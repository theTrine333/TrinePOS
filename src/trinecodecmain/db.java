/*    */ package trinecodecmain;
/*    */ 
/*    */ import java.sql.Connection;
/*    */ import java.sql.DriverManager;
/*    */ import java.sql.SQLException;
/*    */ import javax.swing.JOptionPane;
/*    */ import trinecode.tools.PFetcher;
/*    */ 
/*    */ public class db
/*    */ {
/*    */   public static Connection mycon() {
/* 12 */     Connection con = null;
/* 13 */     PFetcher properties = new PFetcher();
/*    */     try {
/* 15 */       Class.forName("com.mysql.cj.jdbc.Driver");
/* 16 */       con = DriverManager.getConnection("jdbc:mysql://" + 
/* 17 */           PFetcher.getSettings("db.url") + 
/* 18 */           ":" + 
/* 19 */           PFetcher.getSettings("db.port") + 
/* 20 */           "/" + 
/* 21 */           PFetcher.getSettings("db.name") + 
/* 22 */           "?useSSL=False", PFetcher.getSettings("db.uname"), PFetcher.getSettings("db.passwd"));
/* 23 */       return con;
/* 24 */     } catch (SQLException e) {
/*    */       
/* 26 */       System.out.println("[ERROR] : " + e);
/*    */       
/* 28 */       if (e.toString().contains("The driver has not received any packets from the server.")) {
/* 29 */         JOptionPane.showMessageDialog(null, "The server is refusing connections, Please\n Make sure: \n\t - The server is up and running\n\t - The port configuration is correct", 
/* 30 */             "Server Error", 0);
/*    */       }
/* 32 */       else if (e.toString().contains("Unknown database")) {
/* 33 */         JOptionPane.showMessageDialog(null, "The database name is incorrect\nCheck the database name and try again", "DATABASE ERROR", 0);
/*    */       } 
/* 35 */       return null;
/* 36 */     } catch (ClassNotFoundException ex) {
/* 37 */       JOptionPane.showMessageDialog(null, "Error due to Connector!!!", "DATABASE ERROR", 0);
/*    */       
/* 39 */       return null;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecodecmain/db.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */