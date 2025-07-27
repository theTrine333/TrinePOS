/*     */ package trinecodec.subscription;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.EventQueue;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.SystemColor;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.UIManager;
/*     */ import javax.swing.border.EtchedBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AddSubscription
/*     */   extends JFrame
/*     */ {
/*     */   private JTextField textField;
/*     */   private JTextField textField_1;
/*     */   private JTextField textField_2;
/*     */   private JTextField textField_3;
/*     */   
/*     */   public static void main(String[] args) {
/*     */     try {
/*  35 */       UIManager.setLookAndFeel("com.formdev.flatlaf.themes.FlatMacLightLaf");
/*  36 */     } catch (Throwable e) {
/*  37 */       e.printStackTrace();
/*     */     } 
/*  39 */     EventQueue.invokeLater(new Runnable() {
/*     */           public void run() {
/*     */             try {
/*  42 */               AddSubscription addSubscription = new AddSubscription();
/*     */             }
/*  44 */             catch (Exception e) {
/*  45 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public AddSubscription() {
/*  55 */     setResizable(false);
/*     */     
/*  57 */     setDefaultCloseOperation(2);
/*  58 */     setBounds(550, 150, 450, 413);
/*  59 */     getContentPane().setLayout((LayoutManager)null);
/*     */     
/*  61 */     JPanel panel = new JPanel();
/*  62 */     panel.setBounds(0, 0, 434, 35);
/*  63 */     panel.setLayout((LayoutManager)null);
/*  64 */     panel.setBorder(new EtchedBorder(1, null, null));
/*  65 */     getContentPane().add(panel);
/*     */     
/*  67 */     JLabel lblNewLabel = new JLabel("Trine Technologies Subscription");
/*  68 */     lblNewLabel.setHorizontalAlignment(0);
/*  69 */     lblNewLabel.setForeground(Color.BLUE);
/*  70 */     lblNewLabel.setFont(new Font("Segoe UI Black", 0, 17));
/*  71 */     lblNewLabel.setBounds(-4, 0, 444, 34);
/*  72 */     panel.add(lblNewLabel);
/*     */     
/*  74 */     JPanel panel_1 = new JPanel();
/*  75 */     panel_1.setBounds(0, 36, 434, 34);
/*  76 */     panel_1.setLayout((LayoutManager)null);
/*  77 */     panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
/*  78 */     getContentPane().add(panel_1);
/*     */     
/*  80 */     JLabel lblNewLabel_1 = new JLabel("Adding Subscription");
/*  81 */     lblNewLabel_1.setHorizontalAlignment(0);
/*  82 */     lblNewLabel_1.setFont(new Font("Segoe UI Black", 0, 14));
/*  83 */     lblNewLabel_1.setBounds(10, 11, 432, 25);
/*  84 */     panel_1.add(lblNewLabel_1);
/*     */     
/*  86 */     JLabel lblNewLabel_2 = new JLabel("Customer Name : ");
/*  87 */     lblNewLabel_2.setBounds(16, 81, 132, 22);
/*  88 */     lblNewLabel_2.setFont(new Font("Segoe UI Black", 0, 13));
/*  89 */     getContentPane().add(lblNewLabel_2);
/*     */     
/*  91 */     JLabel lblNewLabel_2_1 = new JLabel("Subscription Type : ");
/*  92 */     lblNewLabel_2_1.setBounds(16, 115, 132, 22);
/*  93 */     lblNewLabel_2_1.setFont(new Font("Segoe UI Black", 0, 13));
/*  94 */     getContentPane().add(lblNewLabel_2_1);
/*     */     
/*  96 */     JComboBox comboBox = new JComboBox();
/*  97 */     comboBox.setForeground(SystemColor.textHighlight);
/*  98 */     comboBox.setModel(new DefaultComboBoxModel<>(new String[] { "Basic", "Advanced", "Premium" }));
/*  99 */     comboBox.setBounds(152, 117, 272, 22);
/* 100 */     comboBox.setFont(new Font("Segoe UI Black", 0, 13));
/* 101 */     getContentPane().add(comboBox);
/*     */     
/* 103 */     this.textField = new JTextField();
/* 104 */     this.textField.setForeground(SystemColor.textHighlight);
/* 105 */     this.textField.setBounds(152, 81, 272, 24);
/* 106 */     this.textField.setFont(new Font("Segoe UI Black", 0, 13));
/* 107 */     this.textField.setColumns(10);
/* 108 */     getContentPane().add(this.textField);
/*     */     
/* 110 */     JLabel lblNewLabel_2_2 = new JLabel("Price : ");
/* 111 */     lblNewLabel_2_2.setBounds(16, 150, 132, 22);
/* 112 */     lblNewLabel_2_2.setFont(new Font("Segoe UI Black", 0, 13));
/* 113 */     getContentPane().add(lblNewLabel_2_2);
/*     */     
/* 115 */     this.textField_1 = new JTextField();
/* 116 */     this.textField_1.setForeground(SystemColor.textHighlight);
/* 117 */     this.textField_1.setBounds(152, 150, 272, 24);
/* 118 */     this.textField_1.setFont(new Font("Segoe UI Black", 0, 13));
/* 119 */     this.textField_1.setColumns(10);
/* 120 */     getContentPane().add(this.textField_1);
/*     */     
/* 122 */     JComboBox comboBox_1 = new JComboBox();
/* 123 */     comboBox_1.setForeground(SystemColor.textHighlight);
/* 124 */     comboBox_1.setBounds(152, 185, 272, 22);
/* 125 */     comboBox_1.setFont(new Font("Segoe UI Black", 0, 13));
/* 126 */     getContentPane().add(comboBox_1);
/*     */     
/* 128 */     JLabel lblNewLabel_2_1_1 = new JLabel("Payment Method : ");
/* 129 */     lblNewLabel_2_1_1.setBounds(16, 183, 132, 22);
/* 130 */     lblNewLabel_2_1_1.setFont(new Font("Segoe UI Black", 0, 13));
/* 131 */     getContentPane().add(lblNewLabel_2_1_1);
/*     */     
/* 133 */     JLabel lblNewLabel_2_2_1 = new JLabel("Duration : ");
/* 134 */     lblNewLabel_2_2_1.setFont(new Font("Segoe UI Black", 0, 13));
/* 135 */     lblNewLabel_2_2_1.setBounds(16, 218, 132, 22);
/* 136 */     getContentPane().add(lblNewLabel_2_2_1);
/*     */     
/* 138 */     this.textField_2 = new JTextField();
/* 139 */     this.textField_2.setForeground(SystemColor.textHighlight);
/* 140 */     this.textField_2.setFont(new Font("Segoe UI Black", 0, 13));
/* 141 */     this.textField_2.setColumns(10);
/* 142 */     this.textField_2.setBounds(152, 218, 272, 24);
/* 143 */     getContentPane().add(this.textField_2);
/*     */     
/* 145 */     JButton btnNewButton = new JButton("Pay");
/* 146 */     btnNewButton.setForeground(Color.GREEN);
/* 147 */     btnNewButton.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 149 */             String customerKey = "CUSTOMER API KEY";
/* 150 */             String customerPassword = "CUSTOMER API PASS";
/*     */           }
/*     */         });
/*     */     
/* 154 */     btnNewButton.setFocusable(false);
/* 155 */     btnNewButton.setFont(new Font("Segoe UI Black", 0, 15));
/* 156 */     btnNewButton.setBounds(315, 306, 109, 34);
/* 157 */     getContentPane().add(btnNewButton);
/*     */     
/* 159 */     final JButton btnNewButton_1 = new JButton("Close");
/* 160 */     btnNewButton_1.setFocusable(false);
/* 161 */     btnNewButton_1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 163 */             if (e.getSource() == btnNewButton_1) {
/* 164 */               AddSubscription.this.dispose();
/*     */             }
/*     */           }
/*     */         });
/* 168 */     btnNewButton_1.setFont(new Font("Segoe UI Black", 0, 15));
/* 169 */     btnNewButton_1.setBounds(201, 306, 102, 34);
/* 170 */     getContentPane().add(btnNewButton_1);
/*     */     
/* 172 */     this.textField_3 = new JTextField();
/* 173 */     this.textField_3.setForeground(SystemColor.textHighlight);
/* 174 */     this.textField_3.setFont(new Font("Segoe UI Black", 0, 13));
/* 175 */     this.textField_3.setColumns(10);
/* 176 */     this.textField_3.setBounds(152, 251, 272, 24);
/* 177 */     getContentPane().add(this.textField_3);
/*     */     
/* 179 */     JLabel lblNewLabel_2_2_1_1 = new JLabel("Expiry Date : ");
/* 180 */     lblNewLabel_2_2_1_1.setFont(new Font("Segoe UI Black", 0, 13));
/* 181 */     lblNewLabel_2_2_1_1.setBounds(16, 251, 132, 22);
/* 182 */     getContentPane().add(lblNewLabel_2_2_1_1);
/*     */     
/* 184 */     setVisible(true);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/subscription/AddSubscription.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */