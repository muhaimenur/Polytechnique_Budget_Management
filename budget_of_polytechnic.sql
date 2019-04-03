-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 03, 2019 at 08:39 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `budget_of_polytechnic`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`Username`, `Password`) VALUES
('lrcient@gmail.com', '12345'),
('tanmoy.cse90@gmail.com', '109628111437');

-- --------------------------------------------------------

--
-- Table structure for table `app`
--

CREATE TABLE IF NOT EXISTS `app` (
  `Procurement_methods` varchar(11) NOT NULL,
  `budget` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `app`
--

INSERT INTO `app` (`Procurement_methods`, `budget`) VALUES
('DP', 814598),
('Others', 49665623),
('OTM', 12252221),
('RFQ', 814007);

-- --------------------------------------------------------

--
-- Table structure for table `budgettable`
--

CREATE TABLE IF NOT EXISTS `budgettable` (
  `CODE` int(11) NOT NULL,
  `PROCUREMENT_PACKAGE` varchar(250) NOT NULL,
  `PROCUREMENT_METHOD` varchar(250) NOT NULL,
  `GROUPS` varchar(250) NOT NULL,
  `GROUP_CODE` int(11) NOT NULL,
  `DATE` date DEFAULT NULL,
  `BUDGET` int(20) NOT NULL,
  `Revised_budgets` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `budgettable`
--

INSERT INTO `budgettable` (`CODE`, `PROCUREMENT_PACKAGE`, `PROCUREMENT_METHOD`, `GROUPS`, `GROUP_CODE`, `DATE`, `BUDGET`, `Revised_budgets`) VALUES
(3111101, 'Office salary', 'OTM', 'Cash wage & salary', 3111, '2019-01-27', 1563025, 0),
(3111201, 'Employee salary', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 151, 0),
(3111301, 'Responsibility duty allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 95565, 0),
(3111302, 'Transportation allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 6656, 0),
(3111306, 'Educational allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 662, 0),
(3111309, 'Hill allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 626556, 0),
(3111310, 'House rent allowance', 'Others', 'Cash wage & salary', 3111, '2019-01-27', 959564, 0),
(3111311, 'Medical allowance', 'OTM', 'Cash wage & salary', 3111, '2019-01-27', 6262, 0),
(3111314, 'Tiffin allowance', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 4444, 0),
(3111316, 'Bleaching allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 5654, 0),
(3111325, 'Festival allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 5654, 0),
(3111327, 'Overtime allowance', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 48984, 0),
(3111328, 'Wax entertainment allowance', 'Others', 'Cash wage & salary', 3111, '2019-01-27', 1651651, 0),
(3111332, 'Honorarium', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 8464, 0),
(3111335, 'Bengali new year allowance', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 54654, 0),
(3111338, 'Other allowance', 'Others', 'Cash wage & salary', 3111, '2019-01-27', 1651, 0),
(3211102, 'Clear appetite', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 846468, 0),
(3211106, 'Reception expenditure', 'DP', 'Administrative expenditure', 3211, '2019-01-27', 165061, 0),
(3211107, 'Hiring charge', 'DP', 'Administrative expenditure', 3211, '2019-01-27', 8250, 0),
(3211110, 'The cost of the law', 'OTM', 'Administrative expenditure', 3211, '2019-01-27', 15612, 0),
(3211113, 'Electricity', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 8468465, 0),
(3211115, 'Water', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 564654, 0),
(3211117, 'Internet/Fax/Telex', 'DP', 'Administrative expenditure', 3211, '2019-01-27', 1651, 0),
(3211119, 'Postal', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 4654, 0),
(3211120, 'Telephone', 'OTM', 'Administrative expenditure', 3211, '2019-01-27', 54564, 0),
(3211125, 'Promotion and advertising expences', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 54654, 0),
(3211127, 'Books and magazine', 'RFQ', 'Administrative expenditure', 3211, '2019-01-27', 654654, 0),
(3221104, 'Registration fee', 'DP', 'Fee charge and commission', 3221, '2019-01-27', 54654, 0),
(3231301, 'Training', 'Others', 'Training', 3231, '2019-01-27', 54654, 0),
(3243101, 'petrol oil and lubricant', 'OTM', 'Petrol oil and lubricant', 3243, '2019-01-27', 56465, 0),
(3243102, 'Gas and fuel', 'Others', 'Petrol oil and lubricant', 3243, '2019-01-27', 4565, 0),
(3244101, 'Travel expense', 'Others', 'Travel and transfer', 3244, '2019-01-27', 54654, 0),
(3255101, 'Computer accessories', 'OTM', 'Printing and monihari', 3255, '2019-01-27', 11651, 0),
(3255105, 'Other monihari', 'Others', 'Printing and monihari', 3255, '2019-01-27', 11650, 0),
(3256102, 'Chemicals', 'Others', 'General supplies and raw materials', 3256, '2019-01-27', 5646540, 0),
(3256105, 'raw materials and spare parts', 'DP', 'General supplies and raw materials', 3256, '2019-01-27', 54650, 0),
(3256106, 'Clothing', 'Others', 'General supplies and raw materials', 3256, '2019-01-27', 546548, 0),
(3256107, 'Sports accessories', 'OTM', 'General supplies and raw materials', 3256, '2019-01-27', 4848645, 0),
(3257206, 'Honorariam without govt. employee', 'Others', 'Professional service honor and spacial expenditure', 3257, '2019-01-27', 465465, 0),
(3257301, 'Festival', 'RFQ', 'Professional service honor and spacial expenditure', 3257, '2019-01-27', 4564, 0),
(3258101, 'Motor vehicles', 'Others', 'Repair and store', 3258, '2019-01-27', 5646548, 0),
(3258102, 'Furniture', 'Others', 'Repair and store', 3258, '2019-01-27', 8454, 0),
(3258103, 'Computer', 'OTM', 'Repair and store', 3258, '2019-01-27', 45465, 0),
(3258104, 'office equipment', 'RFQ', 'Repair and store', 3258, '2019-01-27', 54654, 0),
(3258105, 'Other parts and equipments', 'RFQ', 'Repair and store', 3258, '2019-01-27', 5465, 0),
(3258108, 'Other building and structure', 'RFQ', 'Repair and store', 3258, '2019-01-27', 113, 0),
(3258115, 'Health provision and water supply', 'Others', 'Repair and store', 3258, '2019-01-27', 461321, 0),
(3258119, 'Electrical installation', 'Others', 'Repair and store', 3258, '2019-01-27', 4654, 0),
(3258127, 'Fitting and fixing', 'OTM', 'Repair and store', 3258, '2019-01-27', 1321184, 0),
(3821102, 'Land development tax', 'OTM', 'Recuring tranfers that are not classified elsewhere', 3821, '2019-01-27', 5654654, 0),
(3821103, 'Municipality', 'Others', 'Recuring tranfers that are not classified elsewhere', 3821, '2019-01-27', 16516513, 0),
(3821117, 'Scholarship', 'Others', 'Recuring tranfers that are not classified elsewhere', 3821, '2019-01-27', 54654, 0),
(4112202, 'Computer and accessories', 'Others', 'Equipments and tools', 4112, '2019-01-27', 15165, 0),
(4112304, 'Engineering and other equipment', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 165654, 0),
(4112310, 'Office equipment', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 165165, 0),
(4112312, 'Educational and teaching equipments', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 84641, 0),
(4112314, 'Furniture', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 5646488, 0);

-- --------------------------------------------------------

--
-- Table structure for table `expenditure_table`
--

CREATE TABLE IF NOT EXISTS `expenditure_table` (
`id` int(11) NOT NULL,
  `CODES` int(11) NOT NULL,
  `Procurement_packages` varchar(250) NOT NULL,
  `Procurement_methods` varchar(200) NOT NULL,
  `Groups` varchar(250) NOT NULL,
  `Descriptions` varchar(300) NOT NULL,
  `Date` date NOT NULL,
  `BILL` int(11) NOT NULL,
  `VAT` int(11) NOT NULL,
  `IT` int(11) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expenditure_table`
--

INSERT INTO `expenditure_table` (`id`, `CODES`, `Procurement_packages`, `Procurement_methods`, `Groups`, `Descriptions`, `Date`, `BILL`, `VAT`, `IT`, `Total`) VALUES
(1, 3111314, 'Tiffin allowance', 'DP', 'Cash wage & salary', 'rgesrg', '2019-02-10', 200, 5, 5, 210);

-- --------------------------------------------------------

--
-- Table structure for table `main_db_table`
--

CREATE TABLE IF NOT EXISTS `main_db_table` (
  `CODE` int(11) NOT NULL,
  `PROCUREMENT_PACKAGE` varchar(250) NOT NULL,
  `PROCUREMENT_METHOD` varchar(15) NOT NULL,
  `GROUP` varchar(250) NOT NULL,
  `GROUP_CODE` int(11) NOT NULL,
  `DATE` date NOT NULL,
  `BUDGET` int(11) NOT NULL,
  `Revised_Budget` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `main_db_table`
--

INSERT INTO `main_db_table` (`CODE`, `PROCUREMENT_PACKAGE`, `PROCUREMENT_METHOD`, `GROUP`, `GROUP_CODE`, `DATE`, `BUDGET`, `Revised_Budget`) VALUES
(3111101, 'Office salary', 'OTM', 'Cash wage & salary', 3111, '2019-01-27', 1565165, 0),
(3111201, 'Employee salary', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 151, 0),
(3111301, 'Responsibility duty allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 95565, 0),
(3111302, 'Transportation allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 6656, 0),
(3111306, 'Educational allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 662, 0),
(3111309, 'Hill allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 626556, 0),
(3111310, 'House rent allowance', 'Others', 'Cash wage & salary', 3111, '2019-01-27', 959564, 0),
(3111311, 'Medical allowance', 'OTM', 'Cash wage & salary', 3111, '2019-01-27', 6262, 0),
(3111314, 'Tiffin allowance', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 4654, 0),
(3111316, 'Bleaching allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 5654, 0),
(3111325, 'Festival allowance', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 5654, 0),
(3111327, 'Overtime allowance', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 48984, 0),
(3111328, 'Wax entertainment allowance', 'Others', 'Cash wage & salary', 3111, '2019-01-27', 1651651, 0),
(3111332, 'Honorarium', 'RFQ', 'Cash wage & salary', 3111, '2019-01-27', 8464, 0),
(3111335, 'Bengali new year allowance', 'DP', 'Cash wage & salary', 3111, '2019-01-27', 54654, 0),
(3111338, 'Other allowance', 'Others', 'Cash wage & salary', 3111, '2019-01-27', 1651, 0),
(3211102, 'Clear appetite', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 846468, 0),
(3211106, 'Reception expenditure', 'DP', 'Administrative expenditure', 3211, '2019-01-27', 165165, 0),
(3211107, 'Hiring charge', 'DP', 'Administrative expenditure', 3211, '2019-01-27', 8464, 0),
(3211110, 'The cost of the law', 'OTM', 'Administrative expenditure', 3211, '2019-01-27', 15612, 0),
(3211113, 'Electricity', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 8468465, 0),
(3211115, 'Water', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 564654, 0),
(3211117, 'Internet/Fax/Telex', 'DP', 'Administrative expenditure', 3211, '2019-01-27', 1651, 0),
(3211119, 'Postal', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 4654, 0),
(3211120, 'Telephone', 'OTM', 'Administrative expenditure', 3211, '2019-01-27', 54564, 0),
(3211125, 'Promotion and advertising expences', 'Others', 'Administrative expenditure', 3211, '2019-01-27', 54654, 0),
(3211127, 'Books and magazine', 'RFQ', 'Administrative expenditure', 3211, '2019-01-27', 654654, 0),
(3221104, 'Registration fee', 'DP', 'Fee charge and commission', 3221, '2019-01-27', 54654, 0),
(3231301, 'Training', 'Others', 'Training', 3231, '2019-01-27', 54654, 0),
(3243101, 'petrol oil and lubricant', 'OTM', 'Petrol oil and lubricant', 3243, '2019-01-27', 56465, 0),
(3243102, 'Gas and fuel', 'Others', 'Petrol oil and lubricant', 3243, '2019-01-27', 4565, 0),
(3244101, 'Travel expense', 'Others', 'Travel and transfer', 3244, '2019-01-27', 54654, 0),
(3255101, 'Computer accessories', 'OTM', 'Printing and monihari', 3255, '2019-01-27', 11651, 0),
(3255105, 'Other monihari', 'Others', 'Printing and monihari', 3255, '2019-01-27', 11650, 0),
(3256102, 'Chemicals', 'Others', 'General supplies and raw materials', 3256, '2019-01-27', 5646540, 0),
(3256105, 'raw materials and spare parts', 'DP', 'General supplies and raw materials', 3256, '2019-01-27', 54650, 0),
(3256106, 'Clothing', 'Others', 'General supplies and raw materials', 3256, '2019-01-27', 546548, 0),
(3256107, 'Sports accessories', 'OTM', 'General supplies and raw materials', 3256, '2019-01-27', 4848645, 0),
(3257206, 'Honorariam without govt. employee', 'Others', 'Professional service honor and spacial expenditure', 3257, '2019-01-27', 465465, 0),
(3257301, 'Festival', 'RFQ', 'Professional service honor and spacial expenditure', 3257, '2019-01-27', 4564, 0),
(3258101, 'Motor vehicles', 'Others', 'Repair and store', 3258, '2019-01-27', 5646548, 0),
(3258102, 'Furniture', 'Others', 'Repair and store', 3258, '2019-01-27', 8454, 0),
(3258103, 'Computer', 'OTM', 'Repair and store', 3258, '2019-01-27', 45465, 0),
(3258104, 'office equipment', 'RFQ', 'Repair and store', 3258, '2019-01-27', 54654, 0),
(3258105, 'Other parts and equipments', 'RFQ', 'Repair and store', 3258, '2019-01-27', 5465, 0),
(3258108, 'Other building and structure', 'RFQ', 'Repair and store', 3258, '2019-01-27', 113, 0),
(3258115, 'Health provision and water supply', 'Others', 'Repair and store', 3258, '2019-01-27', 461321, 0),
(3258119, 'Electrical installation', 'Others', 'Repair and store', 3258, '2019-01-27', 4654, 0),
(3258127, 'Fitting and fixing', 'OTM', 'Repair and store', 3258, '2019-01-27', 1321184, 0),
(3821102, 'Land development tax', 'OTM', 'Recuring tranfers that are not classified elsewhere', 3821, '2019-01-27', 5654654, 0),
(3821103, 'Municipality', 'Others', 'Recuring tranfers that are not classified elsewhere', 3821, '2019-01-27', 16516513, 0),
(3821117, 'Scholarship', 'Others', 'Recuring tranfers that are not classified elsewhere', 3821, '2019-01-27', 54654, 0),
(4112202, 'Computer and accessories', 'Others', 'Equipments and tools', 4112, '2019-01-27', 15165, 0),
(4112304, 'Engineering and other equipment', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 165654, 0),
(4112310, 'Office equipment', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 165165, 0),
(4112312, 'Educational and teaching equipments', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 84641, 0),
(4112314, 'Furniture', 'OTM', 'Equipments and tools', 4112, '2019-01-27', 5646488, 0);

-- --------------------------------------------------------

--
-- Table structure for table `non_govt`
--

CREATE TABLE IF NOT EXISTS `non_govt` (
  `Khat` varchar(250) NOT NULL,
  `Total_Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `non_govt`
--

INSERT INTO `non_govt` (`Khat`, `Total_Amount`) VALUES
('Admission application fee', 48),
('Admission/ Re-admission Fee', 290),
('Bicycle garage fee', 244),
('Guardians Day fee', 290),
('Health examination fee', 268),
('ICT fee', 400),
('Identity card', 400),
('Internal Examination Fee', 400),
('Magazine (Yearly)', 400),
('Mark sheet fee', 400),
('Mosque development fee', 400),
('Other/Miscellaneous', 400),
('Pay Out', 400),
('Poor/Welfare fund', 400),
('Red Crescent Fee', 400),
('Registration Fee', 400),
('Regular student cirtificate fee', 400),
('Religious fund', 400),
('Rover Scout', 400),
('Salary (Per semester)', 400),
('Security', 400),
('Security/guard/essential teacher/employee', 400),
('Sports & Culture fee', 400),
('Testimonial fee', 400),
('Transport fee', 400);

-- --------------------------------------------------------

--
-- Table structure for table `non_govt_main`
--

CREATE TABLE IF NOT EXISTS `non_govt_main` (
  `Khat` varchar(250) NOT NULL,
  `Session` varchar(20) NOT NULL,
  `Date` date NOT NULL,
  `Number_Of_Student` int(11) NOT NULL,
  `Taka (Per student)` int(11) NOT NULL,
  `Total_Amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `non_govt_main`
--

INSERT INTO `non_govt_main` (`Khat`, `Session`, `Date`, `Number_Of_Student`, `Taka (Per student)`, `Total_Amount`) VALUES
('Admission/ Re-admission Fee', '2018-19', '2019-02-09', 100, 1, 100),
('Salary (Per semester)', '2018-19', '2019-02-09', 100, 1, 100),
('Security', '2018-19', '2019-02-09', 100, 1, 100),
('Internal Examination Fee', '2018-19', '2019-02-09', 100, 1, 100),
('Magazine (Yearly)', '2018-19', '2019-02-09', 100, 1, 100),
('Religious fund', '2018-19', '2019-02-09', 100, 1, 100),
('Mark sheet fee', '2018-19', '2019-02-09', 100, 1, 100),
('Rover Scout', '2018-19', '2019-02-09', 100, 1, 100),
('Registration Fee', '2018-19', '2019-02-09', 100, 1, 100),
('Health examination fee', '2018-19', '2019-02-09', 100, 1, 100),
('Identity card', '2018-19', '2019-02-09', 100, 1, 100),
('Red Crescent Fee', '2018-19', '2019-02-09', 100, 1, 100),
('Pay Out', '2018-19', '2019-02-09', 100, 1, 100),
('Admission application fee', '2018-19', '2019-02-09', 100, 1, 100),
('Mosque development fee', '2018-19', '2019-02-09', 100, 1, 100),
('Sports & Culture fee', '2018-19', '2019-02-09', 100, 1, 100),
('Testimonial fee', '2018-19', '2019-02-09', 100, 1, 100),
('Regular student cirtificate fee', '2018-19', '2019-02-09', 100, 1, 100),
('Transport fee', '2018-19', '2019-02-09', 100, 1, 100),
('Poor/Welfare fund', '2018-19', '2019-02-09', 100, 1, 100),
('Security/guard/essential teacher/employee', '2018-19', '2019-02-09', 100, 1, 100),
('ICT fee', '2018-19', '2019-02-09', 100, 1, 100),
('Bicycle garage fee', '2018-19', '2019-02-09', 100, 1, 100),
('Guardians Day fee', '2018-19', '2019-02-09', 100, 1, 100),
('Other/Miscellaneous', '2018-19', '2019-02-09', 100, 1, 100),
('Admission/ Re-admission Fee', '2019-20', '2019-08-09', 150, 2, 300),
('Salary (Per semester)', '2019-20', '2019-08-09', 150, 2, 300),
('Security', '2019-20', '2019-08-09', 150, 2, 300),
('Internal Examination Fee', '2019-20', '2019-08-09', 150, 2, 300),
('Magazine (Yearly)', '2019-20', '2019-08-09', 150, 2, 300),
('Religious fund', '2019-20', '2019-08-09', 150, 2, 300),
('Mark sheet fee', '2019-20', '2019-08-09', 150, 2, 300),
('Rover Scout', '2019-20', '2019-08-09', 150, 2, 300),
('Registration Fee', '2019-20', '2019-08-09', 150, 2, 300),
('Health examination fee', '2019-20', '2019-08-09', 150, 2, 300),
('Identity card', '2019-20', '2019-08-09', 150, 2, 300),
('Red Crescent Fee', '2019-20', '2019-08-09', 150, 2, 300),
('Pay Out', '2019-20', '2019-08-09', 150, 2, 300),
('Admission application fee', '2019-20', '2019-08-09', 150, 2, 300),
('Mosque development fee', '2019-20', '2019-08-09', 150, 2, 300),
('Sports & Culture fee', '2019-20', '2019-08-09', 150, 2, 300),
('Testimonial fee', '2019-20', '2019-08-09', 150, 2, 300),
('Regular student cirtificate fee', '2019-20', '2019-08-09', 150, 2, 300),
('Transport fee', '2019-20', '2019-08-09', 150, 2, 300),
('Poor/Welfare fund', '2019-20', '2019-08-09', 150, 2, 300),
('Security/guard/essential teacher/employee', '2019-20', '2019-08-09', 150, 2, 300),
('ICT fee', '2019-20', '2019-08-09', 150, 2, 300),
('Bicycle garage fee', '2019-20', '2019-08-09', 150, 2, 300),
('Guardians Day fee', '2019-20', '2019-08-09', 150, 2, 300),
('Other/Miscellaneous', '2019-20', '2019-08-09', 150, 2, 300);

-- --------------------------------------------------------

--
-- Table structure for table `non_govt_purchase`
--

CREATE TABLE IF NOT EXISTS `non_govt_purchase` (
`ID` int(11) NOT NULL,
  `khat` varchar(250) NOT NULL,
  `session` varchar(20) NOT NULL,
  `date` date NOT NULL,
  `Description` varchar(500) NOT NULL,
  `Bill` int(11) NOT NULL,
  `Vat` int(11) NOT NULL,
  `IT` int(11) NOT NULL,
  `Total_Amount` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `non_govt_purchase`
--

INSERT INTO `non_govt_purchase` (`ID`, `khat`, `session`, `date`, `Description`, `Bill`, `Vat`, `IT`, `Total_Amount`) VALUES
(7, 'Bicycle garage fee', '2019-20', '2019-02-10', 'dfgs', 150, 3, 3, 156),
(9, 'Admission/ Re-admission Fee', '2019-20', '2019-02-11', 'sdfg', 100, 5, 5, 110),
(10, 'Health examination fee', '2018-19', '2019-02-11', 'yytr', 120, 6, 6, 132),
(11, 'Admission application fee', '2019-20', '2019-02-22', 'hgjgf', 10, 0, 0, 10);

-- --------------------------------------------------------

--
-- Table structure for table `password`
--

CREATE TABLE IF NOT EXISTS `password` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `password`
--

INSERT INTO `password` (`Username`, `Password`) VALUES
('tanmoy.cse90@gmail.com', '109628111437'),
('lrcient@gmail.com', '12345'),
('dsafhasdjkfhsadhf@gmail.com', '5165');

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE IF NOT EXISTS `purchase` (
`ID` int(11) NOT NULL,
  `Code` int(11) NOT NULL,
  `Khat` varchar(250) NOT NULL,
  `Method` varchar(200) NOT NULL,
  `Upo_Khat` varchar(250) NOT NULL,
  `Description` varchar(300) NOT NULL,
  `Date` date NOT NULL,
  `Bill` int(11) NOT NULL,
  `Vat` int(11) NOT NULL,
  `IT` int(11) NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`ID`, `Code`, `Khat`, `Method`, `Upo_Khat`, `Description`, `Date`, `Bill`, `Vat`, `IT`, `Total`) VALUES
(1, 3211106, 'Reception expenditure', 'DP', 'Administrative expenditure', 'fsg', '2019-02-10', 100, 2, 2, 104);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `app`
--
ALTER TABLE `app`
 ADD PRIMARY KEY (`Procurement_methods`);

--
-- Indexes for table `budgettable`
--
ALTER TABLE `budgettable`
 ADD PRIMARY KEY (`CODE`);

--
-- Indexes for table `expenditure_table`
--
ALTER TABLE `expenditure_table`
 ADD PRIMARY KEY (`id`);

--
-- Indexes for table `main_db_table`
--
ALTER TABLE `main_db_table`
 ADD PRIMARY KEY (`CODE`);

--
-- Indexes for table `non_govt`
--
ALTER TABLE `non_govt`
 ADD PRIMARY KEY (`Khat`);

--
-- Indexes for table `non_govt_purchase`
--
ALTER TABLE `non_govt_purchase`
 ADD PRIMARY KEY (`ID`), ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
 ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `expenditure_table`
--
ALTER TABLE `expenditure_table`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `non_govt_purchase`
--
ALTER TABLE `non_govt_purchase`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
