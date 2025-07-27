/*     */ package trinecodecmain;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.util.HashMap;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ 
/*     */ public class Reports extends JPanel {
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JLabel jLabel5;
/*     */   private JPanel jPanel1;
/*     */   private JPanel jPanel2;
/*     */   private JTextField para_inid;
/*     */   
/*     */   public Reports() {
/*  26 */     initComponents();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/*  38 */     this.jPanel1 = new JPanel();
/*  39 */     this.jPanel2 = new JPanel();
/*  40 */     this.jLabel5 = new JLabel();
/*  41 */     this.para_inid = new JTextField();
/*  42 */     this.jButton1 = new JButton();
/*  43 */     this.jButton2 = new JButton();
/*     */     
/*  45 */     this.jPanel2.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/*  47 */     this.jLabel5.setFont(new Font("Tahoma", 1, 14));
/*  48 */     this.jLabel5.setText("Invoice NO :");
/*     */     
/*  50 */     this.para_inid.setFont(new Font("Tahoma", 1, 14));
/*  51 */     this.para_inid.setText("0");
/*  52 */     this.para_inid.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/*  54 */             Reports.this.para_inidKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/*  58 */     this.jButton1.setFont(new Font("Tahoma", 1, 14));
/*  59 */     this.jButton1.setText("View All Sales");
/*  60 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  62 */             Reports.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  66 */     this.jButton2.setFont(new Font("Tahoma", 1, 14));
/*  67 */     this.jButton2.setText("View");
/*  68 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  70 */             Reports.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/*  74 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  75 */     this.jPanel2.setLayout(jPanel2Layout);
/*  76 */     jPanel2Layout.setHorizontalGroup(
/*  77 */         jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  78 */         .addGroup(jPanel2Layout.createSequentialGroup()
/*  79 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  80 */             .addGroup(jPanel2Layout.createSequentialGroup()
/*  81 */               .addGap(40, 40, 40)
/*  82 */               .addComponent(this.jLabel5)
/*  83 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/*  84 */               .addComponent(this.para_inid, -2, 222, -2))
/*  85 */             .addGroup(jPanel2Layout.createSequentialGroup()
/*  86 */               .addGap(31, 31, 31)
/*  87 */               .addComponent(this.jButton1, -2, 158, -2)))
/*  88 */           .addContainerGap(306, 32767))
/*  89 */         .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  90 */           .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/*  91 */             .addContainerGap(372, 32767)
/*  92 */             .addComponent(this.jButton2, -2, 111, -2)
/*  93 */             .addGap(175, 175, 175))));
/*     */     
/*  95 */     jPanel2Layout.setVerticalGroup(
/*  96 */         jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/*  97 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/*  98 */           .addContainerGap(30, 32767)
/*  99 */           .addComponent(this.jButton1, -2, 28, -2)
/* 100 */           .addGap(26, 26, 26)
/* 101 */           .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 102 */             .addComponent(this.jLabel5)
/* 103 */             .addComponent(this.para_inid, -2, -1, -2))
/* 104 */           .addGap(51, 51, 51))
/* 105 */         .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 106 */           .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
/* 107 */             .addContainerGap(83, 32767)
/* 108 */             .addComponent(this.jButton2, -2, 28, -2)
/* 109 */             .addGap(47, 47, 47))));
/*     */ 
/*     */     
/* 112 */     GroupLayout jPanel1Layout = new GroupLayout(this.jPanel1);
/* 113 */     this.jPanel1.setLayout(jPanel1Layout);
/* 114 */     jPanel1Layout.setHorizontalGroup(
/* 115 */         jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 116 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 117 */           .addGap(24, 24, 24)
/* 118 */           .addComponent(this.jPanel2, -2, -1, -2)
/* 119 */           .addContainerGap(-1, 32767)));
/*     */     
/* 121 */     jPanel1Layout.setVerticalGroup(
/* 122 */         jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 123 */         .addGroup(jPanel1Layout.createSequentialGroup()
/* 124 */           .addGap(19, 19, 19)
/* 125 */           .addComponent(this.jPanel2, -2, -1, -2)
/* 126 */           .addContainerGap(276, 32767)));
/*     */ 
/*     */     
/* 129 */     GroupLayout layout = new GroupLayout(this);
/* 130 */     setLayout(layout);
/* 131 */     layout.setHorizontalGroup(
/* 132 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 133 */         .addComponent(this.jPanel1, -1, -1, 32767));
/*     */     
/* 135 */     layout.setVerticalGroup(
/* 136 */         layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 137 */         .addComponent(this.jPanel1, -1, -1, 32767));
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void para_inidKeyReleased(KeyEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 152 */     ReportView r = new ReportView(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/reports/inidreport.jasper");
/* 153 */     r.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 163 */     HashMap<Object, Object> para = new HashMap<>();
/*     */     
/* 165 */     para.put("invo_para", this.para_inid.getText());
/*     */     
/* 167 */     ReportView r = new ReportView(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/reports/reportsearch.jasper", para);
/* 168 */     r.setVisible(true);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/Reports.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */