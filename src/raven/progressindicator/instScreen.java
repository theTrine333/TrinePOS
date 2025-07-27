/*    */ package raven.progressindicator;
/*    */ 
/*    */ import java.awt.EventQueue;
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.event.WindowAdapter;
/*    */ import java.awt.event.WindowEvent;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.UIManager;
/*    */ import javax.swing.UnsupportedLookAndFeelException;
/*    */ import raven.glasspanepopup.GlassPanePopup;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class instScreen
/*    */   extends JFrame
/*    */ {
/*    */   public instScreen() {
/* 23 */     setResizable(false);
/* 24 */     addWindowListener(new WindowAdapter()
/*    */         {
/*    */           public void windowOpened(WindowEvent e) {
/* 27 */             GlassPanePopup.showPopup(new Indicator());
/*    */           }
/*    */         });
/* 30 */     setTitle("TPOS SETUP AND CONFIGURATIONS");
/* 31 */     setIconImage(Toolkit.getDefaultToolkit().getImage(instScreen.class.getResource("/img/icons8_ingredients_50px.png")));
/* 32 */     GlassPanePopup.install(this);
/*    */     
/* 34 */     setDefaultCloseOperation(3);
/* 35 */     setSize(840, 580);
/* 36 */     setLocationRelativeTo(null);
/*    */     
/* 38 */     setVisible(true); } public static void main(String[] args) {
/*    */     try {
/*    */       byte b;
/*    */       int i;
/*    */       UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo;
/* 43 */       for (i = (arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels()).length, b = 0; b < i; ) { UIManager.LookAndFeelInfo info = arrayOfLookAndFeelInfo[b];
/* 44 */         if ("Nimbus".equals(info.getName())) {
/* 45 */           UIManager.setLookAndFeel(info.getClassName()); break;
/*    */         } 
/*    */         b++; }
/*    */     
/* 49 */     } catch (ClassNotFoundException ex) {
/* 50 */       Logger.getLogger(instScreen.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 51 */     } catch (InstantiationException ex) {
/* 52 */       Logger.getLogger(instScreen.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 53 */     } catch (IllegalAccessException ex) {
/* 54 */       Logger.getLogger(instScreen.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 55 */     } catch (UnsupportedLookAndFeelException ex) {
/* 56 */       Logger.getLogger(instScreen.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 61 */     EventQueue.invokeLater(new Runnable() {
/*    */           public void run() {}
/*    */         });
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/instScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */