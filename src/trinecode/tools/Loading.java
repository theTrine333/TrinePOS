/*    */ package trinecode.tools;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.LayoutManager;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ 
/*    */ public class Loading
/*    */   extends JFrame {
/*    */   public Loading() {
/* 12 */     setUndecorated(true);
/* 13 */     getContentPane().setBackground(new Color(255, 255, 255));
/* 14 */     getContentPane().setLayout((LayoutManager)null);
/*    */     
/* 16 */     JLabel lblNewLabel = new JLabel("");
/* 17 */     lblNewLabel.setHorizontalAlignment(0);
/* 18 */     lblNewLabel.setBackground(new Color(255, 255, 255));
/* 19 */     lblNewLabel.setIcon(new ImageIcon(Loading.class.getResource("/icons/loader (1).gif")));
/* 20 */     lblNewLabel.setBounds(0, 0, 231, 220);
/* 21 */     getContentPane().add(lblNewLabel);
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/Loading.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */