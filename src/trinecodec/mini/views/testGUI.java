/*    */ package trinecodec.mini.views;
/*    */ 
/*    */ import javax.swing.JFrame;
/*    */ import raven.progressindicator.processInst;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class testGUI
/*    */   extends JFrame
/*    */ {
/*    */   public static void main(String[] args) {
/* 36 */     String inputStream = processInst.class.getResourceAsStream("/TrinePOS SYSTEM").toString();
/* 37 */     System.out.println("FILE : " + inputStream);
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/testGUI.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */