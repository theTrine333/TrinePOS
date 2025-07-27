/*     */ package raven.progressindicator;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButton;
/*     */ import javax.swing.border.BevelBorder;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.MatteBorder;
/*     */ import trinecodecmain.ScreenHome;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class installModules
/*     */   extends JPanel
/*     */ {
/*     */   public static String module;
/*     */   
/*     */   public installModules() {
/*  35 */     setSize(650, 356);
/*  36 */     setLayout((LayoutManager)null);
/*     */     
/*  38 */     JLabel lblNewLabel = new JLabel("New label");
/*     */     
/*     */     try {
/*  41 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/icons/server (1).png"));
/*  42 */       Image scaledImage = image.getScaledInstance(330, 350, 4);
/*  43 */       lblNewLabel.setIcon(new ImageIcon(scaledImage));
/*  44 */     } catch (IOException e) {
/*  45 */       e.printStackTrace();
/*     */     } 
/*  47 */     lblNewLabel.setBounds(0, 0, 333, 356);
/*  48 */     add(lblNewLabel);
/*     */     
/*  50 */     JPanel panel = new JPanel();
/*  51 */     panel.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/*  52 */     panel.setBounds(343, 0, 297, 356);
/*  53 */     add(panel);
/*  54 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  56 */     JLabel lblNewLabel_1 = new JLabel("SERVER AND DATABASE INSTALL");
/*  57 */     lblNewLabel_1.setBorder(new EtchedBorder(1, null, null));
/*  58 */     lblNewLabel_1.setFont(new Font("DialogInput", 0, 15));
/*  59 */     lblNewLabel_1.setHorizontalAlignment(0);
/*  60 */     lblNewLabel_1.setBounds(0, 75, 297, 26);
/*  61 */     panel.add(lblNewLabel_1);
/*     */     
/*  63 */     JLabel lblNewLabel_2 = new JLabel("Please select your installation components");
/*  64 */     lblNewLabel_2.setIcon(new ImageIcon(installModules.class.getResource("/icons/icons8_tick_box_20px_2.png")));
/*  65 */     lblNewLabel_2.setFont(new Font("Tahoma", 0, 12));
/*  66 */     lblNewLabel_2.setBounds(0, 112, 297, 16);
/*  67 */     panel.add(lblNewLabel_2);
/*     */     
/*  69 */     JPanel panel_1 = new JPanel();
/*  70 */     ButtonGroup radioBtns = new ButtonGroup();
/*  71 */     panel_1.setBorder(new BevelBorder(1, null, null, null, null));
/*  72 */     panel_1.setBounds(10, 156, 277, 118);
/*  73 */     panel.add(panel_1);
/*  74 */     panel_1.setLayout((LayoutManager)null);
/*     */     
/*  76 */     JRadioButton rdbtnNewRadioButton = new JRadioButton("Server Only");
/*  77 */     rdbtnNewRadioButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  79 */             installModules.module = "server";
/*     */           }
/*     */         });
/*  82 */     radioBtns.add(rdbtnNewRadioButton);
/*  83 */     rdbtnNewRadioButton.setBounds(59, 7, 160, 23);
/*  84 */     panel_1.add(rdbtnNewRadioButton);
/*     */     
/*  86 */     JRadioButton rdbtnNodeBranch = new JRadioButton("Node / Branch Only");
/*  87 */     rdbtnNodeBranch.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  89 */             installModules.module = "node";
/*     */           }
/*     */         });
/*  92 */     radioBtns.add(rdbtnNodeBranch);
/*  93 */     rdbtnNodeBranch.setBounds(59, 43, 160, 23);
/*  94 */     panel_1.add(rdbtnNodeBranch);
/*     */     
/*  96 */     JRadioButton rdbtnFullStandalone = new JRadioButton("Full Standalone System");
/*  97 */     rdbtnFullStandalone.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*  99 */             installModules.module = "full";
/*     */           }
/*     */         });
/* 102 */     radioBtns.add(rdbtnFullStandalone);
/* 103 */     rdbtnFullStandalone.setBounds(59, 82, 160, 23);
/* 104 */     panel_1.add(rdbtnFullStandalone);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/installModules.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */