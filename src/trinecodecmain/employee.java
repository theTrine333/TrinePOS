/*     */ package trinecodecmain;
/*     */ import java.awt.event.ActionEvent;
/*     */ 
/*     */ public class employee extends JPanel {
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
/*     */   
/*     */   public employee() {
/*  21 */     setSize(1080, 580);
/*  22 */     initComponents();
/*  23 */     tb_load();
/*     */   }
/*     */   private JButton jButton2; private JButton jButton3; private JButton jButton4; private JButton jButton5; private JButton jButton6; private JButton jButton7; private JLabel jLabel1; private JLabel jLabel10; private JLabel jLabel11; private JLabel jLabel12; private JLabel jLabel13; private JLabel jLabel16; private JLabel jLabel17; private JLabel jLabel18; private JLabel jLabel19; private JLabel jLabel2; private JLabel jLabel3; private JLabel jLabel4; private JLabel jLabel5; private JLabel jLabel6; private JLabel jLabel7; private JLabel jLabel8; private JLabel jLabel9; private JPanel jPanel1; private JPanel jPanel10; private JPanel jPanel11; private JPanel jPanel2; private JPanel jPanel3; private JPanel jPanel4; private JPanel jPanel5; private JPanel jPanel6; private JPanel jPanel7; private JPanel jPanel8; private JPanel jPanel9; private JScrollPane jScrollPane1; private JScrollPane jScrollPane2; private JScrollPane jScrollPane4; private JTabbedPane jTabbedPane1; private JTable jTable1; private JCheckBox same; private JTextField sh_city; private JTextField sh_cp; private JTextField sh_pn;
/*     */   private JTextField sh_tp;
/*     */   
/*     */   public void tb_load() {
/*     */     try {
/*  30 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*  31 */       dt.setRowCount(0);
/*     */       
/*  33 */       Statement s = db.mycon().createStatement();
/*  34 */       ResultSet rs = s.executeQuery(" SELECT * FROM employee");
/*     */       
/*  36 */       while (rs.next())
/*     */       {
/*  38 */         Vector<String> v = new Vector();
/*     */         
/*  40 */         v.add(rs.getString(1));
/*  41 */         v.add(rs.getString(2));
/*  42 */         v.add(rs.getString(3));
/*  43 */         v.add(rs.getString(4));
/*  44 */         v.add(rs.getString(5));
/*  45 */         v.add(rs.getString(6));
/*  46 */         v.add(rs.getString(7));
/*  47 */         v.add(rs.getString(8));
/*  48 */         v.add(rs.getString(9));
/*  49 */         v.add(rs.getString(10));
/*  50 */         v.add(rs.getString(11));
/*     */         
/*  52 */         dt.addRow(v);
/*     */       }
/*     */     
/*     */     }
/*  56 */     catch (SQLException e) {
/*  57 */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void search() {
/*  64 */     String city = this.sh_city.getText();
/*  65 */     String tp = this.sh_tp.getText();
/*  66 */     String contact_person = this.sh_cp.getText();
/*  67 */     String person_name = this.sh_pn.getText();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/*  72 */       DefaultTableModel dtm = (DefaultTableModel)this.jTable1.getModel();
/*  73 */       dtm.setRowCount(0);
/*     */       
/*  75 */       Statement s = db.mycon().createStatement();
/*  76 */       ResultSet rs = s.executeQuery(" SELECT * FROM employee WHERE city LIKE  '%" + city + "%' AND tp_number LIKE '%" + tp + "%' AND contact_person LIKE '%" + contact_person + "%' AND person_name LIKE '%" + person_name + "%' ");
/*     */ 
/*     */ 
/*     */       
/*  80 */       while (rs.next())
/*     */       {
/*  82 */         Vector<String> v = new Vector();
/*     */         
/*  84 */         v.add(rs.getString(1));
/*  85 */         v.add(rs.getString(2));
/*  86 */         v.add(rs.getString(3));
/*  87 */         v.add(rs.getString(4));
/*  88 */         v.add(rs.getString(5));
/*  89 */         v.add(rs.getString(6));
/*  90 */         v.add(rs.getString(7));
/*  91 */         v.add(rs.getString(8));
/*  92 */         v.add(rs.getString(9));
/*  93 */         v.add(rs.getString(10));
/*  94 */         v.add(rs.getString(11));
/*     */         
/*  96 */         dtm.addRow(v);
/*     */       }
/*     */     
/*     */     }
/* 100 */     catch (Exception e) {
/*     */       
/* 102 */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearText() {
/* 108 */     this.c_name.setText("");
/* 109 */     this.c_tp.setText("");
/* 110 */     this.c_billadd.setText("");
/* 111 */     this.c_shipadd.setText("");
/* 112 */     this.c_bank.setText("");
/* 113 */     this.c_city.setText("");
/* 114 */     this.cp_name.setText("");
/* 115 */     this.c_person.setText("");
/* 116 */     this.cp_tp.setText("");
/* 117 */     this.cp_email.setText("");
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/* 124 */     this.jPanel1 = new JPanel();
/* 125 */     this.jTabbedPane1 = new JTabbedPane();
/* 126 */     this.jTabbedPane1.setBounds(0, 0, 1080, 569);
/* 127 */     this.jPanel6 = new JPanel();
/* 128 */     this.jPanel3 = new JPanel();
/* 129 */     this.jPanel3.setBounds(0, 7, 939, 58);
/* 130 */     this.jLabel3 = new JLabel();
/* 131 */     this.jLabel3.setBounds(26, 13, 77, 42);
/* 132 */     this.c_search = new JTextField();
/* 133 */     this.c_search.setBounds(133, 23, 254, 23);
/* 134 */     this.jPanel2 = new JPanel();
/* 135 */     this.jPanel2.setBounds(0, 72, 939, 445);
/* 136 */     this.jLabel1 = new JLabel();
/* 137 */     this.jLabel1.setBounds(64, 14, 49, 33);
/* 138 */     this.jLabel2 = new JLabel();
/* 139 */     this.jLabel2.setBounds(22, 53, 91, 32);
/* 140 */     this.c_name = new JTextField();
/* 141 */     this.c_name.setBounds(137, 14, 313, 33);
/* 142 */     this.c_tp = new JTextField();
/* 143 */     this.c_tp.setBounds(137, 53, 313, 32);
/* 144 */     this.jLabel6 = new JLabel();
/* 145 */     this.jLabel6.setBounds(12, 91, 101, 17);
/* 146 */     this.jLabel7 = new JLabel();
/* 147 */     this.jLabel7.setBounds(12, 187, 101, 17);
/* 148 */     this.jPanel8 = new JPanel();
/* 149 */     this.jPanel8.setBounds(462, 4, 464, 321);
/* 150 */     this.jLabel9 = new JLabel();
/* 151 */     this.c_person = new JTextField();
/* 152 */     this.cp_name = new JTextField();
/* 153 */     this.jLabel8 = new JLabel();
/* 154 */     this.jLabel12 = new JLabel();
/* 155 */     this.cp_tp = new JTextField();
/* 156 */     this.jLabel13 = new JLabel();
/* 157 */     this.cp_email = new JTextField();
/* 158 */     this.jLabel10 = new JLabel();
/* 159 */     this.jLabel10.setBounds(26, 287, 105, 17);
/* 160 */     this.jLabel11 = new JLabel();
/* 161 */     this.jLabel11.setHorizontalAlignment(4);
/* 162 */     this.jLabel11.setBounds(26, 346, 106, 17);
/* 163 */     this.c_bank = new JTextField();
/* 164 */     this.c_bank.setBounds(137, 287, 313, 38);
/* 165 */     this.c_city = new JTextField();
/* 166 */     this.c_city.setBounds(136, 336, 314, 38);
/* 167 */     this.jPanel9 = new JPanel();
/* 168 */     this.jPanel9.setBounds(0, 384, 1135, 104);
/* 169 */     this.jButton1 = new JButton();
/* 170 */     this.jButton1.setBounds(695, 5, 210, 55);
/* 171 */     this.jButton2 = new JButton();
/* 172 */     this.jButton2.setBounds(480, 5, 202, 55);
/* 173 */     this.jButton3 = new JButton();
/* 174 */     this.jButton3.setBounds(265, 5, 203, 55);
/* 175 */     this.jButton4 = new JButton();
/* 176 */     this.jButton4.setBounds(65, 5, 188, 55);
/* 177 */     this.jScrollPane2 = new JScrollPane();
/* 178 */     this.jScrollPane2.setBounds(137, 91, 313, 90);
/* 179 */     this.c_billadd = new JTextArea();
/* 180 */     this.same = new JCheckBox();
/* 181 */     this.same.setBounds(12, 206, 91, 23);
/* 182 */     this.jScrollPane4 = new JScrollPane();
/* 183 */     this.jScrollPane4.setBounds(137, 187, 313, 94);
/* 184 */     this.c_shipadd = new JTextArea();
/* 185 */     this.jPanel4 = new JPanel();
/* 186 */     this.jPanel4.setSize(950, 550);
/* 187 */     this.jPanel5 = new JPanel();
/* 188 */     this.jPanel5.setBounds(1218, 459, 100, 100);
/* 189 */     this.jScrollPane1 = new JScrollPane();
/* 190 */     this.jScrollPane1.setBounds(0, 165, 1065, 354);
/* 191 */     this.jTable1 = new JTable();
/* 192 */     this.jPanel7 = new JPanel();
/* 193 */     this.jPanel7.setBounds(0, 0, 1065, 154);
/* 194 */     this.jLabel5 = new JLabel();
/* 195 */     this.jLabel5.setBounds(20, 15, 120, 17);
/* 196 */     this.c_search_tbl = new JTextField();
/* 197 */     this.c_search_tbl.setBounds(158, 8, 222, 28);
/* 198 */     this.jPanel10 = new JPanel();
/* 199 */     this.jPanel10.setBounds(0, 49, 1024, 94);
/* 200 */     this.jLabel16 = new JLabel();
/* 201 */     this.jLabel16.setBounds(16, 13, 47, 24);
/* 202 */     this.sh_city = new JTextField();
/* 203 */     this.sh_city.setBounds(16, 47, 148, 30);
/* 204 */     this.jLabel17 = new JLabel();
/* 205 */     this.jLabel17.setBounds(509, 13, 130, 24);
/* 206 */     this.sh_tp = new JTextField();
/* 207 */     this.sh_tp.setBounds(188, 44, 139, 36);
/* 208 */     this.jLabel18 = new JLabel();
/* 209 */     this.jLabel18.setBounds(345, 13, 146, 24);
/* 210 */     this.sh_cp = new JTextField();
/* 211 */     this.sh_cp.setBounds(345, 44, 146, 36);
/* 212 */     this.jLabel19 = new JLabel();
/* 213 */     this.jLabel19.setBounds(188, 19, 106, 24);
/* 214 */     this.sh_pn = new JTextField();
/* 215 */     this.sh_pn.setBounds(509, 44, 227, 36);
/* 216 */     this.jButton7 = new JButton();
/* 217 */     this.jButton7.setBounds(777, 40, 99, 36);
/* 218 */     this.jPanel11 = new JPanel();
/* 219 */     this.jButton5 = new JButton();
/* 220 */     this.jButton5.setBounds(41, 34, 333, 70);
/* 221 */     this.cid = new JTextField();
/* 222 */     this.cid.setBounds(41, 175, 333, 66);
/* 223 */     this.jLabel4 = new JLabel();
/* 224 */     this.jLabel4.setBounds(52, 141, 322, 28);
/* 225 */     this.jButton6 = new JButton();
/* 226 */     this.jButton6.setBounds(41, 259, 333, 50);
/*     */     
/* 228 */     this.jPanel3.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 230 */     this.jLabel3.setFont(new Font("Tahoma", 1, 14));
/* 231 */     this.jLabel3.setText("Search ID :");
/*     */     
/* 233 */     this.c_search.setFont(new Font("Tahoma", 1, 14));
/* 234 */     this.c_search.setText("");
/* 235 */     this.c_search.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 237 */             employee.this.c_searchKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 241 */     this.jPanel2.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 243 */     this.jLabel1.setFont(new Font("Tahoma", 1, 14));
/* 244 */     this.jLabel1.setText("Name :");
/*     */     
/* 246 */     this.jLabel2.setFont(new Font("Tahoma", 1, 14));
/* 247 */     this.jLabel2.setText("T.P Number :");
/*     */     
/* 249 */     this.c_name.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 251 */     this.c_tp.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 253 */     this.jLabel6.setFont(new Font("Tahoma", 1, 14));
/* 254 */     this.jLabel6.setText("Main Address :");
/*     */     
/* 256 */     this.jLabel7.setFont(new Font("Tahoma", 1, 14));
/* 257 */     this.jLabel7.setText("Temp Addres :");
/*     */     
/* 259 */     this.jPanel8.setBorder(BorderFactory.createTitledBorder("Contact Person"));
/*     */     
/* 261 */     this.jLabel9.setFont(new Font("Tahoma", 1, 14));
/* 262 */     this.jLabel9.setText("Last Name :");
/*     */     
/* 264 */     this.c_person.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 266 */     this.cp_name.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 268 */     this.jLabel8.setFont(new Font("Tahoma", 1, 14));
/* 269 */     this.jLabel8.setText("First Name :");
/*     */     
/* 271 */     this.jLabel12.setFont(new Font("Tahoma", 1, 14));
/* 272 */     this.jLabel12.setText("T.P Number :");
/*     */     
/* 274 */     this.cp_tp.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 276 */     this.jLabel13.setFont(new Font("Tahoma", 1, 14));
/* 277 */     this.jLabel13.setText("Email Address:");
/*     */     
/* 279 */     this.cp_email.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 281 */     GroupLayout jPanel8Layout = new GroupLayout(this.jPanel8);
/* 282 */     jPanel8Layout.setHorizontalGroup(
/* 283 */         jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 284 */         .addGroup(jPanel8Layout.createSequentialGroup()
/* 285 */           .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 286 */             .addGroup(jPanel8Layout.createSequentialGroup()
/* 287 */               .addGap(10)
/* 288 */               .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 289 */                 .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
/* 290 */                   .addComponent(this.jLabel12)
/* 291 */                   .addComponent(this.jLabel9))
/* 292 */                 .addComponent(this.jLabel8, GroupLayout.Alignment.TRAILING)))
/* 293 */             .addGroup(jPanel8Layout.createSequentialGroup()
/* 294 */               .addContainerGap()
/* 295 */               .addComponent(this.jLabel13)))
/* 296 */           .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
/* 297 */           .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
/* 298 */             .addComponent(this.cp_name)
/* 299 */             .addComponent(this.c_person)
/* 300 */             .addComponent(this.cp_tp)
/* 301 */             .addComponent(this.cp_email, -1, 284, 32767))
/* 302 */           .addContainerGap(146, 32767)));
/*     */     
/* 304 */     jPanel8Layout.setVerticalGroup(
/* 305 */         jPanel8Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 306 */         .addGroup(jPanel8Layout.createSequentialGroup()
/* 307 */           .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 308 */             .addComponent(this.jLabel8, -1, -1, 32767)
/* 309 */             .addComponent(this.cp_name, -2, 35, -2))
/* 310 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 311 */           .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 312 */             .addComponent(this.jLabel9)
/* 313 */             .addComponent(this.c_person, -2, 33, -2))
/* 314 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 315 */           .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 316 */             .addComponent(this.jLabel12)
/* 317 */             .addComponent(this.cp_tp, -1, 33, 32767))
/* 318 */           .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
/* 319 */           .addGroup(jPanel8Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
/* 320 */             .addComponent(this.jLabel13, -1, -1, 32767)
/* 321 */             .addComponent(this.cp_email, -2, 35, -2))
/* 322 */           .addGap(195)));
/*     */     
/* 324 */     this.jPanel8.setLayout(jPanel8Layout);
/*     */     
/* 326 */     this.jLabel10.setFont(new Font("Tahoma", 1, 14));
/* 327 */     this.jLabel10.setText("Bank Acc No :");
/*     */     
/* 329 */     this.jLabel11.setFont(new Font("Tahoma", 1, 14));
/* 330 */     this.jLabel11.setText("City :");
/*     */     
/* 332 */     this.c_bank.setFont(new Font("Tahoma", 1, 14));
/* 333 */     this.c_bank.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 335 */             employee.this.c_bankActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 339 */     this.c_city.setFont(new Font("Tahoma", 1, 14));
/*     */     
/* 341 */     this.jButton1.setFont(new Font("Tahoma", 1, 24));
/* 342 */     this.jButton1.setIcon(new ImageIcon(getClass().getResource("/img/delete.png")));
/* 343 */     this.jButton1.setText("Delete");
/* 344 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 346 */             employee.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 350 */     this.jButton2.setFont(new Font("Tahoma", 1, 24));
/* 351 */     this.jButton2.setIcon(new ImageIcon(getClass().getResource("/img/update.png")));
/* 352 */     this.jButton2.setText("Update");
/* 353 */     this.jButton2.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 355 */             employee.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 359 */     this.jButton3.setFont(new Font("Tahoma", 1, 24));
/* 360 */     this.jButton3.setIcon(new ImageIcon(getClass().getResource("/img/search x30.png")));
/* 361 */     this.jButton3.setText("Search");
/* 362 */     this.jButton3.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 364 */             employee.this.jButton3ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 368 */     this.jButton4.setFont(new Font("Tahoma", 1, 24));
/* 369 */     this.jButton4.setIcon(new ImageIcon(getClass().getResource("/img/save.png")));
/* 370 */     this.jButton4.setText("Save");
/* 371 */     this.jButton4.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             try {
/* 374 */               employee.this.jButton4ActionPerformed(evt);
/* 375 */             } catch (MalformedURLException e) {
/*     */               
/* 377 */               e.printStackTrace();
/* 378 */             } catch (AWTException e) {
/*     */               
/* 380 */               e.printStackTrace();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 385 */     this.c_billadd.setColumns(20);
/* 386 */     this.c_billadd.setFont(new Font("Tahoma", 1, 14));
/* 387 */     this.jScrollPane2.setViewportView(this.c_billadd);
/*     */     
/* 389 */     this.same.setText("Same as Main");
/* 390 */     this.same.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 392 */             employee.this.sameActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 396 */     this.c_shipadd.setColumns(20);
/* 397 */     this.c_shipadd.setFont(new Font("Tahoma", 1, 14));
/* 398 */     this.jScrollPane4.setViewportView(this.c_shipadd);
/* 399 */     this.jPanel3.setLayout((LayoutManager)null);
/* 400 */     this.jPanel3.add(this.jLabel3);
/* 401 */     this.jPanel3.add(this.c_search);
/* 402 */     this.jPanel2.setLayout((LayoutManager)null);
/* 403 */     this.jPanel2.add(this.jLabel10);
/* 404 */     this.jPanel2.add(this.jLabel2);
/* 405 */     this.jPanel2.add(this.jLabel6);
/* 406 */     this.jPanel2.add(this.jLabel1);
/* 407 */     this.jPanel2.add(this.jLabel7);
/* 408 */     this.jPanel2.add(this.same);
/* 409 */     this.jPanel2.add(this.jScrollPane4);
/* 410 */     this.jPanel2.add(this.jScrollPane2);
/* 411 */     this.jPanel2.add(this.c_tp);
/* 412 */     this.jPanel2.add(this.c_name);
/* 413 */     this.jPanel2.add(this.c_bank);
/* 414 */     this.jPanel2.add(this.jLabel11);
/* 415 */     this.jPanel2.add(this.c_city);
/* 416 */     this.jPanel2.add(this.jPanel8);
/* 417 */     this.jPanel2.add(this.jPanel9);
/* 418 */     this.jPanel9.setLayout((LayoutManager)null);
/* 419 */     this.jPanel9.add(this.jButton4);
/* 420 */     this.jPanel9.add(this.jButton3);
/* 421 */     this.jPanel9.add(this.jButton2);
/* 422 */     this.jPanel9.add(this.jButton1);
/*     */     
/* 424 */     this.jTabbedPane1.addTab("Add Employee", this.jPanel6);
/* 425 */     this.jTabbedPane1.setIconAt(0, new ImageIcon(employee.class.getResource("/img/emp.png")));
/* 426 */     this.jPanel6.setLayout((LayoutManager)null);
/* 427 */     this.jPanel6.add(this.jPanel3);
/* 428 */     this.jPanel6.add(this.jPanel2);
/*     */     
/* 430 */     GroupLayout jPanel5Layout = new GroupLayout(this.jPanel5);
/* 431 */     this.jPanel5.setLayout(jPanel5Layout);
/* 432 */     jPanel5Layout.setHorizontalGroup(
/* 433 */         jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 434 */         .addGap(0, 100, 32767));
/*     */     
/* 436 */     jPanel5Layout.setVerticalGroup(
/* 437 */         jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
/* 438 */         .addGap(0, 100, 32767));
/*     */ 
/*     */     
/* 441 */     this.jTable1.setModel(new DefaultTableModel(
/* 442 */           new Object[0][], 
/*     */ 
/*     */           
/* 445 */           (Object[])new String[] { 
/* 446 */             "ID", "Name", "T.P Number", "Main Address", "2nd Address", "Bank", "City", "Contact Person", "Other", "Person TP", "Email" }));
/*     */ 
/*     */     
/* 449 */     this.jTable1.addMouseListener(new MouseAdapter() {
/*     */           public void mouseClicked(MouseEvent evt) {
/* 451 */             employee.this.jTable1MouseClicked(evt);
/*     */           }
/*     */         });
/* 454 */     this.jScrollPane1.setViewportView(this.jTable1);
/*     */     
/* 456 */     this.jLabel5.setFont(new Font("Tahoma", 1, 14));
/* 457 */     this.jLabel5.setText("Employee Name :");
/*     */     
/* 459 */     this.c_search_tbl.setFont(new Font("Tahoma", 1, 18));
/* 460 */     this.c_search_tbl.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 462 */             employee.this.c_search_tblActionPerformed(evt);
/*     */           }
/*     */         });
/* 465 */     this.c_search_tbl.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 467 */             employee.this.c_search_tblKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 471 */     this.jLabel16.setFont(new Font("Dialog", 1, 18));
/* 472 */     this.jLabel16.setText("City :");
/*     */     
/* 474 */     this.sh_city.setFont(new Font("Dialog", 1, 18));
/* 475 */     this.sh_city.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 477 */             employee.this.sh_cityKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 481 */     this.jLabel17.setFont(new Font("Dialog", 1, 18));
/* 482 */     this.jLabel17.setText("Preson Name :");
/*     */     
/* 484 */     this.sh_tp.setFont(new Font("Dialog", 1, 18));
/* 485 */     this.sh_tp.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 487 */             employee.this.sh_tpKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 491 */     this.jLabel18.setFont(new Font("Dialog", 1, 18));
/* 492 */     this.jLabel18.setText("Contact Person :");
/*     */     
/* 494 */     this.sh_cp.setFont(new Font("Dialog", 1, 18));
/* 495 */     this.sh_cp.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 497 */             employee.this.sh_cpKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 501 */     this.jLabel19.setFont(new Font("Dialog", 1, 18));
/* 502 */     this.jLabel19.setText("TelePhone :");
/*     */     
/* 504 */     this.sh_pn.setFont(new Font("Dialog", 1, 18));
/* 505 */     this.sh_pn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 507 */             employee.this.sh_pnActionPerformed(evt);
/*     */           }
/*     */         });
/* 510 */     this.sh_pn.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 512 */             employee.this.sh_pnKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 516 */     this.jButton7.setText("Edit");
/* 517 */     this.jButton7.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 519 */             employee.this.jButton7ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 523 */     this.jTabbedPane1.addTab("Search Employee", this.jPanel4);
/* 524 */     this.jTabbedPane1.setIconAt(1, new ImageIcon(employee.class.getResource("/img/search x30.png")));
/* 525 */     this.jPanel4.setLayout((LayoutManager)null);
/* 526 */     this.jPanel4.add(this.jPanel7);
/* 527 */     this.jPanel7.setLayout((LayoutManager)null);
/* 528 */     this.jPanel7.add(this.jLabel5);
/* 529 */     this.jPanel7.add(this.c_search_tbl);
/* 530 */     this.jPanel7.add(this.jPanel10);
/* 531 */     this.jPanel10.setLayout((LayoutManager)null);
/* 532 */     this.jPanel10.add(this.sh_city);
/* 533 */     this.jPanel10.add(this.jLabel16);
/* 534 */     this.jPanel10.add(this.sh_tp);
/* 535 */     this.jPanel10.add(this.jLabel19);
/* 536 */     this.jPanel10.add(this.sh_cp);
/* 537 */     this.jPanel10.add(this.jLabel18);
/* 538 */     this.jPanel10.add(this.jLabel17);
/* 539 */     this.jPanel10.add(this.sh_pn);
/* 540 */     this.jPanel10.add(this.jButton7);
/* 541 */     this.jPanel4.add(this.jScrollPane1);
/* 542 */     this.jPanel4.add(this.jPanel5);
/*     */     
/* 544 */     this.jButton5.setText("All Employee  Reports");
/* 545 */     this.jButton5.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 547 */             employee.this.jButton5ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 551 */     this.jLabel4.setFont(new Font("Dialog", 1, 18));
/* 552 */     this.jLabel4.setText("Employee ID :");
/*     */     
/* 554 */     this.jButton6.setText("View Report");
/* 555 */     this.jButton6.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 557 */             employee.this.jButton6ActionPerformed(evt);
/*     */           }
/*     */         });
/* 560 */     setLayout(new BorderLayout(0, 0));
/* 561 */     this.jPanel1.setLayout((LayoutManager)null);
/*     */     
/* 563 */     this.jTabbedPane1.addTab("Reports", this.jPanel11);
/* 564 */     this.jTabbedPane1.setIconAt(2, new ImageIcon(employee.class.getResource("/img/reports.png")));
/* 565 */     this.jPanel11.setLayout((LayoutManager)null);
/* 566 */     this.jPanel11.add(this.jButton6);
/* 567 */     this.jPanel11.add(this.jLabel4);
/* 568 */     this.jPanel11.add(this.jButton5);
/* 569 */     this.jPanel11.add(this.cid);
/* 570 */     this.jPanel1.add(this.jTabbedPane1);
/* 571 */     add(this.jPanel1);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void c_search_tblKeyReleased(KeyEvent evt) {
/* 577 */     String name = this.c_search_tbl.getText();
/*     */     
/*     */     try {
/* 580 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/* 581 */       dt.setRowCount(0);
/* 582 */       Statement s = db.mycon().createStatement();
/*     */       
/* 584 */       ResultSet rs = s.executeQuery("SELECT * FROM employee WHERE employee_name LIKE '%" + name + "%' ");
/*     */       
/* 586 */       while (rs.next()) {
/* 587 */         Vector<String> v = new Vector();
/*     */         
/* 589 */         v.add(rs.getString(1));
/* 590 */         v.add(rs.getString(2));
/* 591 */         v.add(rs.getString(3));
/* 592 */         v.add(rs.getString(4));
/* 593 */         v.add(rs.getString(5));
/* 594 */         v.add(rs.getString(6));
/* 595 */         v.add(rs.getString(7));
/* 596 */         v.add(rs.getString(8));
/* 597 */         v.add(rs.getString(9));
/* 598 */         v.add(rs.getString(10));
/* 599 */         v.add(rs.getString(11));
/*     */ 
/*     */         
/* 602 */         dt.addRow(v);
/*     */       }
/*     */     
/*     */     }
/* 606 */     catch (Exception e) {
/* 607 */       tb_load();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jTable1MouseClicked(MouseEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void c_search_tblActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void sh_cityKeyReleased(KeyEvent evt) {
/* 625 */     search();
/*     */   }
/*     */   
/*     */   private void sh_tpKeyReleased(KeyEvent evt) {
/* 629 */     search();
/*     */   }
/*     */   
/*     */   private void sh_cpKeyReleased(KeyEvent evt) {
/* 633 */     search();
/*     */   }
/*     */   
/*     */   private void sh_pnKeyReleased(KeyEvent evt) {
/* 637 */     search();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 644 */     ReportView r = new ReportView("src/trinecodecmain/reports/aLLCus.jasper");
/* 645 */     r.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 653 */     HashMap<Object, Object> para = new HashMap<>();
/* 654 */     para.put("Para_cid", this.cid.getText());
/*     */     
/* 656 */     ReportView r = new ReportView("src/trinecodecmain/reports/CIDCustomers.jasper", para);
/* 657 */     r.setVisible(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void sameActionPerformed(ActionEvent evt) {
/* 667 */     if (this.same.isSelected()) {
/* 668 */       this.c_shipadd.setText(this.c_billadd.getText());
/*     */     } else {
/* 670 */       this.c_shipadd.setText("");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton4ActionPerformed(ActionEvent evt) throws MalformedURLException, AWTException {
/* 677 */     String name = this.c_name.getText();
/* 678 */     String tp = this.c_tp.getText();
/* 679 */     String main_add = this.c_billadd.getText();
/* 680 */     String temp_add = this.c_shipadd.getText();
/* 681 */     String bank = this.c_bank.getText();
/* 682 */     String city = this.c_city.getText();
/* 683 */     String Contact_Person_Fname = this.cp_name.getText();
/* 684 */     String Contact_Person_Sname = this.c_person.getText();
/* 685 */     String person_tp = this.cp_tp.getText();
/* 686 */     String email = this.cp_email.getText();
/*     */ 
/*     */     
/*     */     try {
/* 690 */       Statement s = db.mycon().createStatement();
/* 691 */       s.executeUpdate(" INSERT INTO employee (Employee_Name,Tp_Number,main_add,temp_add,bank,city,Contact_Person_Fname,Contact_Person_Sname,Person_Tp,Email) VALUES ('" + 
/* 692 */           name + "','" + tp + "','" + main_add + "','" + temp_add + "','" + bank + "','" + city + "','" + Contact_Person_Fname + "','" + Contact_Person_Sname + "','" + person_tp + "','" + email + "')");
/*     */       
/* 694 */       Notification.sendNotification("TrineTechs : Moyale Mini Supermarket", "Data for: " + name + " added successfully", TrayIcon.MessageType.INFO);
/* 695 */     } catch (SQLException e) {
/*     */       
/* 697 */       Notification.sendNotification("TrineTechs: Moyale Supermarket", "Error saving to database\nError :  " + e, TrayIcon.MessageType.ERROR);
/* 698 */     } catch (MalformedURLException e) {
/*     */       
/* 700 */       e.printStackTrace();
/* 701 */     } catch (AWTException e) {
/*     */       
/* 703 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 706 */     tb_load();
/* 707 */     clearText();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 713 */     String search = this.c_search.getText();
/*     */     
/*     */     try {
/* 716 */       Statement s = db.mycon().createStatement();
/*     */       
/* 718 */       ResultSet rs = s.executeQuery(" SELECT * FROM employee WHERE eid = '" + search + "'");
/*     */       
/* 720 */       if (rs.next())
/*     */       {
/* 722 */         this.c_name.setText(rs.getString("employee_name"));
/* 723 */         this.c_tp.setText(rs.getString("tp_number"));
/* 724 */         this.c_billadd.setText(rs.getString("main_address"));
/* 725 */         this.c_shipadd.setText(rs.getString("temp_address"));
/* 726 */         this.c_bank.setText(rs.getString("bank"));
/* 727 */         this.c_city.setText(rs.getString("city"));
/*     */         
/* 729 */         this.cp_name.setText(rs.getString("person_name"));
/* 730 */         this.c_person.setText(rs.getString("contact_person"));
/* 731 */         this.cp_tp.setText(rs.getString("person_tp"));
/* 732 */         this.cp_email.setText(rs.getString("email"));
/*     */       }
/*     */     
/* 735 */     } catch (SQLException e) {
/* 736 */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 744 */     String id = this.c_search.getText();
/*     */     
/* 746 */     String name = this.c_name.getText();
/* 747 */     String tp = this.c_tp.getText();
/*     */     
/* 749 */     String bill_add = this.c_billadd.getText();
/* 750 */     String shipp_add = this.c_shipadd.getText();
/* 751 */     String bank = this.c_bank.getText();
/* 752 */     String city = this.c_city.getText();
/* 753 */     String person_name = this.cp_name.getText();
/* 754 */     String contact_person = this.c_person.getText();
/* 755 */     String person_tp = this.cp_tp.getText();
/* 756 */     String email = this.cp_email.getText();
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 761 */       Statement s = db.mycon().createStatement();
/* 762 */       s.executeUpdate(" UPDATE employee SET employee_name ='" + name + "'" + 
/* 763 */           " ,Tp_Number ='" + tp + "'" + 
/* 764 */           ",main_address ='" + bill_add + "'" + 
/* 765 */           ",temp_address ='" + shipp_add + "' " + 
/* 766 */           ",bank ='" + bank + "' " + 
/* 767 */           ",city ='" + city + "' " + 
/* 768 */           ",person_name ='" + person_name + "' " + 
/* 769 */           ",contact_person ='" + contact_person + "' " + 
/* 770 */           ",person_tp ='" + person_tp + "' " + 
/* 771 */           ",email ='" + email + "' " + 
/* 772 */           " WHERE eid = '" + id + "' ");
/*     */       
/* 774 */       Notification.sendNotification("TrineTechs : Moyale Mini Supermarket", "Data for: " + name + " updated successfully", TrayIcon.MessageType.INFO);
/* 775 */     } catch (HeadlessException|SQLException e) {
/* 776 */       System.out.println(e);
/* 777 */     } catch (MalformedURLException e) {
/*     */       
/* 779 */       e.printStackTrace();
/* 780 */     } catch (AWTException e) {
/*     */       
/* 782 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 785 */     tb_load();
/* 786 */     clearText();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 793 */     String id = this.c_search.getText();
/*     */     
/*     */     try {
/* 796 */       Statement s = db.mycon().createStatement();
/* 797 */       s.executeUpdate("DELETE FROM employee WHERE eid = '" + id + "'");
/*     */       
/* 799 */       Notification.sendNotification("TrineTechs : Moyale Mini Supermarket", "Data for id: " + id + " deleted successfully", TrayIcon.MessageType.INFO);
/* 800 */     } catch (SQLException e) {
/* 801 */       System.out.println(e);
/* 802 */     } catch (MalformedURLException e) {
/*     */       
/* 804 */       e.printStackTrace();
/* 805 */     } catch (AWTException e) {
/*     */       
/* 807 */       e.printStackTrace();
/*     */     } 
/*     */     
/* 810 */     tb_load();
/* 811 */     clearText();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void c_bankActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void sh_pnActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void c_searchKeyReleased(KeyEvent evt) {}
/*     */ 
/*     */   
/*     */   private void jButton7ActionPerformed(ActionEvent evt) {
/* 828 */     int r = this.jTable1.getSelectedRow();
/*     */     
/* 830 */     String id = this.jTable1.getValueAt(r, 0).toString();
/* 831 */     String name = this.jTable1.getValueAt(r, 1).toString();
/* 832 */     String tp = this.jTable1.getValueAt(r, 2).toString();
/* 833 */     String m_add = this.jTable1.getValueAt(r, 3).toString();
/* 834 */     String temp_add = this.jTable1.getValueAt(r, 4).toString();
/* 835 */     String bank = this.jTable1.getValueAt(r, 5).toString();
/* 836 */     String city = this.jTable1.getValueAt(r, 6).toString();
/* 837 */     String per_name = this.jTable1.getValueAt(r, 7).toString();
/* 838 */     String con_pre = this.jTable1.getValueAt(r, 8).toString();
/* 839 */     String p_tp = this.jTable1.getValueAt(r, 9).toString();
/* 840 */     String p_em = this.jTable1.getValueAt(r, 10).toString();
/*     */ 
/*     */ 
/*     */     
/* 844 */     this.c_search.setText(id);
/* 845 */     this.c_name.setText(name);
/* 846 */     this.c_tp.setText(tp);
/* 847 */     this.c_billadd.setText(m_add);
/* 848 */     this.c_shipadd.setText(temp_add);
/* 849 */     this.c_bank.setText(bank);
/* 850 */     this.c_city.setText(city);
/* 851 */     this.cp_name.setText(per_name);
/* 852 */     this.c_person.setText(con_pre);
/* 853 */     this.cp_tp.setText(p_tp);
/* 854 */     this.cp_email.setText(p_em);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/employee.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */