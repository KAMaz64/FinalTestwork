USE `humanfriends`; 
 CREATE TABLE IF NOT EXISTS `YoungAnimals` (
 `ID` INT AUTO_INCREMENT PRIMARY KEY,
 `AnimalID` INT,
 `AnimalType` VARCHAR(50),
 `Name` VARCHAR(255),
 `DateOfBirth` DATE,
 `Commands` VARCHAR(255),
 `AgeDescription` VARCHAR(50),
 FOREIGN KEY (`AnimalID`) REFERENCES `allanimals`(`ID`)
 );
INSERT INTO `YoungAnimals` (`AnimalID`, `AnimalType`, `Name`, `DateOfBirth`, `Commands`, `AgeDescription`)
    SELECT
     `ID`,
CASE
   WHEN `ID` IN (1, 2, 3, 4, 5, 6, 7, 8, 9, 10) THEN 'Pet'
   WHEN `ID` IN (11, 12, 13, 14, 15, 16, 17, 18) THEN 'PackAnimal'
   END AS `AnimalType`,
    `Name`,
    `DateOfBirth`,
    `Commands`,
    CONCAT(
    TIMESTAMPDIFF(YEAR, `DateOfBirth`, '2023-12-17'),
    ' years ',
    TIMESTAMPDIFF(MONTH, `DateOfBirth`, '2023-12-17') % 12,
    ' months'
    ) AS `AgeDescription`
    FROM `allanimals`
    WHERE TIMESTAMPDIFF(YEAR, `DateOfBirth`, '2023-12-17') BETWEEN 1 AND 3;