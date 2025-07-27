/*     */ package trinecodecmain;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.net.MalformedURLException;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.HashMap;
/*     */ import java.util.Vector;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ 
/*     */ public class customer extends JPanel {
/*     */   private JTextField c_bank;
/*     */   private JTextArea c_billadd;
/*     */   private JTextField c_city;
/*     */   private JTextField c_name;
/*     */   private JTextField c_person;
/*     */   private JTextField c_search;
/*     */   private JTextField c_search_tbl;
/*     */   private JTextArea c_shipadd;
/*     */   private JTextField c_tp;
/*     */   private JTextField cid;
/*     */   private JTextField cp_email;
/*     */   private JTextField cp_name;
/*     */   private JTextField cp_online;
/*     */   private JTextField cp_tp;
/*     */   
/*     */   public customer() {
/*  43 */     initComponents();
/*  44 */     tb_load();
/*     */   }
/*     */   private JButton jButton1; private JButton jButton2; private JButton jButton3; private JButton jButton4; private JButton jButton5; private JButton jButton6; private JLabel jLabel1; private JLabel jLabel10; private JLabel jLabel11; private JLabel jLabel12; private JLabel jLabel13; private JLabel jLabel14; private JLabel jLabel16; private JLabel jLabel17; private JLabel jLabel18; private JLabel jLabel19; private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JLabel jLabel7; private JLabel jLabel8; private JLabel jLabel9; private JPanel jPanel1; private JPanel jPanel10; private JPanel jPanel11; private JPanel jPanel2; private JPanel jPanel3; private JPanel jPanel4; private JPanel jPanel5; private JPanel jPanel6; private JPanel jPanel7; private JPanel jPanel8; private JPanel jPanel9; private JScrollPane jScrollPane1; private JScrollPane jScrollPane2; private JScrollPane jScrollPane4; private JTabbedPane jTabbedPane1; private JTable jTable1; private JCheckBox same; private JTextField sh_city;
/*     */   private JTextField sh_cp;
/*     */   private JTextField sh_pn;
/*     */   private JTextField sh_tp;
/*     */   
/*     */   public void tb_load() {
/*     */     try {
/*  53 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*  54 */       dt.setRowCount(0);
/*     */       
/*  56 */       Statement s = db.mycon().createStatement();
/*  57 */       ResultSet rs = s.executeQuery(" SELECT * FROM customer");
/*     */       
/*  59 */       while (rs.next())
/*     */       {
/*  61 */         Vector<String> v = new Vector();
/*     */         
/*  63 */         v.add(rs.getString(1));
/*  64 */         v.add(rs.getString(2));
/*  65 */         v.add(rs.getString(3));
/*  66 */         v.add(rs.getString(4));
/*  67 */         v.add(rs.getString(5));
/*  68 */         v.add(rs.getString(6));
/*  69 */         v.add(rs.getString(7));
/*  70 */         v.add(rs.getString(8));
/*  71 */         v.add(rs.getString(9));
/*  72 */         v.add(rs.getString(10));
/*  73 */         v.add(rs.getString(11));
/*     */         
/*  75 */         dt.addRow(v);
/*     */       }
/*     */     
/*  78 */     } catch (SQLException e) {
/*  79 */       System.out.println("[ERROR ON DATA LOAD]\n[ERROR] : " + e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void search() {
/*  86 */     String city = this.sh_city.getText();
/*  87 */     String tp = this.sh_tp.getText();
/*  88 */     String contact_person = this.sh_cp.getText();
/*  89 */     String person_name = this.sh_pn.getText();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  94 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/*  95 */       dtm.setRowCount(0);
/*     */       
/*  97 */       Statement s = db.mycon().createStatement();
/*  98 */       ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE city LIKE  '%" + city + "%' AND tp_number LIKE '%" + tp + "%' AND contact_person LIKE '%" + contact_person + "%' AND person_name LIKE '%" + person_name + "%' ");
/*     */ 
/*     */ 
/*     */       
/* 102 */       while (rs.next())
/*     */       {
/* 104 */         Vector<String> v = new Vector();
/*     */         
/* 106 */         v.add(rs.getString(1));
/* 107 */         v.add(rs.getString(2));
/* 108 */         v.add(rs.getString(3));
/* 109 */         v.add(rs.getString(4));
/* 110 */         v.add(rs.getString(5));
/* 111 */         v.add(rs.getString(6));
/* 112 */         v.add(rs.getString(7));
/* 113 */         v.add(rs.getString(8));
/* 114 */         v.add(rs.getString(9));
/* 115 */         v.add(rs.getString(10));
/* 116 */         v.add(rs.getString(11));
/*     */         
/* 118 */         dtm.addRow(v);
/*     */       }
/*     */     
/*     */     }
/* 122 */     catch (Exception e) {
/* 123 */       JOptionPane.showMessageDialog(null, "Error : " + e, "Customers Search Error", 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void clearText() {
/* 130 */     this.c_name.setText("");
/* 131 */     this.c_tp.setText("");
/* 132 */     this.c_billadd.setText("");
/* 133 */     this.c_shipadd.setText("");
/* 134 */     this.c_bank.setText("");
/* 135 */     this.c_city.setText("");
/* 136 */     this.cp_name.setText("");
/* 137 */     this.c_person.setText("");
/* 138 */     this.cp_tp.setText("");
/* 139 */     this.cp_email.setText("");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/* 146 */     this.jPanel1 = new JPanel();
/* 147 */     this.jPanel1.setBounds(0, 1, 1134, 628);
/* 148 */     this.jTabbedPane1 = new JTabbedPane();
/* 149 */     this.jTabbedPane1.setBounds(0, 0, 1134, 628);
/* 150 */     this.jPanel6 = new JPanel();
/* 151 */     this.jPanel6.setSize(new Dimension(1050, 550));
/* 152 */     this.jPanel3 = new JPanel();
/* 153 */     this.jPanel3.setBounds(10, 11, 1122, 68);
/* 154 */     this.jLabel3 = new JLabel();
/* 155 */     this.c_search = new JTextField();
/* 156 */     this.jPanel2 = new JPanel();
/* 157 */     this.jPanel2.setBounds(10, 85, 1122, 493);
/* 158 */     this.jLabel1 = new JLabel();
/* 159 */     this.jLabel1.setBounds(12, 14, 122, 33);
/* 160 */     this.jLabel2 = new JLabel();
/* 161 */     this.jLabel2.setBounds(12, 53, 132, 32);
/* 162 */     this.c_name = new JTextField();
/* 163 */     this.c_name.setBounds(140, 14, 405, 33);
/* 164 */     this.c_tp = new JTextField();
/* 165 */     this.c_tp.setBounds(140, 53, 405, 32);
/* 166 */     this.jLabel6 = new JLabel();
/* 167 */     this.jLabel6.setBounds(12, 91, 122, 17);
/* 168 */     this.jLabel7 = new JLabel();
/* 169 */     this.jLabel7.setBounds(12, 187, 122, 17);
/* 170 */     this.jPanel8 = new JPanel();
/* 171 */     this.jPanel8.setBounds(550, 14, 559, 365);
/* 172 */     this.jLabel9 = new JLabel();
/* 173 */     this.jLabel9.setBounds(16, 65, 116, 17);
/* 174 */     this.c_person = new JTextField();
/* 175 */     this.c_person.setBounds(136, 57, 350, 33);
/* 176 */     this.cp_name = new JTextField();
/* 177 */     this.cp_name.setBounds(136, 16, 350, 35);
/* 178 */     this.jLabel8 = new JLabel();
/* 179 */     this.jLabel8.setBounds(16, 25, 116, 17);
/* 180 */     this.jLabel12 = new JLabel();
/* 181 */     this.jLabel12.setBounds(16, 96, 116, 33);
/* 182 */     this.cp_tp = new JTextField();
/* 183 */     this.cp_tp.setBounds(136, 96, 350, 33);
/* 184 */     this.jLabel13 = new JLabel();
/* 185 */     this.jLabel13.setBounds(16, 135, 116, 35);
/* 186 */     this.cp_email = new JTextField();
/* 187 */     this.cp_email.setBounds(136, 135, 350, 35);
/* 188 */     this.cp_online = new JTextField();
/* 189 */     this.jLabel14 = new JLabel();
/* 190 */     this.jLabel14.setBounds(516, 354, 0, 0);
/* 191 */     this.jLabel10 = new JLabel();
/* 192 */     this.jLabel10.setBounds(12, 287, 122, 17);
/* 193 */     this.jLabel11 = new JLabel();
/* 194 */     this.jLabel11.setBounds(12, 346, 132, 17);
/* 195 */     this.c_bank = new JTextField();
/* 196 */     this.c_bank.setBounds(140, 287, 405, 38);
/* 197 */     this.c_city = new JTextField();
/* 198 */     this.c_city.setBounds(140, 336, 406, 38);
/* 199 */     this.jPanel9 = new JPanel();
/* 200 */     this.jPanel9.setBounds(2, 379, 1107, 90);
/* 201 */     this.jButton1 = new JButton();
/* 202 */     this.jButton1.setBounds(748, 11, 210, 68);
/* 203 */     this.jButton2 = new JButton();
/* 204 */     this.jButton2.setBounds(518, 11, 202, 68);
/* 205 */     this.jButton3 = new JButton();
/* 206 */     this.jButton3.setBounds(286, 11, 203, 68);
/* 207 */     this.jButton4 = new JButton();
/* 208 */     this.jButton4.setBounds(88, 11, 188, 68);
/* 209 */     this.jScrollPane2 = new JScrollPane();
/* 210 */     this.jScrollPane2.setBounds(140, 91, 405, 90);
/* 211 */     this.c_billadd = new JTextArea();
/* 212 */     this.same = new JCheckBox();
/* 213 */     this.same.setBounds(12, 206, 95, 23);
/* 214 */     this.jScrollPane4 = new JScrollPane();
/* 215 */     this.jScrollPane4.setBounds(140, 187, 405, 94);
/* 216 */     this.c_shipadd = new JTextArea();
/* 217 */     this.jPanel4 = new JPanel();
/* 218 */     this.jPanel5 = new JPanel();
/* 219 */     this.jPanel5.setBounds(1216, 495, 100, 100);
/* 220 */     this.jScrollPane1 = new JScrollPane();
/* 221 */     this.jScrollPane1.setHorizontalScrollBarPolicy(32);
/* 222 */     this.jScrollPane1.setBounds(5, 152, 1114, 427);
/* 223 */     this.jTable1 = new JTable();
/* 224 */     this.jPanel7 = new JPanel();
/* 225 */     this.jPanel7.setBounds(5, 0, 1119, 146);
/* 226 */     this.jLabel5 = new JLabel();
/* 227 */     this.jLabel5.setBounds(20, 15, 121, 17);
/* 228 */     this.c_search_tbl = new JTextField();
/* 229 */     this.c_search_tbl.setBounds(159, 8, 222, 28);
/* 230 */     this.jPanel10 = new JPanel();
/* 231 */     this.jPanel10.setBounds(0, 47, 1109, 88);
/* 232 */     this.jLabel16 = new JLabel();
/* 233 */     this.jLabel16.setBounds(16, 11, 47, 24);
/* 234 */     this.sh_city = new JTextField();
/* 235 */     this.sh_city.setBounds(16, 41, 227, 36);
/* 236 */     this.jLabel17 = new JLabel();
/* 237 */     this.jLabel17.setBounds(784, 11, 130, 24);
/* 238 */     this.sh_tp = new JTextField();
/* 239 */     this.sh_tp.setBounds(271, 41, 227, 36);
/* 240 */     this.jLabel18 = new JLabel();
/* 241 */     this.jLabel18.setBounds(527, 11, 146, 24);
/* 242 */     this.sh_cp = new JTextField();
/* 243 */     this.sh_cp.setBounds(527, 41, 227, 36);
/* 244 */     this.jLabel19 = new JLabel();
/* 245 */     this.jLabel19.setBounds(271, 11, 106, 24);
/* 246 */     this.sh_pn = new JTextField();
/* 247 */     this.sh_pn.setBounds(784, 41, 227, 36);
/* 248 */     this.jPanel11 = new JPanel();
/* 249 */     this.jButton5 = new JButton();
/* 250 */     this.cid = new JTextField();
/* 251 */     this.jLabel4 = new JLabel();
/* 252 */     this.jButton6 = new JButton();
/*     */     
/* 254 */     this.jPanel3.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 256 */     this.jLabel3.setFont(new Font("Tahoma", 1, 14));
/* 257 */     this.jLabel3.setText("Search ID :");
/*     */     
/* 259 */     this.c_search.setFont(new Font("Tahoma", 1, 14));
/* 260 */     this.c_search.setText("0");
/*     */     
/* 262 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 263 */     this.jPanel3.setLayout(jPanel3Layout);
/* 264 */     jPanel3Layout.setHorizontalGroup(
/* 265 */         jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 266 */         .addGroup(jPanel3Layout.createSequentialGroup()
/* 267 */           .addGap(23, 23, 23)
/* 268 */           .addComponent(this.jLabel3)
/* 269 */           .addGap(30, 30, 30)
/* 270 */           .addComponent(this.c_search, -2, 254, -2)
/* 271 */           .addGap(0, 0, 32767)));
/*     */     
/* 273 */     jPanel3Layout.setVerticalGroup(
/* 274 */         jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 275 */         .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
/* 276 */           .addContainerGap()
/* 277 */           .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 278 */             .addComponent(this.c_search)
/* 279 */             .addComponent(this.jLabel3, -1, 42, 32767))
/* 280 */           .addContainerGap()));
/*     */ 
/*     */     
/* 283 */     this.jPanel2.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 285 */     this.jLabel1.setFont(new Font("Tahoma", 1, 14));
/* 286 */     this.jLabel1.setText("Full Name :");
/*     */     
/* 288 */     this.jLabel2.setFont(new Font("Tahoma", 1, 14));
/* 289 */     this.jLabel2.setText("T.P Number :");
/*     */     
/* 291 */     this.c_name.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 293 */     this.c_tp.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 295 */     this.jLabel6.setFont(new Font("Tahoma", 1, 14));
/* 296 */     this.jLabel6.setText("Billing Address :");
/*     */     
/* 298 */     this.jLabel7.setFont(new Font("Tahoma", 1, 14));
/* 299 */     this.jLabel7.setText("Shipping Addres :");
/*     */     
/* 301 */     this.jPanel8.setBorder(new TitledBorder(null, "Next Of Kin", 4, 2, null, null));
/*     */     
/* 303 */     this.jLabel9.setFont(new Font("Tahoma", 1, 14));
/* 304 */     this.jLabel9.setText("Last Name : ");
/*     */     
/* 306 */     this.c_person.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 308 */     this.cp_name.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 310 */     this.jLabel8.setFont(new Font("Tahoma", 1, 14));
/* 311 */     this.jLabel8.setText("First Name :");
/*     */     
/* 313 */     this.jLabel12.setFont(new Font("Tahoma", 1, 14));
/* 314 */     this.jLabel12.setText("T.P Number :");
/*     */     
/* 316 */     this.cp_tp.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 318 */     this.jLabel13.setFont(new Font("Tahoma", 1, 14));
/* 319 */     this.jLabel13.setText("Email Address :");
/*     */     
/* 321 */     this.cp_email.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 323 */     this.cp_online.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 325 */     this.jLabel10.setFont(new Font("Tahoma", 1, 14));
/* 326 */     this.jLabel10.setText("Bank Acc No :");
/*     */     
/* 328 */     this.jLabel11.setFont(new Font("Tahoma", 1, 14));
/* 329 */     this.jLabel11.setText("City / Location :");
/*     */     
/* 331 */     this.c_bank.setFont(new Font("Tahoma", 1, 14));
/* 332 */     this.c_bank.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 334 */             customer.this.c_bankActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 338 */     this.c_city.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 340 */     this.jButton1.setFont(new Font("Tahoma", 1, 24));
/* 341 */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/img/delete.png")));
/* 342 */     this.jButton1.setText("Delete");
/* 343 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 345 */             customer.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 349 */     this.jButton2.setFont(new Font("Tahoma", 1, 24));
/* 350 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/img/update.png")));
/* 351 */     this.jButton2.setText("Update");
/* 352 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 354 */             customer.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 358 */     this.jButton3.setFont(new Font("Tahoma", 1, 24));
/* 359 */     this.jButton3.setIcon(new ImageIcon(getClass().getResource("/img/search x30.png")));
/* 360 */     this.jButton3.setText("Search");
/* 361 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 363 */             customer.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 367 */     this.jButton4.setFont(new Font("Tahoma", 1, 24));
/* 368 */     this.jButton4.setIcon(new ImageIcon(getClass().getResource("/img/save.png")));
/* 369 */     this.jButton4.setText("Save");
/* 370 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 372 */             customer.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 376 */     this.c_billadd.setColumns(20);
/* 377 */     this.c_billadd.setFont(new Font("Tahoma", 1, 14));
/* 378 */     this.jScrollPane2.setViewportView(this.c_billadd);
/*     */     
/* 380 */     this.same.setText("Same as Billing");
/* 381 */     this.same.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 383 */             customer.this.sameActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 387 */     this.c_shipadd.setColumns(20);
/* 388 */     this.c_shipadd.setFont(new Font("Tahoma", 1, 14));
/* 389 */     this.jScrollPane4.setViewportView(this.c_shipadd);
/* 390 */     this.jPanel8.setLayout((LayoutManager)null);
/* 391 */     this.jPanel8.add(this.jLabel12);
/* 392 */     this.jPanel8.add(this.jLabel9);
/* 393 */     this.jPanel8.add(this.jLabel8);
/* 394 */     this.jPanel8.add(this.jLabel13);
/* 395 */     this.jPanel8.add(this.cp_email);
/* 396 */     this.jPanel8.add(this.cp_tp);
/* 397 */     this.jPanel8.add(this.c_person);
/* 398 */     this.jPanel8.add(this.cp_name);
/* 399 */     this.jPanel8.add(this.jLabel14);
/* 400 */     this.jPanel2.setLayout((LayoutManager)null);
/* 401 */     this.jPanel2.add(this.jLabel10);
/* 402 */     this.jPanel2.add(this.jLabel2);
/* 403 */     this.jPanel2.add(this.jLabel6);
/* 404 */     this.jPanel2.add(this.jLabel1);
/* 405 */     this.jPanel2.add(this.jLabel7);
/* 406 */     this.jPanel2.add(this.same);
/* 407 */     this.jPanel2.add(this.jScrollPane4);
/* 408 */     this.jPanel2.add(this.jScrollPane2);
/* 409 */     this.jPanel2.add(this.c_tp);
/* 410 */     this.jPanel2.add(this.c_name);
/* 411 */     this.jPanel2.add(this.c_bank);
/* 412 */     this.jPanel2.add(this.jLabel11);
/* 413 */     this.jPanel2.add(this.c_city);
/* 414 */     this.jPanel2.add(this.jPanel8);
/* 415 */     this.jPanel2.add(this.jPanel9);
/* 416 */     this.jPanel9.setLayout((LayoutManager)null);
/* 417 */     this.jPanel9.add(this.jButton4);
/* 418 */     this.jPanel9.add(this.jButton3);
/* 419 */     this.jPanel9.add(this.jButton2);
/* 420 */     this.jPanel9.add(this.jButton1);
/*     */     
/* 422 */     this.jTabbedPane1.addTab("Add Customer", this.jPanel6);
/* 423 */     this.jTabbedPane1.setIconAt(0, new ImageIcon(customer.class.getResource("/img/customer.png")));
/* 424 */     this.jPanel6.setLayout((LayoutManager)null);
/* 425 */     this.jPanel6.add(this.jPanel2);
/* 426 */     this.jPanel6.add(this.jPanel3);
/*     */     
/* 428 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/* 429 */     this.jPanel5.setLayout(jPanel5Layout);
/* 430 */     jPanel5Layout.setHorizontalGroup(
/* 431 */         jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 432 */         .addGap(0, 100, 32767));
/*     */     
/* 434 */     jPanel5Layout.setVerticalGroup(
/* 435 */         jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 436 */         .addGap(0, 100, 32767));
/*     */ 
/*     */     
/* 439 */     this.jTable1.setModel(new DefaultTableModel(
/* 440 */           new Object[0][], 
/*     */           
/* 442 */           (Object[])new String[] { 
/* 443 */             "ID", "Customer Name", "T.P Number", "Billing Address", "Shipping Address", "Bank", "City", "Person Name", "Contact Person", "Person TP", "Email" }));
/*     */ 
/*     */     
/* 446 */     this.jTable1.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 448 */             customer.this.jTable1MouseClicked(evt);
/*     */           }
/*     */         });
/* 451 */     this.jScrollPane1.setViewportView(this.jTable1);
/*     */     
/* 453 */     this.jLabel5.setFont(new Font("Tahoma", 1, 14));
/* 454 */     this.jLabel5.setText("Customer Name :");
/*     */     
/* 456 */     this.c_search_tbl.setFont(new Font("Tahoma", 1, 18));
/* 457 */     this.c_search_tbl.setText("0");
/* 458 */     this.c_search_tbl.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 460 */             customer.this.c_search_tblActionPerformed(evt);
/*     */           }
/*     */         });
/* 463 */     this.c_search_tbl.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 465 */             customer.this.c_search_tblKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 469 */     this.jLabel16.setFont(new Font("Dialog", 1, 18));
/* 470 */     this.jLabel16.setText("City :");
/*     */     
/* 472 */     this.sh_city.setFont(new Font("Dialog", 1, 18));
/* 473 */     this.sh_city.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 475 */             customer.this.sh_cityKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 479 */     this.jLabel17.setFont(new Font("Dialog", 1, 18));
/* 480 */     this.jLabel17.setText("Preson Name :");
/*     */     
/* 482 */     this.sh_tp.setFont(new Font("Dialog", 1, 18));
/* 483 */     this.sh_tp.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 485 */             customer.this.sh_tpKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 489 */     this.jLabel18.setFont(new Font("Dialog", 1, 18));
/* 490 */     this.jLabel18.setText("Contact Person :");
/*     */     
/* 492 */     this.sh_cp.setFont(new Font("Dialog", 1, 18));
/* 493 */     this.sh_cp.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 495 */             customer.this.sh_cpKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 499 */     this.jLabel19.setFont(new Font("Dialog", 1, 18));
/* 500 */     this.jLabel19.setText("TelePhone :");
/*     */     
/* 502 */     this.sh_pn.setFont(new Font("Dialog", 1, 18));
/* 503 */     this.sh_pn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 505 */             customer.this.sh_pnActionPerformed(evt);
/*     */           }
/*     */         });
/* 508 */     this.sh_pn.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 510 */             customer.this.sh_pnKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 514 */     this.jTabbedPane1.addTab("Search Customer", this.jPanel4);
/* 515 */     this.jTabbedPane1.setIconAt(1, new ImageIcon(customer.class.getResource("/img/search x30.png")));
/* 516 */     this.jPanel4.setLayout((LayoutManager)null);
/* 517 */     this.jPanel4.add(this.jPanel7);
/* 518 */     this.jPanel7.setLayout((LayoutManager)null);
/* 519 */     this.jPanel7.add(this.jLabel5);
/* 520 */     this.jPanel7.add(this.c_search_tbl);
/* 521 */     this.jPanel7.add(this.jPanel10);
/* 522 */     this.jPanel10.setLayout((LayoutManager)null);
/* 523 */     this.jPanel10.add(this.sh_city);
/* 524 */     this.jPanel10.add(this.jLabel16);
/* 525 */     this.jPanel10.add(this.sh_tp);
/* 526 */     this.jPanel10.add(this.jLabel19);
/* 527 */     this.jPanel10.add(this.sh_cp);
/* 528 */     this.jPanel10.add(this.jLabel18);
/* 529 */     this.jPanel10.add(this.sh_pn);
/* 530 */     this.jPanel10.add(this.jLabel17);
/* 531 */     this.jPanel4.add(this.jScrollPane1);
/* 532 */     this.jPanel4.add(this.jPanel5);
/*     */     
/* 534 */     this.jButton5.setText("All Customer Reports");
/* 535 */     this.jButton5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 537 */             customer.this.jButton5ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 541 */     this.jLabel4.setFont(new Font("Dialog", 1, 18));
/* 542 */     this.jLabel4.setText("Customer ID :");
/*     */     
/* 544 */     this.jButton6.setText("View Report");
/* 545 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 547 */             customer.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 550 */     setLayout((LayoutManager)null);
/* 551 */     this.jPanel1.setLayout((LayoutManager)null);
/*     */     
/* 553 */     GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
/* 554 */     this.jPanel11.setLayout(jPanel11Layout);
/* 555 */     jPanel11Layout.setHorizontalGroup(
/* 556 */         jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 557 */         .addGroup(jPanel11Layout.createSequentialGroup()
/* 558 */           .addGap(41, 41, 41)
/* 559 */           .addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 560 */             .addComponent(this.jButton6, -1, 333, 32767)
/* 561 */             .addGroup(jPanel11Layout.createSequentialGroup()
/* 562 */               .addGap(11, 11, 11)
/* 563 */               .addComponent(this.jLabel4, -1, 322, 32767))
/* 564 */             .addComponent(this.jButton5, -1, -1, 32767)
/* 565 */             .addComponent(this.cid, GroupLayout.Alignment.TRAILING))
/* 566 */           .addContainerGap(793, 32767)));
/*     */     
/* 568 */     jPanel11Layout.setVerticalGroup(
/* 569 */         jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 570 */         .addGroup(jPanel11Layout.createSequentialGroup()
/* 571 */           .addGap(34, 34, 34)
/* 572 */           .addComponent(this.jButton5, -2, 70, -2)
/* 573 */           .addGap(37, 37, 37)
/* 574 */           .addComponent(this.jLabel4, -2, 28, -2)
/* 575 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 576 */           .addComponent(this.cid, -2, 66, -2)
/* 577 */           .addGap(18, 18, 18)
/* 578 */           .addComponent(this.jButton6, -2, 50, -2)
/* 579 */           .addContainerGap(299, 32767)));
/*     */ 
/*     */     
/* 582 */     this.jTabbedPane1.addTab("Reports", this.jPanel11);
/* 583 */     this.jTabbedPane1.setIconAt(2, new ImageIcon(customer.class.getResource("/img/reports.png")));
/* 584 */     this.jPanel1.add(this.jTabbedPane1);
/* 585 */     add(this.jPanel1);
/*     */   }
/*     */ 
/*     */   
/*     */   private void c_search_tblKeyReleased(KeyEvent evt) {
/* 590 */     String name = this.c_search_tbl.getText();
/*     */     
/*     */     try {
/* 593 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/* 594 */       dt.setRowCount(0);
/* 595 */       Statement s = db.mycon().createStatement();
/*     */       
/* 597 */       ResultSet rs = s.executeQuery("SELECT * FROM customer WHERE customer_name LIKE '%" + name + "%' ");
/*     */       
/* 599 */       while (rs.next()) {
/* 600 */         Vector<String> v = new Vector();
/*     */         
/* 602 */         v.add(rs.getString(1));
/* 603 */         v.add(rs.getString(2));
/* 604 */         v.add(rs.getString(3));
/* 605 */         v.add(rs.getString(4));
/* 606 */         v.add(rs.getString(5));
/* 607 */         v.add(rs.getString(6));
/* 608 */         v.add(rs.getString(7));
/* 609 */         v.add(rs.getString(8));
/* 610 */         v.add(rs.getString(9));
/* 611 */         v.add(rs.getString(10));
/* 612 */         v.add(rs.getString(11));
/*     */ 
/*     */ 
/*     */         
/* 616 */         dt.addRow(v);
/*     */       }
/*     */     
/*     */     }
/* 620 */     catch (Exception e) {
/* 621 */       tb_load();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jTable1MouseClicked(MouseEvent evt) {
/* 630 */     int r = this.jTable1.getSelectedRow();
/*     */     
/* 632 */     String id = this.jTable1.getValueAt(r, 0).toString();
/* 633 */     String name = this.jTable1.getValueAt(r, 1).toString();
/* 634 */     String tp = this.jTable1.getValueAt(r, 2).toString();
/*     */     
/* 636 */     this.c_search.setText(id);
/* 637 */     this.c_name.setText(name);
/* 638 */     this.c_tp.setText(tp);
/*     */     
/* 640 */     this.jButton3.doClick();
/*     */   }
/*     */ 
/*     */   
/*     */   private void c_search_tblActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */   
/*     */   private void sh_cityKeyReleased(KeyEvent evt) {
/* 648 */     search();
/*     */   }
/*     */   
/*     */   private void sh_tpKeyReleased(KeyEvent evt) {
/* 652 */     search();
/*     */   }
/*     */   
/*     */   private void sh_cpKeyReleased(KeyEvent evt) {
/* 656 */     search();
/*     */   }
/*     */   
/*     */   private void sh_pnKeyReleased(KeyEvent evt) {
/* 660 */     search();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 667 */     ReportView r = new ReportView("src/reports/aLLCus.jasper");
/* 668 */     r.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 677 */     HashMap<Object, Object> para = new HashMap<>();
/* 678 */     para.put("Para_cid", Integer.valueOf(1));
/*     */     
/* 680 */     ReportView r = new ReportView("src/reports/CIDCustomer.jrxml", para);
/* 681 */     r.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void sameActionPerformed(ActionEvent evt) {
/* 691 */     if (this.same.isSelected()) {
/* 692 */       this.c_shipadd.setText(this.c_billadd.getText());
/*     */     } else {
/* 694 */       this.c_shipadd.setText("");
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 700 */     String name = this.c_name.getText();
/* 701 */     String tp = this.c_tp.getText();
/*     */     
/* 703 */     String bill_add = this.c_billadd.getText();
/* 704 */     String shipp_add = this.c_shipadd.getText();
/* 705 */     String bank = this.c_bank.getText();
/* 706 */     String city = this.c_city.getText();
/* 707 */     String person_name = this.cp_name.getText();
/* 708 */     String contact_person = this.c_person.getText();
/* 709 */     String person_tp = this.cp_tp.getText();
/* 710 */     String email = this.cp_email.getText();
/*     */     try {
/* 712 */       Statement s = db.mycon().createStatement();
/*     */       
/* 714 */       s.executeUpdate("INSERT INTO `customer` (`customer_name`, `Tp_Number`, `billing_address`, `shipping_address`, `bank`, `city`, `contact_fname`, `contact_lname`, `contact_tp`, `email`) VALUES ('" + 
/* 715 */           name + "','" + tp + "','" + bill_add + "','" + shipp_add + "','" + bank + "','" + city + "','" + person_name + "','" + contact_person + "','" + person_tp + "','" + email + "')");
/*     */     
/*     */     }
/* 718 */     catch (SQLException e) {
/*     */ 
/*     */       
/* 721 */       JOptionPane.showMessageDialog(null, "Error : " + e, "Database Error", 0);
/*     */     } 
/*     */     
/* 724 */     tb_load();
/* 725 */     clearText();
/* 726 */     this.jButton3.doClick();
/*     */   }
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 730 */     String search = this.c_search.getText();
/*     */     
/*     */     try {
/* 733 */       Statement s = db.mycon().createStatement();
/*     */       
/* 735 */       ResultSet rs = s.executeQuery(" SELECT * FROM customer WHERE cid = '" + search + "'");
/*     */       
/* 737 */       if (rs.next())
/*     */       {
/* 739 */         this.c_name.setText(rs.getString("customer_name"));
/* 740 */         this.c_tp.setText(rs.getString("Tp_Number"));
/* 741 */         this.c_billadd.setText(rs.getString("billing_address"));
/* 742 */         this.c_shipadd.setText(rs.getString("shipping_address"));
/* 743 */         this.c_bank.setText(rs.getString("bank"));
/* 744 */         this.c_city.setText(rs.getString("city"));
/* 745 */         this.cp_name.setText(rs.getString("contact_fname"));
/* 746 */         this.c_person.setText(rs.getString("contact_lname"));
/* 747 */         this.cp_tp.setText(rs.getString("contact_tp"));
/* 748 */         this.cp_email.setText(rs.getString("email"));
/*     */       }
/*     */     
/* 751 */     } catch (SQLException e) {
/*     */       
/* 753 */       JOptionPane.showMessageDialog(null, "Error :  " + e, "Customer Search Error", 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 760 */     String id = this.c_search.getText();
/*     */     
/* 762 */     String name = this.c_name.getText();
/* 763 */     String tp = this.c_tp.getText();
/*     */     
/* 765 */     String bill_add = this.c_billadd.getText();
/* 766 */     String shipp_add = this.c_shipadd.getText();
/* 767 */     String bank = this.c_bank.getText();
/* 768 */     String city = this.c_city.getText();
/* 769 */     String person_name = this.cp_name.getText();
/* 770 */     String contact_person = this.c_person.getText();
/* 771 */     String person_tp = this.cp_tp.getText();
/* 772 */     String email = this.cp_email.getText();
/*     */ 
/*     */     
/*     */     try {
/* 776 */       Statement s = db.mycon().createStatement();
/* 777 */       s.executeUpdate(" UPDATE customer SET customer_name ='" + name + "'" + 
/* 778 */           " ,Tp_Number ='" + tp + "'" + 
/* 779 */           ",billing_address ='" + bill_add + "'" + 
/* 780 */           ",shipping_address ='" + shipp_add + "' " + 
/* 781 */           ",bank ='" + bank + "' " + 
/* 782 */           ",city ='" + city + "' " + 
/* 783 */           ",contact_fname ='" + person_name + "' " + 
/* 784 */           ",contact_lname ='" + contact_person + "' " + 
/* 785 */           ",contact_tp ='" + person_tp + "' " + 
/* 786 */           ",email ='" + email + "' " + 
/* 787 */           " WHERE cid = '" + id + "' ");
/* 788 */       JOptionPane.showMessageDialog(null, "Data Updated Successfully");
/*     */       try {
/* 790 */         Notification.sendNotification("TPOS SYSTEM", "CUSTOMER : " + name + " updated successfully", TrayIcon.MessageType.INFO, Toolkit.getDefaultToolkit().getImage(ScreenHome.class.getResource("/img/icons8_ingredients_50px.png")));
/* 791 */       } catch (MalformedURLException|AWTException e) {
/*     */         
/* 793 */         e.printStackTrace();
/*     */       }
/*     */     
/* 796 */     } catch (HeadlessException e) {
/* 797 */       System.out.println(e);
/* 798 */     } catch (SQLException e) {
/*     */       
/* 800 */       JOptionPane.showMessageDialog(null, "[ERROR ON UPDATING] \n: [ERROR]: " + e, "Update Error", 0);
/*     */     } 
/*     */     
/* 803 */     tb_load();
/* 804 */     clearText();
/* 805 */     this.jButton3.doClick();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 811 */     String id = this.c_search.getText();
/*     */     
/*     */     try {
/* 814 */       Statement s = db.mycon().createStatement();
/* 815 */       s.executeUpdate("DELETE FROM customer WHERE cid = '" + id + "'");
/*     */       
/* 817 */       Notification.sendNotification("TrineTechs: Moyale Supermarket", "Data for id: " + id + " deleted succesfully", TrayIcon.MessageType.INFO);
/*     */     }
/* 819 */     catch (SQLException e) {
/*     */       
/* 821 */       System.out.println("Error on data deletion:\nError : " + e);
/* 822 */     } catch (MalformedURLException e) {
/*     */       
/* 824 */       e.printStackTrace();
/* 825 */     } catch (AWTException e) {
/*     */       
/* 827 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 830 */     tb_load();
/* 831 */     clearText();
/*     */   }
/*     */   
/*     */   private void c_bankActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   private void sh_pnActionPerformed(ActionEvent evt) {}
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/customer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */