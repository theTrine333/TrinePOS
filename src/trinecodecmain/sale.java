/*     */ package trinecodecmain;
/*     */ import java.awt.AWTException;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.Robot;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Vector;
/*     */ import javax.swing.BorderFactory;
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.GroupLayout;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JComboBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.LineBorder;
/*     */ import javax.swing.table.DefaultTableModel;
/*     */ 
/*     */ public class sale extends JPanel {
/*  30 */   public static String barcode_c = "0";
/*  31 */   public static String cus_id = "0";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JButton _payPrint;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   JButton addToCart;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel balance;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel bill_tot;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JComboBox<String> com_cus;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JComboBox<String> com_pro;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   JButton removeBtn;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   JLabel expShow;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   String barcode;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel10;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel11;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel4;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel6;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel7;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel8;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel jLabel9;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JPanel jPanel1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JPanel jPanel2;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JPanel jPanel3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JPanel jPanel4;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JPanel jPanel5;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JPanel jPanel6;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JPanel jPanel7;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JScrollPane jScrollPane1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JTable jTable1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   JLabel inid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JTextField p_qty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JTextField paid_amt;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JButton resetBtn;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel tot_price;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel tot_qty;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel u_price;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JTextField discountPaid;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JTextField stkLevel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JLabel dateShower;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private JTextField bc_code;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public sale() {
/* 850 */     this.inid = new JLabel();
/*     */     initComponents();
/*     */     data_load();
/*     */     productLoad();
/*     */   }
/*     */   
/*     */   public void data_load() {
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       ResultSet rs = s.executeQuery("SELECT * FROM customer");
/*     */       Vector<String> v = new Vector();
/*     */       while (rs.next()) {
/*     */         v.add(rs.getString("customer_name"));
/*     */         DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
/*     */         this.com_cus.setModel(com);
/*     */       } 
/*     */     } catch (SQLException e) {
/*     */       System.out.println(e);
/*     */       JOptionPane.showMessageDialog(null, "Error loading data, Please check your\nDatabase connections and try again", "Dataload Error", 0);
/*     */     } 
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       ResultSet rs = s.executeQuery("SELECT * FROM product WHERE Qty>0");
/*     */       Vector<String> v = new Vector();
/*     */       while (rs.next()) {
/*     */         v.add(rs.getString("Product_Name"));
/*     */         DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
/*     */         this.com_pro.setModel(com);
/*     */       } 
/*     */     } catch (SQLException e) {
/*     */       JOptionPane.showMessageDialog(null, "Error : " + e, "SQL ERROR", 0);
/*     */     } 
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       ResultSet rs = s.executeQuery("SELECT * FROM extra WHERE exid =1");
/*     */       if (rs.next())
/*     */         this.inid.setText(rs.getString("val")); 
/*     */     } catch (Exception exception) {}
/*     */     int i = Integer.valueOf(this.inid.getText()).intValue();
/*     */     i++;
/*     */     this.inid.setText(String.valueOf(i));
/*     */   }
/*     */   
/*     */   public void pro_tot_cal() {
/*     */     Double qt = Double.valueOf(this.p_qty.getText());
/*     */     Double price = Double.valueOf(this.u_price.getText());
/*     */     Double tot = Double.valueOf(qt.doubleValue() * price.doubleValue());
/*     */     this.tot_price.setText(String.valueOf(tot));
/*     */   }
/*     */   
/*     */   public void cart_total() {
/*     */     int numofrow = this.jTable1.getRowCount();
/*     */     double total = 0.0D;
/*     */     for (int i = 0; i < numofrow; i++) {
/*     */       double value = Double.valueOf(this.jTable1.getValueAt(i, 4).toString()).doubleValue();
/*     */       total += value;
/*     */     } 
/*     */     this.bill_tot.setText(Double.toString(total));
/*     */     int numofrows = this.jTable1.getRowCount();
/*     */     double totals = 0.0D;
/*     */     for (int j = 0; j < numofrows; j++) {
/*     */       double values = Double.valueOf(this.jTable1.getValueAt(j, 2).toString()).doubleValue();
/*     */       totals += values;
/*     */     } 
/*     */     this.tot_qty.setText(Double.toString(totals));
/*     */   }
/*     */   
/*     */   public void tot() {
/*     */     double paid = Double.valueOf(this.paid_amt.getText()).doubleValue();
/*     */     double tot = Double.valueOf(this.bill_tot.getText()).doubleValue();
/*     */     double discount = Double.valueOf(this.discountPaid.getText()).doubleValue();
/*     */     double due = paid - tot + discount;
/*     */     this.balance.setText(String.valueOf(due));
/*     */   }
/*     */   
/*     */   private void initComponents() {
/*     */     this.jPanel1 = new JPanel();
/*     */     this.jPanel1.setBorder(new LineBorder(new Color(0, 0, 0)));
/*     */     this.jPanel1.addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent e) {
/*     */             if (e.getKeyCode() == 10)
/*     */               sale.this._payPrint.doClick(); 
/*     */           }
/*     */         });
/*     */     this.jPanel2 = new JPanel();
/*     */     this.jPanel2.setBounds(0, 0, 1000, 49);
/*     */     this.inid.setBounds(129, 12, 158, 17);
/*     */     this.jLabel2 = new JLabel();
/*     */     this.jLabel2.setBounds(11, 12, 100, 17);
/*     */     this.jPanel3 = new JPanel();
/*     */     this.jPanel3.setBounds(0, 50, 1000, 77);
/*     */     this.jLabel3 = new JLabel();
/*     */     this.jLabel3.setBounds(1, 19, 77, 17);
/*     */     this.jLabel4 = new JLabel();
/*     */     this.jLabel4.setHorizontalAlignment(4);
/*     */     this.jLabel4.setBounds(1, 48, 74, 17);
/*     */     this.jLabel5 = new JLabel();
/*     */     this.jLabel5.setBounds(520, 19, 34, 17);
/*     */     this.jLabel6 = new JLabel();
/*     */     this.jLabel6.setHorizontalAlignment(4);
/*     */     this.jLabel6.setBounds(740, 12, 81, 21);
/*     */     this.u_price = new JLabel();
/*     */     this.u_price.setBounds(824, 12, 166, 21);
/*     */     this.com_cus = new JComboBox<>();
/*     */     this.com_cus.setEditable(true);
/*     */     this.com_cus.setBounds(88, 15, 205, 24);
/*     */     this.com_pro = new JComboBox<>();
/*     */     this.com_pro.setBounds(88, 45, 205, 23);
/*     */     this.p_qty = new JTextField();
/*     */     this.p_qty.setBounds(564, 16, 166, 24);
/*     */     this.jLabel7 = new JLabel();
/*     */     this.jLabel7.setBounds(740, 38, 81, 24);
/*     */     this.tot_price = new JLabel();
/*     */     this.tot_price.setBounds(824, 41, 166, 22);
/*     */     this.jLabel9 = new JLabel();
/*     */     this.jLabel9.setBounds(303, 48, 65, 17);
/*     */     this.jPanel4 = new JPanel();
/*     */     this.jPanel4.setBounds(0, 117, 816, 312);
/*     */     this.jScrollPane1 = new JScrollPane();
/*     */     this.jScrollPane1.setBorder(new BevelBorder(0, null, null, null, null));
/*     */     this.jScrollPane1.setFont(new Font("Comic Sans MS", 0, 17));
/*     */     this.jTable1 = new JTable();
/*     */     this.jTable1.setGridColor(new Color(0, 204, 204));
/*     */     this.jTable1.setFocusable(false);
/*     */     this.jTable1.setBackground(SystemColor.menu);
/*     */     this.jPanel5 = new JPanel();
/*     */     this.jPanel5.setBounds(820, 127, 180, 433);
/*     */     this.addToCart = new JButton();
/*     */     this.addToCart.setFont(new Font("Dialog", 1, 12));
/*     */     this.addToCart.setMnemonic(521);
/*     */     this.addToCart.setBounds(20, 10, 140, 43);
/*     */     this.removeBtn = new JButton();
/*     */     this.removeBtn.setFont(new Font("Dialog", 1, 12));
/*     */     this.removeBtn.setBounds(20, 68, 140, 43);
/*     */     this.resetBtn = new JButton();
/*     */     this.resetBtn.setFont(new Font("Dialog", 1, 12));
/*     */     this.resetBtn.setLocation(20, 122);
/*     */     this.resetBtn.setSize(new Dimension(140, 43));
/*     */     this.jPanel6 = new JPanel();
/*     */     this.jPanel6.setBounds(0, 440, 820, 120);
/*     */     this.jLabel8 = new JLabel();
/*     */     this.jLabel8.setBounds(34, 57, 98, 28);
/*     */     this.paid_amt = new JTextField();
/*     */     this.paid_amt.setText("0");
/*     */     this.paid_amt.setBounds(136, 57, 150, 28);
/*     */     this.jPanel7 = new JPanel();
/*     */     this.jPanel7.setBounds(495, 13, 261, 92);
/*     */     this.bill_tot = new JLabel();
/*     */     this.jLabel10 = new JLabel();
/*     */     this.jLabel11 = new JLabel();
/*     */     this.balance = new JLabel();
/*     */     this.jLabel1 = new JLabel();
/*     */     this.jLabel1.setBounds(311, 13, 110, 28);
/*     */     this.tot_qty = new JLabel();
/*     */     this.tot_qty.setBounds(431, 13, 64, 28);
/*     */     try {
/*     */       BufferedImage image = ImageIO.read(sale.class.getResource("/icons/noun-money-5717246.png"));
/*     */       Image image1 = image.getScaledInstance(50, 30, 4);
/*     */     } catch (IOException e) {
/*     */       e.printStackTrace();
/*     */     } 
/*     */     this.jPanel1.setLayout((LayoutManager)null);
/*     */     this.jPanel2.setBorder(new LineBorder(new Color(0, 0, 0)));
/*     */     this.inid.setFont(new Font("Tahoma", 1, 14));
/*     */     this.inid.setText("01");
/*     */     this.jLabel2.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel2.setText("INVOICE NO :");
/*     */     this.jPanel1.add(this.jPanel2);
/*     */     this.jPanel2.setLayout((LayoutManager)null);
/*     */     this.jPanel2.add(this.jLabel2);
/*     */     this.jPanel2.add(this.inid);
/*     */     this.dateShower = new JLabel("dd-mm-yyyy");
/*     */     SimpleDateFormat timeFormat = new SimpleDateFormat("EEE, dd - MMM - yyyy");
/*     */     String time = timeFormat.format(Calendar.getInstance().getTime());
/*     */     this.dateShower.setText(time);
/*     */     this.dateShower.setHorizontalAlignment(0);
/*     */     this.dateShower.setFont(new Font("Calisto MT", 0, 18));
/*     */     this.dateShower.setBounds(798, 11, 192, 26);
/*     */     this.jPanel2.add(this.dateShower);
/*     */     this.jPanel3.setBorder(new LineBorder(new Color(0, 0, 0)));
/*     */     this.jLabel3.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel3.setText("Customer :");
/*     */     this.jLabel4.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel4.setText("Product :");
/*     */     this.jLabel5.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel5.setText("Qty :");
/*     */     this.jLabel6.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel6.setText("Unit Price :");
/*     */     this.u_price.setFont(new Font("Tahoma", 1, 14));
/*     */     this.u_price.setText("00.00");
/*     */     this.com_cus.setFont(new Font("Tahoma", 1, 14));
/*     */     this.com_cus.setModel(new DefaultComboBoxModel<>(new String[] { "select " }));
/*     */     this.com_cus.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             sale.this.com_cusActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.com_pro.setFont(new Font("Tahoma", 1, 14));
/*     */     this.com_pro.setModel(new DefaultComboBoxModel<>(new String[] { "select " }));
/*     */     this.com_pro.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             sale.this.com_proActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.p_qty.setFont(new Font("Tahoma", 1, 18));
/*     */     this.p_qty.setText("1");
/*     */     this.p_qty.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/*     */             sale.this.p_qtyKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     this.jLabel7.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel7.setText("Total Price :");
/*     */     this.tot_price.setFont(new Font("Tahoma", 1, 14));
/*     */     this.tot_price.setText("00.00");
/*     */     this.jLabel9.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel9.setText("BarCode:");
/*     */     this.jPanel1.add(this.jPanel3);
/*     */     this.jPanel3.setLayout((LayoutManager)null);
/*     */     this.jPanel3.add(this.jLabel3);
/*     */     this.jPanel3.add(this.com_cus);
/*     */     this.jPanel3.add(this.jLabel4);
/*     */     this.jPanel3.add(this.jLabel9);
/*     */     this.jPanel3.add(this.com_pro);
/*     */     this.jPanel3.add(this.jLabel5);
/*     */     this.jPanel3.add(this.p_qty);
/*     */     this.jPanel3.add(this.jLabel6);
/*     */     this.jPanel3.add(this.u_price);
/*     */     this.jPanel3.add(this.jLabel7);
/*     */     this.jPanel3.add(this.tot_price);
/*     */     this.expShow = new JLabel();
/*     */     this.expShow.setFont(new Font("Tahoma", 1, 14));
/*     */     this.expShow.setBorder(new LineBorder(new Color(0, 0, 0)));
/*     */     this.expShow.setBounds(374, 16, 136, 24);
/*     */     this.jPanel3.add(this.expShow);
/*     */     JLabel lblExp = new JLabel();
/*     */     lblExp.setText("Exp Date");
/*     */     lblExp.setFont(new Font("Tahoma", 1, 14));
/*     */     lblExp.setBounds(303, 19, 65, 17);
/*     */     this.jPanel3.add(lblExp);
/*     */     JLabel jLabel5_1 = new JLabel();
/*     */     jLabel5_1.setText("Stk :");
/*     */     jLabel5_1.setFont(new Font("Tahoma", 1, 14));
/*     */     jLabel5_1.setBounds(520, 48, 34, 17);
/*     */     this.jPanel3.add(jLabel5_1);
/*     */     this.stkLevel = new JTextField();
/*     */     this.stkLevel.setEnabled(false);
/*     */     this.stkLevel.setFont(new Font("Tahoma", 1, 18));
/*     */     this.stkLevel.setBounds(564, 44, 166, 24);
/*     */     this.jPanel3.add(this.stkLevel);
/*     */     this.bc_code = new JTextField();
/*     */     this.bc_code.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent e) {
/*     */             sale.this.barcode = sale.this.bc_code.getText();
/*     */             try {
/*     */               Robot robot = new Robot();
/*     */               robot.keyPress(10);
/*     */               robot.keyRelease(10);
/*     */               sale.this.bc_code.setText(sale.this.barcode);
/*     */             } catch (AWTException aWTException) {}
/*     */             try {
/*     */               Statement s = db.mycon().createStatement();
/*     */               ResultSet rs = s.executeQuery("SELECT * FROM product WHERE bar_code LIKE '%" + sale.this.barcode + "%'");
/*     */               Vector<String> v = new Vector();
/*     */               while (rs.next()) {
/*     */                 v.add(rs.getString("Product_Name"));
/*     */                 DefaultComboBoxModel<String> com = new DefaultComboBoxModel<>(v);
/*     */                 sale.this.com_pro.setModel(com);
/*     */               } 
/*     */             } catch (SQLException e1) {
/*     */               JOptionPane.showMessageDialog(null, "Error : " + e1, "Error Reading Barcode", 0);
/*     */             } 
/*     */           }
/*     */         });
/*     */     this.bc_code.setFont(new Font("Tahoma", 1, 18));
/*     */     this.bc_code.setBounds(373, 44, 136, 24);
/*     */     this.jPanel3.add(this.bc_code);
/*     */     this.jPanel4.setBorder(BorderFactory.createEtchedBorder());
/*     */     this.jTable1.setFont(new Font("Bookman Old Style", 0, 18));
/*     */     this.jTable1.setModel(new DefaultTableModel(new Object[0][], (Object[])new String[] { "No.", "Name", "Qty", "Unit Price", "Total Price" }));
/*     */     this.jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
/*     */     this.jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
/*     */     this.jScrollPane1.setViewportView(this.jTable1);
/*     */     GroupLayout jPanel4Layout = new GroupLayout(this.jPanel4);
/*     */     jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane1, -1, 812, 32767));
/*     */     jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(this.jScrollPane1, -2, 298, -2).addContainerGap(-1, 32767)));
/*     */     this.jPanel4.setLayout(jPanel4Layout);
/*     */     this.jPanel1.add(this.jPanel4);
/*     */     this.jPanel5.setBorder(new LineBorder(new Color(0, 0, 0)));
/*     */     this.addToCart.setText("Add to Cart");
/*     */     this.addToCart.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             sale.this.addToCartActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.jPanel5.setLayout((LayoutManager)null);
/*     */     this.jPanel5.add(this.addToCart);
/*     */     this.removeBtn.setText("Remove One");
/*     */     this.removeBtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             sale.this.jButton2ActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.jPanel5.add(this.removeBtn);
/*     */     this.resetBtn.setText("Remove All");
/*     */     this.resetBtn.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             sale.this.resetBtnActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.jPanel5.add(this.resetBtn);
/*     */     this.jPanel1.add(this.jPanel5);
/*     */     this._payPrint = new JButton();
/*     */     this._payPrint.setBounds(20, 342, 137, 53);
/*     */     this.jPanel5.add(this._payPrint);
/*     */     try {
/*     */       BufferedImage image = ImageIO.read(ScreenHome.class.getResource("/icons/noun-money-5717225.png"));
/*     */       Image scaledImage = image.getScaledInstance(40, 40, 4);
/*     */       this._payPrint.setIcon(new ImageIcon(scaledImage));
/*     */     } catch (Exception exception) {}
/*     */     this._payPrint.setFont(new Font("Dialog", 1, 11));
/*     */     this._payPrint.setText("Pay \n&\nPrint");
/*     */     JButton _payPrint_1 = new JButton();
/*     */     _payPrint_1.setText("Add Pending");
/*     */     _payPrint_1.setFont(new Font("Dialog", 1, 12));
/*     */     _payPrint_1.setBounds(20, 176, 137, 43);
/*     */     this.jPanel5.add(_payPrint_1);
/*     */     JButton _payPrint_1_1 = new JButton();
/*     */     _payPrint_1_1.setText("Gift");
/*     */     _payPrint_1_1.setFont(new Font("Dialog", 1, 12));
/*     */     _payPrint_1_1.setBounds(20, 230, 137, 43);
/*     */     this.jPanel5.add(_payPrint_1_1);
/*     */     JButton _payPrint_1_1_1 = new JButton();
/*     */     _payPrint_1_1_1.setText("Pay Only");
/*     */     _payPrint_1_1_1.setFont(new Font("Dialog", 1, 11));
/*     */     _payPrint_1_1_1.setBounds(20, 286, 137, 43);
/*     */     this.jPanel5.add(_payPrint_1_1_1);
/*     */     this._payPrint.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*     */             sale.this._payPrintActionPerformed(evt);
/*     */           }
/*     */         });
/*     */     this.jPanel6.setBorder(BorderFactory.createEtchedBorder());
/*     */     this.jLabel8.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel8.setText("Paid Amount :");
/*     */     this.paid_amt.setFont(new Font("Tahoma", 1, 18));
/*     */     this.paid_amt.addKeyListener(new KeyAdapter() {
/*     */           public void keyReleased(KeyEvent evt) {
/*     */             sale.this.paid_amtKeyReleased(evt);
/*     */           }
/*     */         });
/*     */     this.jPanel7.setBorder(new LineBorder(new Color(0, 0, 0)));
/*     */     this.bill_tot.setFont(new Font("Tahoma", 1, 14));
/*     */     this.bill_tot.setText("00.00");
/*     */     this.bill_tot.setBorder(BorderFactory.createEtchedBorder());
/*     */     this.jLabel10.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel10.setHorizontalAlignment(2);
/*     */     this.jLabel10.setText("Total Amount :");
/*     */     this.jLabel11.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jLabel11.setHorizontalAlignment(4);
/*     */     this.jLabel11.setText("Balance/Due :");
/*     */     this.balance.setFont(new Font("Tahoma", 1, 14));
/*     */     this.balance.setText("00.00");
/*     */     this.balance.setBorder(BorderFactory.createEtchedBorder());
/*     */     GroupLayout jPanel7Layout = new GroupLayout(this.jPanel7);
/*     */     this.jPanel7.setLayout(jPanel7Layout);
/*     */     jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel10, -1, -1, 32767).addComponent(this.jLabel11, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.balance, -1, 129, 32767).addComponent(this.bill_tot, -1, -1, 32767)).addContainerGap()));
/*     */     jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel7Layout.createSequentialGroup().addContainerGap().addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel10, -1, -1, 32767).addComponent(this.bill_tot, -1, 28, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel7Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel11, -1, -1, 32767).addComponent(this.balance, -1, 28, 32767)).addGap(17, 17, 17)));
/*     */     this.jLabel1.setFont(new Font("Tahoma", 1, 12));
/*     */     this.jLabel1.setText("Total Products :");
/*     */     this.tot_qty.setFont(new Font("Tahoma", 1, 12));
/*     */     this.tot_qty.setText("0");
/*     */     this.discountPaid = new JTextField();
/*     */     this.discountPaid.setText("0");
/*     */     this.discountPaid.setBounds(136, 13, 150, 28);
/*     */     this.discountPaid.setFont(new Font("Tahoma", 1, 18));
/*     */     JLabel lblDiscount = new JLabel();
/*     */     lblDiscount.setHorizontalAlignment(4);
/*     */     lblDiscount.setBounds(34, 13, 98, 28);
/*     */     lblDiscount.setText("Discount :");
/*     */     lblDiscount.setFont(new Font("Tahoma", 1, 14));
/*     */     this.jPanel1.add(this.jPanel6);
/*     */     this.jPanel6.setLayout((LayoutManager)null);
/*     */     this.jPanel6.add(this.jLabel8);
/*     */     this.jPanel6.add(this.paid_amt);
/*     */     this.jPanel6.add(this.jLabel1);
/*     */     this.jPanel6.add(this.tot_qty);
/*     */     this.jPanel6.add(lblDiscount);
/*     */     this.jPanel6.add(this.discountPaid);
/*     */     this.jPanel6.add(this.jPanel7);
/*     */     GroupLayout layout = new GroupLayout(this);
/*     */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -2, 1021, -2).addContainerGap(-1, 32767)));
/*     */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, 538, 32767).addContainerGap()));
/*     */     setLayout(layout);
/*     */   }
/*     */   
/*     */   private void productLoad() {
/*     */     String name = this.com_pro.getSelectedItem().toString();
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       ResultSet rs = s.executeQuery("SELECT * FROM product  WHERE Product_Name ='" + name + "' ");
/*     */       if (rs.next()) {
/*     */         this.u_price.setText(rs.getString(8));
/*     */         this.bc_code.setText(rs.getString(4));
/*     */         this.stkLevel.setText(rs.getString(7));
/*     */         this.expShow.setText(rs.getString(6));
/*     */       } 
/*     */       pro_tot_cal();
/*     */     } catch (SQLException e) {
/*     */       JOptionPane.showMessageDialog(null, "Error : " + e, "Data load error", 0);
/*     */     } 
/*     */   }
/*     */   
/*     */   private void com_proActionPerformed(ActionEvent evt) {
/*     */     productLoad();
/*     */   }
/*     */   
/*     */   private void p_qtyKeyReleased(KeyEvent evt) {
/*     */     pro_tot_cal();
/*     */   }
/*     */   
/*     */   private void addToCartActionPerformed(ActionEvent evt) {
/*     */     int stock = Integer.parseInt(this.stkLevel.getText());
/*     */     DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*     */     String selectedProduct = this.com_pro.getSelectedItem().toString();
/*     */     int quantity = Integer.parseInt(this.p_qty.getText());
/*     */     double unitPrice = Double.parseDouble(this.u_price.getText());
/*     */     int existingRowIndex = -1;
/*     */     for (int i = 0; i < dt.getRowCount(); i++) {
/*     */       String prodName = dt.getValueAt(i, 1).toString();
/*     */       if (prodName.equals(selectedProduct)) {
/*     */         existingRowIndex = i;
/*     */         break;
/*     */       } 
/*     */     } 
/*     */     if (existingRowIndex != -1) {
/*     */       int existingQuantity = Integer.parseInt(dt.getValueAt(existingRowIndex, 2).toString());
/*     */       double existingTotalPrice = Double.parseDouble(dt.getValueAt(existingRowIndex, 4).toString());
/*     */       int newQty = existingQuantity + quantity;
/*     */       double newTotalPrice = unitPrice * newQty;
/*     */       dt.setValueAt(Integer.valueOf(newQty), existingRowIndex, 2);
/*     */       dt.setValueAt(Double.valueOf(newTotalPrice), existingRowIndex, 4);
/*     */       cart_total();
/*     */       tot();
/*     */     } else {
/*     */       Vector<Integer> v = new Vector();
/*     */       v.add(Integer.valueOf(dt.getRowCount() + 1));
/*     */       v.add(this.com_pro.getSelectedItem().toString());
/*     */       v.add(this.p_qty.getText());
/*     */       v.add(this.u_price.getText());
/*     */       v.add(this.tot_price.getText());
/*     */       dt.addRow(v);
/*     */       cart_total();
/*     */       tot();
/*     */     } 
/*     */   }
/*     */   
/*     */   private void jButton2ActionPerformed(ActionEvent evt) {
/*     */     try {
/*     */       DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*     */       int rw = this.jTable1.getSelectedRow();
/*     */       int existingQuantity = Integer.parseInt(dt.getValueAt(rw, 2).toString());
/*     */       int quantity = Integer.parseInt(this.p_qty.getText());
/*     */       double unitPrice = Double.parseDouble(this.u_price.getText());
/*     */       if (existingQuantity > 1) {
/*     */         dt.setValueAt(Integer.valueOf(existingQuantity - 1), rw, 2);
/*     */         double totalPrice = Double.parseDouble(dt.getValueAt(rw, 2).toString()) * unitPrice;
/*     */         double newTotalPrice = unitPrice * quantity;
/*     */         dt.setValueAt(Double.valueOf(totalPrice), this.jTable1.getSelectedRow(), 4);
/*     */       } else {
/*     */         dt.removeRow(rw);
/*     */       } 
/*     */       cart_total();
/*     */       tot();
/*     */     } catch (Exception exception) {}
/*     */   }
/*     */   
/*     */   private void resetBtnActionPerformed(ActionEvent evt) {
/*     */     DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*     */     dt.setRowCount(0);
/*     */     cart_total();
/*     */     tot();
/*     */   }
/*     */   
/*     */   private void paid_amtKeyReleased(KeyEvent evt) {
/*     */     tot();
/*     */   }
/*     */   
/*     */   private void _payPrintActionPerformed(ActionEvent evt) {
/*     */     DefaultTableModel dt = (DefaultTableModel)this.jTable1.getModel();
/*     */     try {
/*     */       int rc = dt.getRowCount();
/*     */       String inidtext = this.inid.getText();
/*     */       for (int i = 0; i < rc; i++) {
/*     */         String P_name = dt.getValueAt(i, 1).toString();
/*     */         String qty = dt.getValueAt(i, 2).toString();
/*     */         String un_price = dt.getValueAt(i, 3).toString();
/*     */         String tot_price = dt.getValueAt(i, 4).toString();
/*     */         int newQty = 0;
/*     */         Statement s = db.mycon().createStatement();
/*     */         s.executeUpdate(" INSERT INTO cart (INID, Product_Name, qty, Unit_Price, Total_Price) VALUES ('" + inidtext + "','" + P_name + "','" + qty + "','" + un_price + "','" + tot_price + "') ");
/*     */         ResultSet rs = s.executeQuery(" SELECT * FROM product");
/*     */         while (rs.next()) {
/*     */           int Qty = Integer.parseInt(qty);
/*     */           int orgQty = Integer.parseInt(rs.getString("Qty"));
/*     */           if (orgQty >= Qty && orgQty - Qty < 0) {
/*     */             newQty = orgQty - Qty;
/*     */             Statement q = db.mycon().createStatement();
/*     */             q.executeUpdate("UPDATE `product` SET `Qty` = '" + newQty + "' WHERE (`Product_Name` = '" + P_name + "');");
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } catch (SQLException e) {
/*     */       JOptionPane.showMessageDialog(null, "Error : " + e, "SQL ERROR", 0);
/*     */     } 
/*     */     cart_total();
/*     */     tot();
/*     */     dt.setRowCount(0);
/*     */     try {
/*     */       String inv_id = this.inid.getText();
/*     */       String cname = this.com_cus.getSelectedItem().toString();
/*     */       String totqty = this.tot_qty.getText();
/*     */       String tot_bil = this.bill_tot.getText();
/*     */       String blnc = this.balance.getText();
/*     */       SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
/*     */       String date = timeFormat.format(Calendar.getInstance().getTime());
/*     */       Double tot = Double.valueOf(this.bill_tot.getText());
/*     */       Double pid = Double.valueOf(this.paid_amt.getText());
/*     */       Double discount = Double.valueOf(Double.parseDouble(this.discountPaid.getText()));
/*     */       String transaction = "----------------------------------------------------------\n|  Paid  : " + pid + " Balance : " + blnc + " Total : " + tot_bil + "\n" + "----------------------------------------------------------\n";
/*     */       Notification.sendNotification("Transaction Complete", transaction, TrayIcon.MessageType.NONE);
/*     */       String Status = null;
/*     */       if (pid.doubleValue() == 0.0D) {
/*     */         Status = "UnPaid";
/*     */       } else if (tot.doubleValue() > pid.doubleValue()) {
/*     */         Status = "Partial";
/*     */       } else if (pid.doubleValue() >= tot.doubleValue()) {
/*     */         Status = "Paid";
/*     */       } 
/*     */       Statement ss = db.mycon().createStatement();
/*     */       ss.executeUpdate("INSERT INTO sales(INID, Date, Customer_Name, Total_Qty, Total_Bill, Status, Balance,paidAmt) VALUES('" + inv_id + "','" + date + "','" + cname + "','" + totqty + "','" + tot_bil + "','" + Status + "','" + blnc + "','" + pid + "')");
/*     */     } catch (SQLException e1) {
/*     */       daysSale.errorGen(e1);
/*     */     } catch (MalformedURLException e1) {
/*     */       e1.printStackTrace();
/*     */     } catch (AWTException e1) {
/*     */       e1.printStackTrace();
/*     */     } 
/*     */     try {
/*     */       String id = this.inid.getText();
/*     */       Statement s = db.mycon().createStatement();
/*     */       s.executeUpdate("UPDATE  extra SET val='" + id + "' WHERE exid = 1");
/*     */     } catch (SQLException e1) {
/*     */       daysSale.errorGen(e1);
/*     */     } 
/*     */     int a = Integer.parseInt(this.inid.getText()) + 1;
/*     */     this.inid.setText(String.valueOf(a));
/*     */     this.balance.setText("0.0");
/*     */     this.discountPaid.setText("0.0");
/*     */     this.bill_tot.setText("0.0");
/*     */     this.paid_amt.setText("0.0");
/*     */     productLoad();
/*     */   }
/*     */   
/*     */   private void com_cusActionPerformed(ActionEvent evt) {
/*     */     String name = this.com_cus.getSelectedItem().toString();
/*     */     try {
/*     */       Statement s = db.mycon().createStatement();
/*     */       ResultSet rs = s.executeQuery("SELECT cid,customer_name FROM customer  WHERE customer_name ='" + name + "'  ");
/*     */       if (rs.next())
/*     */         cus_id = rs.getString("cid"); 
/*     */     } catch (SQLException e) {
/*     */       daysSale.errorGen(e);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/sale.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */