/*    */ package trinecodecmain;
/*    */ 
/*    */ import java.awt.Component;
/*    */ import java.awt.Container;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.InputStream;
/*    */ import java.sql.Connection;
/*    */ import java.util.HashMap;
/*    */ import javax.swing.JFrame;
/*    */ import net.sf.jasperreports.engine.JRException;
/*    */ import net.sf.jasperreports.engine.JasperCompileManager;
/*    */ import net.sf.jasperreports.engine.JasperFillManager;
/*    */ import net.sf.jasperreports.engine.JasperPrint;
/*    */ import net.sf.jasperreports.engine.JasperReport;
/*    */ import net.sf.jasperreports.engine.design.JasperDesign;
/*    */ import net.sf.jasperreports.engine.xml.JRXmlLoader;
/*    */ import net.sf.jasperreports.swing.JRViewer;
/*    */ 
/*    */ public class ReportView extends JFrame {
/*    */   public ReportView(String fileName) {
/* 23 */     this(fileName, (HashMap)null);
/*    */   }
/*    */ 
/*    */   
/*    */   public ReportView(String fileName, HashMap para) {
/* 28 */     db d = new db();
/* 29 */     Connection con = db.mycon();
/*    */     
/*    */     try {
/* 32 */       JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
/*    */       
/* 34 */       JRViewer viewer = new JRViewer(print);
/* 35 */       Container c = getContentPane();
/* 36 */       c.add((Component)viewer);
/*    */     }
/* 38 */     catch (JRException jRException) {
/*    */       
/* 40 */       System.out.println(jRException);
/*    */     } 
/* 42 */     setBounds(2, 2, 900, 700);
/* 43 */     setDefaultCloseOperation(2);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   static JRViewer view;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void JViewer() throws FileNotFoundException, JRException {
/* 70 */     InputStream input = new FileInputStream(new File("C:\\Users\\theTrine\\JaspersoftWorkspace\\TrinePos Reports\\Reports\\print.jrxml"));
/*    */ 
/*    */ 
/*    */     
/* 74 */     JasperDesign desinger = JRXmlLoader.load(input);
/* 75 */     JasperReport jasperReport = JasperCompileManager.compileReport(desinger);
/*    */     
/* 77 */     HashMap<Object, Object> para = new HashMap<>();
/* 78 */     para.put("inv_id", Integer.valueOf(43));
/* 79 */     para.put("shopName", "TRINE WHOLESALE SUPERMARKET");
/* 80 */     para.put("location", "KISUMU TOWN");
/* 81 */     para.put("postalAddr", "P.O BOX 14,41412");
/* 82 */     para.put("phoneNumber", "0795514454");
/* 83 */     para.put("phoneNumber2", "0111521140");
/* 84 */     para.put("pageHeight", "300");
/*    */     
/* 86 */     db d = new db();
/* 87 */     Connection con = db.mycon();
/* 88 */     JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, para, con);
/*    */ 
/*    */     
/* 91 */     view = new JRViewer(jasperPrint);
/*    */   }
/*    */   void print() {
/* 94 */     throw new UnsupportedOperationException("Not supported yet.");
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/ReportView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */