/*     */ package trinecode.tools;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.awt.print.PrinterJob;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.SQLException;
/*     */ import java.util.Properties;
/*     */ import javax.print.PrintService;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JColorChooser;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.LineBorder;
/*     */ import javax.swing.border.TitledBorder;
/*     */ import jpos.JposException;
/*     */ import jpos.POSPrinter;
/*     */ import trinecodec.mini.views.databaseSetts;
/*     */ import trinecodec.mini.views.daysSale;
/*     */ import trinecodecmain.ScreenHome;
/*     */ 
/*     */ public class SettingsManager extends JPanel {
/*  37 */   PFetcher properties = new PFetcher(); static JLabel showPass; static JButton dbApllyBtn; private static final String SETTINGS_FILE_PATH = "settings.properties"; private static final String DEFAULT_SETTINGS_FILE_PATH = "defaults.properties";
/*     */   JComboBox printerComboBox;
/*     */   
/*     */   public SettingsManager() {
/*  41 */     setLayout((LayoutManager)null);
/*  42 */     setSize(1080, 580);
/*  43 */     JLabel lblNewLabel = new JLabel("SYSTEM SETTINGS");
/*  44 */     lblNewLabel.setBounds(0, 11, 1070, 54);
/*  45 */     lblNewLabel.setVerticalAlignment(3);
/*  46 */     lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
/*  47 */     lblNewLabel.setFont(new Font("Consolas", 0, 40));
/*  48 */     lblNewLabel.setHorizontalAlignment(0);
/*  49 */     add(lblNewLabel);
/*     */     
/*  51 */     JPanel panel = new JPanel();
/*  52 */     panel.setBorder(new TitledBorder(null, "UI Themes and Fonts", 4, 2, null, null));
/*  53 */     panel.setBounds(0, 76, 281, 493);
/*  54 */     add(panel);
/*  55 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  57 */     JLabel lblNewLabel_1 = new JLabel("Theme");
/*  58 */     lblNewLabel_1.setBounds(new Rectangle(0, 0, 80, 30));
/*  59 */     lblNewLabel_1.setBounds(10, 23, 74, 23);
/*  60 */     panel.add(lblNewLabel_1);
/*     */     
/*  62 */     final JComboBox themeComboBox = new JComboBox();
/*  63 */     themeComboBox.setFocusable(false);
/*  64 */     themeComboBox.setFont(new Font("Tahoma", 0, 13));
/*  65 */     themeComboBox.setModel(new DefaultComboBoxModel<>(new String[] { String.valueOf(String.format("%c", new Object[] { Integer.valueOf(174) })) + " Soft Light", "Nebular", "Soft Dark", "Dracular" }));
/*  66 */     if (PFetcher.getSettings("ui.theme").contains("Soft Light")) {
/*  67 */       themeComboBox.setSelectedIndex(0);
/*     */     } else {
/*  69 */       themeComboBox.setSelectedItem(PFetcher.getSettings("ui.theme"));
/*     */     } 
/*  71 */     themeComboBox.setBounds(56, 23, 215, 23);
/*  72 */     panel.add(themeComboBox);
/*     */     
/*  74 */     JLabel lblNewLabel_2 = new JLabel("The " + String.format("%c", new Object[] { Integer.valueOf(174) }) + " Soft Light is Recommeded");
/*  75 */     lblNewLabel_2.setForeground(new Color(0, 0, 204));
/*  76 */     lblNewLabel_2.setHorizontalAlignment(0);
/*  77 */     lblNewLabel_2.setBounds(10, 59, 261, 14);
/*  78 */     panel.add(lblNewLabel_2);
/*     */     
/*  80 */     JLabel lblNewLabel_3 = new JLabel("Tittle : ");
/*  81 */     lblNewLabel_3.setFont(new Font("Tahoma", 0, 15));
/*  82 */     lblNewLabel_3.setBounds(10, 115, 66, 23);
/*  83 */     panel.add(lblNewLabel_3);
/*     */     
/*  85 */     this.titleField = new JTextField();
/*  86 */     this.titleField.setText(PFetcher.getSettings("ui.title"));
/*  87 */     this.titleField.setFont(new Font(PFetcher.getSettings("ui.font").toString(), 0, 12));
/*  88 */     this.titleField.setBounds(56, 115, 215, 23);
/*  89 */     panel.add(this.titleField);
/*  90 */     this.titleField.setColumns(10);
/*     */     
/*  92 */     JLabel lblNewLabel_3_1 = new JLabel("Font : ");
/*  93 */     lblNewLabel_3_1.setFont(new Font("Tahoma", 0, 15));
/*  94 */     lblNewLabel_3_1.setBounds(10, 149, 66, 23);
/*  95 */     panel.add(lblNewLabel_3_1);
/*     */     
/*  97 */     final JComboBox<String> fontChombo = new JComboBox();
/*  98 */     fontChombo.setFocusable(false);
/*  99 */     String[] fonts = 
/* 100 */       GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); byte b; int i; String[] arrayOfString1;
/* 101 */     for (i = (arrayOfString1 = fonts).length, b = 0; b < i; ) { String font = arrayOfString1[b];
/* 102 */       fontChombo.addItem(font); b++; }
/*     */     
/* 104 */     fontChombo.setSelectedItem(PFetcher.getSettings("ui.font"));
/* 105 */     fontChombo.setBounds(56, 149, 215, 22);
/* 106 */     fontChombo.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 108 */             SettingsManager.this.titleField.setFont(new Font(fontChombo.getSelectedItem().toString(), 0, 12));
/*     */           }
/*     */         });
/* 111 */     panel.add(fontChombo);
/*     */     
/* 113 */     JLabel lblNewLabel_4 = new JLabel("Title Settings");
/* 114 */     lblNewLabel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 115 */     lblNewLabel_4.setFont(new Font("Tahoma", 0, 18));
/* 116 */     lblNewLabel_4.setBounds(2, 80, 275, 23);
/* 117 */     panel.add(lblNewLabel_4);
/*     */     
/* 119 */     JLabel lblNewLabel_3_1_1 = new JLabel("Color : ");
/* 120 */     lblNewLabel_3_1_1.setFont(new Font("Tahoma", 0, 15));
/* 121 */     lblNewLabel_3_1_1.setBounds(10, 184, 66, 23);
/* 122 */     panel.add(lblNewLabel_3_1_1);
/*     */     
/* 124 */     JButton btnNewButton = new JButton("Choose a color\r\n");
/* 125 */     btnNewButton.setFocusable(false);
/* 126 */     btnNewButton.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e) {
/* 129 */             Color selectedColor = JColorChooser.showDialog(null, "Title's Color", Color.BLACK);
/*     */             
/* 131 */             if (selectedColor != null) {
/* 132 */               SettingsManager.this.colorShower.setBackground(selectedColor);
/*     */             } else {
/*     */               
/* 135 */               SettingsManager.this.colorShower.setBackground((Color)null);
/*     */             } 
/*     */           }
/*     */         });
/* 139 */     btnNewButton.setFont(new Font("Tahoma", 0, 15));
/* 140 */     btnNewButton.setBounds(56, 183, 178, 23);
/* 141 */     panel.add(btnNewButton);
/*     */     
/* 143 */     this.colorShower = new JTextField();
/*     */     
/* 145 */     String colorString = PFetcher.getSettings("ui.title.color");
/* 146 */     int startIndex = colorString.indexOf("r=") + 2;
/* 147 */     int endIndex = colorString.indexOf(",", startIndex);
/* 148 */     int red = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 150 */     startIndex = colorString.indexOf("g=") + 2;
/* 151 */     endIndex = colorString.indexOf(",", startIndex);
/* 152 */     int green = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 154 */     startIndex = colorString.indexOf("b=") + 2;
/* 155 */     endIndex = colorString.indexOf("]", startIndex);
/* 156 */     int blue = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */     
/* 158 */     this.colorShower.setBackground(new Color(red, green, blue));
/* 159 */     this.colorShower.setEditable(false);
/* 160 */     this.colorShower.setBounds(236, 182, 35, 25);
/* 161 */     panel.add(this.colorShower);
/* 162 */     this.colorShower.setColumns(10);
/*     */     
/* 164 */     JButton btnUiReset = new JButton("Set Default");
/* 165 */     btnUiReset.setFocusable(false);
/* 166 */     btnUiReset.setBounds(30, 450, 106, 32);
/* 167 */     panel.add(btnUiReset);
/*     */     
/* 169 */     JButton btnUiApply = new JButton("Apply");
/* 170 */     btnUiApply.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 173 */               PFetcher.loadSettings();
/* 174 */               if (themeComboBox.getSelectedItem().toString().contains("Soft Light")) {
/* 175 */                 PFetcher.setSettings("ui.theme", "Soft Light");
/*     */               } else {
/* 177 */                 PFetcher.setSettings("ui.theme", themeComboBox.getSelectedItem().toString());
/*     */               } 
/* 179 */               PFetcher.setSettings("ui.title", SettingsManager.this.titleField.getText());
/* 180 */               PFetcher.setSettings("postalAddr", SettingsManager.this.textField_1.getText());
/* 181 */               PFetcher.setSettings("user.curr", SettingsManager.this.textField_4.getText());
/* 182 */               PFetcher.setSettings("phoneNumber2", SettingsManager.this.textField_3.getText());
/* 183 */               PFetcher.setSettings("phoneNumber", SettingsManager.this.textField_2.getText());
/* 184 */               PFetcher.setSettings("location", SettingsManager.this.textField.getText());
/* 185 */               PFetcher.setSettings("ui.font", fontChombo.getSelectedItem().toString());
/* 186 */               PFetcher.setSettings("ui.title.color", SettingsManager.this.colorShower.getBackground().toString());
/*     */               
/* 188 */               String colorString = PFetcher.getSettings("ui.title.color");
/* 189 */               int startIndex = colorString.indexOf("r=") + 2;
/* 190 */               int endIndex = colorString.indexOf(",", startIndex);
/* 191 */               int red = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */               
/* 193 */               startIndex = colorString.indexOf("g=") + 2;
/* 194 */               endIndex = colorString.indexOf(",", startIndex);
/* 195 */               int green = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */               
/* 197 */               startIndex = colorString.indexOf("b=") + 2;
/* 198 */               endIndex = colorString.indexOf("]", startIndex);
/* 199 */               int blue = Integer.parseInt(colorString.substring(startIndex, endIndex).trim());
/*     */               
/* 201 */               SettingsManager.this.colorShower.setBackground(new Color(red, green, blue));
/*     */               
/* 203 */               int reboot = JOptionPane.showConfirmDialog(null, "- The changes will be applied on the next start.\n- Do you want to close now to apply the changes? ", 
/* 204 */                   "TRINEPOS SETTINGS", 2);
/*     */               
/* 206 */               if (reboot == 0) {
/* 207 */                 System.exit(0);
/*     */               }
/* 209 */             } catch (IOException e1) {
/* 210 */               e1.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 214 */     btnUiApply.setFocusable(false);
/* 215 */     btnUiApply.setBounds(146, 450, 106, 32);
/* 216 */     panel.add(btnUiApply);
/*     */     
/* 218 */     JLabel lblNewLabel_4_1 = new JLabel("OTHER INFO : ");
/* 219 */     lblNewLabel_4_1.setHorizontalAlignment(0);
/* 220 */     lblNewLabel_4_1.setFont(new Font("Tahoma", 0, 18));
/* 221 */     lblNewLabel_4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 222 */     lblNewLabel_4_1.setBounds(2, 218, 275, 23);
/* 223 */     panel.add(lblNewLabel_4_1);
/*     */     
/* 225 */     this.textField = new JTextField();
/* 226 */     this.textField.setHorizontalAlignment(0);
/* 227 */     this.textField.setText(PFetcher.getSettings("location"));
/* 228 */     this.textField.setFont(new Font("Gadugi", 0, 12));
/* 229 */     this.textField.setColumns(10);
/* 230 */     this.textField.setBounds(71, 249, 200, 23);
/* 231 */     panel.add(this.textField);
/*     */     
/* 233 */     JLabel lblNewLabel_3_2 = new JLabel("LOCATION : ");
/* 234 */     lblNewLabel_3_2.setFont(new Font("Tahoma", 0, 12));
/* 235 */     lblNewLabel_3_2.setBounds(5, 249, 74, 23);
/* 236 */     panel.add(lblNewLabel_3_2);
/*     */     
/* 238 */     this.textField_1 = new JTextField();
/* 239 */     this.textField_1.setText(PFetcher.getSettings("postalAddr"));
/* 240 */     this.textField_1.setHorizontalAlignment(0);
/* 241 */     this.textField_1.setFont(new Font("Gadugi", 0, 12));
/* 242 */     this.textField_1.setColumns(10);
/* 243 */     this.textField_1.setBounds(71, 283, 200, 23);
/* 244 */     panel.add(this.textField_1);
/*     */     
/* 246 */     JLabel lblNewLabel_3_2_1 = new JLabel("P.O ADDR : ");
/* 247 */     lblNewLabel_3_2_1.setFont(new Font("Tahoma", 0, 12));
/* 248 */     lblNewLabel_3_2_1.setBounds(5, 283, 74, 23);
/* 249 */     panel.add(lblNewLabel_3_2_1);
/*     */     
/* 251 */     this.textField_2 = new JTextField();
/* 252 */     this.textField_2.setText(PFetcher.getSettings("phoneNumber"));
/* 253 */     this.textField_2.setHorizontalAlignment(0);
/* 254 */     this.textField_2.setFont(new Font("Gadugi", 0, 12));
/* 255 */     this.textField_2.setColumns(10);
/* 256 */     this.textField_2.setBounds(71, 317, 200, 23);
/* 257 */     panel.add(this.textField_2);
/*     */     
/* 259 */     JLabel lblNewLabel_3_2_2 = new JLabel("PHONE1 :");
/* 260 */     lblNewLabel_3_2_2.setFont(new Font("Tahoma", 0, 12));
/* 261 */     lblNewLabel_3_2_2.setBounds(5, 317, 74, 23);
/* 262 */     panel.add(lblNewLabel_3_2_2);
/*     */     
/* 264 */     this.textField_3 = new JTextField();
/* 265 */     this.textField_3.setText(PFetcher.getSettings("phoneNumber2"));
/* 266 */     this.textField_3.setHorizontalAlignment(0);
/* 267 */     this.textField_3.setFont(new Font("Gadugi", 0, 12));
/* 268 */     this.textField_3.setColumns(10);
/* 269 */     this.textField_3.setBounds(71, 351, 200, 23);
/* 270 */     panel.add(this.textField_3);
/*     */     
/* 272 */     JLabel lblNewLabel_3_2_3 = new JLabel("PHONE2 : ");
/* 273 */     lblNewLabel_3_2_3.setFont(new Font("Tahoma", 0, 12));
/* 274 */     lblNewLabel_3_2_3.setBounds(5, 351, 74, 23);
/* 275 */     panel.add(lblNewLabel_3_2_3);
/*     */     
/* 277 */     JLabel lblNewLabel_2_1 = new JLabel("The above info will be used in printing");
/* 278 */     lblNewLabel_2_1.setHorizontalAlignment(0);
/* 279 */     lblNewLabel_2_1.setForeground(new Color(0, 0, 204));
/* 280 */     lblNewLabel_2_1.setBounds(10, 407, 261, 32);
/* 281 */     panel.add(lblNewLabel_2_1);
/*     */     
/* 283 */     JLabel lblNewLabel_3_2_3_1 = new JLabel("CURRENCY : ");
/* 284 */     lblNewLabel_3_2_3_1.setFont(new Font("Tahoma", 0, 12));
/* 285 */     lblNewLabel_3_2_3_1.setBounds(5, 385, 74, 23);
/* 286 */     panel.add(lblNewLabel_3_2_3_1);
/*     */     
/* 288 */     this.textField_4 = new JTextField();
/* 289 */     this.textField_4.setText(PFetcher.getSettings("user.curr"));
/* 290 */     this.textField_4.setHorizontalAlignment(0);
/* 291 */     this.textField_4.setFont(new Font("Gadugi", 0, 12));
/* 292 */     this.textField_4.setColumns(10);
/* 293 */     this.textField_4.setBounds(71, 385, 200, 23);
/* 294 */     panel.add(this.textField_4);
/*     */     
/* 296 */     JPanel panel_1 = new JPanel();
/* 297 */     panel_1.setFocusable(false);
/* 298 */     panel_1.setBorder(new TitledBorder(null, "Database Settings", 4, 2, null, null));
/* 299 */     panel_1.setBounds(291, 76, 293, 493);
/* 300 */     add(panel_1);
/* 301 */     panel_1.setLayout((LayoutManager)null);
/*     */     
/* 303 */     JLabel lblNewLabel_5 = new JLabel("URL : ");
/* 304 */     lblNewLabel_5.setFont(new Font("Tahoma", 0, 15));
/* 305 */     lblNewLabel_5.setBounds(10, 94, 50, 23);
/* 306 */     panel_1.add(lblNewLabel_5);
/*     */     
/* 308 */     dbUrl = new JTextField();
/* 309 */     dbUrl.setFont(new Font("Tahoma", 0, 12));
/* 310 */     dbUrl.setText(PFetcher.getSettings("db.url"));
/* 311 */     dbUrl.setEnabled(false);
/* 312 */     dbUrl.setBounds(81, 95, 202, 30);
/* 313 */     panel_1.add(dbUrl);
/* 314 */     dbUrl.setColumns(10);
/*     */     
/* 316 */     JLabel lblNewLabel_5_1 = new JLabel("PORT : ");
/* 317 */     lblNewLabel_5_1.setFont(new Font("Tahoma", 0, 15));
/* 318 */     lblNewLabel_5_1.setBounds(10, 129, 61, 23);
/* 319 */     panel_1.add(lblNewLabel_5_1);
/*     */     
/* 321 */     dbPort = new JTextField();
/* 322 */     dbPort.setFont(new Font("Tahoma", 0, 12));
/* 323 */     dbPort.setEnabled(false);
/* 324 */     dbPort.setText(PFetcher.getSettings("db.port"));
/* 325 */     dbPort.setColumns(10);
/* 326 */     dbPort.setBounds(81, 130, 202, 30);
/* 327 */     panel_1.add(dbPort);
/*     */     
/* 329 */     JLabel lblNewLabel_5_1_1 = new JLabel("UNAME : ");
/* 330 */     lblNewLabel_5_1_1.setFont(new Font("Tahoma", 0, 14));
/* 331 */     lblNewLabel_5_1_1.setBounds(10, 205, 61, 23);
/* 332 */     panel_1.add(lblNewLabel_5_1_1);
/*     */     
/* 334 */     dbUname = new JTextField();
/* 335 */     dbUname.setFont(new Font("Tahoma", 0, 12));
/* 336 */     dbUname.setText(PFetcher.getSettings("db.uname"));
/* 337 */     dbUname.setEnabled(false);
/* 338 */     dbUname.setColumns(10);
/* 339 */     dbUname.setBounds(81, 205, 202, 30);
/* 340 */     panel_1.add(dbUname);
/*     */     
/* 342 */     JLabel lblNewLabel_5_1_1_1 = new JLabel("PASS : ");
/* 343 */     lblNewLabel_5_1_1_1.setFont(new Font("Tahoma", 0, 14));
/* 344 */     lblNewLabel_5_1_1_1.setBounds(10, 240, 61, 23);
/* 345 */     panel_1.add(lblNewLabel_5_1_1_1);
/*     */     
/* 347 */     JLabel lblNewLabel_6 = new JLabel("- Enter the username on \"UNAME\" Field");
/* 348 */     lblNewLabel_6.setFont(new Font("Tahoma", 0, 13));
/* 349 */     lblNewLabel_6.setHorizontalAlignment(2);
/* 350 */     lblNewLabel_6.setForeground(new Color(0, 0, 153));
/* 351 */     lblNewLabel_6.setBounds(10, 288, 273, 23);
/* 352 */     panel_1.add(lblNewLabel_6);
/*     */     
/* 354 */     JLabel lblNewLabel_6_1 = new JLabel("- Enter the Password on \"PASS\" Field");
/* 355 */     lblNewLabel_6_1.setHorizontalAlignment(2);
/* 356 */     lblNewLabel_6_1.setForeground(new Color(0, 0, 153));
/* 357 */     lblNewLabel_6_1.setFont(new Font("Tahoma", 0, 13));
/* 358 */     lblNewLabel_6_1.setBounds(10, 314, 273, 23);
/* 359 */     panel_1.add(lblNewLabel_6_1);
/*     */     
/* 361 */     JButton dbDefaults = new JButton("Set Defaults");
/* 362 */     dbDefaults.setFocusable(false);
/* 363 */     dbDefaults.setBounds(10, 348, 116, 30);
/* 364 */     panel_1.add(dbDefaults);
/*     */     
/* 366 */     dbApllyBtn = new JButton("Apply");
/* 367 */     dbApllyBtn.setEnabled(false);
/* 368 */     dbApllyBtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 371 */               PFetcher.loadSettings();
/* 372 */               PFetcher.setSettings("db.url", SettingsManager.dbUrl.getText());
/* 373 */               PFetcher.setSettings("db.port", SettingsManager.dbPort.getText());
/* 374 */               PFetcher.setSettings("db.uname", SettingsManager.dbUname.getText());
/* 375 */               PFetcher.setSettings("db.passwd", SettingsManager.dbpassField.getText().toString());
/* 376 */               PFetcher.setSettings("db.name", SettingsManager.dBname.getText());
/*     */               
/* 378 */               JOptionPane.showMessageDialog(null, "Updates Done successfully", "Data update", 1);
/* 379 */             } catch (IOException e1) {
/*     */               
/* 381 */               e1.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 385 */     dbApllyBtn.setFocusable(false);
/* 386 */     dbApllyBtn.setBounds(155, 348, 128, 30);
/* 387 */     panel_1.add(dbApllyBtn);
/*     */     
/* 389 */     JButton dbTester = new JButton("Test Connection");
/* 390 */     dbTester.addActionListener(new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e)
/*     */           {
/*     */             try {
/* 395 */               String url = PFetcher.getSettings("db.url");
/* 396 */               String uname = PFetcher.getSettings("db.uname");
/* 397 */               String port = PFetcher.getSettings("db.port");
/* 398 */               String password = PFetcher.getSettings("db.passwd");
/* 399 */               String dname = PFetcher.getSettings("db.name");
/*     */               
/* 401 */               PFetcher.loadSettings();
/* 402 */               PFetcher.setSettings("db.url", SettingsManager.dbUrl.getText());
/* 403 */               PFetcher.setSettings("db.port", SettingsManager.dbPort.getText());
/* 404 */               PFetcher.setSettings("db.uname", SettingsManager.dbUname.getText());
/* 405 */               PFetcher.setSettings("db.passwd", SettingsManager.dbpassField.getText().toString());
/* 406 */               PFetcher.setSettings("db.name", SettingsManager.dBname.getText());
/*     */               
/* 408 */               Connection connection = DriverManager.getConnection("jdbc:mysql://" + url + ":" + port + "/" + dname + "?useSSL=False", uname, password);
/* 409 */               JOptionPane.showMessageDialog(null, "Connection to database succeded", "Database test", 1);
/*     */             }
/* 411 */             catch (SQLException e1) {
/*     */               
/* 413 */               daysSale.errorGen(e1);
/* 414 */             } catch (IOException e1) {
/*     */               
/* 416 */               e1.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/* 420 */     dbTester.setFocusable(false);
/* 421 */     dbTester.setBounds(10, 389, 273, 30);
/* 422 */     panel_1.add(dbTester);
/*     */     
/* 424 */     JLabel lblNewLabel_6_2 = new JLabel("* For developer or experts use only * ");
/* 425 */     lblNewLabel_6_2.setHorizontalAlignment(0);
/* 426 */     lblNewLabel_6_2.setForeground(new Color(255, 0, 0));
/* 427 */     lblNewLabel_6_2.setFont(new Font("Tahoma", 0, 13));
/* 428 */     lblNewLabel_6_2.setBounds(10, 459, 273, 23);
/* 429 */     panel_1.add(lblNewLabel_6_2);
/*     */     
/* 431 */     dBname = new JTextField();
/* 432 */     dBname.setFont(new Font("Tahoma", 0, 12));
/* 433 */     dBname.setText(PFetcher.getSettings("db.name"));
/* 434 */     dBname.setEnabled(false);
/* 435 */     dBname.setColumns(10);
/* 436 */     dBname.setBounds(81, 164, 202, 30);
/* 437 */     panel_1.add(dBname);
/*     */     
/* 439 */     JLabel lblNewLabel_5_1_1_2 = new JLabel("DNAME : ");
/* 440 */     lblNewLabel_5_1_1_2.setFont(new Font("Tahoma", 0, 14));
/* 441 */     lblNewLabel_5_1_1_2.setBounds(10, 166, 61, 23);
/* 442 */     panel_1.add(lblNewLabel_5_1_1_2);
/*     */     
/* 444 */     JPanel panel_3 = new JPanel();
/* 445 */     panel_3.setBackground(new Color(255, 255, 255));
/* 446 */     panel_3.setBorder(UIManager.getBorder("PasswordField.border"));
/* 447 */     panel_3.setBounds(81, 240, 202, 26);
/* 448 */     panel_1.add(panel_3);
/* 449 */     panel_3.setLayout((LayoutManager)null);
/*     */     
/* 451 */     dbpassField = new JPasswordField();
/* 452 */     dbpassField.setBorder((Border)null);
/* 453 */     dbpassField.setBounds(3, 3, 162, 20);
/* 454 */     panel_3.add(dbpassField);
/* 455 */     dbpassField.setEnabled(false);
/* 456 */     dbpassField.setText(PFetcher.getSettings("db.passwd"));
/* 457 */     dbpassField.setEchoChar('●');
/* 458 */     dbpassField.setFont(new Font("Tahoma", 0, 12));
/*     */     
/* 460 */     showPass = new JLabel();
/* 461 */     showPass.setFocusable(false);
/* 462 */     showPass.setHorizontalAlignment(0);
/* 463 */     showPass.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 466 */             if (SettingsManager.dbpassField.getEchoChar() == '●') {
/* 467 */               SettingsManager.dbpassField.setEchoChar(false);
/* 468 */               SettingsManager.showPass.setText("");
/* 469 */               SettingsManager.this.iconSet(SettingsManager.showPass, 30, 20, "/icons/hide.jpg");
/*     */             } else {
/*     */               
/* 472 */               SettingsManager.showPass.setText("");
/* 473 */               SettingsManager.this.iconSet(SettingsManager.showPass, 30, 20, "/img/see.jpg");
/* 474 */               SettingsManager.dbpassField.setEchoChar('●');
/*     */             } 
/*     */           }
/*     */         });
/* 478 */     iconSet(showPass, 30, 20, "/img/see.jpg");
/* 479 */     showPass.setBounds(164, 3, 35, 20);
/* 480 */     panel_3.add(showPass);
/*     */     
/* 482 */     JLabel lblNewLabel_6_2_1 = new JLabel("* CURRENTLY ONLY MYSQL IS SUPPORTED * ");
/* 483 */     lblNewLabel_6_2_1.setHorizontalAlignment(0);
/* 484 */     lblNewLabel_6_2_1.setForeground(Color.RED);
/* 485 */     lblNewLabel_6_2_1.setFont(new Font("Tahoma", 0, 13));
/* 486 */     lblNewLabel_6_2_1.setBounds(10, 21, 273, 30);
/* 487 */     panel_1.add(lblNewLabel_6_2_1);
/*     */     
/* 489 */     JComboBox comboBox = new JComboBox();
/* 490 */     comboBox.setFocusable(false);
/* 491 */     comboBox.setFont(new Font("Calisto MT", 0, 13));
/* 492 */     comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "MYSQL" }));
/* 493 */     comboBox.setBounds(81, 62, 202, 23);
/* 494 */     panel_1.add(comboBox);
/*     */     
/* 496 */     JLabel lblNewLabel_5_2 = new JLabel("ENGINE : ");
/* 497 */     lblNewLabel_5_2.setFont(new Font("Tahoma", 0, 15));
/* 498 */     lblNewLabel_5_2.setBounds(10, 62, 73, 23);
/* 499 */     panel_1.add(lblNewLabel_5_2);
/*     */     
/* 501 */     JButton btnAdvancedOptions = new JButton("Advanced Options");
/* 502 */     btnAdvancedOptions.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 504 */             databaseSetts dbsp = new databaseSetts();
/* 505 */             JpanelLoader.jPanelLoader(ScreenHome.panel_load, (JPanel)dbsp);
/*     */           }
/*     */         });
/* 508 */     btnAdvancedOptions.setFocusable(false);
/* 509 */     btnAdvancedOptions.setBounds(10, 425, 273, 30);
/* 510 */     ScreenHome.homeBtns.add(btnAdvancedOptions);
/* 511 */     panel_1.add(btnAdvancedOptions);
/*     */     
/* 513 */     JPanel panel_2 = new JPanel();
/* 514 */     panel_2.setBorder(new TitledBorder(new EtchedBorder(1, new Color(255, 255, 255), new Color(160, 160, 160)), "Devices Configurations", 4, 2, null, new Color(0, 0, 0)));
/* 515 */     panel_2.setBounds(594, 76, 394, 158);
/* 516 */     add(panel_2);
/* 517 */     panel_2.setLayout((LayoutManager)null);
/*     */     
/* 519 */     JLabel lblNewLabel_7_1 = new JLabel("Available Printers : ");
/* 520 */     lblNewLabel_7_1.setHorizontalAlignment(4);
/* 521 */     lblNewLabel_7_1.setBounds(10, 28, 93, 21);
/* 522 */     panel_2.add(lblNewLabel_7_1);
/*     */     
/* 524 */     JButton btnNewButton_5 = new JButton("Apply");
/* 525 */     btnNewButton_5.setFocusable(false);
/* 526 */     btnNewButton_5.setBounds(229, 109, 72, 29);
/* 527 */     panel_2.add(btnNewButton_5);
/*     */     
/* 529 */     JButton btnNewButton_5_1 = new JButton("Configure Printer");
/* 530 */     btnNewButton_5_1.setFocusable(false);
/* 531 */     btnNewButton_5_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 533 */             PrinterJob pj = PrinterJob.getPrinterJob();
/* 534 */             if (pj.printDialog()) {
/*     */               try {
/* 536 */                 pj.print();
/* 537 */               } catch (Exception pje) {
/* 538 */                 System.out.println("[PRINTER ERROR] : " + pje + "\n");
/* 539 */                 JOptionPane.showMessageDialog(null, "An Error Occured", "Printer Error", 0);
/*     */               } 
/*     */             }
/*     */           }
/*     */         });
/* 544 */     btnNewButton_5_1.setBounds(60, 109, 159, 29);
/* 545 */     panel_2.add(btnNewButton_5_1);
/*     */     
/* 547 */     this.printerComboBox = new JComboBox();
/* 548 */     this.printerComboBox.setFocusable(false);
/* 549 */     this.printerComboBox.setBounds(113, 27, 273, 22);
/* 550 */     panel_2.add(this.printerComboBox);
/*     */     
/* 552 */     JButton btnNewButton_5_2 = new JButton("Test");
/* 553 */     btnNewButton_5_2.setFocusable(false);
/* 554 */     btnNewButton_5_2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 556 */             SettingsManager.this.testPrinter();
/*     */           }
/*     */         });
/* 559 */     btnNewButton_5_2.setBounds(314, 109, 72, 29);
/* 560 */     panel_2.add(btnNewButton_5_2);
/*     */     
/* 562 */     JComboBox printerComboBox_1 = new JComboBox();
/* 563 */     printerComboBox_1.setFocusable(false);
/* 564 */     printerComboBox_1.setBounds(113, 60, 273, 22);
/* 565 */     panel_2.add(printerComboBox_1);
/*     */     
/* 567 */     JLabel lblNewLabel_7_1_1 = new JLabel("Printer in-use : ");
/* 568 */     lblNewLabel_7_1_1.setHorizontalAlignment(4);
/* 569 */     lblNewLabel_7_1_1.setBounds(10, 61, 93, 21);
/* 570 */     panel_2.add(lblNewLabel_7_1_1);
/*     */     
/* 572 */     JPanel panel_4 = new JPanel();
/* 573 */     panel_4.setBorder(new TitledBorder(new EtchedBorder(1, new Color(255, 255, 255), new Color(160, 160, 160)), "HOME BAR ANIMATION", 2, 2, null, new Color(0, 0, 0)));
/* 574 */     panel_4.setBounds(594, 245, 394, 197);
/* 575 */     add(panel_4);
/* 576 */     panel_4.setLayout((LayoutManager)null);
/*     */     
/* 578 */     JScrollPane scrollPane = new JScrollPane();
/* 579 */     scrollPane.setBounds(10, 15, 374, 102);
/* 580 */     panel_4.add(scrollPane);
/*     */     
/* 582 */     JEditorPane editorPane = new JEditorPane();
/* 583 */     editorPane.setText(PFetcher.getSettings("ui.bar.text"));
/* 584 */     scrollPane.setViewportView(editorPane);
/* 585 */     populatePrinters();
/* 586 */     devsOption();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 591 */   static String errorMessage = "The settings file is missing.\nThe possible cause are : \n\t- The settings file has been deleted\n\t- The settings file has been corrupt\n\t- The settings file has been moved\n\t- The settings file has been renamed\nIn order to solve this we need to restore default settings\nDo you agree?";
/*     */   
/*     */   private JTextField titleField;
/*     */   
/*     */   private JTextField colorShower;
/*     */   
/*     */   private static JTextField dbUrl;
/*     */   
/*     */   private static JTextField dbPort;
/*     */   
/*     */   private static JTextField dbUname;
/*     */   
/*     */   private static JPasswordField dbpassField;
/*     */   
/*     */   private static JTextField dBname;
/*     */   
/*     */   private JTextField textField;
/*     */   private JTextField textField_1;
/*     */   private JTextField textField_2;
/*     */   private JTextField textField_3;
/*     */   private JTextField textField_4;
/*     */   
/*     */   private void populatePrinters() {
/* 614 */     PrintService[] printServices = PrintServiceLookup.lookupPrintServices(null, null); byte b; int i;
/*     */     PrintService[] arrayOfPrintService1;
/* 616 */     for (i = (arrayOfPrintService1 = printServices).length, b = 0; b < i; ) { PrintService printService = arrayOfPrintService1[b];
/* 617 */       this.printerComboBox.addItem(printService.getName());
/*     */       b++; }
/*     */   
/*     */   }
/*     */   
/*     */   private void testPrinter() {
/*     */     try {
/* 624 */       String printerName = this.printerComboBox.getSelectedItem().toString();
/* 625 */       POSPrinter printer = new POSPrinter();
/* 626 */       printer.open(printerName);
/*     */       
/* 628 */       printer.claim(1000);
/* 629 */       printer.setDeviceEnabled(true);
/*     */       
/* 631 */       printer.printNormal(2, "Test Message\n");
/*     */       
/* 633 */       printer.setDeviceEnabled(false);
/* 634 */       printer.release();
/*     */       
/* 636 */       printer.close();
/*     */       
/* 638 */       JOptionPane.showMessageDialog(this, "Printer configurations succeded.", "Printer Connected", 1);
/* 639 */     } catch (JposException e) {
/* 640 */       JOptionPane.showMessageDialog(this, "Printer configurations failed", "Printer Disconnected", 0);
/* 641 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   public static void devsOption() {
/* 645 */     if (loginPage.role.equals("technician")) {
/* 646 */       dbUrl.setEnabled(true);
/* 647 */       dbUname.setEnabled(true);
/* 648 */       dbPort.setEnabled(true);
/* 649 */       dbpassField.setEnabled(true);
/* 650 */       dbApllyBtn.setEnabled(true);
/* 651 */       dBname.setEnabled(true);
/*     */     } else {
/*     */       
/* 654 */       dbUrl.setEnabled(false);
/* 655 */       dbUname.setEnabled(false);
/* 656 */       dbPort.setEnabled(false);
/* 657 */       dBname.setEnabled(false);
/* 658 */       dbpassField.setEnabled(false);
/* 659 */       dbApllyBtn.setEnabled(false);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   void iconSet(JLabel label, int width, int height, String location) {
/*     */     try {
/* 666 */       BufferedImage image = ImageIO.read(loginPage.class.getResource(location));
/* 667 */       Image scaledImage = image.getScaledInstance(width, height, 4);
/* 668 */       label.setIcon(new ImageIcon(scaledImage));
/* 669 */       label.revalidate();
/* 670 */       label.repaint();
/* 671 */     } catch (IOException e) {
/*     */       
/* 673 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */   
/*     */   public static Properties loadSettings() {
/* 678 */     Properties properties = new Properties(); try {
/* 679 */       Exception exception2, exception1 = null;
/*     */     }
/* 681 */     catch (FileNotFoundException e) {
/* 682 */       int option = JOptionPane.showConfirmDialog(null, errorMessage, "Settings Restoration", 1);
/* 683 */       if (option == 0) {
/*     */         try {
/* 685 */           FileInputStream fileInputStream = new FileInputStream("defaults.properties");
/* 686 */         } catch (FileNotFoundException e1) {
/* 687 */           JOptionPane.showMessageDialog(null, "File Not Found Exception Occured", "Settings Load Error", 0);
/*     */         } 
/*     */       }
/* 690 */     } catch (IOException e) {
/* 691 */       JOptionPane.showMessageDialog(null, "IOException Occured", "Settings Load Error", 0);
/*     */     } 
/* 693 */     return properties;
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/SettingsManager.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */