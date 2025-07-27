/*    */ package raven.progressindicator;
/*    */ 
/*    */ import java.awt.Graphics;
/*    */ import java.awt.Graphics2D;
/*    */ import java.awt.RenderingHints;
/*    */ import java.awt.event.MouseAdapter;
/*    */ import java.awt.event.MouseEvent;
/*    */ import java.awt.geom.RoundRectangle2D;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.SwingUtilities;
/*    */ import javax.swing.border.EmptyBorder;
/*    */ 
/*    */ public class Button
/*    */   extends JButton {
/*    */   private boolean mousePress;
/*    */   
/*    */   public Button() {
/* 18 */     setContentAreaFilled(false);
/* 19 */     setBorder(new EmptyBorder(7, 5, 7, 5));
/* 20 */     addMouseListener(new MouseAdapter()
/*    */         {
/*    */           public void mousePressed(MouseEvent me) {
/* 23 */             if (SwingUtilities.isLeftMouseButton(me)) {
/* 24 */               Button.this.mousePress = true;
/*    */             }
/*    */           }
/*    */ 
/*    */           
/*    */           public void mouseReleased(MouseEvent me) {
/* 30 */             if (SwingUtilities.isLeftMouseButton(me)) {
/* 31 */               Button.this.mousePress = false;
/*    */             }
/*    */           }
/*    */         });
/*    */   }
/*    */ 
/*    */   
/*    */   protected void paintComponent(Graphics grphcs) {
/* 39 */     Graphics2D g2 = (Graphics2D)grphcs.create();
/* 40 */     g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
/* 41 */     if (this.mousePress) {
/* 42 */       g2.setColor(getBackground().darker());
/*    */     } else {
/* 44 */       g2.setColor(getBackground());
/*    */     } 
/* 46 */     g2.fill(new RoundRectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight(), getHeight(), getHeight()));
/* 47 */     g2.dispose();
/* 48 */     super.paintComponent(grphcs);
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/Button.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */