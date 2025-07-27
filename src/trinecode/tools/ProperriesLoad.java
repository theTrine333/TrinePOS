/*    */ package trinecode.tools;
/*    */ import java.io.FileReader;
/*    */ import java.io.IOException;
/*    */ import java.util.Properties;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class ProperriesLoad {
/*    */   public static void main(String[] args) throws IOException {
/*  9 */     FileReader reader = new FileReader((new File("src/resources/settings.properties")).getAbsolutePath());
/* 10 */     Properties properties = new Properties();
/* 11 */     properties.load(reader);
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
/* 26 */     Set<String> propertiesNames = properties.stringPropertyNames();
/* 27 */     for (String propertyName : propertiesNames)
/* 28 */       System.out.println("[PROPERTY FOUND] : " + propertyName); 
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/ProperriesLoad.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */