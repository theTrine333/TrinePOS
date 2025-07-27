/*     */ package trinecodecmain;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Desktop;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.SystemColor;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.WindowAdapter;
/*     */ import java.awt.event.WindowEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.net.URI;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import java.util.Date;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.ButtonGroup;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JMenu;
/*     */ import javax.swing.JMenuBar;
/*     */ import javax.swing.JMenuItem;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JRadioButtonMenuItem;
/*     */ import javax.swing.JToggleButton;
/*     */ import javax.swing.Timer;
/*     */ import javax.swing.border.LineBorder;
/*     */ import javax.swing.border.MatteBorder;
/*     */ import javax.swing.filechooser.FileNameExtensionFilter;
/*     */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ import trinecode.tools.FileChooser;
/*     */ import trinecode.tools.PFetcher;
/*     */ import trinecode.tools.SettingsManager;
/*     */ import trinecodec.mini.views.GUIEngine;
/*     */ import trinecodec.mini.views.daysSale;
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
/*     */ 
/*     */ public class ScreenHome
/*     */   extends JFrame
/*     */ {
/*  68 */   public static String aboutText = "Moyale Mini Supermarket. \n-------------------------------------------------------------------------------------\nVersion: 1.0\nAuthor : TrineTechs\n-------------------------------------------------------------------------------------\nThis is a Swing-based Point Of Sale (POS) System developed for Moyale Mini Supermarket.  The system allows efficient management of products, tracking of sales, and generating reports. \nKey Features include:\n-------------------------------------------------------------------------------------\n- Inventory Management : Track product stock levels, receive new shipments, and manage product info\n- Sales processing : Process transactions, apply discounts, and generate sales receipts.\n- Customer Management : Maintain customer records, loyalty programs, and personalized offers. \n- Reporting and analysis : Generate reports on sales, inventory, and customers information that is provided. \n-------------------------------------------------------------------------------------\nFor further assistance or inquiries, Please contact the developer: \nEmail : ericksonoluoch004@gmail.com\nPhone: +254795514454\nPhone: +254111521140\n" + 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  86 */     String.format("%c ", new Object[] { Integer.valueOf(169) }) + Calendar.getInstance().get(1) + " Moyale Mini Supermarket. All rights reserved. \n" + 
/*  87 */     "-------------------------------------------------------------------------------------";
/*     */   public ScreenHome() {
/*  89 */     setTitle("TRINEPOS SYSTEM");
/*  90 */     setIconImage(Toolkit.getDefaultToolkit().getImage(ScreenHome.class.getResource("/img/icons8_ingredients_50px.png")));
/*  91 */     addWindowListener(new WindowAdapter()
/*     */         {
/*     */           public void windowOpened(WindowEvent e) {
/*  94 */             ScreenHome.salesbtn.doClick();
/*     */           }
/*     */         });
/*  97 */     setSize(1364, 784);
/*  98 */     setExtendedState(6);
/*  99 */     setDefaultCloseOperation(3);
/* 100 */     this.menuBar = new JMenuBar();
/* 101 */     homeBtns = new ButtonGroup();
/* 102 */     this.mstSelling = new ButtonGroup();
/* 103 */     this.nomSales = new ButtonGroup();
/* 104 */     this.menuBar.setFont(new Font("Segoe UI", 0, 13));
/* 105 */     setJMenuBar(this.menuBar);
/*     */     
/* 107 */     JMenu mnFiles = new JMenu("Files");
/* 108 */     homeBtns.add(mnFiles);
/* 109 */     this.menuBar.add(mnFiles);
/*     */     
/* 111 */     JMenu mnNewMenu_2 = new JMenu("Import");
/* 112 */     mnFiles.add(mnNewMenu_2);
/*     */     
/* 114 */     JMenuItem mntmNewMenuItem_9 = new JMenuItem("From *.sql");
/* 115 */     mntmNewMenuItem_9.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 117 */             FileChooser sqlChooser = new FileChooser();
/* 118 */             FileNameExtensionFilter filter = new FileNameExtensionFilter("SQL FILES ONLY", new String[] { "sql", "SQL" });
/* 119 */             sqlChooser.addChoosableFileFilter(filter);
/* 120 */             sqlChooser.setAcceptAllFileFilterUsed(false);
/*     */             
/* 122 */             int option = sqlChooser.showOpenDialog(null);
/* 123 */             if (option == 0) {
/* 124 */               File file = sqlChooser.getSelectedFile();
/* 125 */               String fileName = file.getName();
/* 126 */               int startIndex = fileName.charAt(1);
/* 127 */               int endIndex = fileName.charAt(46);
/* 128 */               System.out.println("[SQLFILE] : " + fileName.substring(startIndex, endIndex).trim());
/*     */             } 
/*     */           }
/*     */         });
/* 132 */     mnNewMenu_2.add(mntmNewMenuItem_9);
/*     */     
/* 134 */     JMenuItem mntmNewMenuItem_8 = new JMenuItem("From dump");
/* 135 */     mntmNewMenuItem_8.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 137 */             FileChooser sqlChooser = new FileChooser();
/* 138 */             FileNameExtensionFilter filter = new FileNameExtensionFilter("DUMP FILES ONLY", new String[] { "dump" });
/* 139 */             sqlChooser.addChoosableFileFilter(filter);
/* 140 */             sqlChooser.setAcceptAllFileFilterUsed(false);
/*     */             
/* 142 */             int option = sqlChooser.showOpenDialog(null);
/* 143 */             if (option == 0) {
/* 144 */               File file = sqlChooser.getSelectedFile();
/*     */               
/*     */               try {
/* 147 */                 BufferedImage image = ImageIO.read(file);
/* 148 */                 Image scaledImage = image.getScaledInstance(190, 130, 4);
/* 149 */                 ProcessBuilder process = new ProcessBuilder(new String[0]);
/* 150 */                 process.command(new String[] { "ECHO HELLO" });
/*     */               }
/* 152 */               catch (IOException e1) {
/* 153 */                 e1.printStackTrace();
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 158 */     mnNewMenu_2.add(mntmNewMenuItem_8);
/*     */     
/* 160 */     JMenu mnNewMenu_3 = new JMenu("Export ");
/* 161 */     mnFiles.add(mnNewMenu_3);
/*     */     
/* 163 */     JMenuItem mntmNewMenuItem_10 = new JMenuItem("To *.sql");
/* 164 */     mnNewMenu_3.add(mntmNewMenuItem_10);
/*     */     
/* 166 */     JMenuItem mntmNewMenuItem_20 = new JMenuItem("To dump");
/* 167 */     mnNewMenu_3.add(mntmNewMenuItem_20);
/*     */     
/* 169 */     JMenu mnNewMenu = new JMenu("3D ANALYSIS");
/* 170 */     mnNewMenu.setMnemonic(82);
/* 171 */     this.menuBar.add(mnNewMenu);
/*     */     
/* 173 */     JMenu mnNewMenu_5 = new JMenu("All Sales");
/* 174 */     mnNewMenu.add(mnNewMenu_5);
/*     */     
/* 176 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_4 = new JRadioButtonMenuItem("Today");
/* 177 */     rdbtnmntmNewRadioItem_4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 180 */               daysSale ds = new daysSale();
/* 181 */               JpanelLoader.jPanelLoader(ScreenHome.panel_load, (JPanel)ds);
/* 182 */               daysSale.todayReports();
/* 183 */             } catch (Exception exception) {}
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 188 */     homeBtns.add(rdbtnmntmNewRadioItem_4);
/* 189 */     mnNewMenu_5.add(rdbtnmntmNewRadioItem_4);
/*     */     
/* 191 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_5 = new JRadioButtonMenuItem("This Week");
/* 192 */     homeBtns.add(rdbtnmntmNewRadioItem_5);
/* 193 */     mnNewMenu_5.add(rdbtnmntmNewRadioItem_5);
/*     */     
/* 195 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_6 = new JRadioButtonMenuItem("This Month");
/* 196 */     homeBtns.add(rdbtnmntmNewRadioItem_6);
/* 197 */     mnNewMenu_5.add(rdbtnmntmNewRadioItem_6);
/*     */     
/* 199 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_7 = new JRadioButtonMenuItem("This Year");
/* 200 */     homeBtns.add(rdbtnmntmNewRadioItem_7);
/* 201 */     mnNewMenu_5.add(rdbtnmntmNewRadioItem_7);
/*     */     
/* 203 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_8 = new JRadioButtonMenuItem("All The Time");
/* 204 */     rdbtnmntmNewRadioItem_8.setFont(new Font("Segoe UI", 1, 12));
/* 205 */     homeBtns.add(rdbtnmntmNewRadioItem_8);
/* 206 */     rdbtnmntmNewRadioItem_8.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 209 */               daysSale ds = new daysSale();
/* 210 */               daysSale.allDayReports();
/* 211 */               JpanelLoader.jPanelLoader(ScreenHome.panel_load, (JPanel)ds);
/* 212 */             } catch (Exception exception) {}
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 217 */     mnNewMenu_5.add(rdbtnmntmNewRadioItem_8);
/*     */     
/* 219 */     JMenu mnNewMenu_4 = new JMenu("Most Selling");
/* 220 */     homeBtns.add(mnNewMenu_4);
/* 221 */     mnNewMenu.add(mnNewMenu_4);
/*     */     
/* 223 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Today");
/* 224 */     homeBtns.add(rdbtnmntmNewRadioItem);
/* 225 */     mnNewMenu_4.add(rdbtnmntmNewRadioItem);
/*     */     
/* 227 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_9 = new JRadioButtonMenuItem("This Week");
/* 228 */     homeBtns.add(rdbtnmntmNewRadioItem_9);
/* 229 */     mnNewMenu_4.add(rdbtnmntmNewRadioItem_9);
/*     */     
/* 231 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("This Month");
/* 232 */     homeBtns.add(rdbtnmntmNewRadioItem_1);
/* 233 */     mnNewMenu_4.add(rdbtnmntmNewRadioItem_1);
/*     */     
/* 235 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("This Year");
/* 236 */     homeBtns.add(rdbtnmntmNewRadioItem_2);
/* 237 */     mnNewMenu_4.add(rdbtnmntmNewRadioItem_2);
/*     */     
/* 239 */     JRadioButtonMenuItem rdbtnmntmNewRadioItem_3 = new JRadioButtonMenuItem("All The Time");
/* 240 */     rdbtnmntmNewRadioItem_3.setFont(new Font("Segoe UI", 1, 12));
/* 241 */     homeBtns.add(rdbtnmntmNewRadioItem_3);
/* 242 */     mnNewMenu_4.add(rdbtnmntmNewRadioItem_3);
/*     */     
/* 244 */     JMenuItem mntmNewMenuItem_3 = new JMenuItem("Current Stock Level");
/* 245 */     mntmNewMenuItem_3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 248 */               GUIEngine.genChart3D();
/* 249 */               GUIEngine chartShower = new GUIEngine();
/* 250 */               JpanelLoader.jPanelLoader(ScreenHome.panel_load, (JPanel)chartShower);
/* 251 */             } catch (IOException e1) {
/*     */               
/* 253 */               e1.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 257 */     mnNewMenu.add(mntmNewMenuItem_3);
/*     */     
/* 259 */     JMenu mnFaqs = new JMenu("Help  ");
/* 260 */     mnFaqs.setMnemonic(72);
/* 261 */     this.menuBar.add(mnFaqs);
/*     */     
/* 263 */     final JMenuItem mntmNewMenuItem_1 = new JMenuItem("About");
/*     */     
/*     */     try {
/* 266 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/img/programmer-icon.png"));
/* 267 */       Image scaledImage = image.getScaledInstance(20, 20, 4);
/* 268 */       mntmNewMenuItem_1.setIcon(new ImageIcon(scaledImage));
/* 269 */     } catch (IOException e1) {
/* 270 */       e1.printStackTrace();
/*     */     } 
/* 272 */     mntmNewMenuItem_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 274 */             if (e.getSource() == mntmNewMenuItem_1) {
/* 275 */               JOptionPane.showMessageDialog(null, ScreenHome.aboutText, "About Moyale", 1);
/*     */             }
/*     */           }
/*     */         });
/* 279 */     mntmNewMenuItem_1.setMnemonic(65);
/* 280 */     mnFaqs.add(mntmNewMenuItem_1);
/*     */     
/* 282 */     JMenuItem mntmNewMenuItem = new JMenuItem("User Manual");
/* 283 */     mntmNewMenuItem = new JMenuItem("User Manual");
/* 284 */     mntmNewMenuItem.setIcon(new ImageIcon(ScreenHome.class.getResource("/net/sf/jasperreports/view/images/print.GIF")));
/* 285 */     mntmNewMenuItem.setMnemonic(85);
/* 286 */     mnFaqs.add(mntmNewMenuItem);
/*     */     
/* 288 */     JMenuItem mntmNewMenuItem_6 = new JMenuItem("Contact Us");
/*     */     try {
/* 290 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/icons/File Name Lost (70).png"));
/* 291 */       Image scaledImage = image.getScaledInstance(15, 20, 4);
/* 292 */       mntmNewMenuItem_6.setIcon(new ImageIcon(scaledImage));
/* 293 */     } catch (IOException e1) {
/*     */       
/* 295 */       e1.printStackTrace();
/*     */     } 
/* 297 */     mntmNewMenuItem_6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 299 */             String contactText = 
/* 300 */               "For any assistance,  inquiries or Feedback Regarding our TrinePOS System, Please contact us: \nEmail : ericksonoluoch004@gmail.com\nPhone: +254795514454\nPhone: +254111521140\nWe value your Feedback. Help Us Help You With a Better System. Great Together";
/*     */ 
/*     */ 
/*     */ 
/*     */             
/* 305 */             JOptionPane.showMessageDialog(null, contactText, "Contact Developer", 1);
/*     */           }
/*     */         });
/* 308 */     mntmNewMenuItem_6.setMnemonic(67);
/* 309 */     mnFaqs.add(mntmNewMenuItem_6);
/*     */     
/* 311 */     JMenu mnTools = new JMenu("Tools");
/* 312 */     mnTools.setMnemonic(84);
/* 313 */     this.menuBar.add(mnTools);
/*     */     
/* 315 */     JMenuItem mntmNewMenuItem_16 = new JMenuItem("BCR Generator");
/*     */     try {
/* 317 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/img/theTrine.jpg"));
/* 318 */       Image scaledImage = image.getScaledInstance(20, 15, 4);
/* 319 */       mntmNewMenuItem_16.setIcon(new ImageIcon(scaledImage));
/* 320 */     } catch (IOException e1) {
/*     */       
/* 322 */       e1.printStackTrace();
/*     */     } 
/*     */     
/* 325 */     mntmNewMenuItem_16.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/*     */             
/* 329 */             } catch (InterruptedException e1) {
/*     */               
/* 331 */               e1.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 335 */     mnTools.add(mntmNewMenuItem_16);
/*     */     
/* 337 */     final JMenuItem calculatorMn = new JMenuItem("Calculator");
/*     */     try {
/* 339 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/img/Calc.png"));
/* 340 */       Image scaledImage = image.getScaledInstance(15, 20, 4);
/* 341 */       calculatorMn.setIcon(new ImageIcon(scaledImage));
/* 342 */     } catch (IOException e1) {
/*     */       
/* 344 */       e1.printStackTrace();
/*     */     } 
/* 346 */     calculatorMn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 348 */             if (e.getSource() == calculatorMn);
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 353 */     mnTools.add(calculatorMn);
/*     */     
/* 355 */     JMenuItem mntmNewMenuItem_7 = new JMenuItem("File Explorer");
/*     */     try {
/* 357 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/icons/File Name Lost (926).png"));
/* 358 */       Image scaledImage = image.getScaledInstance(20, 20, 4);
/* 359 */       mntmNewMenuItem_7.setIcon(new ImageIcon(scaledImage));
/* 360 */     } catch (IOException e1) {
/*     */       
/* 362 */       e1.printStackTrace();
/*     */     } 
/*     */     
/* 365 */     mntmNewMenuItem_7.setMnemonic(70);
/* 366 */     mntmNewMenuItem_7.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 369 */               if (Desktop.isDesktopSupported()) {
/* 370 */                 Desktop desktop = Desktop.getDesktop();
/* 371 */                 desktop.browse(URI.create("file:///"));
/*     */               } 
/* 373 */             } catch (IOException e8) {
/* 374 */               JOptionPane.showMessageDialog(null, "Error oppening File Explorer", "System Error", 0);
/*     */             } 
/*     */           }
/*     */         });
/* 378 */     mnTools.add(mntmNewMenuItem_7);
/*     */     
/* 380 */     settingsBtn = new JMenuItem("Settings");
/* 381 */     homeBtns.add(settingsBtn);
/* 382 */     settingsBtn.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 385 */             SettingsManager settings = new SettingsManager();
/* 386 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, (JPanel)settings);
/*     */           }
/*     */         });
/*     */     try {
/* 390 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/icons/File Name Lost (1436).png"));
/* 391 */       Image scaledImage = image.getScaledInstance(20, 20, 4);
/* 392 */       settingsBtn.setIcon(new ImageIcon(scaledImage));
/* 393 */     } catch (IOException e1) {
/*     */       
/* 395 */       e1.printStackTrace();
/*     */     } 
/* 397 */     mnTools.add(settingsBtn);
/*     */     
/* 399 */     JMenu mnNewMenu_1 = new JMenu("Subsciption");
/* 400 */     mnNewMenu_1.setEnabled(false);
/* 401 */     this.menuBar.add(mnNewMenu_1);
/*     */     
/* 403 */     JMenuItem mntmNewMenuItem_2 = new JMenuItem("Add Subscription");
/* 404 */     mnNewMenu_1.add(mntmNewMenuItem_2);
/*     */     
/* 406 */     JMenuItem mntmNewMenuItem_12 = new JMenuItem("Check Subscription");
/* 407 */     mnNewMenu_1.add(mntmNewMenuItem_12);
/*     */     
/* 409 */     JMenuItem mntmNewMenuItem_13 = new JMenuItem("Renew Subcription\r\n");
/* 410 */     mnNewMenu_1.add(mntmNewMenuItem_13);
/*     */     
/* 412 */     JMenuItem mntmNewMenuItem_14 = new JMenuItem("Subscription Reports");
/* 413 */     mnNewMenu_1.add(mntmNewMenuItem_14);
/* 414 */     getContentPane().setLayout((LayoutManager)null);
/*     */     
/* 416 */     String colorString = PFetcher.getSettings("ui.title.color");
/* 417 */     int startIndex = colorString.indexOf("r=") + 2;
/* 418 */     int endIndex = colorString.indexOf(",", startIndex);
/* 419 */     int red = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 421 */     startIndex = colorString.indexOf("g=") + 2;
/* 422 */     endIndex = colorString.indexOf(",", startIndex);
/* 423 */     int green = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 425 */     startIndex = colorString.indexOf("b=") + 2;
/* 426 */     endIndex = colorString.indexOf("]", startIndex);
/* 427 */     int blue = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 429 */     panel_load = new JPanel();
/* 430 */     panel_load.setBorder(BorderFactory.createEtchedBorder());
/* 431 */     panel_load.setBounds(185, 99, 1090, 590);
/* 432 */     getContentPane().add(panel_load);
/* 433 */     panel_load.setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 435 */     this.jPanel1 = new JPanel();
/* 436 */     this.jPanel1.setLayout((LayoutManager)null);
/* 437 */     this.jPanel1.setBorder(BorderFactory.createEtchedBorder());
/* 438 */     this.jPanel1.setBackground(SystemColor.activeCaption);
/* 439 */     this.jPanel1.setBounds(0, 99, 180, 590);
/* 440 */     getContentPane().add(this.jPanel1);
/*     */     
/* 442 */     this.panel = new JPanel();
/* 443 */     this.panel.setLayout((LayoutManager)null);
/* 444 */     this.panel.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 445 */     this.panel.setBounds(12, 6, 153, 49);
/* 446 */     this.jPanel1.add(this.panel);
/*     */     
/* 448 */     this.jLabel1 = new JLabel();
/* 449 */     this.jLabel1.setText("MENU");
/* 450 */     this.jLabel1.setHorizontalAlignment(0);
/* 451 */     this.jLabel1.setFont(new Font("Segoe UI", 1, 20));
/* 452 */     this.jLabel1.setBounds(7, 6, 137, 43);
/* 453 */     this.panel.add(this.jLabel1);
/*     */     
/* 455 */     salesbtn = new JToggleButton("Sales");
/* 456 */     salesbtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 458 */             sale sl = new sale();
/* 459 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, sl);
/*     */           }
/*     */         });
/* 462 */     salesbtn.setFont(new Font("Tahoma", 1, 14));
/* 463 */     homeBtns.add(salesbtn);
/* 464 */     salesbtn.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/sales_menu.png")));
/* 465 */     salesbtn.setBounds(16, 66, 140, 38);
/* 466 */     this.jPanel1.add(salesbtn);
/*     */     
/* 468 */     JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Suppliers");
/* 469 */     tglbtnNewToggleButton_1.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/supplier.png")));
/* 470 */     tglbtnNewToggleButton_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 472 */             supplier sp = new supplier();
/* 473 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, sp);
/*     */           }
/*     */         });
/* 476 */     tglbtnNewToggleButton_1.setFont(new Font("Tahoma", 1, 14));
/* 477 */     homeBtns.add(tglbtnNewToggleButton_1);
/* 478 */     tglbtnNewToggleButton_1.setBounds(19, 115, 140, 38);
/* 479 */     this.jPanel1.add(tglbtnNewToggleButton_1);
/*     */     
/* 481 */     JToggleButton tglbtnNewToggleButton_2 = new JToggleButton("Employees");
/* 482 */     tglbtnNewToggleButton_2.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/emp.png")));
/* 483 */     tglbtnNewToggleButton_2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 485 */             employee emp = new employee();
/* 486 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, emp);
/*     */           }
/*     */         });
/* 489 */     tglbtnNewToggleButton_2.setFont(new Font("Tahoma", 1, 14));
/* 490 */     homeBtns.add(tglbtnNewToggleButton_2);
/* 491 */     tglbtnNewToggleButton_2.setBounds(19, 164, 140, 38);
/* 492 */     this.jPanel1.add(tglbtnNewToggleButton_2);
/*     */     
/* 494 */     JToggleButton tglbtnNewToggleButton_3 = new JToggleButton("Products");
/* 495 */     tglbtnNewToggleButton_3.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/product.png")));
/* 496 */     tglbtnNewToggleButton_3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 498 */             product pro = new product();
/* 499 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, pro);
/*     */           }
/*     */         });
/* 502 */     tglbtnNewToggleButton_3.setFont(new Font("Tahoma", 1, 14));
/* 503 */     homeBtns.add(tglbtnNewToggleButton_3);
/* 504 */     tglbtnNewToggleButton_3.setBounds(19, 213, 140, 38);
/* 505 */     this.jPanel1.add(tglbtnNewToggleButton_3);
/*     */     
/* 507 */     JToggleButton tglbtnNewToggleButton_4 = new JToggleButton("Customers");
/* 508 */     tglbtnNewToggleButton_4.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/customer.png")));
/* 509 */     tglbtnNewToggleButton_4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 511 */             customer cus = new customer();
/* 512 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, cus);
/*     */           }
/*     */         });
/* 515 */     tglbtnNewToggleButton_4.setFont(new Font("Tahoma", 1, 14));
/* 516 */     homeBtns.add(tglbtnNewToggleButton_4);
/* 517 */     tglbtnNewToggleButton_4.setBounds(19, 262, 140, 38);
/* 518 */     this.jPanel1.add(tglbtnNewToggleButton_4);
/*     */     
/* 520 */     JToggleButton tglbtnNewToggleButton_5 = new JToggleButton("Invoices");
/* 521 */     tglbtnNewToggleButton_5.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/invo.png")));
/* 522 */     tglbtnNewToggleButton_5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 524 */             Invoice inv = new Invoice();
/* 525 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, inv);
/*     */           }
/*     */         });
/* 528 */     tglbtnNewToggleButton_5.setFont(new Font("Tahoma", 1, 14));
/* 529 */     homeBtns.add(tglbtnNewToggleButton_5);
/* 530 */     tglbtnNewToggleButton_5.setBounds(19, 311, 140, 38);
/* 531 */     this.jPanel1.add(tglbtnNewToggleButton_5);
/*     */     
/* 533 */     JToggleButton tglbtnNewToggleButton_6 = new JToggleButton("Grns");
/* 534 */     tglbtnNewToggleButton_6.setEnabled(false);
/* 535 */     tglbtnNewToggleButton_6.setFont(new Font("Tahoma", 1, 14));
/* 536 */     homeBtns.add(tglbtnNewToggleButton_6);
/* 537 */     tglbtnNewToggleButton_6.setBounds(19, 360, 140, 38);
/* 538 */     this.jPanel1.add(tglbtnNewToggleButton_6);
/*     */     
/* 540 */     JToggleButton tglbtnNewToggleButton_7 = new JToggleButton("New toggle button");
/* 541 */     tglbtnNewToggleButton_7.setEnabled(false);
/* 542 */     tglbtnNewToggleButton_7.setFont(new Font("Tahoma", 1, 14));
/* 543 */     homeBtns.add(tglbtnNewToggleButton_7);
/* 544 */     tglbtnNewToggleButton_7.setBounds(19, 409, 140, 38);
/* 545 */     this.jPanel1.add(tglbtnNewToggleButton_7);
/*     */     
/* 547 */     JToggleButton tglbtnNewToggleButton_8 = new JToggleButton("Reports");
/* 548 */     tglbtnNewToggleButton_8.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/reports.png")));
/* 549 */     tglbtnNewToggleButton_8.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 551 */             Reports rp = new Reports();
/* 552 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, rp);
/*     */           }
/*     */         });
/* 555 */     tglbtnNewToggleButton_8.setFont(new Font("Tahoma", 1, 14));
/* 556 */     homeBtns.add(tglbtnNewToggleButton_8);
/* 557 */     tglbtnNewToggleButton_8.setBounds(19, 458, 140, 38);
/* 558 */     this.jPanel1.add(tglbtnNewToggleButton_8);
/*     */     
/* 560 */     JPanel panel_1 = new JPanel();
/* 561 */     panel_1.setBackground(new Color(255, 255, 255));
/* 562 */     panel_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/* 563 */     panel_1.setBounds(0, 0, 1275, 88);
/* 564 */     getContentPane().add(panel_1);
/* 565 */     panel_1.setLayout((LayoutManager)null);
/*     */     
/* 567 */     JLabel TitleLabel = new JLabel();
/* 568 */     TitleLabel.setFont(new Font(PFetcher.getSettings("ui.font"), 0, 40));
/* 569 */     TitleLabel.setText(PFetcher.getSettings("ui.title"));
/*     */     
/* 571 */     colorString = PFetcher.getSettings("ui.title.color");
/* 572 */     startIndex = colorString.indexOf("r=") + 2;
/* 573 */     endIndex = colorString.indexOf(",", startIndex);
/* 574 */     red = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 576 */     startIndex = colorString.indexOf("g=") + 2;
/* 577 */     endIndex = colorString.indexOf(",", startIndex);
/* 578 */     green = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 580 */     startIndex = colorString.indexOf("b=") + 2;
/* 581 */     endIndex = colorString.indexOf("]", startIndex);
/* 582 */     blue = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 584 */     TitleLabel.setForeground(new Color(red, green, blue));
/* 585 */     TitleLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 586 */     TitleLabel.setHorizontalAlignment(0);
/* 587 */     TitleLabel.setBounds(0, 0, 1275, 52);
/* 588 */     panel_1.add(TitleLabel);
/*     */     
/* 590 */     this.timeShower = new JLabel();
/* 591 */     this.timeShower.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/icons8_clock_20px_2.png")));
/* 592 */     this.timeShower.setHorizontalAlignment(0);
/* 593 */     this.timeShower.setFont(new Font("OCR A Extended", 0, 16));
/* 594 */     this.timeShower.setBounds(1018, 0, 247, 25);
/* 595 */     panel_1.add(this.timeShower);
/*     */     
/* 597 */     JLabel dateShower = new JLabel();
/* 598 */     dateShower.setIcon(new ImageIcon(ScreenHome.class.getResource("/img/icons8_calendar_8_20px.png")));
/* 599 */     dateShower.setHorizontalAlignment(0);
/* 600 */     dateShower.setFont(new Font("OCR A Extended", 0, 16));
/* 601 */     SimpleDateFormat timeFormat = new SimpleDateFormat(" EEE dd-MMM-yyyy");
/* 602 */     date = timeFormat.format(Calendar.getInstance().getTime());
/* 603 */     dateShower.setText(date);
/* 604 */     dateShower.setBounds(1018, 27, 247, 25);
/* 605 */     panel_1.add(dateShower);
/*     */     
/* 607 */     this.animTextShow = new JLabel();
/* 608 */     this.animTextShow.setHorizontalAlignment(4);
/* 609 */     this.animTextShow.setFont(new Font("Berlin Sans FB Demi", 0, 14));
/* 610 */     this.animTextShow.setForeground(new Color(0, 0, 255));
/* 611 */     this.animTextShow.setText(PFetcher.getSettings("ui.bar.text"));
/* 612 */     this.animTextShow.setBounds(0, 55, 1275, 30);
/* 613 */     panel_1.add(this.animTextShow);
/*     */     
/* 615 */     setVisible(true);
/* 616 */     sTime();
/*     */   }
/*     */ 
/*     */   
/*     */   public void sTime() {
/* 621 */     this.timer = new Timer(10, new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 624 */             Date d = new Date();
/* 625 */             SimpleDateFormat s = new SimpleDateFormat(" hh:mm:ss a z");
/* 626 */             ScreenHome.this.timeShower.setText(s.format(d));
/* 627 */             ScreenHome.this.currentX--;
/* 628 */             ScreenHome.this.animTextShow.setLocation(ScreenHome.this.currentX, ScreenHome.this.animTextShow.getY());
/* 629 */             ScreenHome.this.animTextShow.repaint();
/* 630 */             if (ScreenHome.this.currentX + ScreenHome.this.animTextShow.getWidth() < 0) {
/* 631 */               ScreenHome.this.currentX = ScreenHome.this.getWidth();
/*     */             }
/*     */           }
/*     */         });
/* 635 */     this.timer.start();
/*     */   }
/* 637 */   public static JpanelLoader jpload = new JpanelLoader();
/*     */   int currentX;
/*     */   public static String date;
/*     */   JLabel animTextShow;
/* 641 */   static PFetcher properties = new PFetcher();
/*     */   JMenuBar menuBar;
/*     */   Timer timer;
/*     */   public static ButtonGroup homeBtns;
/*     */   ButtonGroup mstSelling;
/*     */   ButtonGroup nomSales;
/*     */   JLabel timeShower;
/*     */   public static JMenuItem settingsBtn;
/*     */   static JToggleButton salesbtn;
/*     */   public static JPanel panel_load;
/*     */   private JPanel jPanel1;
/*     */   private JPanel panel;
/*     */   private JLabel jLabel1;
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/ScreenHome.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */