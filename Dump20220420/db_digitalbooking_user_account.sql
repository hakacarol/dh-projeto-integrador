CREATE DATABASE  IF NOT EXISTS `db_digitalbooking` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_digitalbooking`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: pit1g1.cy6nd2qhdavj.sa-east-1.rds.amazonaws.com    Database: db_digitalbooking
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--

SET @@GLOBAL.GTID_PURGED=/*!80000 '+'*/ '';

--
-- Table structure for table `user_account`
--

DROP TABLE IF EXISTS `user_account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_account` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_account`
--

LOCK TABLES `user_account` WRITE;
/*!40000 ALTER TABLE `user_account` DISABLE KEYS */;
INSERT INTO `user_account` VALUES (1,'helena@gmail.com','Perdigueiro','Helena','$2a$10$H0113gJpvivXIAdugPfXgOMtnPTShDn7VMyC9E7htdNbAvbchGmwO','Helena'),(2,'marcolerio@gmail.com','Vidoti','Marco Aurelio','$2a$10$.wK3YBpD1E6PjhQdR6CL2evgOgdCFdU2AjTKsMKe4Zv7QKAw2GsfS','Marco Aurelio'),(3,'leonardosantino@email.com','Santino','Leonardo','$2a$10$2RciCfIG7gYI9eu3GscEBO5Pmvqhrt9L8Aud/LUV2iFlaog7ALl3K','leonardosantino'),(4,'milkynata@hotmail.com','Leal','Renata','$2a$10$oRrwibcrW8.w2wK.mLIOIeX95BhIfwtL3bVoZmqKROhr7Tl8NOyQ6','Renata'),(6,'petu@email.com','Fharew','Petúnia','$2a$10$BpAgRs7q.C72OPOWH2Vd9ux1SyzhAe375wTN6HGdHfopNVDxiocS2','Petúnia'),(21,'flavia@gmail.com','Russo','Flavia','$2a$10$Co7m7x/VSlkbXRNHtX488.cuMSN8KHwKz7fILobr61IJNQsuTxLTC','Flavia'),(22,'eliana@gmail.com','Famosa','Eliana','$2a$10$J24.iWE07gtuzsU1iD6ogu.8/D5hLIMx/c8k2sO4nZxVbUoKZ3cVC','Eliana'),(23,'alan@gmail.com','Vitor','Alan','$2a$10$CuaikaG5YF.OVjI0D7Ts7u46NEzBVSRLYARMCDFmmAsXpQbpiOU5K','Alan'),(24,'oliveh@email.com','Houfshr','Olívia','$2a$10$h2uQHfstqk4um6PPr0sTBuFuVVlDCYUp3rxKShX1.WMIGwgGJ0Sga','Olívia'),(25,'ca_haka@gmail.com','Hakamada','Carol','$2a$10$BLRkCMVplExA3VVAVIXYUuAZIOkAYZ9cVCmoWnRY/HjCpbAiF24/2','Carol'),(26,'larissa@gmail.com','Nobre','Larissa','$2a$10$ZsrpjsS6G6KMt5JNFp8T7uwfsSso5LyBHyJlPnt6ZcWiGWIopKBs.','Larissa'),(27,'rafa@gmail.com','Meira','Rafaela','$2a$10$x.konKb9XXIrpsHTsBLggOiVvtNIwK9Vwjrllicf/dN710vRGWwmC','Rafaela'),(28,'caneta@gmail.com','azul caneta','caneta azul','$2a$10$VhcDyzhwMjaDzBZ8GP8UnO/eY7h0Yv5ELPa2m8Su3skt89N.WQKtm','caneta azul'),(29,'ms25022003@gmail.com','Silva','Matheus','$2a$10$dfSlZ6doIzWsPE9R3EsMu.j6a.8eK2nhr3dkdwtbeFrzFT6fGVzda','Matheus'),(30,'zeca@gmail.com','urubu','zeca','$2a$10$pLs9ljN2C6mz0Wun1olVCeq1qFNSOkspB5tmt.QTal9u1yxPtnWXm','zeca'),(31,'van@gmail.com','Eu','Vanessa','$2a$10$hy3OdbY9vEedD6EuS6MXVuINW5UFI13ChEzFrZ6O7iqsNa44gKO0i','Vanessa'),(34,'tarta@gmail.com','Hakamada','Tarta','$2a$10$4rFEY.ftLOXnpXa6aoJUfO6Gi5LLEQYjji7MEUqwMRy.MVArV4iFi','Tarta'),(35,'baleia@gmail.com','Hakamada','Baleia','$2a$10$5idf6Wh3HV/mODI1rcwg2uGHOfOu64/3UKs3YNhRpuq5X3AjNnli6','Baleia'),(36,'hakamora@gmail.com','Hakamada','Amora','$2a$10$7osEK14u9HehNfuYSEgPPOXNHzJs8IhrO1R7f2wMQNb/KcLDg/JOy','Amora'),(37,'helenaarrasou@mtoparabens.com','Glober','Helena','$2a$10$4htY0HApCVgajZrQkEyi3eWWBc7t6kx5AJSc6Xw8DSfRC5QbkqUgO','Helena'),(38,'larissa@gmail.com','Hakamada','Larisa','$2a$10$FLkqJdC7z1bB/peRSAxlXOrB14DUaIBYLnIlGn10v1en6Zka2nRh.','Larisa'),(39,'larissa@gmail.com','Hakamada','Larisa','$2a$10$5OuqCd8JBAeeT4a9B1otGuBZ5MPPDSF4TUQhuz0Cr9UQi.5sdrcTG','Larisa'),(40,'larissa1@gmail.com','Hakamada','Larisa','$2a$10$wluQCUi551OZljmclweTw.mqNpOWn5DuG2Cw81/JqWoYM6ewqzkjC','Larisa'),(41,'juliana@gmail.com','Leal','Juliana','$2a$10$vpKkI4Bx0vcBGw.RFFqRPeHc5B3wdCzXMNXmOzjyoVlmDWIXWHw2C','Juliana');
/*!40000 ALTER TABLE `user_account` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-20  8:30:49
