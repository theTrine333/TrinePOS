/*     */ package trinecode.tools;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Cursor;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Toolkit;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.IOException;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JPasswordField;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ import javax.swing.border.MatteBorder;
/*     */ import trinecodec.mini.views.daysSale;
/*     */ import trinecodecmain.db;
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
/*     */ public class loginPage
/*     */   extends JFrame
/*     */ {
/*     */   private JPanel contentPane;
/*  53 */   PFetcher properties = new PFetcher();
/*     */   
/*     */   private JTextField textField;
/*     */   
/*     */   public static String role;
/*     */   
/*     */   public loginPage() {
/*  60 */     setResizable(false);
/*  61 */     setTitle("TPOS SYSTEM LOGIN");
/*  62 */     setIconImage(Toolkit.getDefaultToolkit().getImage(loginPage.class.getResource("/img/icons8_ingredients_50px.png")));
/*  63 */     setDefaultCloseOperation(3);
/*  64 */     setSize(585, 426);
/*  65 */     setLocationRelativeTo(null);
/*  66 */     getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  68 */     JPanel panel = new JPanel();
/*  69 */     panel.setBorder(new EtchedBorder(1, null, null));
/*  70 */     panel.setBounds(0, 0, 289, 376);
/*  71 */     getContentPane().add(panel);
/*  72 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  74 */     JLabel lblNewLabel = new JLabel("");
/*  75 */     lblNewLabel.setHorizontalAlignment(0);
/*  76 */     lblNewLabel.setIcon(new ImageIcon(loginPage.class.getResource("/icons/lock.jpg")));
/*  77 */     lblNewLabel.setBounds(7, 11, 275, 354);
/*  78 */     panel.add(lblNewLabel);
/*     */     
/*  80 */     JPanel panel_1 = new JPanel();
/*  81 */     panel_1.setBorder(new EtchedBorder(1, null, null));
/*  82 */     panel_1.setBounds(290, 0, 269, 376);
/*  83 */     getContentPane().add(panel_1);
/*  84 */     panel_1.setLayout((LayoutManager)null);
/*     */     
/*  86 */     JLabel lblNewLabel_1 = new JLabel();
/*  87 */     lblNewLabel_1.setBackground(new Color(0, 102, 204));
/*  88 */     lblNewLabel_1.setFont(new Font("Tahoma", 1, 13));
/*  89 */     lblNewLabel_1.setText(PFetcher.getSettings("ui.title"));
/*  90 */     lblNewLabel_1.setHorizontalAlignment(0);
/*  91 */     lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 255)));
/*  92 */     lblNewLabel_1.setBounds(0, 0, 269, 46);
/*  93 */     panel_1.add(lblNewLabel_1);
/*     */     
/*  95 */     JLabel lblNewLabel_1_1 = new JLabel("POWERED BY : TRINETECHS");
/*  96 */     lblNewLabel_1_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 102, 204)));
/*  97 */     lblNewLabel_1_1.setForeground(new Color(0, 102, 153));
/*  98 */     lblNewLabel_1_1.setFont(new Font("DialogInput", 0, 13));
/*  99 */     lblNewLabel_1_1.setHorizontalAlignment(0);
/* 100 */     lblNewLabel_1_1.setBounds(0, 327, 269, 46);
/* 101 */     panel_1.add(lblNewLabel_1_1);
/*     */     
/* 103 */     final JLabel lblNewLabel_1_1_1 = new JLabel("Don't have an account? Sign up");
/* 104 */     lblNewLabel_1_1_1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseEntered(MouseEvent e) {
/* 107 */             lblNewLabel_1_1_1.setFont(new Font("Dialog", 1, 15));
/*     */           }
/*     */           
/*     */           public void mouseExited(MouseEvent e) {
/* 111 */             lblNewLabel_1_1_1.setFont(new Font("Dialog", 0, 13));
/*     */           }
/*     */         });
/* 114 */     lblNewLabel_1_1_1.setCursor(Cursor.getPredefinedCursor(12));
/* 115 */     lblNewLabel_1_1_1.setHorizontalAlignment(0);
/* 116 */     lblNewLabel_1_1_1.setForeground(new Color(0, 102, 153));
/* 117 */     lblNewLabel_1_1_1.setFont(new Font("Dialog", 0, 13));
/* 118 */     lblNewLabel_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 102, 204)));
/* 119 */     lblNewLabel_1_1_1.setBounds(0, 296, 269, 23);
/* 120 */     panel_1.add(lblNewLabel_1_1_1);
/*     */     
/* 122 */     this.textField = new JTextField();
/* 123 */     this.textField.setFont(new Font("Century Schoolbook", 0, 13));
/* 124 */     this.textField.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
/* 125 */     this.textField.setBackground(new Color(220, 220, 220));
/* 126 */     this.textField.setBounds(66, 146, 193, 25);
/* 127 */     panel_1.add(this.textField);
/* 128 */     this.textField.setColumns(10);
/*     */     
/* 130 */     JLabel lblNewLabel_2 = new JLabel("Username : ");
/* 131 */     lblNewLabel_2.setFont(new Font("Tahoma", 0, 12));
/* 132 */     lblNewLabel_2.setBounds(0, 146, 77, 23);
/* 133 */     panel_1.add(lblNewLabel_2);
/*     */     
/* 135 */     JLabel lblNewLabel_2_1_1 = new JLabel("Password : ");
/* 136 */     lblNewLabel_2_1_1.setFont(new Font("Tahoma", 0, 13));
/* 137 */     lblNewLabel_2_1_1.setBounds(0, 191, 77, 23);
/* 138 */     panel_1.add(lblNewLabel_2_1_1);
/*     */     
/* 140 */     final JButton btnNewButton = new JButton("LOGIN");
/* 141 */     btnNewButton.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 144 */             btnNewButton.doClick();
/*     */           }
/*     */         });
/* 147 */     btnNewButton.setCursor(Cursor.getPredefinedCursor(12));
/* 148 */     btnNewButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/*     */             try {
/* 151 */               Statement s = db.mycon().createStatement();
/* 152 */               String uname = loginPage.this.textField.getText();
/* 153 */               String passwd = loginPage.this.passwordField.getText().toString();
/* 154 */               if (uname.isBlank() || passwd.isBlank()) {
/* 155 */                 JOptionPane.showMessageDialog(null, "Please fill in your details", "Empty Fields", 2);
/*     */               } else {
/*     */                 
/* 158 */                 String sql = "SELECT * FROM defs WHERE Username='" + uname + "' AND Password='" + passwd + "' ";
/* 159 */                 ResultSet result = s.executeQuery(sql);
/* 160 */                 if (result.next()) {
/* 161 */                   loginPage.role = result.getString("type");
/* 162 */                   loginPage.passPanel.setBackground(Color.GREEN);
/* 163 */                   loginPage.status.setText("SUCCESSFULL");
/* 164 */                   loginPage.this.dispose();
/*     */                 } else {
/*     */                   
/* 167 */                   loginPage.this.passwordField.setText((String)null);
/* 168 */                   loginPage.passPanel.setBackground(Color.RED);
/* 169 */                   loginPage.status.setText("Wrong username or password");
/* 170 */                   loginPage.status.revalidate();
/* 171 */                   loginPage.status.repaint();
/*     */                 } 
/*     */               } 
/* 174 */             } catch (SQLException e1) {
/* 175 */               e1.printStackTrace();
/* 176 */               daysSale.errorGen(e1);
/*     */             } 
/*     */           }
/*     */         });
/* 180 */     btnNewButton.setFont(new Font("Tahoma", 0, 13));
/* 181 */     btnNewButton.setBounds(5, 253, 259, 32);
/* 182 */     panel_1.add(btnNewButton);
/*     */     
/* 184 */     passPanel = new JPanel();
/* 185 */     passPanel.setBackground(new Color(230, 230, 230));
/* 186 */     passPanel.setBounds(0, 55, 269, 32);
/* 187 */     panel_1.add(passPanel);
/* 188 */     passPanel.setLayout((LayoutManager)null);
/*     */     
/* 190 */     status = new JLabel("FILL YOUR DETAILS");
/* 191 */     status.setHorizontalAlignment(0);
/* 192 */     status.setBounds(10, 0, 249, 32);
/* 193 */     passPanel.add(status);
/*     */     
/* 195 */     JPanel panel_2 = new JPanel();
/* 196 */     panel_2.setBackground(new Color(220, 220, 220));
/* 197 */     panel_2.setBorder(UIManager.getBorder("List.focusCellHighlightBorder"));
/* 198 */     panel_2.setBounds(66, 188, 193, 26);
/* 199 */     panel_1.add(panel_2);
/* 200 */     panel_2.setLayout((LayoutManager)null);
/*     */     
/* 202 */     this.passwordField = new JPasswordField();
/* 203 */     this.passwordField.setFont(new Font("Century Schoolbook", 0, 13));
/* 204 */     this.passwordField.setBorder((Border)null);
/* 205 */     this.passwordField.setEchoChar('●');
/* 206 */     this.passwordField.setBackground(new Color(220, 220, 220));
/* 207 */     this.passwordField.setBounds(2, 2, 161, 23);
/* 208 */     panel_2.add(this.passwordField);
/*     */     
/* 210 */     final JLabel showPass = new JLabel("");
/* 211 */     showPass.setCursor(Cursor.getPredefinedCursor(12));
/* 212 */     showPass.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 215 */             if (loginPage.this.passwordField.getEchoChar() == '●') {
/* 216 */               loginPage.this.passwordField.setEchoChar(false);
/* 217 */               showPass.setText("");
/* 218 */               loginPage.iconSet(showPass, 30, 20, "/icons/hide.jpg");
/*     */             } else {
/*     */               
/* 221 */               showPass.setText("");
/* 222 */               loginPage.iconSet(showPass, 30, 20, "/img/see.jpg");
/* 223 */               loginPage.this.passwordField.setEchoChar('●');
/*     */             } 
/*     */           }
/*     */         });
/* 227 */     showPass.setBackground(new Color(230, 230, 230));
/* 228 */     showPass.setForeground(new Color(230, 230, 230));
/* 229 */     iconSet(showPass, 30, 20, "/img/see.jpg");
/* 230 */     showPass.setBounds(162, 0, 31, 25);
/* 231 */     panel_2.add(showPass);
/*     */     
/* 233 */     setVisible(true);
/* 234 */     this.passwordField.setText("Trine");
/* 235 */     this.textField.setText("Trine");
/* 236 */     btnNewButton.doClick();
/*     */   }
/*     */   static JLabel status; static JPanel passPanel; private JPasswordField passwordField;
/*     */   
/*     */   public static void iconSet(JLabel label, int width, int height, String location) {
/*     */     try {
/* 242 */       BufferedImage image = ImageIO.read(loginPage.class.getResource(location));
/* 243 */       Image scaledImage = image.getScaledInstance(width, height, 4);
/* 244 */       label.setIcon(new ImageIcon(scaledImage));
/* 245 */       label.revalidate();
/* 246 */       label.repaint();
/* 247 */     } catch (IOException e) {
/* 248 */       e.printStackTrace();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/loginPage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */