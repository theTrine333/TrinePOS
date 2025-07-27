/*    */ package trinecode.tools;
/*    */ 
/*    */ import java.awt.Component;
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
/*    */ import trinecodecmain.db;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JViewerClass
/*    */ {
/*    */   public JViewerClass() throws FileNotFoundException, JRException {
/* 51 */     InputStream input = new FileInputStream(new File("C:\\Users\\theTrine\\JaspersoftWorkspace\\TrinePos Reports\\Reports\\print.jrxml"));
/*    */ 
/*    */ 
/*    */     
/* 55 */     JasperDesign desinger = JRXmlLoader.load(input);
/* 56 */     JasperReport jasperReport = JasperCompileManager.compileReport(desinger);
/*    */     
/* 58 */     HashMap<Object, Object> para = new HashMap<>();
/* 59 */     para.put("inv_id", Integer.valueOf(15));
/* 60 */     para.put("shopName", "TRINE WHOLESALE SUPERMARKET");
/* 61 */     para.put("location", "KISUMU TOWN");
/* 62 */     para.put("postalAddr", "P.O BOX 14,41412");
/* 63 */     para.put("phoneNumber", "0795514454");
/* 64 */     para.put("phoneNumber2", "0111521140");
/*    */ 
/*    */     
/* 67 */     db d = new db();
/* 68 */     Connection con = db.mycon();
/* 69 */     JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, para, con);
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 74 */     JRViewer view = new JRViewer(jasperPrint);
/* 75 */     JFrame frame = new JFrame("Reports Viewer");
/* 76 */     frame.setSize(400, 500);
/* 77 */     frame.setDefaultCloseOperation(3);
/* 78 */     frame.add((Component)view);
/* 79 */     frame.setVisible(true);
/*    */   }
/*    */   
/*    */   public static void main(String[] args) {
/*    */     try {
/* 84 */       JViewerClass jViewerClass = new JViewerClass();
/* 85 */     } catch (FileNotFoundException e) {
/*    */       
/* 87 */       e.printStackTrace();
/* 88 */     } catch (JRException e) {
/*    */       
/* 90 */       e.printStackTrace();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/JViewerClass.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */