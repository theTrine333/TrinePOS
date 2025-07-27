/*    */ package trinecode.tools;
/*    */ import java.awt.Font;
/*    */ import java.awt.Image;
/*    */ import java.awt.SystemColor;
/*    */ import java.awt.image.BufferedImage;
/*    */ import java.io.IOException;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JProgressBar;
/*    */ 
/*    */ public class progressBar {
/*    */   public progressBar() throws InterruptedException {
/* 13 */     JFrame frmBcrsm = new JFrame("ProgressBar");
/* 14 */     frmBcrsm.setUndecorated(true);
/* 15 */     frmBcrsm.setLocation(600, 400);
/* 16 */     frmBcrsm.setTitle("BCRSM");
/* 17 */     frmBcrsm.setIconImage(Toolkit.getDefaultToolkit().getImage(progressBar.class.getResource("/tray/resources/arrow.png")));
/* 18 */     frmBcrsm.setResizable(false);
/* 19 */     frmBcrsm.getContentPane().setLayout((LayoutManager)null);
/* 20 */     JProgressBar pb = new JProgressBar();
/* 21 */     pb.setBounds(122, 47, 421, 37);
/* 22 */     pb.setFont(new Font("Tahoma", 1, 18));
/* 23 */     pb.setForeground(SystemColor.windowBorder);
/* 24 */     pb.setBackground(Color.WHITE);
/* 25 */     pb.setStringPainted(true);
/*    */     
/* 27 */     frmBcrsm.getContentPane().add(pb);
/*    */     
/* 29 */     JLabel imageLabel = new JLabel("New label");
/* 30 */     imageLabel.setBounds(6, 32, 104, 66);
/*    */     
/*    */     try {
/* 33 */       BufferedImage image = ImageIO.read(progressBar.class.getResource("/tray/resources/arrow.png"));
/* 34 */       Image scaledImage = image.getScaledInstance(103, 65, 4);
/* 35 */       imageLabel.setIcon(new ImageIcon(scaledImage));
/* 36 */     } catch (IOException e) {
/*    */       
/* 38 */       e.printStackTrace();
/*    */     } 
/* 40 */     frmBcrsm.getContentPane().add(imageLabel);
/*    */     
/* 42 */     JLabel lblNewLabel = new JLabel("BCRSM");
/* 43 */     lblNewLabel.setFont(new Font("Segoe UI", 1, 20));
/* 44 */     lblNewLabel.setBounds(122, 6, 141, 29);
/* 45 */     frmBcrsm.getContentPane().add(lblNewLabel);
/*    */     
/* 47 */     JLabel waitLabel = new JLabel("Please Wait...");
/* 48 */     waitLabel.setForeground(SystemColor.windowBorder);
/* 49 */     waitLabel.setFont(new Font("Segoe UI", 1, 13));
/* 50 */     waitLabel.setBounds(122, 87, 141, 24);
/* 51 */     frmBcrsm.getContentPane().add(waitLabel);
/*    */     
/* 53 */     JLabel lblNewLabel_1 = new JLabel("Trine Technologies\r\n");
/* 54 */     lblNewLabel_1.setBounds(417, 96, 126, 16);
/* 55 */     frmBcrsm.getContentPane().add(lblNewLabel_1);
/* 56 */     frmBcrsm.setBounds(450, 350, 565, 117);
/* 57 */     frmBcrsm.setVisible(true);
/* 58 */     for (int a = 0; a <= 100; a++) {
/* 59 */       pb.setValue(a);
/* 60 */       Thread.sleep(50L);
/* 61 */       if (a % 2 == 0) {
/* 62 */         waitLabel.setText("Please Wait..");
/* 63 */       } else if (a % 2 != 0) {
/* 64 */         waitLabel.setText("Please Wait...");
/* 65 */       }  if (a == 100) {
/* 66 */         pb.setString("Connection Succeded");
/* 67 */         Thread.sleep(2000L);
/* 68 */         frmBcrsm.dispose();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/progressBar.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */