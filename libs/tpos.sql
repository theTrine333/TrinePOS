CREATE DATABASE  IF NOT EXISTS `trinepos` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `trinepos`;
-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: trinepos
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cart` (
  `cartid` int(11) NOT NULL AUTO_INCREMENT,
  `INID` int(11) NOT NULL,
  `Product_Name` varchar(50) NOT NULL,
  `qty` varchar(20) NOT NULL,
  `Unit_Price` varchar(20) NOT NULL,
  `Total_Price` varchar(20) NOT NULL,
  PRIMARY KEY (`cartid`)
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (18,10,'Sugar','3','0250','750.0'),(19,11,'Sugar','4','0250','1000.0'),(20,12,'Sugar','3','0250','750.0'),(21,13,'Sugar','17','0250','4250.0'),(22,14,'A4 HardCover','2','170','340.0'),(23,15,'A4 HardCover','5','170','850.0'),(24,16,'A4 HardCover','1','170','170.0'),(25,17,'A4 HardCover','2','170','340.0'),(26,17,'Bata Slippers','1','230','230.0'),(27,18,'A4 HardCover','6','170','1020.0'),(28,19,'Bata Slippers','3','230','690.0'),(29,20,'A4 HardCover','2','170','340.0'),(30,21,'A4 HardCover','1','170','170.0'),(31,22,'Sugar','3','250','750.0'),(32,23,'Sugar','2','250','500.0'),(33,23,'A4 HardCover','2','170','340.0'),(34,23,'Bata Slippers','2','230','460.0'),(35,24,'Sugar','2','250','500.0'),(36,25,'Sugar','2','250','500.0'),(37,26,'Sugar','1','250','250.0'),(38,26,'Bata Slippers','1','230','230.0'),(39,27,'Sugar','6','250','1500.0');
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(50) NOT NULL,
  `Tp_Number` varchar(10) NOT NULL,
  `billing_address` varchar(45) NOT NULL,
  `shipping_address` varchar(45) NOT NULL,
  `bank` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `contact_fname` varchar(45) NOT NULL,
  `contact_lname` varchar(45) NOT NULL,
  `contact_tp` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'test','null','Cash','null','null','null','null','null','null','null');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customers`
--

DROP TABLE IF EXISTS `customers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customers` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(45) NOT NULL,
  `Tp_Number` varchar(45) NOT NULL,
  `billing_address` varchar(45) NOT NULL,
  `shipping_address` varchar(45) NOT NULL,
  `bank` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `person_name` varchar(45) NOT NULL,
  `contact_person` varchar(45) NOT NULL,
  `person_tp` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customers`
--

LOCK TABLES `customers` WRITE;
/*!40000 ALTER TABLE `customers` DISABLE KEYS */;
/*!40000 ALTER TABLE `customers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `defs`
--

DROP TABLE IF EXISTS `defs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `defs` (
  `Logid` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `type` varchar(50) NOT NULL DEFAULT '1',
  PRIMARY KEY (`Logid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `defs`
--

LOCK TABLES `defs` WRITE;
/*!40000 ALTER TABLE `defs` DISABLE KEYS */;
INSERT INTO `defs` VALUES (1,'Trine','Trine','technician'),(2,'User','User','2');
/*!40000 ALTER TABLE `defs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `Employee_Name` varchar(50) NOT NULL,
  `Tp_Number` varchar(10) NOT NULL,
  `mainAddr` varchar(45) DEFAULT NULL,
  `tempAddr` varchar(45) DEFAULT NULL,
  `Bank` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `Fname` varchar(45) DEFAULT NULL,
  `Lname` varchar(45) DEFAULT NULL,
  `conTp` varchar(45) DEFAULT NULL,
  `conEmail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `extra`
--

DROP TABLE IF EXISTS `extra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `extra` (
  `exid` int(11) NOT NULL AUTO_INCREMENT,
  `val` varchar(10) NOT NULL,
  PRIMARY KEY (`exid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `extra`
--

LOCK TABLES `extra` WRITE;
/*!40000 ALTER TABLE `extra` DISABLE KEYS */;
INSERT INTO `extra` VALUES (1,'28');
/*!40000 ALTER TABLE `extra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `Sid` int(11) NOT NULL,
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `Product_Name` varchar(50) NOT NULL,
  `bar_code` varchar(45) DEFAULT NULL,
  `BPrice` varchar(10) NOT NULL,
  `Exp_Date` varchar(11) NOT NULL,
  `Qty` varchar(10) NOT NULL,
  `SPrice` varchar(10) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (41588751,1,'Sugar','31313131','210','2023-6-15','200','250'),(41588751,2,'A4 HardCover','31313333','120','2027-9-29','111','170'),(41588751,3,'Bata Slippers','31313333','180','2027-9-29','113','230'),(41488751,4,'BRAVADO Energy Drink','6164004075267','30','2025-6-3','240','60');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sales`
--

DROP TABLE IF EXISTS `sales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sales` (
  `saleid` int(11) NOT NULL AUTO_INCREMENT,
  `INID` int(11) NOT NULL,
  `Date` date NOT NULL,
  `Customer_Name` varchar(50) NOT NULL,
  `Total_Qty` varchar(10) NOT NULL,
  `Total_Bill` varchar(10) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Balance` varchar(10) NOT NULL,
  `paidAmt` varchar(20) NOT NULL,
  PRIMARY KEY (`saleid`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sales`
--

LOCK TABLES `sales` WRITE;
/*!40000 ALTER TABLE `sales` DISABLE KEYS */;
INSERT INTO `sales` VALUES (100,8,'2023-07-14','select ','1.0','250.0','Paid','50.0','300.0'),(101,9,'2023-07-14','select ','2.0','500.0','Paid','100.0','600.0'),(102,10,'2023-07-14','select ','3.0','750.0','Paid','250.0','1000.0'),(103,11,'2023-07-14','select ','4.0','1000.0','Paid','0.0','1000.0'),(104,12,'2023-07-14','select ','3.0','750.0','Paid','250.0','1000.0'),(105,13,'2023-07-14','select ','17.0','4250.0','Paid','5750.0','10000.0'),(106,14,'2023-07-14','select ','2.0','340.0','Paid','60.0','400.0'),(107,15,'2023-07-14','select ','5.0','850.0','Paid','150.0','1000.0'),(108,16,'2023-07-14','select ','1.0','170.0','Paid','30.0','200.0'),(109,17,'2023-07-15','select ','3.0','570.0','Paid','30.0','600.0'),(110,18,'2023-07-15','select ','6.0','1020.0','Paid','980.0','2000.0'),(111,19,'2023-07-15','select ','3.0','690.0','Paid','10.0','700.0'),(112,20,'2023-07-15','select ','2.0','340.0','Paid','60.0','400.0'),(113,21,'2023-07-15','select ','1.0','170.0','Paid','30.0','200.0'),(114,22,'2023-07-15','select ','3.0','750.0','Paid','250.0','1000.0'),(115,23,'2023-07-16','select ','6.0','1300.0','Paid','100.0','1400.0'),(116,24,'2023-07-16','select ','2.0','500.0','Paid','500.0','1000.0'),(117,25,'2023-07-16','select ','2.0','500.0','Paid','500.0','1000.0'),(118,26,'2023-07-16','select ','2.0','480.0','Paid','120.0','600.0'),(119,27,'2023-07-16','select ','6.0','1500.0','Paid','500.0','2000.0'),(120,28,'2023-07-20','test','0.0','0.0','UnPaid','0.0','0.0');
/*!40000 ALTER TABLE `sales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscription`
--

DROP TABLE IF EXISTS `subscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subscription` (
  `ID` int(11) NOT NULL,
  `Type` text NOT NULL,
  `DataofSub` date NOT NULL DEFAULT current_timestamp(),
  `ExpDate` date NOT NULL,
  `Secrete_Key` varchar(45) NOT NULL,
  `Mpesa_Code` varchar(45) NOT NULL,
  PRIMARY KEY (`Mpesa_Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscription`
--

LOCK TABLES `subscription` WRITE;
/*!40000 ALTER TABLE `subscription` DISABLE KEYS */;
/*!40000 ALTER TABLE `subscription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_Name` varchar(50) NOT NULL,
  `Tp_Number` varchar(10) NOT NULL,
  `billAddr` varchar(45) DEFAULT NULL,
  `shipAddr` varchar(45) DEFAULT NULL,
  `Bank` varchar(45) DEFAULT NULL,
  `City` varchar(45) DEFAULT NULL,
  `Fname` varchar(45) DEFAULT NULL,
  `Lname` varchar(45) DEFAULT NULL,
  `conTp` varchar(45) DEFAULT NULL,
  `conEmail` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblcostumer`
--

DROP TABLE IF EXISTS `tblcostumer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblcostumer` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `fname` varchar(200) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `contact` varchar(50) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcostumer`
--

LOCK TABLES `tblcostumer` WRITE;
/*!40000 ALTER TABLE `tblcostumer` DISABLE KEYS */;
INSERT INTO `tblcostumer` VALUES (1,'Guianne','Olvido','09245056875','Female','Cadiz','07:29:20 PM','29-04-2021','olvido@gmail.com');
/*!40000 ALTER TABLE `tblcostumer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblinvoice`
--

DROP TABLE IF EXISTS `tblinvoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblinvoice` (
  `invoice_id` int(50) NOT NULL AUTO_INCREMENT,
  `user` varchar(50) NOT NULL,
  `costumer` varchar(50) NOT NULL,
  `paid_amount` varchar(50) NOT NULL,
  `status` varchar(50) NOT NULL,
  `balance` varchar(50) NOT NULL,
  `sub_total` varchar(50) NOT NULL,
  `total_quantity` varchar(50) NOT NULL,
  `transaction_no` int(30) NOT NULL,
  `date` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL,
  PRIMARY KEY (`invoice_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblinvoice`
--

LOCK TABLES `tblinvoice` WRITE;
/*!40000 ALTER TABLE `tblinvoice` DISABLE KEYS */;
INSERT INTO `tblinvoice` VALUES (5,'bcopointofsale','Regular Costumer','100','Paid','88.0','12.0','4.0',6,'29-04-2021','07:07:44 PM'),(6,'bcopointofsale','Regular Costumer','1000','Paid','655.0','345.0','23.0',7,'29-04-2021','07:24:25 PM'),(7,'User','Regular Costumer','1000','Paid','765.0','235.0','15.0',8,'29-04-2021','07:34:06 PM'),(8,'glenn','Regular Costumer','1000','Paid','593.00','407.00','22',9,'16-05-2021','07:54:53 AM'),(9,'glenn','Guianne','35','Paid','3.0','32.0','2.0',10,'30-06-2023','05:05:21 PM'),(10,'glenn','Regular Costumer','60','Paid','5.0','55.0','3.0',11,'30-06-2023','05:29:46 PM'),(11,'glenn','Regular Costumer','150','Paid','18.0','132.0','11',12,'05-07-2023','11:55:16 PM');
/*!40000 ALTER TABLE `tblinvoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblnum`
--

DROP TABLE IF EXISTS `tblnum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblnum` (
  `numid` int(11) NOT NULL AUTO_INCREMENT,
  `value` int(30) NOT NULL,
  PRIMARY KEY (`numid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblnum`
--

LOCK TABLES `tblnum` WRITE;
/*!40000 ALTER TABLE `tblnum` DISABLE KEYS */;
INSERT INTO `tblnum` VALUES (1,12);
/*!40000 ALTER TABLE `tblnum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblproduct`
--

DROP TABLE IF EXISTS `tblproduct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblproduct` (
  `prod_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) NOT NULL,
  `bar_code` varchar(50) NOT NULL,
  `price` int(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `mark_up` int(50) NOT NULL,
  `exp_date` varchar(50) NOT NULL,
  `date` varchar(30) NOT NULL,
  `time` varchar(30) NOT NULL,
  PRIMARY KEY (`prod_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblproduct`
--

LOCK TABLES `tblproduct` WRITE;
/*!40000 ALTER TABLE `tblproduct` DISABLE KEYS */;
INSERT INTO `tblproduct` VALUES (1,'Nescafe','877-090',3,'956.0',1,'09-09-2021','18-09-2020','02:58:52 PM'),(2,'Milo','12-11',9,'970.0',3,'12-23-2023','29-04-2021','07:04:19 PM'),(3,'Coke 12oz','1221-1111',15,'998.0',4,'12-23-2023','29-04-2021','07:06:24 PM'),(4,'Silver swan ','12-2222',10,'992.0',4,'12-4-2024','29-04-2021','07:07:21 PM'),(5,'3 $ 1 nescafe ','1211-111',9,'970.0',3,'1-3-2030','29-04-2021','07:10:12 PM'),(6,'Colgate','13-33',10,'999.0',3,'12-2-2030','29-04-2021','07:11:30 PM'),(7,'Coke 1 liter','13-22-222',50,'996.0',10,'22-21-2030','29-04-2021','07:12:28 PM'),(8,'Beer','14-111111',30,'1002.0',8,'12-2-2030','29-04-2021','07:14:32 PM'),(9,'Meat loaf','19-999',23,'994.0',4,'12-9-2030','29-04-2021','07:18:39 PM'),(10,'Beef loaf','15-222222',24,'997',5,'10-9-2023','29-04-2021','07:19:18 PM'),(11,'Corn beef','26-1111',25,'980.0',4,'13-9-2034','29-04-2021','07:20:51 PM'),(12,'Asin','111-1111',5,'1000.0',2,'12-28-2034','29-04-2021','07:21:27 PM'),(13,'Vitsen','122333',3,'992.0',1,'12-09-2074','29-04-2021','07:21:55 PM');
/*!40000 ALTER TABLE `tblproduct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblremove`
--

DROP TABLE IF EXISTS `tblremove`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblremove` (
  `remove_id` int(11) NOT NULL AUTO_INCREMENT,
  `remove_by` varchar(50) NOT NULL,
  `product_id` int(30) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `unit_price` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `time` varchar(30) NOT NULL,
  PRIMARY KEY (`remove_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblremove`
--

LOCK TABLES `tblremove` WRITE;
/*!40000 ALTER TABLE `tblremove` DISABLE KEYS */;
INSERT INTO `tblremove` VALUES (1,'bcopointofsale',1,'Nescafe','4','3','29-04-2021','07:23:59 PM'),(2,'glenn',7,'Coke 1 liter','3','50','14-07-2021','na'),(3,'glenn',2,'Milo','5','9','14-07-2021','na'),(4,'glenn',6,'Colgate','3','10','14-07-2021','na'),(5,'glenn',8,'Beer','4','30','14-07-2021','na'),(6,'glenn',3,'Coke 12oz','3','15','14-07-2021','na'),(7,'glenn',12,'Asin','5','5','14-07-2021','na'),(8,'glenn',5,'3 $ 1 nescafe ','34','9','14-07-2021','na');
/*!40000 ALTER TABLE `tblremove` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblselling`
--

DROP TABLE IF EXISTS `tblselling`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblselling` (
  `selling_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(100) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `quantity` varchar(50) NOT NULL,
  `total_price` varchar(50) NOT NULL,
  `unit_price` varchar(50) NOT NULL,
  `profit` varchar(50) NOT NULL,
  `date` varchar(30) NOT NULL,
  `time` varchar(30) NOT NULL,
  PRIMARY KEY (`selling_id`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblselling`
--

LOCK TABLES `tblselling` WRITE;
/*!40000 ALTER TABLE `tblselling` DISABLE KEYS */;
INSERT INTO `tblselling` VALUES (1,1,'Nescafe','5','15.0','3','5.0','18-09-2020','02:59:04 PM'),(2,1,'Nescafe','5','15.0','3','5.0','18-09-2020','02:59:49 PM'),(3,1,'Nescafe','1','3.0','3','1.0','18-09-2020','03:01:47 PM'),(4,1,'Nescafe','9','27.0','3','9.0','18-09-2020','03:02:30 PM'),(5,1,'Nescafe','8','24.0','3','8.0','29-04-2021','06:35:14 PM'),(6,1,'Nescafe','6','18.0','3','6.0','29-04-2021','06:35:22 PM'),(7,1,'Nescafe','4','12.0','3','4.0','29-04-2021','07:07:33 PM'),(8,11,'Corn beef','6','150.0','25','24.0','29-04-2021','07:22:04 PM'),(9,11,'Corn beef','4','100.0','25','16.0','29-04-2021','07:22:12 PM'),(10,4,'Silver swan ','4','40.0','10','16.0','29-04-2021','07:22:17 PM'),(11,4,'Silver swan ','4','40.0','10','16.0','29-04-2021','07:22:21 PM'),(13,13,'Vitsen','5','15.0','3','5.0','29-04-2021','07:22:30 PM'),(14,11,'Corn beef','5','125.0','25','20.0','29-04-2021','07:33:45 PM'),(15,9,'Meat loaf','4','92.0','23','16.0','29-04-2021','07:33:48 PM'),(16,13,'Vitsen','3','9.0','3','3.0','29-04-2021','07:33:52 PM'),(17,1,'Nescafe','3','9.0','3','3.0','29-04-2021','07:33:55 PM'),(18,7,'Coke 1 liter','4','200.0','50','40.0','16-05-2021','na'),(19,10,'Beef loaf','3','72.0','24','15.0','16-05-2021','na'),(20,2,'Milo','15','135.0','9','45.0','16-05-2021','na'),(26,5,'3 $ 1 nescafe ','10','90.0','9','30.0','14-07-2021','na'),(27,5,'3 $ 1 nescafe ','20','180.0','9','60.0','14-07-2021','na'),(30,11,'Corn beef','4','100.0','25','16.0','27-07-2021','10:52:51 AM'),(31,2,'Milo','3','27.0','9','9.0','27-07-2021','10:52:56 AM'),(32,1,'Nescafe','3','9.0','3','3.0','27-07-2021','10:53:06 AM'),(33,2,'Milo','1','9.0','9','3.0','30-06-2023','05:04:26 PM'),(34,9,'Meat loaf','1','23.0','23','4.0','30-06-2023','05:04:40 PM'),(35,11,'Corn beef','1','25.0','25','4.0','30-06-2023','05:28:41 PM'),(36,3,'Coke 12oz','1','15.0','15','4.0','30-06-2023','05:28:51 PM'),(37,3,'Coke 12oz','1','15.0','15','4.0','30-06-2023','05:28:58 PM'),(38,6,'Colgate','1','10.0','10','3.0','05-07-2023','11:54:09 PM'),(39,9,'Meat loaf','1','23.0','23','4.0','05-07-2023','11:54:20 PM'),(40,2,'Milo','11','99.0','9','33.0','05-07-2023','11:54:47 PM');
/*!40000 ALTER TABLE `tblselling` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-25  8:21:25
