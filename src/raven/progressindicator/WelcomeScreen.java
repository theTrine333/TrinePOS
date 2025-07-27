/*    */ package raven.progressindicator;
/*    */ 
/*    */ import java.awt.Font;
/*    */ import java.awt.LayoutManager;
/*    */ import java.awt.SystemColor;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.border.EtchedBorder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class WelcomeScreen
/*    */   extends JPanel
/*    */ {
/*    */   public WelcomeScreen() {
/* 23 */     setBackground(SystemColor.inactiveCaptionBorder);
/* 24 */     setSize(650, 356);
/* 25 */     setLayout((LayoutManager)null);
/*    */     
/* 27 */     JLabel lblDevelopedBy = new JLabel("\t\tPOWERED BY :\r\n\tTRINE TECHNOLOGIES");
/* 28 */     lblDevelopedBy.setForeground(SystemColor.textHighlight);
/* 29 */     lblDevelopedBy.setHorizontalAlignment(0);
/* 30 */     lblDevelopedBy.setFont(new Font("Tahoma", 0, 20));
/* 31 */     lblDevelopedBy.setBorder(new EtchedBorder(0, null, null));
/* 32 */     lblDevelopedBy.setBounds(98, 271, 486, 62);
/* 33 */     add(lblDevelopedBy);
/*    */     
/* 35 */     JLabel lblNewLabel_1 = new JLabel();
/* 36 */     lblNewLabel_1.setIcon(new ImageIcon(WelcomeScreen.class.getResource("/img/iicon.png")));
/* 37 */     lblNewLabel_1.setBounds(98, 11, 486, 249);
/* 38 */     add(lblNewLabel_1);
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/WelcomeScreen.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */