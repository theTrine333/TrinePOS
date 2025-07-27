/*    */ package trinecode.tools;
/*    */ 
/*    */ import javax.swing.JFileChooser;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FileChooser
/*    */   extends JFileChooser
/*    */ {
/*    */   public FileChooser() {
/* 11 */     setDialogTitle("TPOS IMPORT");
/* 12 */     setApproveButtonText("Import");
/* 13 */     setDragEnabled(false);
/* 14 */     setDialogType(1);
/* 15 */     setFocusable(false);
/* 16 */     setOpaque(false);
/* 17 */     setFileSystemView(getFileSystemView());
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/FileChooser.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */