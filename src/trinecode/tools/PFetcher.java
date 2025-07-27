/*    */ package trinecode.tools;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.FileOutputStream;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class PFetcher {
/* 10 */   static Properties properties = new Properties();
/* 11 */   public static File setsFile = new File(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/resources/settings.properties");
/* 12 */   public static File defsFile = new File(String.valueOf(System.getenv("APPDATA")) + "/TrinePOS SYSTEM/resources/defaults.properties");
/*    */   static FileInputStream getSetsFile;
/*    */   static FileInputStream getDefsFile;
/*    */   static FileOutputStream setSetsFile;
/*    */   static FileOutputStream setDefsFile;
/*    */   
/*    */   public static void main(String[] args) throws IOException {
/* 19 */     System.out.println("[STARTING]");
/* 20 */     loadSettings();
/* 21 */     loadDefaults();
/* 22 */     setDefaults("firstTime", "false");
/* 23 */     setSettings("ui.bar.text", "DEVELOPMENT IS IN PROGRESS");
/* 24 */     System.out.println("[DONE] ");
/*    */   }
/*    */   public static void setSettings(String key, String value) throws IOException {
/* 27 */     setSetsFile = new FileOutputStream(setsFile);
/* 28 */     properties.setProperty(key, value);
/* 29 */     properties.store(setSetsFile, (String)null);
/*    */   }
/*    */   
/*    */   public static String getSettings(String key) {
/*    */     try {
/* 34 */       InputStream input = new FileInputStream(setsFile);
/* 35 */       properties.load(input);
/* 36 */     } catch (FileNotFoundException e) {
/*    */       
/* 38 */       e.printStackTrace();
/* 39 */     } catch (IOException e) {
/*    */       
/* 41 */       e.printStackTrace();
/*    */     } 
/* 43 */     return properties.getProperty(key);
/*    */   }
/*    */   public static void setDefaults(String key, String value) throws IOException {
/* 46 */     setDefsFile = new FileOutputStream(defsFile);
/* 47 */     properties.setProperty(key, value);
/* 48 */     properties.store(setDefsFile, (String)null);
/*    */   }
/*    */   
/*    */   public static String getDefaults(String key) {
/*    */     try {
/* 53 */       InputStream input = new FileInputStream(defsFile);
/* 54 */       properties.load(input);
/* 55 */     } catch (FileNotFoundException e) {
/*    */       
/* 57 */       e.printStackTrace();
/* 58 */     } catch (IOException e) {
/*    */       
/* 60 */       e.printStackTrace();
/*    */     } 
/* 62 */     return properties.getProperty(key);
/*    */   }
/*    */   public static void loadSettings() throws IOException {
/* 65 */     getSetsFile = new FileInputStream(setsFile);
/* 66 */     properties.load(getSetsFile);
/*    */   }
/*    */   public static void loadDefaults() throws IOException {
/* 69 */     getDefsFile = new FileInputStream(defsFile);
/* 70 */     properties.load(getDefsFile);
/*    */   }
/*    */ }


/* Location:              /home/trine/Projects/TrinePOS-main/TrinePOS.jar!/trinecode/tools/PFetcher.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */