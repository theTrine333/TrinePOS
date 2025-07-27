/*     */ package raven.glasspanepopup;
/*     */ 
/*     */ import java.awt.AlphaComposite;
/*     */ import java.awt.Component;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Graphics2D;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.geom.Rectangle2D;
/*     */ import java.text.DecimalFormat;
/*     */ import java.text.DecimalFormatSymbols;
/*     */ import java.util.Locale;
/*     */ import javax.swing.JComponent;
/*     */ import javax.swing.SwingUtilities;
/*     */ import net.miginfocom.layout.LayoutCallback;
/*     */ import net.miginfocom.swing.MigLayout;
/*     */ import org.jdesktop.animation.timing.Animator;
/*     */ import org.jdesktop.animation.timing.TimingTarget;
/*     */ import org.jdesktop.animation.timing.TimingTargetAdapter;
/*     */ 
/*     */ 
/*     */ public class Popup
/*     */   extends JComponent
/*     */ {
/*  26 */   private final DecimalFormat df = new DecimalFormat("#.###", DecimalFormatSymbols.getInstance(Locale.US));
/*     */   private final GlassPanePopup parent;
/*     */   private final Component component;
/*     */   private final Option option;
/*     */   private Animator animator;
/*     */   private MigLayout layout;
/*     */   private float animate;
/*     */   private boolean show;
/*     */   private boolean mouseHover;
/*     */   
/*     */   public Popup(GlassPanePopup parent, Component component, Option option) {
/*  37 */     this.parent = parent;
/*  38 */     this.component = component;
/*  39 */     this.option = option;
/*  40 */     init();
/*  41 */     initAnimator();
/*     */   }
/*     */   
/*     */   private void init() {
/*  45 */     this.layout = new MigLayout();
/*  46 */     initOption();
/*  47 */     setLayout((LayoutManager)this.layout);
/*  48 */     add(this.component, this.option.getLayout(this.parent.getLayerPane(), 0.0F));
/*     */   }
/*     */   
/*     */   private void initOption() {
/*  52 */     LayoutCallback callBack = this.option.getLayoutCallBack(this.parent.getLayerPane());
/*  53 */     if (callBack != null) {
/*  54 */       this.layout.addLayoutCallback(callBack);
/*     */     }
/*  56 */     if (this.option.closeWhenClickOutside()) {
/*  57 */       addMouseListener(new MouseAdapter()
/*     */           {
/*     */             public void mouseEntered(MouseEvent e) {
/*  60 */               Popup.this.mouseHover = true;
/*     */             }
/*     */ 
/*     */             
/*     */             public void mouseExited(MouseEvent e) {
/*  65 */               Popup.this.mouseHover = false;
/*     */             }
/*     */ 
/*     */             
/*     */             public void mouseReleased(MouseEvent e) {
/*  70 */               if (Popup.this.mouseHover && SwingUtilities.isLeftMouseButton(e)) {
/*  71 */                 Popup.this.setShowPopup(false);
/*     */               }
/*     */             }
/*     */           });
/*  75 */     } else if (this.option.blockBackground()) {
/*  76 */       addMouseListener(new MouseAdapter() {  }
/*     */         );
/*     */     } 
/*     */   }
/*     */   
/*     */   private void initAnimator() {
/*  82 */     this.animator = new Animator(this.option.duration(), (TimingTarget)new TimingTargetAdapter()
/*     */         {
/*     */           public void timingEvent(float fraction) {
/*  85 */             if (Popup.this.show) {
/*  86 */               Popup.this.animate = fraction;
/*     */             } else {
/*  88 */               Popup.this.animate = 1.0F - fraction;
/*     */             } 
/*  90 */             float f = Float.parseFloat(Popup.this.df.format(Popup.this.animate));
/*  91 */             Popup.this.option.setAnimate(f);
/*  92 */             String lc = Popup.this.option.getLayout(Popup.this.parent.getLayerPane(), f);
/*  93 */             if (lc != null) {
/*  94 */               Popup.this.layout.setComponentConstraints(Popup.this.component, lc);
/*     */             }
/*  96 */             Popup.this.repaint();
/*  97 */             Popup.this.revalidate();
/*     */           }
/*     */ 
/*     */           
/*     */           public void end() {
/* 102 */             if (!Popup.this.show) {
/* 103 */               Popup.this.parent.removePopup(Popup.this);
/*     */             }
/*     */           }
/*     */         });
/* 107 */     this.animator.setAcceleration(0.5F);
/* 108 */     this.animator.setDeceleration(0.5F);
/* 109 */     this.animator.setResolution(5);
/*     */   }
/*     */   
/*     */   public void setShowPopup(boolean show) {
/* 113 */     if (this.show != show) {
/* 114 */       if (this.animator.isRunning()) {
/* 115 */         float f = this.animator.getTimingFraction();
/* 116 */         this.animator.stop();
/* 117 */         this.animator.setStartFraction(1.0F - f);
/*     */       } else {
/* 119 */         this.animator.setStartFraction(0.0F);
/*     */       } 
/* 121 */       this.show = show;
/* 122 */       this.animator.start();
/* 123 */       if (!show && (
/* 124 */         getMouseListeners()).length != 0) {
/* 125 */         removeMouseListener(getMouseListeners()[0]);
/*     */       }
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void paintComponent(Graphics g) {
/* 133 */     Graphics2D g2 = (Graphics2D)g;
/* 134 */     g2.setComposite(AlphaComposite.SrcOver.derive(this.animate * this.option.opacity()));
/* 135 */     g2.setColor(this.option.background());
/* 136 */     g2.fill(new Rectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight()));
/* 137 */     g2.setComposite(AlphaComposite.SrcOver.derive(this.animate));
/* 138 */     super.paintComponent(g);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/glasspanepopup/Popup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */