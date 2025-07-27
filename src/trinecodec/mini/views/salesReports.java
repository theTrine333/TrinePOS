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
/*     */ public class salesReports
/*     */   extends JPanel
/*     */ {
/*     */   private JTextField c_search_tbl;
/*     */   private static JTable jTable1;
/*     */   
/*     */   public salesReports() {
/*  31 */     setLayout((LayoutManager)null);
/*     */     
/*  33 */     JScrollPane jScrollPane1 = new JScrollPane();
/*  34 */     jScrollPane1.setBounds(0, 45, 555, 539);
/*  35 */     add(jScrollPane1);
/*     */     
/*  37 */     jTable1 = new JTable();
/*  38 */     jTable1.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/*  41 */             int r = salesReports.jTable1.getSelectedRow();
/*     */             
/*  43 */             String id = salesReports.jTable1.getValueAt(r, 0).toString();
/*  44 */             String name = salesReports.jTable1.getValueAt(r, 1).toString();
/*  45 */             String bcode = salesReports.jTable1.getValueAt(r, 2).toString();
/*  46 */             String price = salesReports.jTable1.getValueAt(r, 3).toString();
/*  47 */             String qty = salesReports.jTable1.getValueAt(r, 4).toString();
/*  48 */             String sid = salesReports.jTable1.getValueAt(r, 5).toString();
/*     */             
/*  50 */             product.p_src.setText(id);
/*  51 */             product.p_name.setText(name);
/*  52 */             product.p_bcode.setText(bcode);
/*  53 */             product.p_price.setText(price);
/*  54 */             product.p_qty.setText(qty);
/*  55 */             product.p_sid.setText(sid);
/*     */           }
/*     */         });
/*  58 */     jTable1.setModel(new DefaultTableModel(
/*  59 */           new Object[][] { 
/*  60 */             new Object[6], 
/*  61 */             new Object[6], 
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
/*  94 */             new Object[6]
/*     */           },
/*  96 */           (Object[])new String[] {
/*  97 */             "ID", "Product Name", "BarCode", "Date", "Quantity", "TOTAL PRICE"
/*     */           }));
/*     */     
/* 100 */     jTable1.getColumnModel().getColumn(0).setPreferredWidth(35);
/* 101 */     jTable1.getColumnModel().getColumn(1).setPreferredWidth(120);
/* 102 */     jTable1.getColumnModel().getColumn(2).setPreferredWidth(85);
/* 103 */     jTable1.getColumnModel().getColumn(3).setPreferredWidth(93);
/* 104 */     jTable1.getColumnModel().getColumn(4).setPreferredWidth(63);
/* 105 */     jTable1.getColumnModel().getColumn(5).setPreferredWidth(78);
/* 106 */     jScrollPane1.setViewportView(jTable1);
/*     */     
/* 108 */     this.c_search_tbl = new JTextField();
/* 109 */     this.c_search_tbl.addKeyListener(new KeyAdapter()
/*     */         {
/*     */           public void keyReleased(KeyEvent e)
/*     */           {
/* 113 */             String name = salesReports.this.c_search_tbl.getText();
/*     */             
/*     */             try {
/* 116 */               DefaultTableModel dt = (DefaultTableModel)salesReports.jTable1.getModel();
/* 117 */               dt.setRowCount(0);
/* 118 */               Statement s = db.mycon().createStatement();
/*     */               
/* 120 */               ResultSet rs = s.executeQuery("SELECT * FROM product WHERE Product_Name LIKE '%" + name + "%' ");
/*     */               
/* 122 */               while (rs.next()) {
/* 123 */                 Vector<String> v = new Vector();
/*     */                 
/* 125 */                 v.add(rs.getString(2));
/* 126 */                 v.add(rs.getString(3));
/* 127 */                 v.add(rs.getString(4));
/* 128 */                 v.add(rs.getString(5));
/* 129 */                 v.add(rs.getString(7));
/* 130 */                 v.add(rs.getString(1));
/*     */                 
/* 132 */                 dt.addRow(v);
/*     */ 
/*     */               
/*     */               }
/*     */ 
/*     */             
/*     */             }
/* 139 */             catch (Exception e1) {
/* 140 */               salesReports.tb_load();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 145 */     this.c_search_tbl.setFont(new Font("Tahoma", 1, 14));
/* 146 */     this.c_search_tbl.setBounds(76, 11, 222, 23);
/* 147 */     add(this.c_search_tbl);
/*     */     
/* 149 */     JLabel jLabel8 = new JLabel();
/* 150 */     jLabel8.setText("Search :");
/* 151 */     jLabel8.setFont(new Font("Tahoma", 1, 14));
/* 152 */     jLabel8.setBounds(10, 14, 56, 17);
/* 153 */     add(jLabel8);
/*     */     
/* 155 */     tb_load();
/*     */   }
/*     */   
/*     */   public static void tb_load() {
/*     */     try {
/* 160 */       DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
/* 161 */       dt.setRowCount(0);
/*     */       
/* 163 */       Statement s = db.mycon().createStatement();
/* 164 */       ResultSet rs = s.executeQuery(" SELECT * FROM product");
/*     */       
/* 166 */       while (rs.next())
/*     */       {
/* 168 */         Vector<String> v = new Vector();
/*     */         
/* 170 */         v.add(rs.getString(2));
/* 171 */         v.add(rs.getString(3));
/* 172 */         v.add(rs.getString(4));
/* 173 */         v.add(rs.getString(5));
/* 174 */         v.add(rs.getString(7));
/* 175 */         v.add(rs.getString(1));
/*     */         
/* 177 */         dt.addRow(v);
/*     */       }
/*     */     
/* 180 */     } catch (SQLException e) {
/* 181 */       System.out.println(e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/salesReports.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */