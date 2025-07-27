/*     */ package raven.progressindicator;
/*     */ 
/*     */ import java.awt.Component;
/*     */ import java.awt.LayoutManager;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.swing.JPanel;
/*     */ import net.miginfocom.layout.ComponentWrapper;
/*     */ import net.miginfocom.layout.LayoutCallback;
/*     */ import net.miginfocom.swing.MigLayout;
/*     */ import org.jdesktop.animation.timing.Animator;
/*     */ import org.jdesktop.animation.timing.TimingTarget;
/*     */ import org.jdesktop.animation.timing.TimingTargetAdapter;
/*     */ 
/*     */ 
/*     */ public class PanelSlider
/*     */   extends JPanel
/*     */ {
/*     */   private Component[] sliderComponent;
/*  20 */   private final Component[] components = new Component[2];
/*  21 */   private final List<EventSliderAnimatorChanged> events = new ArrayList<>();
/*     */   private Animator animator;
/*     */   private float animate;
/*     */   private SliderType type;
/*     */   private MigLayout layout;
/*     */   
/*     */   public PanelSlider() {
/*  28 */     init();
/*     */   }
/*     */   
/*     */   private void init() {
/*  32 */     this.layout = new MigLayout();
/*  33 */     setLayout((LayoutManager)this.layout);
/*  34 */     this.layout.addLayoutCallback(new LayoutCallback()
/*     */         {
/*     */           public void correctBounds(ComponentWrapper cw) {
/*  37 */             PanelSlider.this.change(cw);
/*     */           }
/*     */         });
/*  40 */     this.animator = new Animator(500, (TimingTarget)new TimingTargetAdapter()
/*     */         {
/*     */           public void timingEvent(float fraction) {
/*  43 */             PanelSlider.this.animate = fraction;
/*  44 */             PanelSlider.this.revalidate();
/*  45 */             PanelSlider.this.runEvent(fraction);
/*     */           }
/*     */         });
/*  48 */     this.animator.setAcceleration(0.5F);
/*  49 */     this.animator.setDeceleration(0.5F);
/*  50 */     this.animator.setResolution(0);
/*     */   }
/*     */   
/*     */   public void change(ComponentWrapper cw) {
/*  54 */     int width = getWidth();
/*  55 */     int height = getHeight();
/*  56 */     int x = 0;
/*  57 */     int y = 0;
/*  58 */     int x2 = 0;
/*  59 */     int y2 = 0;
/*  60 */     switch (this.type) {
/*     */       case LEFT_TO_RIGHT:
/*  62 */         x = (int)-(width * (1.0F - this.animate));
/*  63 */         x2 = (int)(width * this.animate);
/*     */         break;
/*     */       case RIGHT_TO_LEFT:
/*  66 */         x = (int)(width - width * this.animate);
/*  67 */         x2 = (int)-(width * this.animate);
/*     */         break;
/*     */       case TOP_TO_BOTTOM:
/*  70 */         y = (int)-(height * (1.0F - this.animate));
/*  71 */         y2 = (int)(height * this.animate);
/*     */         break;
/*     */       case null:
/*  74 */         y = (int)(height - height * this.animate);
/*  75 */         y2 = (int)-(height * this.animate);
/*     */         break;
/*     */       default:
/*  78 */         x2 = width;
/*  79 */         y2 = 0; break;
/*     */     } 
/*  81 */     if (cw.getComponent() == this.components[0]) {
/*  82 */       cw.setBounds(x, y, width, height);
/*     */     }
/*  84 */     if (cw.getComponent() == this.components[1]) {
/*  85 */       cw.setBounds(x2, y2, width, height);
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean isSlidAble() {
/*  90 */     return !this.animator.isRunning();
/*     */   }
/*     */   
/*     */   public synchronized void showSlid(Component component, SliderType type) {
/*  94 */     if (!this.animator.isRunning()) {
/*  95 */       this.type = type;
/*  96 */       if (this.components[1] != null) {
/*  97 */         remove(this.components[1]);
/*     */       }
/*  99 */       this.components[1] = this.components[0];
/* 100 */       this.components[0] = component;
/* 101 */       add(component, "pos 0 0");
/* 102 */       if (type == SliderType.NONE) {
/* 103 */         this.animate = 1.0F;
/* 104 */         revalidate();
/*     */       } else {
/* 106 */         this.animator.start();
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public void addEventSliderAnimatorChanged(EventSliderAnimatorChanged event) {
/* 112 */     this.events.add(event);
/*     */   }
/*     */   
/*     */   private void runEvent(float f) {
/* 116 */     for (EventSliderAnimatorChanged event : this.events)
/* 117 */       event.animatorChange(this.type, f); 
/*     */   }
/*     */   
/*     */   public enum SliderType
/*     */   {
/* 122 */     LEFT_TO_RIGHT, RIGHT_TO_LEFT, TOP_TO_BOTTOM, BOTTOM_TO_TOP, NONE;
/*     */   }
/*     */   
/*     */   public Component[] getSliderComponent() {
/* 126 */     return this.sliderComponent;
/*     */   }
/*     */   
/*     */   public void setSliderComponent(Component[] sliderComponent) {
/* 130 */     this.sliderComponent = sliderComponent;
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/PanelSlider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */