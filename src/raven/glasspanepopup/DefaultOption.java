/*    */ package raven.glasspanepopup;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Component;
/*    */ import net.miginfocom.layout.LayoutCallback;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DefaultOption
/*    */   implements Option
/*    */ {
/*    */   private float animate;
/*    */   
/*    */   public LayoutCallback getLayoutCallBack(Component parent) {
/* 17 */     return new DefaultLayoutCallBack(parent);
/*    */   }
/*    */ 
/*    */   
/*    */   public String getLayout(Component parent, float animate) {
/* 22 */     float an = 20.0F / parent.getHeight();
/* 23 */     float space = 0.5F + an - animate * an;
/* 24 */     return "pos 0.5al " + space + "al";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean closeWhenClickOutside() {
/* 29 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean blockBackground() {
/* 34 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public Color background() {
/* 39 */     return new Color(100, 100, 100);
/*    */   }
/*    */ 
/*    */   
/*    */   public float opacity() {
/* 44 */     return 0.5F;
/*    */   }
/*    */ 
/*    */   
/*    */   public int duration() {
/* 49 */     return 300;
/*    */   }
/*    */ 
/*    */   
/*    */   public float getAnimate() {
/* 54 */     return this.animate;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setAnimate(float animate) {
/* 59 */     this.animate = animate;
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/glasspanepopup/DefaultOption.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */