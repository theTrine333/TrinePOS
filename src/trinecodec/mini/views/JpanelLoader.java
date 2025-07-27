/*    */ package trinecodec.mini.views;
/*    */ 
/*    */ import javax.swing.GroupLayout;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JpanelLoader
/*    */ {
/*    */   public static void jPanelLoader(JPanel Main, JPanel setPanel) {
/* 12 */     Main.removeAll();
/* 13 */     GroupLayout layout = new GroupLayout(Main);
/* 14 */     Main.setLayout(layout);
/* 15 */     layout.setHorizontalGroup(
/* 16 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 17 */         .addComponent(setPanel, GroupLayout.Alignment.LEADING, -2, -2, 32767));
/*    */     
/* 19 */     layout.setVerticalGroup(
/* 20 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 21 */         .addComponent(setPanel, GroupLayout.Alignment.LEADING, -2, -2, 32767));
/*    */     
/* 23 */     System.gc();
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/JpanelLoader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */