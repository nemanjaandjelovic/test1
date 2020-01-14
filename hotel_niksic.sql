-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 11:43 AM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel_niksic`
--

-- --------------------------------------------------------

--
-- Table structure for table `brojkreveta`
--

CREATE TABLE `brojkreveta` (
  `brojKrevetaID` int(11) NOT NULL,
  `nazivBrojaKreveta` varchar(100) NOT NULL,
  `brojKreveta` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `brojkreveta`
--

INSERT INTO `brojkreveta` (`brojKrevetaID`, `nazivBrojaKreveta`, `brojKreveta`) VALUES
(1, 'jednokrevetna', 1),
(2, 'dvokrevetna', 2),
(3, 'trokrevetna', 3),
(4, 'cetvorokrevetna', 4),
(5, 'petokrevetna', 5);

-- --------------------------------------------------------

--
-- Table structure for table `klijenti`
--

CREATE TABLE `klijenti` (
  `klijentiID` int(11) NOT NULL,
  `ime` varchar(50) NOT NULL,
  `prezime` varchar(50) NOT NULL,
  `adresa` varchar(50) NOT NULL,
  `brojTelefona` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `klijenti`
--

INSERT INTO `klijenti` (`klijentiID`, `ime`, `prezime`, `adresa`, `brojTelefona`, `email`) VALUES
(1, 'Petar', 'Peric', 'kozaracka', '066534434', 'marko@gmail.com'),
(2, 'Stefan', 'Petro', 'Strazilovacka', '065534123', 'stefan@gmail.com'),
(3, 'Nemanja', 'Ilic', 'Novoseljanska', '066643123', 'nemanja@gmail.com'),
(4, 'Marija', 'Milanovic', 'Sarajevska', '0633234', 'marija@gmail.com'),
(5, 'Dragan', 'Peric', 'Beogradska', '011231531', 'dragan@gmail.com'),
(6, 'Milica', 'Milic', 'Kozaracka', '0334123123', 'milica@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `naplaceno`
--

CREATE TABLE `naplaceno` (
  `naplacenoID` int(11) NOT NULL,
  `rezervacijeID` int(100) NOT NULL,
  `ukupnoNaplaceno` int(100) NOT NULL,
  `datumNaplate` date NOT NULL,
  `napomena` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `naplaceno`
--

INSERT INTO `naplaceno` (`naplacenoID`, `rezervacijeID`, `ukupnoNaplaceno`, `datumNaplate`, `napomena`) VALUES
(1, 1, 1050, '2020-01-03', 'Sve ok');

-- --------------------------------------------------------

--
-- Table structure for table `rezervacije`
--

CREATE TABLE `rezervacije` (
  `rezervacijaID` int(11) NOT NULL,
  `datumOd` date NOT NULL,
  `datumDo` date NOT NULL,
  `klijentiID` int(50) NOT NULL,
  `zeljeniBrojKreveta` int(100) NOT NULL,
  `ukupnaCena` int(100) NOT NULL,
  `sobeID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `rezervacije`
--

INSERT INTO `rezervacije` (`rezervacijaID`, `datumOd`, `datumDo`, `klijentiID`, `zeljeniBrojKreveta`, `ukupnaCena`, `sobeID`) VALUES
(1, '2020-01-03', '2020-01-10', 1, 3, 1050, 1);

-- --------------------------------------------------------

--
-- Table structure for table `sobe`
--

CREATE TABLE `sobe` (
  `sobeID` int(11) NOT NULL,
  `nazivSobe` varchar(100) NOT NULL,
  `brojKrevetaID` int(50) NOT NULL,
  `sobeTipoviID` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sobe`
--

INSERT INTO `sobe` (`sobeID`, `nazivSobe`, `brojKrevetaID`, `sobeTipoviID`) VALUES
(1, 'kleopatra', 3, 3),
(2, 'cezar', 5, 2),
(3, 'leonida', 1, 1),
(4, 'aleksandar', 4, 4);

-- --------------------------------------------------------

--
-- Table structure for table `sobetipovi`
--

CREATE TABLE `sobetipovi` (
  `sobeTipoviID` int(11) NOT NULL,
  `nazivTipovaSobe` varchar(100) NOT NULL,
  `cena` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sobetipovi`
--

INSERT INTO `sobetipovi` (`sobeTipoviID`, `nazivTipovaSobe`, `cena`) VALUES
(1, 'standard', 30),
(2, 'standard sa terasom', 40),
(3, 'exclusive', 50),
(4, 'exclusive sa terasom', 60),
(5, 'president', 100),
(8, 'Faraon', 35);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `brojkreveta`
--
ALTER TABLE `brojkreveta`
  ADD PRIMARY KEY (`brojKrevetaID`);

--
-- Indexes for table `klijenti`
--
ALTER TABLE `klijenti`
  ADD PRIMARY KEY (`klijentiID`);

--
-- Indexes for table `naplaceno`
--
ALTER TABLE `naplaceno`
  ADD PRIMARY KEY (`naplacenoID`);

--
-- Indexes for table `rezervacije`
--
ALTER TABLE `rezervacije`
  ADD PRIMARY KEY (`rezervacijaID`);

--
-- Indexes for table `sobe`
--
ALTER TABLE `sobe`
  ADD PRIMARY KEY (`sobeID`);

--
-- Indexes for table `sobetipovi`
--
ALTER TABLE `sobetipovi`
  ADD PRIMARY KEY (`sobeTipoviID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `brojkreveta`
--
ALTER TABLE `brojkreveta`
  MODIFY `brojKrevetaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `klijenti`
--
ALTER TABLE `klijenti`
  MODIFY `klijentiID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `naplaceno`
--
ALTER TABLE `naplaceno`
  MODIFY `naplacenoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `rezervacije`
--
ALTER TABLE `rezervacije`
  MODIFY `rezervacijaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `sobe`
--
ALTER TABLE `sobe`
  MODIFY `sobeID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `sobetipovi`
--
ALTER TABLE `sobetipovi`
  MODIFY `sobeTipoviID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
