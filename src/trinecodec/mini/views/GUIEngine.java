/*     */ package trinecodec.mini.views;
/*     */ 
/*     */ import java.awt.BasicStroke;
/*     */ import java.awt.Color;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.image.BufferedImage;
/*     */ import java.io.File;
/*     */ import java.io.IOException;
/*     */ import java.sql.ResultSet;
/*     */ import java.sql.SQLException;
/*     */ import java.sql.Statement;
/*     */ import javax.imageio.ImageIO;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JLabel;
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
/*     */ import org.jfree.ui.RectangleInsets;
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
/*     */ public class GUIEngine
/*     */   extends JPanel
/*     */ {
/*     */   public static void genChart3D() throws IOException {
/*  40 */     DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
/*     */     
/*     */     try {
/*  43 */       Statement s = db.mycon().createStatement();
/*  44 */       ResultSet rs = s.executeQuery("SELECT Product_Name,Qty FROM product");
/*  45 */       while (rs.next()) {
/*  46 */         String name = rs.getString(1);
/*  47 */         int Qty = Integer.parseInt(rs.getString(2));
/*  48 */         dataset1.setValue(Qty, "PRODUCT NAME", name);
/*     */       }
/*     */     
/*  51 */     } catch (SQLException e) {
/*     */       
/*  53 */       e.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/*  57 */     JFreeChart ch = ChartFactory.createBarChart3D("Product Stock Levels", 
/*  58 */         "Products", 
/*  59 */         "Quantity", 
/*  60 */         (CategoryDataset)dataset1, 
/*  61 */         PlotOrientation.VERTICAL, 
/*  62 */         true, true, false);
/*  63 */     editChart(ch);
/*  64 */     String file = String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports/" + 
/*  65 */       ScreenHome.date + "-products-in-store.png";
/*  66 */     ChartUtilities.saveChartAsPNG(new File(file), ch, 1080, 580);
/*     */   }
/*     */   
/*     */   public static void editChart(JFreeChart ch) {
/*  70 */     StandardChartTheme theme = new StandardChartTheme(ch.toString());
/*     */     
/*  72 */     theme.setTitlePaint(Color.decode("#4572a7"));
/*  73 */     theme.setRangeGridlinePaint(Color.decode("#C0C0C0"));
/*  74 */     theme.setPlotBackgroundPaint(new Color(235, 235, 235));
/*     */     
/*  76 */     theme.setGridBandPaint(Color.red);
/*  77 */     theme.setAxisOffset(new RectangleInsets(0.0D, 0.0D, 0.0D, 0.0D));
/*  78 */     theme.setBarPainter((BarPainter)new StandardBarPainter());
/*  79 */     theme.setAxisLabelPaint(Color.decode("#666666"));
/*  80 */     theme.apply(ch);
/*  81 */     ch.getCategoryPlot().setOutlineVisible(true);
/*  82 */     ch.getCategoryPlot().getRangeAxis().setAxisLineVisible(true);
/*  83 */     ch.getCategoryPlot().getRangeAxis().setTickMarksVisible(false);
/*  84 */     ch.getCategoryPlot().setRangeGridlineStroke(new BasicStroke());
/*  85 */     ch.getCategoryPlot().getRangeAxis().setTickLabelPaint(Color.decode("#666666"));
/*  86 */     ch.getCategoryPlot().getDomainAxis().setTickLabelPaint(Color.decode("#666666"));
/*  87 */     ch.setTextAntiAlias(true);
/*  88 */     ch.setAntiAlias(true);
/*  89 */     ch.getCategoryPlot().getRenderer().setSeriesPaint(0, Color.decode("#4572a7"));
/*     */   }
/*     */   
/*     */   public GUIEngine() throws IOException {
/*  93 */     setSize(1080, 580);
/*  94 */     setLayout((LayoutManager)null);
/*     */     
/*  96 */     String file = String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/3DReports/" + 
/*  97 */       ScreenHome.date + "-products-in-store.png";
/*     */ 
/*     */     
/* 100 */     BufferedImage image = ImageIO.read(new File(file));
/* 101 */     JLabel label = new JLabel(new ImageIcon(image));
/* 102 */     label.setSize(1080, 580);
/* 103 */     add(label);
/*     */   }
/*     */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodec/mini/views/GUIEngine.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */