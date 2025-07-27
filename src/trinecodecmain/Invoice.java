/*     */ package trinecodecmain;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.io.FileInputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.sql.Connection;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.util.HashMap;
/*     */ import java.util.Vector;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JEditorPane;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.JTable;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.CompoundBorder;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ import net.sf.jasperreports.engine.JRException;
/*     */ import net.sf.jasperreports.engine.JasperCompileManager;
/*     */ import net.sf.jasperreports.engine.JasperExportManager;
/*     */ import net.sf.jasperreports.engine.JasperFillManager;
/*     */ import net.sf.jasperreports.engine.JasperPrint;
/*     */ import net.sf.jasperreports.engine.JasperReport;
/*     */ import net.sf.jasperreports.engine.design.JasperDesign;
/*     */ import net.sf.jasperreports.engine.xml.JRXmlLoader;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ 
/*     */ public class Invoice extends JPanel {
/*     */   JEditorPane editPane;
/*     */   private JComboBox<String> com_status;
/*     */   private JTextField cus_name;
/*     */   private JTextField inid;
/*     */   private JButton jButton1;
/*     */   private JLabel jLabel5;
/*     */   private JLabel jLabel6;
/*     */   
/*     */   public Invoice() {
/*  56 */     initComponents();
/*  57 */     dataLoad();
/*     */   }
/*     */   private JLabel jLabel7; private JPanel jPanel1; private JPanel jPanel2; private JPanel jPanel3; private JScrollPane jScrollPane1; private JTable jTable1; private JPanel panel;
/*     */   public void miniReport(int a, String name) throws JRException, IOException {
/*  61 */     InputStream input = new FileInputStream(new File("C:\\Users\\theTrine\\JaspersoftWorkspace\\TrinePos Reports\\Reports\\print.jrxml"));
/*     */ 
/*     */ 
/*     */     
/*  65 */     JasperDesign desinger = JRXmlLoader.load(input);
/*  66 */     JasperReport jasperReport = JasperCompileManager.compileReport(desinger);
/*     */     
/*  68 */     HashMap<Object, Object> para = new HashMap<>();
/*  69 */     para.put("inv_id", Integer.valueOf(a));
/*  70 */     para.put("shopName", "TRINE WHOLESALE SUPERMARKET");
/*  71 */     para.put("location", "KISUMU TOWN");
/*  72 */     para.put("postalAddr", "P.O BOX 14,41412");
/*  73 */     para.put("phoneNumber", "0795514454");
/*  74 */     para.put("phoneNumber2", "0111521140");
/*  75 */     para.put("pageHeight", "300");
/*     */     
/*  77 */     db d = new db();
/*  78 */     Connection con = db.mycon();
/*  79 */     JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, para, con);
/*  80 */     String location = String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/temps/" + a + name + ".htm";
/*  81 */     JasperExportManager.exportReportToHtmlFile(jasperPrint, location);
/*     */     
/*  83 */     File file = new File(location);
/*  84 */     this.editPane.setText("");
/*  85 */     this.editPane.setPage(file.toURI().toURL());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void dataLoad() {
/*     */     try {
/*  93 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*  94 */       dt.setRowCount(0);
/*     */       
/*  96 */       Statement s = db.mycon().createStatement();
/*  97 */       ResultSet rs = s.executeQuery("SELECT * FROM sales");
/*     */       
/*  99 */       while (rs.next())
/*     */       {
/* 101 */         Vector<String> v = new Vector();
/* 102 */         v.add(rs.getString(1));
/* 103 */         v.add(rs.getString(2));
/* 104 */         v.add(rs.getString(4));
/* 105 */         v.add(rs.getString(3));
/* 106 */         v.add(rs.getString(5));
/* 107 */         v.add(rs.getString(6));
/* 108 */         v.add(rs.getString(7));
/* 109 */         v.add(rs.getString(8));
/* 110 */         dt.addRow(v);
/*     */       }
/*     */     
/*     */     }
/* 114 */     catch (SQLException e) {
/* 115 */       JOptionPane.showMessageDialog(null, "Error : " + e, "Sales Shema Error", 0);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public void search_product() {
/* 121 */     String inv_id = this.inid.getText();
/* 122 */     String c_Name = this.cus_name.getText();
/* 123 */     String sta = this.com_status.getSelectedItem().toString();
/*     */     
/*     */     try {
/*     */       ResultSet rs;
/* 127 */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/* 128 */       dt.setRowCount(0);
/*     */       
/* 130 */       Statement s = db.mycon().createStatement();
/*     */       
/* 132 */       if (sta.equals("All")) {
/* 133 */         rs = s.executeQuery("SELECT * FROM sales WHERE INID  LIKE '%" + inv_id + "%' AND Customer_Name LIKE '%" + c_Name + "%'");
/*     */       } else {
/* 135 */         rs = s.executeQuery("SELECT * FROM sales WHERE INID  LIKE '%" + inv_id + "%' AND Customer_Name LIKE '%" + c_Name + "%' AND Status='" + sta + "'");
/*     */       } 
/* 137 */       while (rs.next())
/*     */       {
/* 139 */         Vector<String> v = new Vector();
/* 140 */         v.add(rs.getString(1));
/* 141 */         v.add(rs.getString(2));
/* 142 */         v.add(rs.getString(4));
/* 143 */         v.add(rs.getString(3));
/* 144 */         v.add(rs.getString(5));
/* 145 */         v.add(rs.getString(6));
/* 146 */         v.add(rs.getString(7));
/* 147 */         v.add(rs.getString(8));
/*     */         
/* 149 */         dt.addRow(v);
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 154 */     catch (SQLException e) {
/* 155 */       JOptionPane.showMessageDialog(null, "Error : " + e, "Invoice load Error", 0);
/* 156 */       dataLoad();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/* 166 */     setSize(1090, 590);
/* 167 */     this.jPanel1 = new JPanel();
/* 168 */     this.jPanel1.setBounds(0, 0, 1080, 590);
/* 169 */     this.jPanel2 = new JPanel();
/* 170 */     this.jPanel2.setBounds(0, 122, 662, 468);
/* 171 */     this.jScrollPane1 = new JScrollPane();
/* 172 */     this.jScrollPane1.setBorder(new EtchedBorder(1, null, null));
/* 173 */     this.jScrollPane1.setBounds(2, 2, 661, 455);
/* 174 */     this.jTable1 = new JTable();
/* 175 */     this.jPanel3 = new JPanel();
/* 176 */     this.jPanel3.setBounds(0, 0, 662, 116);
/* 177 */     this.jLabel5 = new JLabel();
/* 178 */     this.jLabel5.setBounds(10, 29, 121, 17);
/* 179 */     this.inid = new JTextField();
/* 180 */     this.inid.setBounds(141, 23, 227, 30);
/* 181 */     this.jLabel6 = new JLabel();
/* 182 */     this.jLabel6.setBounds(10, 74, 121, 17);
/* 183 */     this.cus_name = new JTextField();
/* 184 */     this.cus_name.setBounds(141, 64, 227, 30);
/* 185 */     this.jLabel7 = new JLabel();
/* 186 */     this.jLabel7.setBounds(417, 29, 54, 17);
/* 187 */     this.com_status = new JComboBox<>();
/* 188 */     this.com_status.setBounds(493, 26, 105, 23);
/* 189 */     this.jButton1 = new JButton();
/* 190 */     this.jButton1.setBounds(402, 64, 121, 41);
/*     */     
/* 192 */     this.jPanel2.setBorder(new CompoundBorder());
/*     */     
/* 194 */     this.jTable1.setModel(new DefaultTableModel(
/* 195 */           new Object[0][], 
/*     */           
/* 197 */           (Object[])new String[] {
/* 198 */             "SaleID", "INID", "Customer_Name", "Date", "Total Qty", "Total Bill", "Status", "Balance"
/*     */           }));
/*     */     
/* 201 */     this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(45);
/* 202 */     this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(45);
/* 203 */     this.jTable1.getColumnModel().getColumn(2).setPreferredWidth(120);
/* 204 */     this.jScrollPane1.setViewportView(this.jTable1);
/*     */     
/* 206 */     this.jPanel3.setBorder(BorderFactory.createEtchedBorder());
/*     */     
/* 208 */     this.jLabel5.setFont(new Font("Tahoma", 1, 14));
/* 209 */     this.jLabel5.setText("INVOICE NO : ");
/*     */     
/* 211 */     this.inid.setFont(new Font("Tahoma", 1, 14));
/* 212 */     this.inid.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 214 */             Invoice.this.inidKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 218 */     this.jLabel6.setFont(new Font("Tahoma", 1, 14));
/* 219 */     this.jLabel6.setText("Customer Name :");
/*     */     
/* 221 */     this.cus_name.setFont(new Font("Tahoma", 1, 14));
/* 222 */     this.cus_name.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/* 224 */             Invoice.this.cus_nameKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     
/* 228 */     this.jLabel7.setFont(new Font("Tahoma", 1, 14));
/* 229 */     this.jLabel7.setText("Status :");
/*     */     
/* 231 */     this.com_status.setFont(new Font("Tahoma", 1, 14));
/* 232 */     this.com_status.setModel(new DefaultComboBoxModel<>(new String[] { "All", "UnPaid", "Partial", "Paid" }));
/* 233 */     this.com_status.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 235 */             Invoice.this.com_statusActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     
/* 239 */     this.jButton1.setIcon(new ImageIcon(Invoice.class.getResource("/icons/File Name Lost (321).png")));
/* 240 */     this.jButton1.setText("Refresh");
/* 241 */     this.jButton1.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 243 */             Invoice.this.jButton1ActionPerformed(evt);
/*     */           }
/*     */         });
/* 246 */     setLayout((LayoutManager)null);
/* 247 */     add(this.jPanel1);
/* 248 */     this.jPanel1.setLayout((LayoutManager)null);
/* 249 */     this.jPanel1.add(this.jPanel2);
/* 250 */     this.jPanel2.setLayout((LayoutManager)null);
/* 251 */     this.jPanel2.add(this.jScrollPane1);
/* 252 */     this.jPanel1.add(this.jPanel3);
/* 253 */     this.jPanel3.setLayout((LayoutManager)null);
/* 254 */     this.jPanel3.add(this.jLabel5);
/* 255 */     this.jPanel3.add(this.inid);
/* 256 */     this.jPanel3.add(this.jLabel6);
/* 257 */     this.jPanel3.add(this.cus_name);
/* 258 */     this.jPanel3.add(this.jLabel7);
/* 259 */     this.jPanel3.add(this.com_status);
/* 260 */     this.jPanel3.add(this.jButton1);
/*     */     
/* 262 */     JButton btnPreview = new JButton();
/* 263 */     btnPreview.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {
/*     */             
/* 265 */             try { FileUtils.cleanDirectory(new File(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/temps")); } catch (IOException iOException) {}
/* 266 */             DefaultTableModel dt = (DefaultTableModel)Invoice.this.jTable1.getModel();
/* 267 */             int rw = Invoice.this.jTable1.getSelectedRow();
/* 268 */             int inid = Integer.parseInt(dt.getValueAt(rw, 1).toString()); 
/* 269 */             try { Invoice.this.miniReport(inid, dt.getValueAt(rw, 2).toString()); } catch (JRException|IOException e1) { e1.printStackTrace(); }
/*     */           
/*     */           } }
/*     */       );
/*     */     try {
/* 274 */       BufferedImage image = ImageIO.read(Invoice.class.getResource("/img/see.jpg"));
/* 275 */       Image scaledImage = image.getScaledInstance(35, 20, 4);
/* 276 */       btnPreview.setIcon(new ImageIcon(scaledImage));
/* 277 */     } catch (IOException e1) {
/*     */       
/* 279 */       e1.printStackTrace();
/*     */     } 
/* 281 */     btnPreview.setText("View");
/* 282 */     btnPreview.setBounds(548, 66, 104, 37);
/* 283 */     this.jPanel3.add(btnPreview);
/*     */     
/* 285 */     this.panel = new JPanel();
/* 286 */     this.panel.setBorder(new MatteBorder(1, 1, 1, 1, new Color(0, 0, 0)));
/* 287 */     this.panel.setBounds(669, 0, 401, 579);
/* 288 */     this.jPanel1.add(this.panel);
/* 289 */     this.panel.setLayout((LayoutManager)null);
/*     */     
/* 291 */     JScrollPane scrollPane = new JScrollPane();
/* 292 */     scrollPane.setBounds(0, 0, 401, 579);
/* 293 */     this.panel.add(scrollPane);
/*     */     
/* 295 */     this.editPane = new JEditorPane();
/* 296 */     this.editPane.setEditable(false);
/* 297 */     this.editPane.setFont(new Font("Tahoma", 0, 8));
/* 298 */     scrollPane.setViewportView(this.editPane);
/*     */   }
/*     */ 
/*     */   
/*     */   private void inidKeyReleased(KeyEvent evt) {
/* 303 */     search_product();
/*     */   }
/*     */ 
/*     */   
/*     */   private void cus_nameKeyReleased(KeyEvent evt) {
/* 308 */     search_product();
/*     */   }
/*     */   
/*     */   private void com_statusActionPerformed(ActionEvent evt) {
/* 312 */     search_product();
/*     */   }
/*     */ 
/*     */   
/*     */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 317 */     dataLoad();
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/Invoice.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */