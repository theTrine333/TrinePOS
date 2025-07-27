/*     */ package trinecodec.mini.views;
/*     */ 
/*     */ import java.awt.BasicStroke;
/*     */ import java.awt.Color;
/*     */ import java.awt.Image;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JFrame;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import org.jfree.chart.ChartFactory;
/*     */ import org.jfree.chart.ChartUtilities;
/*     */ import org.jfree.chart.JFreeChart;
/*     */ import org.jfree.chart.StandardChartTheme;
/*     */ import org.jfree.chart.plot.PlotOrientation;
/*     */ import org.jfree.chart.renderer.category.BarPainter;
/*     */ import org.jfree.chart.renderer.category.StandardBarPainter;
/*     */ import org.jfree.data.category.CategoryDataset;
/*     */ import org.jfree.data.category.DefaultCategoryDataset;
/*     */ import org.jfree.data.jdbc.JDBCCategoryDataset;
/*     */ import org.jfree.ui.RectangleInsets;
/*     */ import trinecode.tools.PFetcher;
/*     */ import trinecode.tools.SettingsManager;
/*     */ import trinecodecmain.ScreenHome;
/*     */ import trinecodecmain.db;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class AnalyserClass
/*     */   extends JPanel
/*     */ {
/*     */   static JDBCCategoryDataset dataset;
/*     */   PFetcher properties;
/*     */   
/*     */   public AnalyserClass() {
/*  57 */     this.properties = new PFetcher(); setLayout((LayoutManager)null); JPanel panel = new JPanel(); panel.setBounds(0, 0, 260, 180); add(panel); DefaultCategoryDataset data1 = new DefaultCategoryDataset(); try { Statement s = db.mycon().createStatement(); ResultSet resultSet = s.executeQuery(" SELECT * FROM product"); } catch (SQLException e) { JOptionPane.showMessageDialog(null, "An Error Occured While Connecting to database\nAborting to create Analyser Engine!!!", "Connection Failier", 0); SettingsManager settings = new SettingsManager(); JpanelLoader.jPanelLoader(ScreenHome.panel_load, (JPanel)settings); }
/*  58 */      } static String url = "jdbc:mysql://localhost:3306/trinepos";
/*  59 */   static String user = "root";
/*  60 */   static String passwd = "";
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) throws IOException {
/*  74 */     DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
/*     */     
/*     */     try {
/*  77 */       Statement s = db.mycon().createStatement();
/*  78 */       ResultSet rs = s.executeQuery("SELECT Product_Name,Qty FROM product");
/*  79 */       while (rs.next()) {
/*  80 */         String name = rs.getString(1);
/*  81 */         int Qty = Integer.parseInt(rs.getString(2));
/*  82 */         dataset1.setValue(Qty, "PRODUCT NAME", name);
/*     */       }
/*     */     
/*  85 */     } catch (SQLException e) {
/*     */       
/*  87 */       e.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/*  91 */     JFreeChart ch = ChartFactory.createBarChart("Product Stock Levels", 
/*  92 */         "Products", 
/*  93 */         "Quantity", 
/*  94 */         (CategoryDataset)dataset1, 
/*  95 */         PlotOrientation.VERTICAL, 
/*  96 */         true, false, false);
/*  97 */     StandardChartTheme theme = new StandardChartTheme(ch.toString());
/*     */     
/*  99 */     theme.setTitlePaint(Color.decode("#4572a7"));
/* 100 */     theme.setRangeGridlinePaint(Color.decode("#4572a7"));
/*     */ 
/*     */     
/* 103 */     theme.setGridBandPaint(Color.red);
/* 104 */     theme.setAxisOffset(new RectangleInsets(0.0D, 0.0D, 0.0D, 0.0D));
/* 105 */     theme.setBarPainter((BarPainter)new StandardBarPainter());
/* 106 */     theme.setAxisLabelPaint(Color.decode("#666666"));
/* 107 */     theme.apply(ch);
/* 108 */     ch.getCategoryPlot().setOutlineVisible(true);
/* 109 */     ch.getCategoryPlot().getRangeAxis().setAxisLineVisible(true);
/* 110 */     ch.getCategoryPlot().getRangeAxis().setTickMarksVisible(true);
/* 111 */     ch.getCategoryPlot().setRangeGridlineStroke(new BasicStroke());
/* 112 */     ch.getCategoryPlot().getRangeAxis().setTickLabelPaint(Color.decode("#666666"));
/* 113 */     ch.getCategoryPlot().getDomainAxis().setTickLabelPaint(Color.decode("#666666"));
/* 114 */     ch.setTextAntiAlias(true);
/* 115 */     ch.setAntiAlias(true);
/* 116 */     ch.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.decode("#4572a7"));
/* 117 */     String file = String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports/" + 
/* 118 */       ScreenHome.date + "-products-in-store.png";
/* 119 */     ChartUtilities.saveChartAsPNG(new File(file), ch, 857, 530);
/* 120 */     JFrame frame = new JFrame();
/* 121 */     JPanel panel = new JPanel();
/*     */     
/* 123 */     BufferedImage image = ImageIO.read(new File(file));
/* 124 */     Image scaledImage = image.getScaledInstance(1050, 540, 1);
/* 125 */     JLabel label = new JLabel(new ImageIcon(scaledImage));
/* 126 */     frame.setBounds(0, 0, 1070, 580);
/* 127 */     panel.add(label);
/* 128 */     frame.add(panel);
/* 129 */     frame.setVisible(true);
/* 130 */     frame.setDefaultCloseOperation(3);
/*     */     
/* 132 */     System.out.println("[DONE] : BarChar generated Successfully");
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/AnalyserClass.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */