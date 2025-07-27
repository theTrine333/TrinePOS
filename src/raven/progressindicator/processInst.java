/*     */ package raven.progressindicator;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatLightLaf;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JProgressBar;
/*     */ import javax.swing.border.BevelBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ import javax.swing.border.MatteBorder;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class processInst
/*     */   extends JPanel
/*     */ {
/*     */   JCheckBox chckbxNewCheckBox;
/*     */   JCheckBox chckbxDatabaseImport;
/*     */   JLabel lblNewLabel_1;
/*     */   JCheckBox chckbxUserAccount;
/*     */   JCheckBox chckbxShopAccountCreation;
/*     */   JProgressBar progressBar;
/*     */   JCheckBox chckbxDataImport;
/*     */   JLabel shopLabel;
/*     */   
/*     */   public processInst() {
/*  44 */     FlatLightLaf.setup();
/*  45 */     setSize(650, 356);
/*  46 */     setLayout((LayoutManager)null);
/*     */     
/*  48 */     JPanel panel = new JPanel();
/*  49 */     panel.setBorder(new LineBorder(new Color(0, 0, 0)));
/*  50 */     panel.setBounds(0, 0, 200, 334);
/*  51 */     add(panel);
/*  52 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  54 */     this.lblNewLabel_1 = new JLabel("INSTALLATION");
/*  55 */     this.lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/*  56 */     this.lblNewLabel_1.setHorizontalAlignment(0);
/*  57 */     this.lblNewLabel_1.setBounds(10, 11, 180, 27);
/*  58 */     panel.add(this.lblNewLabel_1);
/*     */     
/*  60 */     this.chckbxNewCheckBox = new JCheckBox("Server/Node Install");
/*  61 */     this.chckbxNewCheckBox.setEnabled(false);
/*  62 */     this.chckbxNewCheckBox.setBounds(10, 45, 184, 23);
/*  63 */     panel.add(this.chckbxNewCheckBox);
/*     */     
/*  65 */     this.chckbxUserAccount = new JCheckBox("User Account Creation");
/*  66 */     this.chckbxUserAccount.setEnabled(false);
/*  67 */     this.chckbxUserAccount.setBounds(10, 75, 184, 23);
/*  68 */     panel.add(this.chckbxUserAccount);
/*     */     
/*  70 */     this.chckbxShopAccountCreation = new JCheckBox("Shop Account Creation");
/*  71 */     this.chckbxShopAccountCreation.setEnabled(false);
/*  72 */     this.chckbxShopAccountCreation.setBounds(10, 107, 184, 23);
/*  73 */     panel.add(this.chckbxShopAccountCreation);
/*     */     
/*  75 */     this.chckbxDatabaseImport = new JCheckBox("Database Creation");
/*  76 */     this.chckbxDatabaseImport.setEnabled(false);
/*  77 */     this.chckbxDatabaseImport.setBounds(10, 137, 184, 23);
/*  78 */     panel.add(this.chckbxDatabaseImport);
/*     */     
/*  80 */     this.chckbxDataImport = new JCheckBox("Data Import");
/*  81 */     this.chckbxDataImport.setEnabled(false);
/*  82 */     this.chckbxDataImport.setBounds(11, 170, 184, 23);
/*  83 */     panel.add(this.chckbxDataImport);
/*     */     
/*  85 */     this.progressBar = new JProgressBar();
/*  86 */     this.progressBar.setStringPainted(true);
/*  87 */     this.progressBar.setVisible(false);
/*  88 */     this.progressBar.setForeground(new Color(0, 0, 200));
/*  89 */     this.progressBar.setBounds(205, 303, 445, 22);
/*  90 */     add(this.progressBar);
/*     */     
/*  92 */     JButton btnNewButton = new JButton("Start Installation");
/*  93 */     btnNewButton.setFont(new Font("Tahoma", 0, 12));
/*  94 */     btnNewButton.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/*  97 */             processInst.this.progressBar.setVisible(true);
/*  98 */             processInst.this.moveFolder("TrinePOS SYSTEM");
/*  99 */             processInst.this.progressBar.setValue(20);
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 108 */     btnNewButton.setBounds(491, 262, 149, 31);
/* 109 */     add(btnNewButton);
/*     */     
/* 111 */     this.shopLabel = new JLabel("TPOS SYSTEM");
/* 112 */     this.shopLabel.setHorizontalAlignment(0);
/* 113 */     this.shopLabel.setFont(new Font("Tahoma", 0, 15));
/* 114 */     this.shopLabel.setBorder(new BevelBorder(1, null, null, null, null));
/* 115 */     this.shopLabel.setBounds(210, 0, 430, 42);
/* 116 */     add(this.shopLabel);
/*     */     
/* 118 */     JLabel lblPoweredBy = new JLabel("POWERED BY : TRINETECHS");
/* 119 */     lblPoweredBy.setBorder(new LineBorder(new Color(0, 0, 255)));
/* 120 */     lblPoweredBy.setFont(new Font("Tahoma", 0, 13));
/* 121 */     lblPoweredBy.setForeground(new Color(0, 0, 255));
/* 122 */     lblPoweredBy.setHorizontalAlignment(0);
/* 123 */     lblPoweredBy.setBounds(210, 53, 430, 31);
/* 124 */     add(lblPoweredBy);
/*     */     
/* 126 */     JEditorPane dtrpnTheDetailsFrom = new JEditorPane();
/* 127 */     dtrpnTheDetailsFrom.setEditable(false);
/* 128 */     dtrpnTheDetailsFrom.setFont(new Font("Tahoma", 0, 11));
/* 129 */     dtrpnTheDetailsFrom.setText("The details from the previous pages have been loaded and ready to install. \r\nThis details are used to determine the type of system you are going to have,\r\nthe details that are going to be displayed on the printer paper(s) and even \r\nin database installation, configuration and connection. \r\n\r\nFeel free to go back and make necessary changes.\r\n\r\nIf you are certained your configurations, Press the *Start Installation* to \r\nbegin the installation process.\r\n");
/* 130 */     dtrpnTheDetailsFrom.setBounds(210, 95, 430, 156);
/* 131 */     add(dtrpnTheDetailsFrom);
/*     */   }
/*     */   
/*     */   private void moveFolder(String folderName) {
/*     */     try {
/* 136 */       String inputStream = processInst.class.getResourceAsStream("/" + folderName).toString();
/*     */ 
/*     */       
/* 139 */       String appDATA = System.getenv("APPDATA");
/* 140 */       File destFile = new File(appDATA);
/*     */ 
/*     */       
/* 143 */       FileUtils.moveDirectory(new File(inputStream), destFile);
/* 144 */     } catch (IOException e1) {
/* 145 */       e1.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/processInst.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */