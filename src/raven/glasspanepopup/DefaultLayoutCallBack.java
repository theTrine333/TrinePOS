/*    */ package raven.glasspanepopup;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.Dimension;
/*    */ import net.miginfocom.layout.BoundSize;
/*    */ import net.miginfocom.layout.ComponentWrapper;
/*    */ import net.miginfocom.layout.LayoutCallback;
/*    */ import net.miginfocom.layout.UnitValue;
/*    */ 
/*    */ 
/*    */ public class DefaultLayoutCallBack
/*    */   extends LayoutCallback
/*    */ {
/*    */   private final Component parent;
/*    */   
/*    */   public Component getParent() {
/* 17 */     return this.parent;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public DefaultLayoutCallBack(Component parent) {
/* 23 */     this.parent = parent;
/*    */   }
/*    */ 
/*    */   
/*    */   public BoundSize[] getSize(ComponentWrapper cw) {
/* 28 */     Dimension ps = this.parent.getSize();
/* 29 */     Dimension s = ((Component)cw.getComponent()).getPreferredSize();
/* 30 */     int margin = 50;
/* 31 */     int w = s.width;
/* 32 */     int h = s.height;
/* 33 */     if (s.getWidth() > ps.getWidth() - margin) {
/* 34 */       w = Math.max(ps.width - margin, cw.getMinimumWidth(0));
/*    */     }
/* 36 */     if (s.getHeight() > ps.getHeight() - margin) {
/* 37 */       h = Math.max(ps.height - margin, cw.getMinimumHeight(0));
/*    */     }
/* 39 */     return new BoundSize[] { new BoundSize(new UnitValue(w), ""), new BoundSize(new UnitValue(h), "") };
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/glasspanepopup/DefaultLayoutCallBack.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */