-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 31-Maio-2018 às 21:28
-- Versão do servidor: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbflowtime`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_achievements`
--

CREATE TABLE `tb_achievements` (
  `CD_ACHIEVEMENT` int(11) NOT NULL,
  `DESC_ACHIEVEMENT` varchar(255) NOT NULL,
  `LV_IMPACT` int(11) NOT NULL,
  `CD_REFPAPER` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_achievements`
--

INSERT INTO `tb_achievements` (`CD_ACHIEVEMENT`, `DESC_ACHIEVEMENT`, `LV_IMPACT`, `CD_REFPAPER`) VALUES
(1, 'Criação dos AGs', 5, 1),
(2, 'Padronização dos operadores antigos', 4, 1),
(3, 'Nova Técnica evolutiva para problemas de otimização', 5, 2),
(4, 'Nova meta-heurística', 5, 3),
(5, 'Algoritmo Evolutivo Multi Objetive', 5, 4),
(6, 'Algoritmo Evolutivo Manny Objetive', 5, 5),
(7, 'Combinações Híbridas de Algoritmos Evolutivos', 5, 6),
(8, 'IA aplicado em cenários verdes', 5, 7),
(9, 'Taxonomia de Técnicas Evolutivas', 3, 8),
(10, 'Aplicação de ACs em jogos inteligentes', 5, 9),
(11, 'Expansão do uso das redes neurais', 5, 10);

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_article`
--

CREATE TABLE `tb_article` (
  `CD_ARTICLE` int(11) NOT NULL,
  `DT_DATE` date DEFAULT NULL,
  `COD_DOI` varchar(100) DEFAULT NULL,
  `NM_PUBLISHER` varchar(100) NOT NULL,
  `TL_ARTICLE` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_article`
--

INSERT INTO `tb_article` (`CD_ARTICLE`, `DT_DATE`, `COD_DOI`, `NM_PUBLISHER`, `TL_ARTICLE`) VALUES
(1, '0000-00-00', 'NOT DOI', 'ELSEVIER', 'Genetic Algorithm'),
(2, '0000-00-00', 'NOT DOI', 'IEEE', 'Ant Colony'),
(3, '0000-00-00', 'NOT DOI', 'ELSEVIER', 'PSO'),
(4, '0000-00-00', 'NOT DOI', 'IEEE', 'NSGA II'),
(5, '0000-00-00', 'NOT DOI', 'IEEE', 'NSGA III'),
(6, '0000-00-00', 'NOT DOI', 'ACM', 'Memetic Techniques'),
(7, '0000-00-00', 'NOT DOI', 'ACM', 'Energy aware Survey'),
(8, '0000-00-00', 'NOT DOI', 'ELSEVIER', 'Evolutionary Techines Survey'),
(9, '0000-00-00', 'NOT DOI', 'ELSEVIER', 'Cellular Automata'),
(10, '0000-00-00', 'NOT DOI', 'ACM', 'Deep Learning');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_researcher`
--

CREATE TABLE `tb_researcher` (
  `CD_RESEARCHER` int(11) NOT NULL,
  `NM_INST` varchar(100) NOT NULL,
  `RS_NAME` varchar(200) NOT NULL,
  `NM_NACIONAL` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_researcher`
--

INSERT INTO `tb_researcher` (`CD_RESEARCHER`, `NM_INST`, `RS_NAME`, `NM_NACIONAL`) VALUES
(1, 'AVALANCHE', 'Cloud Strife', 'Nibelheim'),
(2, 'AVALANCHE', 'Barret Wallace', 'Corel Mines'),
(3, 'AVALANCHE', 'Tifa Lockhart', 'Midgar'),
(4, 'CRYSTAL ORTHODOXY', 'Agnes Oblige', 'Anchein'),
(5, 'CALDISLA', 'Tiz Warrior', 'Norende'),
(6, 'BAAL', 'Magnolia Arch', 'Moon'),
(7, 'DUTCHY', 'Alternis Din', 'Florem'),
(8, 'SHEIKAH', 'Zelda of Hyrule', 'Hyrule'),
(9, 'SHINRA', 'Sephiroth', 'Nibelheim'),
(10, 'DUTCHY', 'Edea Lee', 'Eternia');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_researcher_papers`
--

CREATE TABLE `tb_researcher_papers` (
  `CD_RESEARCHER` int(11) NOT NULL,
  `CD_ARTICLE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tb_researcher_papers`
--

INSERT INTO `tb_researcher_papers` (`CD_RESEARCHER`, `CD_ARTICLE`) VALUES
(1, 1),
(2, 1),
(3, 2),
(4, 3),
(5, 4),
(6, 5),
(7, 6),
(8, 7),
(9, 8),
(10, 9),
(10, 10);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_achievements`
--
ALTER TABLE `tb_achievements`
  ADD PRIMARY KEY (`CD_ACHIEVEMENT`),
  ADD KEY `FKlu4fri0u0j1ueh2f5dgamghee` (`CD_REFPAPER`);

--
-- Indexes for table `tb_article`
--
ALTER TABLE `tb_article`
  ADD PRIMARY KEY (`CD_ARTICLE`);

--
-- Indexes for table `tb_researcher`
--
ALTER TABLE `tb_researcher`
  ADD PRIMARY KEY (`CD_RESEARCHER`);

--
-- Indexes for table `tb_researcher_papers`
--
ALTER TABLE `tb_researcher_papers`
  ADD KEY `FK35yyskd5ejeil35tf8ylt85hd` (`CD_ARTICLE`),
  ADD KEY `FKgv7erwycypvnwuxituu83fl9c` (`CD_RESEARCHER`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_achievements`
--
ALTER TABLE `tb_achievements`
  MODIFY `CD_ACHIEVEMENT` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tb_article`
--
ALTER TABLE `tb_article`
  MODIFY `CD_ARTICLE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `tb_researcher`
--
ALTER TABLE `tb_researcher`
  MODIFY `CD_RESEARCHER` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tb_achievements`
--
ALTER TABLE `tb_achievements`
  ADD CONSTRAINT `FKlu4fri0u0j1ueh2f5dgamghee` FOREIGN KEY (`CD_REFPAPER`) REFERENCES `tb_article` (`CD_ARTICLE`);

--
-- Limitadores para a tabela `tb_researcher_papers`
--
ALTER TABLE `tb_researcher_papers`
  ADD CONSTRAINT `FK35yyskd5ejeil35tf8ylt85hd` FOREIGN KEY (`CD_ARTICLE`) REFERENCES `tb_researcher` (`CD_RESEARCHER`),
  ADD CONSTRAINT `FKgv7erwycypvnwuxituu83fl9c` FOREIGN KEY (`CD_RESEARCHER`) REFERENCES `tb_researcher` (`CD_RESEARCHER`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
