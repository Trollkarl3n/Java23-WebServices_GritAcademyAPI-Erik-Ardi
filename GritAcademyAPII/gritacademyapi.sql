-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Värd: 127.0.0.1
-- Tid vid skapande: 19 mars 2024 kl 18:07
-- Serverversion: 10.4.32-MariaDB
-- PHP-version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Databas: `gritacademyapi`
--

-- --------------------------------------------------------

--
-- Tabellstruktur `courses`
--

CREATE TABLE `courses` (
  `id` bigint(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `description` text DEFAULT NULL,
  `yhp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumpning av Data i tabell `courses`
--

INSERT INTO `courses` (`id`, `name`, `description`, `yhp`) VALUES
(1, 'Java', 'Skriva Java', 25),
(2, 'HTML', 'Skriva HTML', 30),
(3, 'CSS', 'Skriva CSS', 10),
(4, 'Apex', 'Hoppa på Apex', 50),
(5, 'Mirage', 'Smokes på Mirage', 80);

-- --------------------------------------------------------

--
-- Tabellstruktur `students`
--

CREATE TABLE `students` (
  `id` bigint(20) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `town` varchar(100) NOT NULL,
  `hobby` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumpning av Data i tabell `students`
--

INSERT INTO `students` (`id`, `fname`, `lname`, `email`, `phone`, `username`, `town`, `hobby`) VALUES
(1, 'Ashleigh', 'Reid', 'ashleigh.reid@gmail.com', '1234567a', 'Ash', 'Outlands', 'Mercenary'),
(2, 'August', 'Montgomery', 'augusth.montgomery@gmail.com', '1234567b', 'Ballistic', 'Brinkmen', 'Entrepreneur'),
(3, 'Anita', 'Williams', 'anita.williams@gmail.com', '1234567c', 'Bangalore', 'IMC', 'Soldier'),
(4, 'Rowenna', 'Valentina', 'rowenna.valentina@gmail.com', '1234567d', 'Conduit', 'Nexus', 'Medic'),
(5, 'Makoa', 'Gibraltar', 'makoa.gibraltar@gmail.com', '1234567e', 'Gibraltar', 'Outlands', 'Volunteer'),
(6, 'Natalie', 'Paquette', 'natalie.paquette@gmail.com', '1234567f', 'Wattson', 'Brinkmen', 'Scientist'),
(7, 'Xiomara', 'Contreras', 'xiomara.contreras@gmail.com', '1234567g', 'Vantage', 'Pagos', 'Survivalist'),
(8, 'Obi', 'Edolasim', 'obi.edolasim@gmail.com', '1234567h', 'Seer', 'Outlands', 'Anbush Expert'),
(9, 'Ramya', 'Parekh', 'ramya.parekh@gmail.com', '1234567i', 'Rampart', 'Outlands', 'Modder'),
(10, 'Octavio', 'Silva', 'octavio.silva@gmail.com', '1234567j', 'Octane', 'IMC', 'Daredevil');

-- --------------------------------------------------------

--
-- Tabellstruktur `student_courses`
--

CREATE TABLE `student_courses` (
  `id` bigint(20) NOT NULL,
  `student_id` bigint(20) NOT NULL,
  `course_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumpning av Data i tabell `student_courses`
--

INSERT INTO `student_courses` (`id`, `student_id`, `course_id`) VALUES
(1, 1, 1),
(2, 9, 2),
(3, 6, 1),
(4, 7, 3),
(5, 3, 1),
(6, 4, 3),
(7, 5, 1),
(8, 6, 2),
(9, 2, 4),
(10, 10, 5);

--
-- Index för dumpade tabeller
--

--
-- Index för tabell `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`id`);

--
-- Index för tabell `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Index för tabell `student_courses`
--
ALTER TABLE `student_courses`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT för dumpade tabeller
--

--
-- AUTO_INCREMENT för tabell `courses`
--
ALTER TABLE `courses`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT för tabell `students`
--
ALTER TABLE `students`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT för tabell `student_courses`
--
ALTER TABLE `student_courses`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
