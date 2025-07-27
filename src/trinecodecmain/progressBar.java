/*     */ package trinecodecmain;
/*     */ 
/*     */ import com.formdev.flatlaf.FlatDarculaLaf;
/*     */ import com.formdev.flatlaf.FlatDarkLaf;
/*     */ import com.formdev.flatlaf.FlatIntelliJLaf;
/*     */ import com.formdev.flatlaf.themes.FlatMacLightLaf;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.sql.Connection;
/*     */ import java.sql.DriverManager;
/*     */ import java.sql.SQLException;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JProgressBar;
/*     */ import javax.swing.border.EmptyBorder;
/*     */ import trinecode.tools.PFetcher;
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
/*     */ public class progressBar
/*     */ {
/*     */   private static JPanel contentPane;
/*     */   static JLabel status;
/*     */   
/*     */   public progressBar() throws InterruptedException {
/*  46 */     JFrame frame = new JFrame();
/*  47 */     frame.setUndecorated(true);
/*  48 */     frame.setIconImage(Toolkit.getDefaultToolkit().getImage(progressBar.class.getResource("/img/icons8_ingredients_50px.png")));
/*  49 */     frame.setDefaultCloseOperation(3);
/*  50 */     frame.setBounds(500, 250, 358, 314);
/*  51 */     contentPane = new JPanel();
/*  52 */     contentPane.setBackground(new Color(240, 240, 240));
/*  53 */     contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
/*     */     
/*  55 */     frame.setContentPane(contentPane);
/*  56 */     contentPane.setLayout((LayoutManager)null);
/*     */     
/*  58 */     JProgressBar jProgressBar = new JProgressBar();
/*  59 */     jProgressBar.setForeground(Color.BLUE);
/*  60 */     jProgressBar.setStringPainted(true);
/*  61 */     jProgressBar.setBounds(0, 289, 358, 14);
/*  62 */     contentPane.add(jProgressBar);
/*     */ 
/*     */     
/*  65 */     JLabel lblNewLabel = new JLabel("TRINEPOS SYSTEM");
/*  66 */     lblNewLabel.setHorizontalAlignment(0);
/*  67 */     lblNewLabel.setFont(new Font("OCR A Extended", 0, 18));
/*  68 */     lblNewLabel.setBounds(32, 0, 275, 43);
/*  69 */     contentPane.add(lblNewLabel);
/*     */     
/*  71 */     JLabel lblNewLabel_1 = new JLabel("");
/*  72 */     lblNewLabel_1.setHorizontalAlignment(0);
/*     */     
/*     */     try {
/*  75 */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/img/iicon.png"));
/*  76 */       Image scaledImage = image.getScaledInstance(200, 150, 4);
/*  77 */       lblNewLabel_1.setIcon(new ImageIcon(progressBar.class.getResource("/icons/loader (1).gif")));
/*  78 */     } catch (IOException e) {
/*  79 */       e.printStackTrace();
/*     */     } 
/*     */     
/*  82 */     lblNewLabel_1.setBounds(0, 68, 358, 194);
/*  83 */     contentPane.add(lblNewLabel_1);
/*     */     
/*  85 */     final JLabel lblNewLabel_2 = new JLabel("X");
/*  86 */     lblNewLabel_2.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  89 */             System.exit(0);
/*     */           }
/*     */           
/*     */           public void mouseEntered(MouseEvent e) {
/*  93 */             lblNewLabel_2.setFont(new Font("Tahoma", 0, 21));
/*     */           }
/*     */           
/*     */           public void mouseExited(MouseEvent e) {
/*  97 */             lblNewLabel_2.setFont(new Font("Tahoma", 0, 18));
/*     */           }
/*     */         });
/* 100 */     lblNewLabel_2.setForeground(new Color(255, 0, 0));
/* 101 */     lblNewLabel_2.setFont(new Font("Tahoma", 0, 18));
/* 102 */     lblNewLabel_2.setHorizontalAlignment(0);
/* 103 */     lblNewLabel_2.setBounds(317, 0, 41, 43);
/* 104 */     contentPane.add(lblNewLabel_2);
/*     */     
/* 106 */     status = new JLabel("Loading...");
/* 107 */     status.setForeground(Color.BLUE);
/* 108 */     status.setHorizontalAlignment(0);
/* 109 */     status.setFont(new Font("DialogInput", 0, 17));
/* 110 */     status.setBounds(0, 264, 358, 23);
/* 111 */     contentPane.add(status);
/*     */     
/* 113 */     frame.setVisible(true);
/*     */     
/* 115 */     for (int a = 0; a <= 100; a++) {
/* 116 */       jProgressBar.setValue(a);
/* 117 */       Thread.sleep(60L);
/* 118 */       if (a == 30) {
/* 119 */         fileFinder();
/* 120 */       } else if (a == 60) {
/* 121 */         PFetcher properties = new PFetcher();
/* 122 */         if (!PFetcher.getSettings("firstTime").contains("true")) {
/* 123 */           mycon();
/*     */         }
/* 125 */       } else if (a == 100) {
/* 126 */         jProgressBar.setString("ALL SET");
/* 127 */         Thread.sleep(2000L);
/* 128 */         frame.dispose();
/*     */         
/* 130 */         getTheme();
/* 131 */       } else if (a > 20 && a < 30) {
/* 132 */         status.setText("Initializing file search...");
/* 133 */       } else if (a > 35 && a < 50) {
/* 134 */         status.setText("Initializing Database Connection");
/* 135 */       } else if (a > 50 && a < 60) {
/* 136 */         status.setText("Establishing Database Connection");
/* 137 */       } else if (a > 70 && a < 85) {
/* 138 */         status.setText("Starting Modules");
/* 139 */       } else if (a > 70 && a < 85) {
/* 140 */         status.setText("Starting Modules");
/* 141 */       } else if (a > 85) {
/* 142 */         status.setText("Starting Main System");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   private void getTheme() {
/* 148 */     PFetcher properties = new PFetcher();
/* 149 */     if (PFetcher.getSettings("ui.theme").contains("Soft Light")) {
/* 150 */       FlatIntelliJLaf.setup();
/* 151 */     } else if (PFetcher.getSettings("ui.theme").contains("Nebular")) {
/* 152 */       FlatMacLightLaf.setup();
/* 153 */     } else if (PFetcher.getSettings("ui.theme").contains("Soft Dark")) {
/* 154 */       FlatDarkLaf.setup();
/* 155 */     } else if (PFetcher.getSettings("ui.theme").contains("Dracular")) {
/* 156 */       FlatDarculaLaf.setup();
/*     */     } 
/* 158 */     if (PFetcher.getSettings("firstTime").contains("true")) {
/*     */     
/*     */     } else {
/*     */     
/*     */     } 
/*     */   }
/*     */   
/*     */   void fileFinder() {
/* 166 */     if (PFetcher.setsFile.exists()) {
/* 167 */       status.setText("Loaded...config1");
/* 168 */       status.setForeground(Color.BLUE); 
/* 169 */       try { Thread.sleep(50L); } catch (InterruptedException interruptedException) {}
/* 170 */       if (PFetcher.defsFile.exists()) {
/* 171 */         status.setText("Loaded...config2");
/* 172 */         status.setForeground(Color.green);
/*     */       } 
/* 174 */     } else if (!PFetcher.setsFile.exists()) {
/* 175 */       contentPane.setForeground(Color.YELLOW);
/* 176 */       status.setText("Configurations File Were Not Found!!!"); 
/* 177 */       try { Thread.sleep(50L); } catch (InterruptedException interruptedException) {}
/* 178 */       if (!PFetcher.defsFile.exists()) {
/* 179 */         contentPane.setBackground(Color.RED);
/* 180 */         status.setText("Loaded...properties2.prop");
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public static Connection mycon() {
/* 185 */     Connection con = null;
/* 186 */     PFetcher properties = new PFetcher();
/*     */     try {
/* 188 */       Class.forName("com.mysql.cj.jdbc.Driver");
/* 189 */       con = DriverManager.getConnection("jdbc:mysql://" + 
/* 190 */           PFetcher.getSettings("db.url") + 
/* 191 */           ":" + 
/* 192 */           PFetcher.getSettings("db.port") + 
/* 193 */           "/" + 
/* 194 */           PFetcher.getSettings("db.name") + 
/* 195 */           "?useSSL=False", PFetcher.getSettings("db.uname"), PFetcher.getSettings("db.passwd"));
/* 196 */       return con;
/* 197 */     } catch (SQLException e) {
/* 198 */       if (e.toString().contains("The driver has not received any packets from the server.")) {
/* 199 */         status.setForeground(Color.RED);
/* 200 */         status.setText("Connection is down");
/* 201 */         JOptionPane.showMessageDialog(null, "The Database is Down\nPlease Ensure Database is up and running", "DATABASE ERROR", 0);
/* 202 */       } else if (e.toString().contains("Unknown database")) {
/* 203 */         JOptionPane.showMessageDialog(null, "The database name is incorrect\nCheck the database name and try again", "DATABASE ERROR", 0);
/*     */       } 
/* 205 */       return null;
/* 206 */     } catch (ClassNotFoundException ex) {
/* 207 */       JOptionPane.showMessageDialog(null, "Error due to Connector!!!", "DATABASE ERROR", 0);
/*     */       
/* 209 */       return null;
/*     */     } 
/*     */   } void dbTester() {
/*     */     try {
/* 213 */       db.mycon().createStatement();
/* 214 */       status.setText("CONNECTION ESTABLISHED");
/* 215 */       status.setBackground(Color.green);
/* 216 */     } catch (SQLException e) {
/* 217 */       status.setBackground(Color.RED);
/* 218 */       status.setText("ERROR CONNECTING TO DATABASE"); 
/* 219 */       try { Thread.sleep(2000L); } catch (InterruptedException interruptedException) {}
/* 220 */       JOptionPane.showMessageDialog(null, "Error loading data, Please check your\nDatabase connections and try again", "Dataload Error", 0);
/* 221 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void main(String[] args) throws IOException, InterruptedException {
/* 226 */     FlatMacLightLaf.setup();
/* 227 */     progressBar pb = new progressBar();
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/progressBar.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */