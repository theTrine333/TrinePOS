/*     */ package trinecodec.mini.views;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.MouseAdapter;
/*     */ import java.awt.event.MouseEvent;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import java.text.SimpleDateFormat;
/*     */ import java.util.Calendar;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.BoxLayout;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JScrollPane;
/*     */ import javax.swing.border.BevelBorder;
/*     */ import javax.swing.border.LineBorder;
/*     */ import org.apache.commons.io.FileUtils;
/*     */ import org.jfree.chart.ChartFactory;
/*     */ import org.jfree.chart.ChartUtilities;
/*     */ import org.jfree.chart.JFreeChart;
/*     */ import org.jfree.chart.plot.PlotOrientation;
/*     */ import org.jfree.data.category.CategoryDataset;
/*     */ import org.jfree.data.category.DefaultCategoryDataset;
/*     */ import trinecode.tools.Loading;
/*     */ import trinecodecmain.db;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class daysSale
/*     */   extends JPanel
/*     */ {
/*     */   public static JPanel thumbHolder;
/*     */   JScrollPane scrollPane;
/*     */   static JLabel dayShower;
/*     */   JPanel panel;
/*     */   private static JLabel imgShower;
/*     */   Statement s;
/*     */   ResultSet rs;
/*     */   ResultSet rs2;
/*  53 */   String file = null;
/*  54 */   DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
/*  55 */   JFreeChart ch = null;
/*  56 */   int counter = 0;
/*     */   
/*     */   public daysSale() throws IOException {
/*  59 */     setSize(1080, 590);
/*  60 */     setLayout((LayoutManager)null);
/*     */     
/*  62 */     this.scrollPane = new JScrollPane();
/*  63 */     this.scrollPane.setBounds(0, 0, 200, 579);
/*  64 */     add(this.scrollPane);
/*     */     
/*  66 */     thumbHolder = new JPanel();
/*  67 */     this.scrollPane.setViewportView(thumbHolder);
/*  68 */     thumbHolder.setLayout(new BoxLayout(thumbHolder, 1));
/*     */     
/*  70 */     dayShower = new JLabel("Todays Sales");
/*  71 */     dayShower.setBorder(new BevelBorder(1, new Color(0, 102, 255), new Color(0, 102, 255), new Color(0, 102, 255), new Color(0, 102, 255)));
/*  72 */     dayShower.setForeground(new Color(0, 102, 255));
/*  73 */     dayShower.setFont(new Font("Copperplate Gothic Bold", 0, 18));
/*  74 */     dayShower.setHorizontalAlignment(0);
/*  75 */     dayShower.setBounds(207, 0, 873, 39);
/*  76 */     add(dayShower);
/*     */     
/*  78 */     this.panel = new JPanel();
/*  79 */     this.panel.setBorder(new BevelBorder(1, new Color(0, 153, 51), new Color(0, 102, 255), new Color(0, 102, 255), new Color(0, 153, 0)));
/*  80 */     this.panel.setBounds(207, 41, 873, 538);
/*  81 */     add(this.panel);
/*  82 */     this.panel.setLayout((LayoutManager)null);
/*     */     
/*  84 */     imgShower = new JLabel("Image goes here");
/*  85 */     imgShower.setHorizontalAlignment(0);
/*  86 */     imgShower.setBounds(5, 5, 863, 527);
/*  87 */     this.panel.add(imgShower);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   static void genReport(String date) throws IOException {
/*  94 */     Loading load = new Loading();
/*  95 */     load.setVisible(true);
/*  96 */     DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
/*     */     try {
/*  98 */       Statement s = db.mycon().createStatement();
/*  99 */       ResultSet rs = s.executeQuery("SELECT INID,Total_Bill FROM sales WHERE Date='" + date + "' ");
/* 100 */       while (rs.next()) {
/* 101 */         String name1 = rs.getString(1);
/* 102 */         double Qty = Double.parseDouble(rs.getString(2));
/* 103 */         dataset1.setValue(Qty, "INVOICE NUMBER", name1);
/*     */       } 
/* 105 */     } catch (SQLException e) {
/* 106 */       errorGen(e);
/*     */     } 
/* 108 */     JFreeChart ch = ChartFactory.createBarChart3D("SALES 3D-REPORTS", 
/* 109 */         "INVOICEID", 
/* 110 */         "TOTAL BILL", 
/* 111 */         (CategoryDataset)dataset1, 
/* 112 */         PlotOrientation.VERTICAL, 
/* 113 */         true, true, false);
/* 114 */     GUIEngine.editChart(ch);
/* 115 */     String file = String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports/" + 
/* 116 */       date + "-daily-sales.png";
/* 117 */     ChartUtilities.saveChartAsPNG(new File(file), ch, 850, 510);
/* 118 */     load.dispose();
/*     */   } public static void todayReports() throws IOException {
/*     */     
/* 121 */     try { FileUtils.cleanDirectory(new File(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports")); } catch (IOException iOException) {}
/* 122 */     DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
/* 123 */     SimpleDateFormat timeFormat = new SimpleDateFormat(" yyyy-MM-dd");
/* 124 */     String date = timeFormat.format(Calendar.getInstance().getTime());
/*     */     
/* 126 */     genReport(date);
/*     */     
/* 128 */     final String fileName = String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports/" + 
/* 129 */       date + "-daily-sales.png";
/* 130 */     timeFormat = new SimpleDateFormat(" dd - MMMM - yyyy");
/* 131 */     date = timeFormat.format(Calendar.getInstance().getTime());
/* 132 */     JLabel nameLabel = new JLabel();
/* 133 */     nameLabel.setText("TODAY : " + date + " SALES ");
/* 134 */     nameLabel.setHorizontalAlignment(0);
/* 135 */     nameLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 136 */     JLabel label = new JLabel();
/*     */ 
/*     */     
/* 139 */     BufferedImage image = ImageIO.read(new File(fileName));
/* 140 */     Image scaledImage = image.getScaledInstance(180, 120, 4);
/* 141 */     label.setIcon(new ImageIcon(scaledImage));
/*     */     
/* 143 */     label.addMouseListener(new MouseAdapter()
/*     */         {
/*     */           public void mouseClicked(MouseEvent e) {
/* 146 */             daysSale.imgShower.setText("");
/* 147 */             daysSale.imgShower.setIcon(new ImageIcon(fileName));
/* 148 */             daysSale.imgShower.revalidate();
/* 149 */             daysSale.imgShower.repaint();
/*     */           }
/*     */         });
/* 152 */     thumbHolder.add(nameLabel);
/* 153 */     thumbHolder.add(label);
/* 154 */     imgShower.setIcon(new ImageIcon(fileName));
/*     */   } public static void allDayReports() throws IOException {
/*     */     
/* 157 */     try { FileUtils.cleanDirectory(new File(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports")); } catch (IOException iOException) {}
/* 158 */     DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
/* 159 */     int cnt = 0;
/* 160 */     String curDate = null;
/* 161 */     String[] dates = new String[255];
/*     */     try {
/* 163 */       Statement s = db.mycon().createStatement();
/* 164 */       ResultSet rs1 = s.executeQuery("SELECT Date FROM sales ");
/* 165 */       while (rs1.next()) {
/* 166 */         String tempDate = rs1.getString(1);
/* 167 */         if (!tempDate.equals(curDate)) {
/* 168 */           curDate = tempDate;
/* 169 */           dates[cnt] = curDate;
/* 170 */           cnt++;
/*     */         } 
/*     */       } 
/*     */       
/* 174 */       JLabel[] namesLabel = new JLabel[cnt + 1];
/* 175 */       JLabel[] labels = new JLabel[cnt + 1];
/*     */       int i;
/* 177 */       for (i = 0; i < cnt; i++) {
/* 178 */         final String date = dates[i];
/* 179 */         genReport(date);
/*     */       } 
/* 181 */       for (i = 0; i < cnt; i++) {
/* 182 */         final String date = dates[i];
/* 183 */         final String fileName = String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports/" + 
/* 184 */           date + "-daily-sales.png";
/* 185 */         JLabel nameLabel = new JLabel();
/* 186 */         String name = dates[i];
/* 187 */         nameLabel.setText(name);
/* 188 */         nameLabel.setHorizontalAlignment(0);
/* 189 */         nameLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
/* 190 */         namesLabel[i] = nameLabel;
/* 191 */         JLabel label = new JLabel();
/*     */ 
/*     */         
/* 194 */         BufferedImage image = ImageIO.read(new File(fileName));
/* 195 */         Image scaledImage = image.getScaledInstance(180, 120, 4);
/* 196 */         label.setIcon(new ImageIcon(scaledImage));
/*     */         
/* 198 */         label.addMouseListener(new MouseAdapter()
/*     */             {
/*     */               public void mouseClicked(MouseEvent e) {
/* 201 */                 daysSale.imgShower.setText("");
/* 202 */                 daysSale.dayShower.setText("DATE : " + date + " SALES 3D REPRESENTATION");
/* 203 */                 daysSale.imgShower.setIcon(new ImageIcon(fileName));
/* 204 */                 daysSale.imgShower.revalidate();
/* 205 */                 daysSale.imgShower.repaint();
/*     */               }
/*     */             });
/* 208 */         labels[i] = label;
/*     */         
/* 210 */         thumbHolder.add(nameLabel);
/* 211 */         thumbHolder.add(label);
/*     */       }
/*     */     
/*     */     }
/* 215 */     catch (Exception e2) {
/* 216 */       errorGen(e2);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void errorGen(Exception e1) {
/* 223 */     if (e1.toString().contains("The driver has not received any packets from the server.")) {
/* 224 */       JOptionPane.showMessageDialog(null, "The server is refusing connections, Please\n Make sure: \n\t - The server is up and running\n\t - The port configuration is correct", 
/* 225 */           "Server Error", 0);
/* 226 */     } else if (e1.toString().contains("Unknown database")) {
/* 227 */       JOptionPane.showMessageDialog(null, "The database name is incorrect\nCheck the database name and try again", "DATABASE ERROR", 0);
/* 228 */     } else if (e1.toString().contains("Access denied for user 'root'@'localhost' (using password: NO)")) {
/* 229 */       JOptionPane.showMessageDialog(null, 
/* 230 */           " ------ [CONNECTION FAILED] ----- \n- The connection requires a password\n- Please check password and try again", 
/*     */           
/* 232 */           "DATABASE ERROR", 0);
/* 233 */     } else if (e1.toString().contains("using password: YES")) {
/* 234 */       JOptionPane.showMessageDialog(null, 
/* 235 */           " ------ [CONNECTION FAILED] ----- \n- The password used is incorrect. \n- Please check password and try again", 
/*     */           
/* 237 */           "DATABASE ERROR", 0);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/daysSale.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */