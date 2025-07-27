/*     */ package raven.progressindicator;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.Border;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.MatteBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ShopAccount
/*     */   extends JPanel
/*     */ {
/*     */   private JTextField textField;
/*     */   private JTextField textField_1;
/*     */   private JTextField textField_2;
/*     */   private JTextField textField_3;
/*     */   private JTextField textField_4;
/*     */   private JTextField textField_5;
/*     */   
/*     */   public ShopAccount() {
/*  29 */     setSize(650, 356);
/*  30 */     setLayout((LayoutManager)null);
/*     */     
/*  32 */     JPanel panel = new JPanel();
/*  33 */     panel.setBounds(0, 0, 313, 356);
/*  34 */     add(panel);
/*  35 */     panel.setLayout((LayoutManager)null);
/*     */     
/*  37 */     JLabel lblNewLabel = new JLabel("");
/*  38 */     lblNewLabel.setIcon(new ImageIcon(ShopAccount.class.getResource("/img/user.png")));
/*  39 */     lblNewLabel.setHorizontalAlignment(0);
/*  40 */     lblNewLabel.setBounds(0, 0, 314, 337);
/*  41 */     panel.add(lblNewLabel);
/*     */     
/*  43 */     JPanel panel_1 = new JPanel();
/*  44 */     panel_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/*  45 */     panel_1.setBounds(315, 0, 335, 356);
/*  46 */     add(panel_1);
/*  47 */     panel_1.setLayout((LayoutManager)null);
/*     */     
/*  49 */     JLabel lblNewLabel_2_2_1_1_2 = new JLabel("Phone : ");
/*  50 */     lblNewLabel_2_2_1_1_2.setFont(new Font("Tahoma", 0, 13));
/*  51 */     lblNewLabel_2_2_1_1_2.setBounds(10, 302, 80, 24);
/*  52 */     panel_1.add(lblNewLabel_2_2_1_1_2);
/*     */     
/*  54 */     this.textField = new JTextField();
/*  55 */     this.textField.setHorizontalAlignment(0);
/*  56 */     this.textField.setForeground(Color.BLACK);
/*  57 */     this.textField.setFont(new Font("Lucida Bright", 1, 13));
/*  58 */     this.textField.setColumns(10);
/*  59 */     this.textField.setBorder((Border)null);
/*  60 */     this.textField.setBackground(Color.LIGHT_GRAY);
/*  61 */     this.textField.setBounds(96, 302, 233, 24);
/*  62 */     panel_1.add(this.textField);
/*     */     
/*  64 */     this.textField_1 = new JTextField();
/*  65 */     this.textField_1.setHorizontalAlignment(0);
/*  66 */     this.textField_1.setForeground(Color.BLACK);
/*  67 */     this.textField_1.setFont(new Font("Lucida Bright", 1, 13));
/*  68 */     this.textField_1.setColumns(10);
/*  69 */     this.textField_1.setBorder((Border)null);
/*  70 */     this.textField_1.setBackground(Color.LIGHT_GRAY);
/*  71 */     this.textField_1.setBounds(96, 270, 233, 24);
/*  72 */     panel_1.add(this.textField_1);
/*     */     
/*  74 */     JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Phone : ");
/*  75 */     lblNewLabel_2_2_1_1_1.setFont(new Font("Tahoma", 0, 13));
/*  76 */     lblNewLabel_2_2_1_1_1.setBounds(10, 270, 80, 24);
/*  77 */     panel_1.add(lblNewLabel_2_2_1_1_1);
/*     */     
/*  79 */     this.textField_2 = new JTextField();
/*  80 */     this.textField_2.setHorizontalAlignment(0);
/*  81 */     this.textField_2.setForeground(Color.BLACK);
/*  82 */     this.textField_2.setFont(new Font("Lucida Bright", 1, 13));
/*  83 */     this.textField_2.setColumns(10);
/*  84 */     this.textField_2.setBorder((Border)null);
/*  85 */     this.textField_2.setBackground(Color.LIGHT_GRAY);
/*  86 */     this.textField_2.setBounds(96, 237, 233, 24);
/*  87 */     panel_1.add(this.textField_2);
/*     */     
/*  89 */     JLabel lblNewLabel_2_2_1_1 = new JLabel("Full Name : ");
/*  90 */     lblNewLabel_2_2_1_1.setHorizontalAlignment(2);
/*  91 */     lblNewLabel_2_2_1_1.setFont(new Font("Tahoma", 0, 13));
/*  92 */     lblNewLabel_2_2_1_1.setBounds(10, 237, 80, 24);
/*  93 */     panel_1.add(lblNewLabel_2_2_1_1);
/*     */     
/*  95 */     JLabel lblNewLabel_2_2_1 = new JLabel("Teller / Employee Details");
/*  96 */     lblNewLabel_2_2_1.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/*  97 */     lblNewLabel_2_2_1.setHorizontalAlignment(0);
/*  98 */     lblNewLabel_2_2_1.setFont(new Font("Tahoma", 0, 13));
/*  99 */     lblNewLabel_2_2_1.setBounds(0, 202, 335, 24);
/* 100 */     panel_1.add(lblNewLabel_2_2_1);
/*     */     
/* 102 */     this.textField_3 = new JTextField();
/* 103 */     this.textField_3.setHorizontalAlignment(0);
/* 104 */     this.textField_3.setForeground(Color.BLACK);
/* 105 */     this.textField_3.setFont(new Font("Lucida Bright", 1, 13));
/* 106 */     this.textField_3.setColumns(10);
/* 107 */     this.textField_3.setBorder((Border)null);
/* 108 */     this.textField_3.setBackground(Color.LIGHT_GRAY);
/* 109 */     this.textField_3.setBounds(96, 170, 233, 24);
/* 110 */     panel_1.add(this.textField_3);
/*     */     
/* 112 */     this.textField_4 = new JTextField();
/* 113 */     this.textField_4.setHorizontalAlignment(0);
/* 114 */     this.textField_4.setForeground(Color.BLACK);
/* 115 */     this.textField_4.setFont(new Font("Lucida Bright", 1, 13));
/* 116 */     this.textField_4.setColumns(10);
/* 117 */     this.textField_4.setBorder((Border)null);
/* 118 */     this.textField_4.setBackground(Color.LIGHT_GRAY);
/* 119 */     this.textField_4.setBounds(96, 137, 233, 24);
/* 120 */     panel_1.add(this.textField_4);
/*     */     
/* 122 */     this.textField_5 = new JTextField();
/* 123 */     this.textField_5.setHorizontalAlignment(0);
/* 124 */     this.textField_5.setForeground(Color.BLACK);
/* 125 */     this.textField_5.setFont(new Font("Lucida Bright", 1, 13));
/* 126 */     this.textField_5.setColumns(10);
/* 127 */     this.textField_5.setBorder((Border)null);
/* 128 */     this.textField_5.setBackground(Color.LIGHT_GRAY);
/* 129 */     this.textField_5.setBounds(96, 106, 233, 24);
/* 130 */     panel_1.add(this.textField_5);
/*     */     
/* 132 */     JLabel lblNewLabel_2 = new JLabel("Shop Name : ");
/* 133 */     lblNewLabel_2.setFont(new Font("Tahoma", 0, 13));
/* 134 */     lblNewLabel_2.setBounds(10, 107, 80, 24);
/* 135 */     panel_1.add(lblNewLabel_2);
/*     */     
/* 137 */     JLabel lblNewLabel_2_1 = new JLabel("Location : ");
/* 138 */     lblNewLabel_2_1.setFont(new Font("Tahoma", 0, 13));
/* 139 */     lblNewLabel_2_1.setBounds(10, 135, 73, 24);
/* 140 */     panel_1.add(lblNewLabel_2_1);
/*     */     
/* 142 */     JLabel lblNewLabel_2_2 = new JLabel("PO Address");
/* 143 */     lblNewLabel_2_2.setFont(new Font("Tahoma", 0, 13));
/* 144 */     lblNewLabel_2_2.setBounds(10, 169, 80, 24);
/* 145 */     panel_1.add(lblNewLabel_2_2);
/*     */     
/* 147 */     JLabel lblNewLabel_1 = new JLabel("Creating Shop Account");
/* 148 */     lblNewLabel_1.setBorder(new EtchedBorder(1, null, null));
/* 149 */     lblNewLabel_1.setHorizontalAlignment(0);
/* 150 */     lblNewLabel_1.setFont(new Font("Ebrima", 1, 17));
/* 151 */     lblNewLabel_1.setBounds(0, 28, 335, 34);
/* 152 */     panel_1.add(lblNewLabel_1);
/*     */     
/* 154 */     JLabel lblNewLabel_2_2_1_2 = new JLabel("Shop Details");
/* 155 */     lblNewLabel_2_2_1_2.setHorizontalAlignment(0);
/* 156 */     lblNewLabel_2_2_1_2.setFont(new Font("Tahoma", 0, 13));
/* 157 */     lblNewLabel_2_2_1_2.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/* 158 */     lblNewLabel_2_2_1_2.setBounds(0, 71, 335, 24);
/* 159 */     panel_1.add(lblNewLabel_2_2_1_2);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/raven/progressindicator/ShopAccount.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */