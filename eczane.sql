-- --------------------------------------------------------
-- Sunucu:                       127.0.0.1
-- Sunucu sürümü:                10.4.13-MariaDB - mariadb.org binary distribution
-- Sunucu İşletim Sistemi:       Win64
-- HeidiSQL Sürüm:               11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- eczane için veritabanı yapısı dökülüyor
CREATE DATABASE IF NOT EXISTS `eczane` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `eczane`;

-- tablo yapısı dökülüyor eczane.hasta_bilgileri
CREATE TABLE IF NOT EXISTS `hasta_bilgileri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tc_kimlik` int(11) DEFAULT NULL,
  `adi_soyadi` varchar(50) NOT NULL,
  `guvence` varchar(50) NOT NULL,
  `adres` varchar(255) NOT NULL,
  `tel_no` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- eczane.hasta_bilgileri: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `hasta_bilgileri` DISABLE KEYS */;
INSERT INTO `hasta_bilgileri` (`id`, `tc_kimlik`, `adi_soyadi`, `guvence`, `adres`, `tel_no`) VALUES
	(1, 12, 'ayse', 'SSK', 'hjtyurtu', '0534655576');
/*!40000 ALTER TABLE `hasta_bilgileri` ENABLE KEYS */;

-- tablo yapısı dökülüyor eczane.ilac_bilgileri
CREATE TABLE IF NOT EXISTS `ilac_bilgileri` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ilac_adi` varchar(50) DEFAULT NULL,
  `uretici_firma` varchar(50) DEFAULT NULL,
  `kutu_sayisi` int(11) DEFAULT NULL,
  `fiyati` int(11) DEFAULT NULL,
  `kullanim_amaci` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- eczane.ilac_bilgileri: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `ilac_bilgileri` DISABLE KEYS */;
INSERT INTO `ilac_bilgileri` (`id`, `ilac_adi`, `uretici_firma`, `kutu_sayisi`, `fiyati`, `kullanim_amaci`) VALUES
	(1, 'rennie', 'ertweywey', 81, 757, 'tydyt');
/*!40000 ALTER TABLE `ilac_bilgileri` ENABLE KEYS */;

-- tablo yapısı dökülüyor eczane.uyeler
CREATE TABLE IF NOT EXISTS `uyeler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `turu` varchar(50) DEFAULT NULL,
  `kadi` varchar(50) DEFAULT NULL,
  `sifre` varchar(50) DEFAULT NULL,
  `mail` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- eczane.uyeler: ~0 rows (yaklaşık) tablosu için veriler indiriliyor
/*!40000 ALTER TABLE `uyeler` DISABLE KEYS */;
INSERT INTO `uyeler` (`id`, `turu`, `kadi`, `sifre`, `mail`) VALUES
	(1, 'Yönetici', '1234', '1234', '1234'),
	(2, 'Personel', '12', '12', '12');
/*!40000 ALTER TABLE `uyeler` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
