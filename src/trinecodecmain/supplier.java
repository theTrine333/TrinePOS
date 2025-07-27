/*     */ package trinecodecmain;
/*     */ import java.awt.AWTException;
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
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextArea;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.LayoutStyle;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ 
/*     */ public class supplier extends JPanel {
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
/*     */   private JTextField cp_tp;
/*     */   private JButton jButton1;
/*     */   private JButton jButton2;
/*     */   private JButton jButton3;
/*     */   private JButton jButton4;
/*     */   private JButton jButton5;
/*     */   private JButton jButton6;
/*     */   private JLabel jLabel1;
/*     */   private JLabel jLabel10;
/*     */   private JLabel jLabel11;
/*     */   private JLabel jLabel12;
/*     */   private JLabel jLabel13;
/*     */   private JLabel jLabel16;
/*     */   private JLabel jLabel17;
/*     */   private JLabel jLabel18;
/*     */   private JLabel jLabel19;
/*     */   
/*     */   public supplier() {
/*  62 */     setSize(1090, 590);
/*  63 */     initComponents();
/*  64 */     tb_load();
/*     */   }
/*     */   private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JLabel jLabel7; private JLabel jLabel8; private JLabel jLabel9; private JPanel jPanel1; private JPanel jPanel10; private JPanel jPanel11; private JPanel jPanel2; private JPanel jPanel3; private JPanel jPanel4; private JPanel jPanel6; private JPanel jPanel7; private JPanel jPanel8; private JPanel jPanel9; private JScrollPane jScrollPane1; private JScrollPane jScrollPane2; private JScrollPane jScrollPane4; private JTabbedPane jTabbedPane1; private JTable jTable1; private JCheckBox same; private JTextField sh_city; private JTextField sh_cp; private JTextField sh_pn; private JTextField sh_tp;
/*     */   
/*     */   public void tb_load() {
/*     */     try {
/*  70 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*  71 */       dt.setRowCount(0);
/*     */       
/*  73 */       Statement s = db.mycon().createStatement();
/*  74 */       ResultSet rs = s.executeQuery(" SELECT * FROM supplier");
/*     */       
/*  76 */       while (rs.next())
/*     */       {
/*  78 */         Vector<String> v = new Vector();
/*     */         
/*  80 */         v.add(rs.getString(1));
/*  81 */         v.add(rs.getString(2));
/*  82 */         v.add(rs.getString(3));
/*  83 */         v.add(rs.getString(4));
/*  84 */         v.add(rs.getString(5));
/*  85 */         v.add(rs.getString(6));
/*  86 */         v.add(rs.getString(7));
/*  87 */         v.add(rs.getString(8));
/*  88 */         v.add(rs.getString(9));
/*  89 */         v.add(rs.getString(10));
/*  90 */         v.add(rs.getString(11));
/*  91 */         dt.addRow(v);
/*     */       }
/*     */     
/*  94 */     } catch (SQLException e) {
/*     */       
/*  96 */       JOptionPane.showMessageDialog(null, e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void search() {
/* 103 */     String city = this.sh_city.getText();
/* 104 */     String tp = this.sh_tp.getText();
/* 105 */     String contact_person = this.sh_cp.getText();
/* 106 */     String person_name = this.sh_pn.getText();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 111 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/* 112 */       dtm.setRowCount(0);
/*     */       
/* 114 */       Statement s = db.mycon().createStatement();
/* 115 */       ResultSet rs = s.executeQuery(" SELECT * FROM supplier WHERE city LIKE  '%" + city + "%' AND tp_number LIKE '%" + tp + "%' AND contact_person LIKE '%" + contact_person + "%' AND person_name LIKE '%" + person_name + "%' ");
/*     */ 
/*     */ 
/*     */       
/* 119 */       while (rs.next()) {
/*     */         
/* 121 */         Vector<String> v = new Vector();
/*     */         
/* 123 */         v.add(rs.getString(1));
/* 124 */         v.add(rs.getString(2));
/* 125 */         v.add(rs.getString(3));
/* 126 */         v.add(rs.getString(4));
/* 127 */         v.add(rs.getString(5));
/* 128 */         v.add(rs.getString(6));
/* 129 */         v.add(rs.getString(7));
/* 130 */         v.add(rs.getString(8));
/* 131 */         v.add(rs.getString(9));
/* 132 */         v.add(rs.getString(10));
/* 133 */         v.add(rs.getString(11));
/*     */         
/* 135 */         dtm.addRow(v);
/*     */       } 
/* 137 */     } catch (Exception e) {
/*     */       
/* 139 */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearText() {
/* 145 */     this.c_name.setText("");
/* 146 */     this.c_tp.setText("");
/* 147 */     this.c_billadd.setText("");
/* 148 */     this.c_shipadd.setText("");
/* 149 */     this.c_bank.setText("");
/* 150 */     this.c_city.setText("");
/* 151 */     this.cp_name.setText("");
/* 152 */     this.c_person.setText("");
/* 153 */     this.cp_tp.setText("");
/* 154 */     this.cp_email.setText("");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/* 161 */     this.jPanel1 = new JPanel();
/* 162 */     this.jPanel1.setBounds(0, 0, 1090, 580);
/* 163 */     this.jTabbedPane1 = new JTabbedPane();
/* 164 */     this.jTabbedPane1.setBounds(0, 0, 1080, 575);
/* 165 */     this.jPanel6 = new JPanel();
/* 166 */     this.jPanel3 = new JPanel();
/* 167 */     this.jPanel3.setBounds(10, 11, 1029, 68);
/* 168 */     this.jLabel3 = new JLabel();
/* 169 */     this.jLabel3.setBounds(25, 13, 77, 42);
/* 170 */     this.c_search = new JTextField();
/* 171 */     this.c_search.setBounds(112, 19, 315, 32);
/* 172 */     this.jPanel2 = new JPanel();
/* 173 */     this.jPanel2.setBounds(10, 85, 1029, 461);
/* 174 */     this.jLabel1 = new JLabel();
/* 175 */     this.jLabel1.setBounds(84, 14, 49, 33);
/* 176 */     this.jLabel2 = new JLabel();
/* 177 */     this.jLabel2.setBounds(42, 53, 91, 32);
/* 178 */     this.c_name = new JTextField();
/* 179 */     this.c_name.setBounds(159, 14, 405, 33);
/* 180 */     this.c_tp = new JTextField();
/* 181 */     this.c_tp.setBounds(159, 53, 405, 32);
/* 182 */     this.jLabel6 = new JLabel();
/* 183 */     this.jLabel6.setBounds(24, 91, 109, 17);
/* 184 */     this.jLabel7 = new JLabel();
/* 185 */     this.jLabel7.setBounds(12, 187, 111, 17);
/* 186 */     this.jPanel8 = new JPanel();
/* 187 */     this.jPanel8.setBounds(574, 14, 443, 361);
/* 188 */     this.jLabel9 = new JLabel();
/* 189 */     this.jLabel9.setHorizontalAlignment(4);
/* 190 */     this.jLabel9.setBounds(16, 53, 122, 32);
/* 191 */     this.c_person = new JTextField();
/* 192 */     this.c_person.setBounds(148, 57, 251, 33);
/* 193 */     this.cp_name = new JTextField();
/* 194 */     this.cp_name.setBounds(148, 16, 251, 35);
/* 195 */     this.jLabel8 = new JLabel();
/* 196 */     this.jLabel8.setHorizontalAlignment(4);
/* 197 */     this.jLabel8.setBounds(24, 16, 114, 35);
/* 198 */     this.jLabel12 = new JLabel();
/* 199 */     this.jLabel12.setHorizontalAlignment(4);
/* 200 */     this.jLabel12.setBounds(16, 96, 128, 33);
/* 201 */     this.cp_tp = new JTextField();
/* 202 */     this.cp_tp.setBounds(148, 96, 251, 33);
/* 203 */     this.jLabel13 = new JLabel();
/* 204 */     this.jLabel13.setBounds(16, 140, 128, 30);
/* 205 */     this.jLabel13.setHorizontalAlignment(4);
/* 206 */     this.cp_email = new JTextField();
/* 207 */     this.cp_email.setBounds(148, 135, 251, 35);
/* 208 */     this.jLabel10 = new JLabel();
/* 209 */     this.jLabel10.setBounds(48, 287, 105, 17);
/* 210 */     this.jLabel11 = new JLabel();
/* 211 */     this.jLabel11.setBounds(118, 346, 36, 17);
/* 212 */     this.c_bank = new JTextField();
/* 213 */     this.c_bank.setBounds(159, 287, 405, 38);
/* 214 */     this.c_city = new JTextField();
/* 215 */     this.c_city.setBounds(158, 336, 406, 38);
/* 216 */     this.jPanel9 = new JPanel();
/* 217 */     this.jPanel9.setBounds(2, 386, 1015, 58);
/* 218 */     this.jButton1 = new JButton();
/* 219 */     this.jButton1.setLocation(748, 5);
/* 220 */     this.jButton1.setSize(new Dimension(188, 42));
/* 221 */     this.jButton2 = new JButton();
/* 222 */     this.jButton2.setBounds(518, 5, 202, 42);
/* 223 */     this.jButton3 = new JButton();
/* 224 */     this.jButton3.setBounds(286, 5, 203, 42);
/* 225 */     this.jButton4 = new JButton();
/* 226 */     this.jButton4.setBounds(88, 5, 188, 42);
/* 227 */     this.jScrollPane2 = new JScrollPane();
/* 228 */     this.jScrollPane2.setBounds(159, 91, 405, 90);
/* 229 */     this.c_billadd = new JTextArea();
/* 230 */     this.same = new JCheckBox();
/* 231 */     this.same.setBounds(12, 206, 95, 23);
/* 232 */     this.jScrollPane4 = new JScrollPane();
/* 233 */     this.jScrollPane4.setBounds(159, 187, 405, 94);
/* 234 */     this.c_shipadd = new JTextArea();
/* 235 */     this.jPanel4 = new JPanel();
/* 236 */     this.jScrollPane1 = new JScrollPane();
/* 237 */     this.jScrollPane1.setHorizontalScrollBarPolicy(32);
/* 238 */     this.jScrollPane1.setBounds(0, 157, 1075, 389);
/* 239 */     this.jTable1 = new JTable();
/* 240 */     this.jTable1.setEnabled(false);
/* 241 */     this.jTable1.setAutoResizeMode(4);
/* 242 */     this.jTable1.setGridColor(Color.BLACK);
/* 243 */     this.jPanel7 = new JPanel();
/* 244 */     this.jPanel7.setBounds(10, 0, 1146, 146);
/* 245 */     this.jLabel5 = new JLabel();
/* 246 */     this.c_search_tbl = new JTextField();
/* 247 */     this.jPanel10 = new JPanel();
/* 248 */     this.jLabel16 = new JLabel();
/* 249 */     this.sh_city = new JTextField();
/* 250 */     this.jLabel17 = new JLabel();
/* 251 */     this.sh_tp = new JTextField();
/* 252 */     this.jLabel18 = new JLabel();
/* 253 */     this.sh_cp = new JTextField();
/* 254 */     this.jLabel19 = new JLabel();
/* 255 */     this.sh_pn = new JTextField();
/* 256 */     this.jPanel11 = new JPanel();
/* 257 */     this.jButton5 = new JButton();
/* 258 */     this.jButton5.setBounds(41, 34, 333, 70);
/* 259 */     this.cid = new JTextField();
/* 260 */     this.cid.setBounds(41, 175, 333, 66);
/* 261 */     this.jLabel4 = new JLabel();
/* 262 */     this.jLabel4.setBounds(52, 141, 322, 28);
/* 263 */     this.jButton6 = new JButton();
/* 264 */     this.jButton6.setBounds(41, 259, 333, 50);
/*     */     
/* 266 */     this.jPanel3.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 268 */     this.jLabel3.setFont(new Font("Tahoma", 1, 14));
/* 269 */     this.jLabel3.setText("Search ID :");
/*     */     
/* 271 */     this.c_search.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 273 */     this.jPanel2.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 275 */     this.jLabel1.setFont(new Font("Tahoma", 1, 14));
/* 276 */     this.jLabel1.setText("Name :");
/*     */     
/* 278 */     this.jLabel2.setFont(new Font("Tahoma", 1, 14));
/* 279 */     this.jLabel2.setText("T.P Number :");
/*     */     
/* 281 */     this.c_name.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 283 */     this.c_tp.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 285 */     this.jLabel6.setFont(new Font("Tahoma", 1, 14));
/* 286 */     this.jLabel6.setText("Billing Address :");
/*     */     
/* 288 */     this.jLabel7.setFont(new Font("Tahoma", 1, 14));
/* 289 */     this.jLabel7.setText("shiping Addres :");
/*     */     
/* 291 */     this.jPanel8.setBorder(BorderFactory.createTitledBorder("Contact Person"));
/*     */     
/* 293 */     this.jLabel9.setFont(new Font("Tahoma", 1, 14));
/* 294 */     this.jLabel9.setText("Last Name :");
/*     */     
/* 296 */     this.c_person.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 298 */     this.cp_name.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 300 */     this.jLabel8.setFont(new Font("Tahoma", 1, 14));
/* 301 */     this.jLabel8.setText("First Name :");
/*     */     
/* 303 */     this.jLabel12.setFont(new Font("Tahoma", 1, 14));
/* 304 */     this.jLabel12.setText("T.P Number :");
/*     */     
/* 306 */     this.cp_tp.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 308 */     this.jLabel13.setFont(new Font("Tahoma", 1, 14));
/* 309 */     this.jLabel13.setText("Email Address :");
/*     */     
/* 311 */     this.cp_email.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 313 */     this.jLabel10.setFont(new Font("Tahoma", 1, 14));
/* 314 */     this.jLabel10.setText("Bank Acc No :");
/*     */     
/* 316 */     this.jLabel11.setFont(new Font("Tahoma", 1, 14));
/* 317 */     this.jLabel11.setText("City :");
/*     */     
/* 319 */     this.c_bank.setFont(new Font("Tahoma", 1, 14));
/* 320 */     this.c_bank.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 322 */             supplier.this.c_bankActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 326 */     this.c_city.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 328 */     this.jButton1.setFont(new Font("Tahoma", 1, 18));
/* 329 */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/img/delete.png")));
/* 330 */     this.jButton1.setText("Delete");
/* 331 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 333 */             supplier.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 337 */     this.jButton2.setFont(new Font("Tahoma", 1, 18));
/* 338 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/img/update.png")));
/* 339 */     this.jButton2.setText("Update");
/* 340 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 342 */             supplier.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 346 */     this.jButton3.setFont(new Font("Tahoma", 1, 18));
/* 347 */     this.jButton3.setIcon(new ImageIcon(getClass().getResource("/img/search x30.png")));
/* 348 */     this.jButton3.setText("Search");
/* 349 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 351 */             supplier.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 355 */     this.jButton4.setFont(new Font("Tahoma", 1, 18));
/* 356 */     this.jButton4.setIcon(new ImageIcon(getClass().getResource("/img/save.png")));
/* 357 */     this.jButton4.setText("Save");
/* 358 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 360 */             supplier.this.jButton4ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 364 */     this.c_billadd.setColumns(20);
/* 365 */     this.c_billadd.setFont(new Font("Tahoma", 1, 14));
/* 366 */     this.jScrollPane2.setViewportView(this.c_billadd);
/*     */     
/* 368 */     this.same.setText("Same as Billing");
/* 369 */     this.same.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 371 */             supplier.this.sameActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 375 */     this.c_shipadd.setColumns(20);
/* 376 */     this.c_shipadd.setFont(new Font("Tahoma", 1, 14));
/* 377 */     this.jScrollPane4.setViewportView(this.c_shipadd);
/* 378 */     this.jPanel8.setLayout((LayoutManager)null);
/* 379 */     this.jPanel8.add(this.jLabel12);
/* 380 */     this.jPanel8.add(this.jLabel9);
/* 381 */     this.jPanel8.add(this.jLabel8);
/* 382 */     this.jPanel8.add(this.jLabel13);
/* 383 */     this.jPanel8.add(this.cp_tp);
/* 384 */     this.jPanel8.add(this.c_person);
/* 385 */     this.jPanel8.add(this.cp_name);
/* 386 */     this.jPanel8.add(this.cp_email);
/* 387 */     this.jPanel9.setLayout((LayoutManager)null);
/* 388 */     this.jPanel9.add(this.jButton4);
/* 389 */     this.jPanel9.add(this.jButton3);
/* 390 */     this.jPanel9.add(this.jButton2);
/* 391 */     this.jPanel9.add(this.jButton1);
/*     */     
/* 393 */     this.jTabbedPane1.addTab("Add Supplier", this.jPanel6);
/* 394 */     this.jTabbedPane1.setIconAt(0, new ImageIcon(supplier.class.getResource("/img/supplier.png")));
/* 395 */     this.jPanel6.setLayout((LayoutManager)null);
/* 396 */     this.jPanel6.add(this.jPanel3);
/* 397 */     this.jPanel3.setLayout((LayoutManager)null);
/* 398 */     this.jPanel3.add(this.jLabel3);
/* 399 */     this.jPanel3.add(this.c_search);
/* 400 */     this.jPanel6.add(this.jPanel2);
/* 401 */     this.jPanel2.setLayout((LayoutManager)null);
/* 402 */     this.jPanel2.add(this.jPanel9);
/* 403 */     this.jPanel2.add(this.jLabel10);
/* 404 */     this.jPanel2.add(this.jLabel2);
/* 405 */     this.jPanel2.add(this.jLabel6);
/* 406 */     this.jPanel2.add(this.jLabel1);
/* 407 */     this.jPanel2.add(this.jLabel7);
/* 408 */     this.jPanel2.add(this.same);
/* 409 */     this.jPanel2.add(this.jScrollPane4);
/* 410 */     this.jPanel2.add(this.c_tp);
/* 411 */     this.jPanel2.add(this.c_name);
/* 412 */     this.jPanel2.add(this.c_bank);
/* 413 */     this.jPanel2.add(this.jScrollPane2);
/* 414 */     this.jPanel2.add(this.jLabel11);
/* 415 */     this.jPanel2.add(this.c_city);
/* 416 */     this.jPanel2.add(this.jPanel8);
/*     */     
/* 418 */     this.jTable1.setModel(new DefaultTableModel(
/* 419 */           new Object[0][], 
/*     */           
/* 421 */           (Object[])new String[] { 
/* 422 */             "ID", "Customer Name", "T.P Number", "Billing Address", "Shipping Address", "Bank", "City", "Person Name", "Contact Person", "Person TP", "Email" }));
/*     */ 
/*     */     
/* 425 */     this.jTable1.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 427 */             supplier.this.jTable1MouseClicked(evt);
/*     */           }
/*     */         });
/* 430 */     this.jScrollPane1.setViewportView(this.jTable1);
/*     */     
/* 432 */     this.jLabel5.setFont(new Font("Tahoma", 1, 14));
/* 433 */     this.jLabel5.setText("Supplier Name :");
/*     */     
/* 435 */     this.c_search_tbl.setFont(new Font("Tahoma", 1, 18));
/* 436 */     this.c_search_tbl.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 438 */             supplier.this.c_search_tblActionPerformed(evt);
/*     */           }
/*     */         });
/* 441 */     this.c_search_tbl.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 443 */             supplier.this.c_search_tblKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 447 */     this.jLabel16.setFont(new Font("Dialog", 1, 18));
/* 448 */     this.jLabel16.setText("City :");
/*     */     
/* 450 */     this.sh_city.setFont(new Font("Dialog", 1, 18));
/* 451 */     this.sh_city.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 453 */             supplier.this.sh_cityKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 457 */     this.jLabel17.setFont(new Font("Dialog", 1, 18));
/* 458 */     this.jLabel17.setText("Preson Name :");
/*     */     
/* 460 */     this.sh_tp.setFont(new Font("Dialog", 1, 18));
/* 461 */     this.sh_tp.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 463 */             supplier.this.sh_tpKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 467 */     this.jLabel18.setFont(new Font("Dialog", 1, 18));
/* 468 */     this.jLabel18.setText("Contact Person :");
/*     */     
/* 470 */     this.sh_cp.setFont(new Font("Dialog", 1, 18));
/* 471 */     this.sh_cp.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 473 */             supplier.this.sh_cpKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 477 */     this.jLabel19.setFont(new Font("Dialog", 1, 18));
/* 478 */     this.jLabel19.setText("TelePhone :");
/*     */     
/* 480 */     this.sh_pn.setFont(new Font("Dialog", 1, 18));
/* 481 */     this.sh_pn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 483 */             supplier.this.sh_pnActionPerformed(evt);
/*     */           }
/*     */         });
/* 486 */     this.sh_pn.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 488 */             supplier.this.sh_pnKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 492 */     GroupLayout jPanel10Layout = new GroupLayout(this.jPanel10);
/* 493 */     this.jPanel10.setLayout(jPanel10Layout);
/* 494 */     jPanel10Layout.setHorizontalGroup(
/* 495 */         jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 496 */         .addGroup(jPanel10Layout.createSequentialGroup()
/* 497 */           .addGap(16, 16, 16)
/* 498 */           .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 499 */             .addComponent(this.sh_city, -2, 227, -2)
/* 500 */             .addComponent(this.jLabel16))
/* 501 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 28, 32767)
/* 502 */           .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 503 */             .addComponent(this.sh_tp, -2, 227, -2)
/* 504 */             .addComponent(this.jLabel19))
/* 505 */           .addGap(29, 29, 29)
/* 506 */           .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 507 */             .addComponent(this.sh_cp, -2, 227, -2)
/* 508 */             .addComponent(this.jLabel18))
/* 509 */           .addGap(30, 30, 30)
/* 510 */           .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 511 */             .addComponent(this.sh_pn, -2, 227, -2)
/* 512 */             .addComponent(this.jLabel17))
/* 513 */           .addGap(87, 87, 87)));
/*     */     
/* 515 */     jPanel10Layout.setVerticalGroup(
/* 516 */         jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 517 */         .addGroup(jPanel10Layout.createSequentialGroup()
/* 518 */           .addContainerGap()
/* 519 */           .addGroup(jPanel10Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 520 */             .addGroup(jPanel10Layout.createSequentialGroup()
/* 521 */               .addComponent(this.jLabel19)
/* 522 */               .addGap(42, 42, 42))
/* 523 */             .addComponent(this.sh_tp, -2, 36, -2)
/* 524 */             .addGroup(jPanel10Layout.createSequentialGroup()
/* 525 */               .addComponent(this.jLabel17)
/* 526 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 527 */               .addComponent(this.sh_pn, -2, 36, -2))
/* 528 */             .addGroup(jPanel10Layout.createSequentialGroup()
/* 529 */               .addComponent(this.jLabel18)
/* 530 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 531 */               .addComponent(this.sh_cp, -2, 36, -2))
/* 532 */             .addGroup(jPanel10Layout.createSequentialGroup()
/* 533 */               .addComponent(this.jLabel16)
/* 534 */               .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 535 */               .addComponent(this.sh_city, -2, 36, -2)))
/* 536 */           .addContainerGap(-1, 32767)));
/*     */ 
/*     */     
/* 539 */     GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
/* 540 */     this.jPanel7.setLayout(jPanel7Layout);
/* 541 */     jPanel7Layout.setHorizontalGroup(
/* 542 */         jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 543 */         .addGroup(jPanel7Layout.createSequentialGroup()
/* 544 */           .addGap(20, 20, 20)
/* 545 */           .addComponent(this.jLabel5)
/* 546 */           .addGap(18, 18, 18)
/* 547 */           .addComponent(this.c_search_tbl, -2, 222, -2)
/* 548 */           .addContainerGap(-1, 32767))
/* 549 */         .addGroup(jPanel7Layout.createSequentialGroup()
/* 550 */           .addComponent(this.jPanel10, -2, -1, -2)
/* 551 */           .addGap(0, 48, 32767)));
/*     */     
/* 553 */     jPanel7Layout.setVerticalGroup(
/* 554 */         jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 555 */         .addGroup(jPanel7Layout.createSequentialGroup()
/* 556 */           .addGap(8, 8, 8)
/* 557 */           .addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 558 */             .addComponent(this.jLabel5)
/* 559 */             .addComponent(this.c_search_tbl, -2, -1, -2))
/* 560 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 561 */           .addComponent(this.jPanel10, -2, -1, -2)
/* 562 */           .addContainerGap(-1, 32767)));
/*     */ 
/*     */     
/* 565 */     this.jTabbedPane1.addTab("Search Supplier", this.jPanel4);
/* 566 */     this.jTabbedPane1.setIconAt(1, new ImageIcon(supplier.class.getResource("/img/search x30.png")));
/* 567 */     this.jPanel4.setLayout((LayoutManager)null);
/* 568 */     this.jPanel4.add(this.jPanel7);
/* 569 */     this.jPanel4.add(this.jScrollPane1);
/*     */     
/* 571 */     this.jButton5.setText("All Supplier Reports");
/* 572 */     this.jButton5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 574 */             supplier.this.jButton5ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 578 */     this.jLabel4.setFont(new Font("Dialog", 1, 18));
/* 579 */     this.jLabel4.setText("Supplier ID :");
/*     */     
/* 581 */     this.jButton6.setText("View Report");
/* 582 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 584 */             supplier.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 587 */     setLayout((LayoutManager)null);
/*     */     
/* 589 */     this.jTabbedPane1.addTab("Reports", this.jPanel11);
/* 590 */     this.jTabbedPane1.setIconAt(2, new ImageIcon(supplier.class.getResource("/img/reports.png")));
/* 591 */     this.jPanel11.setLayout((LayoutManager)null);
/* 592 */     this.jPanel11.add(this.jButton6);
/* 593 */     this.jPanel11.add(this.jLabel4);
/* 594 */     this.jPanel11.add(this.jButton5);
/* 595 */     this.jPanel11.add(this.cid);
/*     */     
/* 597 */     JPanel panel = new JPanel();
/* 598 */     panel.setBorder(new SoftBevelBorder(1, null, null, null, null));
/* 599 */     panel.setBounds(401, 11, 664, 525);
/* 600 */     this.jPanel11.add(panel);
/* 601 */     panel.setLayout((LayoutManager)null);
/*     */     
/* 603 */     JLabel lblNewLabel = new JLabel("QUICK SUPPLIER(S) REPORTS VIEWER");
/* 604 */     lblNewLabel.setHorizontalAlignment(0);
/* 605 */     lblNewLabel.setBounds(10, 11, 644, 25);
/* 606 */     panel.add(lblNewLabel);
/*     */     
/* 608 */     JScrollPane scrollPane = new JScrollPane();
/* 609 */     scrollPane.setBounds(10, 47, 644, 466);
/* 610 */     panel.add(scrollPane);
/*     */     
/* 612 */     JEditorPane editorPane = new JEditorPane();
/* 613 */     scrollPane.setViewportView(editorPane);
/* 614 */     this.jPanel1.setLayout((LayoutManager)null);
/* 615 */     this.jPanel1.add(this.jTabbedPane1);
/* 616 */     add(this.jPanel1);
/*     */   }
/*     */ 
/*     */   
/*     */   private void c_search_tblKeyReleased(KeyEvent evt) {
/* 621 */     String name = this.c_search_tbl.getText();
/*     */     
/*     */     try {
/* 624 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/* 625 */       dt.setRowCount(0);
/* 626 */       Statement s = db.mycon().createStatement();
/*     */       
/* 628 */       ResultSet rs = s.executeQuery("SELECT * FROM supplier WHERE supplier_Name LIKE '%" + name + "%' ");
/*     */       
/* 630 */       while (rs.next()) {
/* 631 */         Vector<String> v = new Vector();
/*     */         
/* 633 */         v.add(rs.getString(1));
/* 634 */         v.add(rs.getString(2));
/* 635 */         v.add(rs.getString(3));
/* 636 */         v.add(rs.getString(4));
/* 637 */         v.add(rs.getString(5));
/* 638 */         v.add(rs.getString(6));
/* 639 */         v.add(rs.getString(7));
/* 640 */         v.add(rs.getString(8));
/* 641 */         v.add(rs.getString(9));
/* 642 */         v.add(rs.getString(10));
/* 643 */         v.add(rs.getString(11));
/*     */ 
/*     */         
/* 646 */         dt.addRow(v);
/*     */       }
/*     */     
/*     */     }
/* 650 */     catch (Exception e) {
/* 651 */       tb_load();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jTable1MouseClicked(MouseEvent evt) {
/* 660 */     int r = this.jTable1.getSelectedRow();
/*     */     
/* 662 */     String id = this.jTable1.getValueAt(r, 0).toString();
/* 663 */     String name = this.jTable1.getValueAt(r, 1).toString();
/* 664 */     String tp = this.jTable1.getValueAt(r, 2).toString();
/*     */     
/* 666 */     this.c_search.setText(id);
/* 667 */     this.c_name.setText(name);
/* 668 */     this.c_tp.setText(tp);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void c_search_tblActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void c_search_tblKeyPressed(KeyEvent evt) {}
/*     */ 
/*     */   
/*     */   private void sh_cityKeyReleased(KeyEvent evt) {
/* 681 */     search();
/*     */   }
/*     */ 
/*     */   
/*     */   private void sh_tpKeyReleased(KeyEvent evt) {
/* 686 */     search();
/*     */   }
/*     */ 
/*     */   
/*     */   private void sh_cpKeyReleased(KeyEvent evt) {
/* 691 */     search();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jTabbedPane1MouseClicked(MouseEvent evt) {
/*     */     try {
/* 697 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/* 698 */       dt.setRowCount(0);
/* 699 */       Statement s = db.mycon().createStatement();
/*     */       
/* 701 */       ResultSet rs = s.executeQuery("SELECT * FROM supplier ");
/*     */       
/* 703 */       while (rs.next()) {
/* 704 */         Vector<String> v = new Vector();
/*     */         
/* 706 */         v.add(rs.getString(1));
/* 707 */         v.add(rs.getString(2));
/* 708 */         v.add(rs.getString(3));
/* 709 */         v.add(rs.getString(4));
/* 710 */         v.add(rs.getString(5));
/* 711 */         v.add(rs.getString(6));
/* 712 */         v.add(rs.getString(7));
/* 713 */         v.add(rs.getString(8));
/* 714 */         v.add(rs.getString(9));
/* 715 */         v.add(rs.getString(10));
/* 716 */         v.add(rs.getString(11));
/*     */         
/* 718 */         dt.addRow(v);
/*     */       }
/*     */     
/*     */     }
/* 722 */     catch (Exception e) {
/* 723 */       tb_load();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private void sh_pnKeyReleased(KeyEvent evt) {
/* 729 */     search();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 736 */     ReportView r = new ReportView(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/reports/Allsupplier.jasper");
/* 737 */     r.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 745 */     HashMap<Object, Object> para = new HashMap<>();
/* 746 */     para.put("Para_sid", this.cid.getText());
/*     */     
/* 748 */     ReportView r = new ReportView(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/reports/sidsupplier.jasper", para);
/* 749 */     r.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void sameActionPerformed(ActionEvent evt) {
/* 759 */     if (this.same.isSelected()) {
/* 760 */       this.c_shipadd.setText(this.c_billadd.getText());
/*     */     } else {
/* 762 */       this.c_shipadd.setText("");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 769 */     String name = this.c_name.getText();
/* 770 */     String tp = this.c_tp.getText();
/*     */     
/* 772 */     String bill_add = this.c_billadd.getText();
/* 773 */     String shipp_add = this.c_shipadd.getText();
/* 774 */     String bank = this.c_bank.getText();
/* 775 */     String city = this.c_city.getText();
/* 776 */     String person_name = this.cp_name.getText();
/* 777 */     String contact_person = this.c_person.getText();
/* 778 */     String person_tp = this.cp_tp.getText();
/* 779 */     String email = this.cp_email.getText();
/*     */     
/*     */     try {
/* 782 */       Statement s = db.mycon().createStatement();
/* 783 */       s.executeUpdate(" INSERT INTO supplier (supplier_Name,Tp_Number,billAddr,shipAddr,Bank,City,Fname,Lname,conTp,conEmail) VALUES ('" + 
/* 784 */           name + "','" + tp + "','" + bill_add + "','" + shipp_add + "','" + bank + "','" + city + "','" + person_name + "','" + contact_person + "','" + person_tp + "','" + email + "')");
/*     */       
/* 786 */       Notification.sendNotification("Moyale Supermarket", "Supplier : " + name + " added to Database", TrayIcon.MessageType.INFO);
/*     */     }
/* 788 */     catch (SQLException e) {
/*     */       
/* 790 */       JOptionPane.showMessageDialog(null, e);
/*     */     }
/* 792 */     catch (MalformedURLException e) {
/*     */       
/* 794 */       e.printStackTrace();
/* 795 */     } catch (AWTException e) {
/*     */       
/* 797 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 800 */     tb_load();
/* 801 */     clearText();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 807 */     String search = this.c_search.getText();
/*     */     
/*     */     try {
/* 810 */       Statement s = db.mycon().createStatement();
/*     */       
/* 812 */       ResultSet rs = s.executeQuery(" SELECT * FROM supplier WHERE sid = '" + search + "'");
/*     */       
/* 814 */       if (rs.next())
/*     */       {
/* 816 */         this.c_name.setText(rs.getString("supplier_Name"));
/* 817 */         this.c_tp.setText(rs.getString("Tp_Number"));
/* 818 */         this.c_billadd.setText(rs.getString("billAddr"));
/* 819 */         this.c_shipadd.setText(rs.getString("shipAddr"));
/* 820 */         this.c_bank.setText(rs.getString("Bank"));
/* 821 */         this.c_city.setText(rs.getString("City"));
/*     */         
/* 823 */         this.cp_name.setText(rs.getString("Fname"));
/* 824 */         this.c_person.setText(rs.getString("Lname"));
/* 825 */         this.cp_tp.setText(rs.getString("conTp"));
/* 826 */         this.cp_email.setText(rs.getString("conEmail"));
/*     */       }
/*     */     
/*     */     }
/* 830 */     catch (SQLException e) {
/* 831 */       System.out.println(e);
/* 832 */       JOptionPane.showMessageDialog(null, e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 840 */     String id = this.c_search.getText();
/*     */     
/* 842 */     String name = this.c_name.getText();
/* 843 */     String tp = this.c_tp.getText();
/*     */     
/* 845 */     String bill_add = this.c_billadd.getText();
/* 846 */     String shipp_add = this.c_shipadd.getText();
/* 847 */     String bank = this.c_bank.getText();
/* 848 */     String city = this.c_city.getText();
/* 849 */     String person_name = this.cp_name.getText();
/* 850 */     String contact_person = this.c_person.getText();
/* 851 */     String person_tp = this.cp_tp.getText();
/* 852 */     String email = this.cp_email.getText();
/*     */     
/*     */     try {
/* 855 */       Statement s = db.mycon().createStatement();
/* 856 */       s.executeUpdate(" UPDATE supplier SET supplier_Name ='" + name + "'" + 
/* 857 */           " ,Tp_Number ='" + tp + "'" + 
/* 858 */           ",billAddr ='" + bill_add + "'" + 
/* 859 */           ",shipAddr ='" + shipp_add + "' " + 
/* 860 */           ",Bank ='" + bank + "' " + 
/* 861 */           ",City ='" + city + "' " + 
/* 862 */           ",Fname ='" + person_name + "' " + 
/* 863 */           ",Lname ='" + contact_person + "' " + 
/* 864 */           ",conTp ='" + person_tp + "' " + 
/* 865 */           ",conEmail ='" + email + "' " + 
/* 866 */           " WHERE sid = '" + id + "' ");
/* 867 */       Notification.sendNotification("TrineTechs : Moyale Mini Supermarket", "Data for: " + name + " updated successfully", TrayIcon.MessageType.INFO);
/*     */     
/*     */     }
/* 870 */     catch (SQLException e) {
/* 871 */       System.out.println(e);
/* 872 */       JOptionPane.showMessageDialog(null, e);
/* 873 */     } catch (MalformedURLException e) {
/* 874 */       e.printStackTrace();
/* 875 */     } catch (AWTException e) {
/*     */       
/* 877 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 880 */     tb_load();
/* 881 */     clearText();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 888 */     String id = this.c_search.getText();
/*     */     
/*     */     try {
/* 891 */       Statement s = db.mycon().createStatement();
/* 892 */       s.executeUpdate("DELETE FROM supplier WHERE sid = '" + id + "'");
/* 893 */       JOptionPane.showMessageDialog(null, "Data Deleted Successfully");
/*     */     }
/* 895 */     catch (SQLException e) {
/* 896 */       System.out.println(e);
/*     */     } 
/*     */     
/* 899 */     tb_load();
/* 900 */     clearText();
/*     */   }
/*     */   
/*     */   private void c_bankActionPerformed(ActionEvent evt) {}
/*     */   
/*     */   private void sh_pnActionPerformed(ActionEvent evt) {}
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/supplier.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */