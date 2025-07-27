/*     */ package trinecodec.mini.views;
/*     */ 
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.Vector;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import trinecodecmain.db;
/*     */ import trinecodecmain.product;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class productReports
/*     */   extends JPanel
/*     */ {
/*     */   private JTextField c_search_tbl;
/*     */   private static JTable jTable1;
/*     */   
/*     */   public productReports() {
/*  31 */     setLayout((LayoutManager)null);
/*     */     
/*  33 */     JScrollPane jScrollPane1 = new JScrollPane();
/*  34 */     jScrollPane1.setBounds(0, 45, 555, 520);
/*  35 */     add(jScrollPane1);
/*     */     
/*  37 */     jTable1 = new JTable();
/*  38 */     jTable1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  41 */             int r = productReports.jTable1.getSelectedRow();
/*     */             
/*  43 */             String id = productReports.jTable1.getValueAt(r, 0).toString();
/*  44 */             String name = productReports.jTable1.getValueAt(r, 1).toString();
/*  45 */             String bcode = productReports.jTable1.getValueAt(r, 2).toString();
/*  46 */             String price = productReports.jTable1.getValueAt(r, 3).toString();
/*  47 */             String qty = productReports.jTable1.getValueAt(r, 4).toString();
/*  48 */             String sid = productReports.jTable1.getValueAt(r, 5).toString();
/*     */             
/*  50 */             product.p_src.setText(id);
/*  51 */             product.p_name.setText(name);
/*  52 */             product.p_bcode.setText(bcode);
/*  53 */             product.p_price.setText(price);
/*  54 */             product.p_qty.setText(qty);
/*  55 */             product.p_sid.setText(sid);
/*     */             
/*  57 */             product.jButton3.doClick();
/*     */           }
/*     */         });
/*  60 */     jTable1.setModel(new DefaultTableModel(
/*  61 */           new Object[][] { 
/*  62 */             new Object[6], 
/*  63 */             new Object[6], 
/*  64 */             new Object[6], 
/*  65 */             new Object[6], 
/*  66 */             new Object[6], 
/*  67 */             new Object[6], 
/*  68 */             new Object[6], 
/*  69 */             new Object[6], 
/*  70 */             new Object[6], 
/*  71 */             new Object[6], 
/*  72 */             new Object[6], 
/*  73 */             new Object[6], 
/*  74 */             new Object[6], 
/*  75 */             new Object[6], 
/*  76 */             new Object[6], 
/*  77 */             new Object[6], 
/*  78 */             new Object[6], 
/*  79 */             new Object[6], 
/*  80 */             new Object[6], 
/*  81 */             new Object[6], 
/*  82 */             new Object[6], 
/*  83 */             new Object[6], 
/*  84 */             new Object[6], 
/*  85 */             new Object[6], 
/*  86 */             new Object[6], 
/*  87 */             new Object[6], 
/*  88 */             new Object[6], 
/*  89 */             new Object[6], 
/*  90 */             new Object[6], 
/*  91 */             new Object[6], 
/*  92 */             new Object[6], 
/*  93 */             new Object[6], 
/*  94 */             new Object[6], 
/*  95 */             new Object[6], 
/*  96 */             new Object[6]
/*     */           },
/*  98 */           (Object[])new String[] {
/*  99 */             "ID", "Product Name", "BarCode", "Price", "QTY", "SID"
/*     */           }));
/*     */     
/* 102 */     jTable1.getColumnModel().getColumn(0).setPreferredWidth(35);
/* 103 */     jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
/* 104 */     jTable1.getColumnModel().getColumn(2).setPreferredWidth(85);
/* 105 */     jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
/* 106 */     jTable1.getColumnModel().getColumn(4).setPreferredWidth(35);
/* 107 */     jTable1.getColumnModel().getColumn(5).setPreferredWidth(78);
/* 108 */     jScrollPane1.setViewportView(jTable1);
/*     */     
/* 110 */     this.c_search_tbl = new JTextField();
/* 111 */     this.c_search_tbl.addKeyListener(new KeyAdapter()
/*     */         {
/*     */           public void keyReleased(KeyEvent e)
/*     */           {
/* 115 */             String name = productReports.this.c_search_tbl.getText();
/*     */             
/*     */             try {
/* 118 */               DefaultTableModel dt = (DefaultTableModel)productReports.jTable1.getModel();
/* 119 */               dt.setRowCount(0);
/* 120 */               Statement s = db.mycon().createStatement();
/*     */               
/* 122 */               ResultSet rs = s.executeQuery("SELECT * FROM product WHERE Product_Name LIKE '%" + name + "%' ");
/*     */               
/* 124 */               while (rs.next()) {
/* 125 */                 Vector<String> v = new Vector();
/*     */                 
/* 127 */                 v.add(rs.getString(2));
/* 128 */                 v.add(rs.getString(3));
/* 129 */                 v.add(rs.getString(4));
/* 130 */                 v.add(rs.getString(5));
/* 131 */                 v.add(rs.getString(7));
/* 132 */                 v.add(rs.getString(1));
/*     */                 
/* 134 */                 dt.addRow(v);
/*     */ 
/*     */               
/*     */               }
/*     */ 
/*     */             
/*     */             }
/* 141 */             catch (Exception e1) {
/* 142 */               productReports.tb_load();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 147 */     this.c_search_tbl.setFont(new Font("Tahoma", 1, 14));
/* 148 */     this.c_search_tbl.setBounds(76, 11, 222, 23);
/* 149 */     add(this.c_search_tbl);
/*     */     
/* 151 */     JLabel jLabel8 = new JLabel();
/* 152 */     jLabel8.setText("Search :");
/* 153 */     jLabel8.setFont(new Font("Tahoma", 1, 14));
/* 154 */     jLabel8.setBounds(10, 14, 56, 17);
/* 155 */     add(jLabel8);
/*     */     
/* 157 */     tb_load();
/*     */   }
/*     */   
/*     */   public static void tb_load() {
/*     */     try {
/* 162 */       DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
/* 163 */       dt.setRowCount(0);
/*     */       
/* 165 */       Statement s = db.mycon().createStatement();
/* 166 */       ResultSet rs = s.executeQuery(" SELECT * FROM product");
/*     */       
/* 168 */       while (rs.next())
/*     */       {
/* 170 */         Vector<String> v = new Vector();
/*     */         
/* 172 */         v.add(rs.getString(2));
/* 173 */         v.add(rs.getString(3));
/* 174 */         v.add(rs.getString(4));
/* 175 */         v.add(rs.getString(5));
/* 176 */         v.add(rs.getString(7));
/* 177 */         v.add(rs.getString(1));
/*     */         
/* 179 */         dt.addRow(v);
/*     */       }
/*     */     
/* 182 */     } catch (SQLException e) {
/* 183 */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/productReports.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */