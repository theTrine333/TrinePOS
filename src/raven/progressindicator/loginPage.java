/*     */ package raven.progressindicator;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.SystemColor;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.MatteBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class loginPage
/*     */   extends JPanel
/*     */ {
/*     */   public static JTextField phone2;
/*     */   public static JTextField phone1;
/*     */   public static JTextField email;
/*     */   public static JTextField passwd;
/*     */   public static JTextField username;
/*     */   public static JTextField fullName;
/*     */   
/*     */   public loginPage() {
/*  28 */     setSize(650, 356);
/*  29 */     setLayout((LayoutManager)null);
/*     */     
/*  31 */     JPanel panel = new JPanel();
/*  32 */     panel.setBackground(SystemColor.inactiveCaptionBorder);
/*  33 */     panel.setBounds(0, 0, 313, 356);
/*  34 */     add(panel);
/*  35 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  37 */     JLabel lblNewLabel = new JLabel("");
/*  38 */     lblNewLabel.setIcon(new ImageIcon(loginPage.class.getResource("/img/user.png")));
/*  39 */     lblNewLabel.setHorizontalAlignment(0);
/*  40 */     lblNewLabel.setBounds(0, 0, 314, 337);
/*  41 */     panel.add(lblNewLabel);
/*     */     
/*  43 */     JPanel panel_1 = new JPanel();
/*  44 */     panel_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/*  45 */     panel_1.setBounds(318, 11, 332, 319);
/*  46 */     add(panel_1);
/*  47 */     panel_1.setLayout((LayoutManager)null);
/*     */     
/*  49 */     phone2 = new JTextField();
/*  50 */     phone2.setHorizontalAlignment(0);
/*  51 */     phone2.setForeground(Color.BLACK);
/*  52 */     phone2.setFont(new Font("Lucida Bright", 1, 13));
/*  53 */     phone2.setColumns(10);
/*  54 */     phone2.setBorder((Border)null);
/*  55 */     phone2.setBackground(Color.LIGHT_GRAY);
/*  56 */     phone2.setBounds(96, 283, 233, 24);
/*  57 */     panel_1.add(phone2);
/*     */     
/*  59 */     phone1 = new JTextField();
/*  60 */     phone1.setHorizontalAlignment(0);
/*  61 */     phone1.setForeground(Color.BLACK);
/*  62 */     phone1.setFont(new Font("Lucida Bright", 1, 13));
/*  63 */     phone1.setColumns(10);
/*  64 */     phone1.setBorder((Border)null);
/*  65 */     phone1.setBackground(Color.LIGHT_GRAY);
/*  66 */     phone1.setBounds(96, 251, 233, 24);
/*  67 */     panel_1.add(phone1);
/*     */     
/*  69 */     email = new JTextField();
/*  70 */     email.setHorizontalAlignment(0);
/*  71 */     email.setForeground(Color.BLACK);
/*  72 */     email.setFont(new Font("Lucida Bright", 1, 13));
/*  73 */     email.setColumns(10);
/*  74 */     email.setBorder((Border)null);
/*  75 */     email.setBackground(Color.LIGHT_GRAY);
/*  76 */     email.setBounds(96, 218, 233, 24);
/*  77 */     panel_1.add(email);
/*     */     
/*  79 */     passwd = new JTextField();
/*  80 */     passwd.setHorizontalAlignment(0);
/*  81 */     passwd.setForeground(Color.BLACK);
/*  82 */     passwd.setFont(new Font("Lucida Bright", 1, 13));
/*  83 */     passwd.setColumns(10);
/*  84 */     passwd.setBorder((Border)null);
/*  85 */     passwd.setBackground(Color.LIGHT_GRAY);
/*  86 */     passwd.setBounds(96, 185, 233, 24);
/*  87 */     panel_1.add(passwd);
/*     */     
/*  89 */     username = new JTextField();
/*  90 */     username.setHorizontalAlignment(0);
/*  91 */     username.setForeground(Color.BLACK);
/*  92 */     username.setFont(new Font("Lucida Bright", 1, 13));
/*  93 */     username.setColumns(10);
/*  94 */     username.setBorder((Border)null);
/*  95 */     username.setBackground(Color.LIGHT_GRAY);
/*  96 */     username.setBounds(96, 151, 233, 24);
/*  97 */     panel_1.add(username);
/*     */     
/*  99 */     fullName = new JTextField();
/* 100 */     fullName.setHorizontalAlignment(0);
/* 101 */     fullName.setForeground(Color.BLACK);
/* 102 */     fullName.setFont(new Font("Lucida Bright", 1, 13));
/* 103 */     fullName.setColumns(10);
/* 104 */     fullName.setBorder((Border)null);
/* 105 */     fullName.setBackground(Color.LIGHT_GRAY);
/* 106 */     fullName.setBounds(96, 118, 233, 24);
/* 107 */     panel_1.add(fullName);
/*     */     
/* 109 */     JLabel lblNewLabel_2_1 = new JLabel("Full Name : ");
/* 110 */     lblNewLabel_2_1.setFont(new Font("Tahoma", 0, 13));
/* 111 */     lblNewLabel_2_1.setBounds(10, 116, 73, 24);
/* 112 */     panel_1.add(lblNewLabel_2_1);
/*     */     
/* 114 */     JLabel lblNewLabel_2_2 = new JLabel("Username : ");
/* 115 */     lblNewLabel_2_2.setFont(new Font("Tahoma", 0, 13));
/* 116 */     lblNewLabel_2_2.setBounds(10, 150, 73, 24);
/* 117 */     panel_1.add(lblNewLabel_2_2);
/*     */     
/* 119 */     JLabel lblNewLabel_2_2_1 = new JLabel("Password : ");
/* 120 */     lblNewLabel_2_2_1.setHorizontalAlignment(2);
/* 121 */     lblNewLabel_2_2_1.setFont(new Font("Tahoma", 0, 13));
/* 122 */     lblNewLabel_2_2_1.setBounds(10, 183, 73, 24);
/* 123 */     panel_1.add(lblNewLabel_2_2_1);
/*     */     
/* 125 */     JLabel lblNewLabel_2_2_1_1 = new JLabel("Email : ");
/* 126 */     lblNewLabel_2_2_1_1.setHorizontalAlignment(2);
/* 127 */     lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", 0, 13));
/* 128 */     lblNewLabel_2_2_1_1.setBounds(10, 218, 80, 24);
/* 129 */     panel_1.add(lblNewLabel_2_2_1_1);
/*     */     
/* 131 */     JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Phone : ");
/* 132 */     lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", 0, 13));
/* 133 */     lblNewLabel_2_2_1_1_1.setBounds(10, 253, 80, 24);
/* 134 */     panel_1.add(lblNewLabel_2_2_1_1_1);
/*     */     
/* 136 */     JLabel lblNewLabel_2_2_1_1_2 = new JLabel("Phone : ");
/* 137 */     lblNewLabel_2_2_1_1_2.setFont(new Font("Tahoma", 0, 13));
/* 138 */     lblNewLabel_2_2_1_1_2.setBounds(10, 283, 80, 24);
/* 139 */     panel_1.add(lblNewLabel_2_2_1_1_2);
/*     */     
/* 141 */     JLabel lblNewLabel_1 = new JLabel("Creating User Account");
/* 142 */     lblNewLabel_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/* 143 */     lblNewLabel_1.setHorizontalAlignment(0);
/* 144 */     lblNewLabel_1.setFont(new Font("Ebrima", 1, 15));
/* 145 */     lblNewLabel_1.setBounds(4, 65, 325, 24);
/* 146 */     panel_1.add(lblNewLabel_1);
/*     */     
/* 148 */     JLabel lblNewLabel_2 = new JLabel("TPOS SYSTEM");
/* 149 */     lblNewLabel_2.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/* 150 */     lblNewLabel_2.setHorizontalAlignment(0);
/* 151 */     lblNewLabel_2.setFont(new Font("Tahoma", 1, 18));
/* 152 */     lblNewLabel_2.setBounds(4, 11, 325, 43);
/* 153 */     panel_1.add(lblNewLabel_2);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/loginPage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */