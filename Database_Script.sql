USE sql12593192;

SHOW TABLES;

-- Create Auth Table
-- Default Password is: 12345
-- Will only have 1 row because of single user
CREATE TABLE AuthTable (
	Username VARCHAR(50) NOT NULL UNIQUE,
	HashedPassword VARCHAR(100) NOT NULL
);
DROP TABLE IF EXISTS `AuthTable`;
-- Place Default Password: 12345 :::::: 838302694ec6710e2873daacbec8c3ed
INSERT INTO AuthTable VALUES ('Admin', '838302694ec6710e2873daacbec8c3ed');
SELECT * FROM AuthTable WHERE Username="Admin";
SELECT * FROM AuthTable;



-- Create Feed Table
CREATE TABLE FeedTable (
	Feed_ID INT PRIMARY KEY AUTO_INCREMENT,
    Feed_Amount DOUBLE NOT NULL,
    Feed_Price DOUBLE NOT NULL,
    Feed_TimeStamp TIMESTAMP NOT NULL
);
DROP TABLE IF EXISTS `FeedTable`;
SELECT * FROM FeedTable;
SELECT SUM(Feed_Amount) AS TotalAmount FROM FeedTable;

SELECT SUM(Water_Amount) AS TotalAmount FROM WaterTable;
SELECT COALESCE(AVG(ABS(Feed_Amount)))
	AS AverageAmountPerMonth
    FROM FeedTable
	WHERE FeedTable.Feed_TimeStamp >= DATE_SUB(CURDATE(), INTERVAL 1 MONTH)
    AND FeedTable.Feed_Amount < 0;



-- Create Water Table
CREATE TABLE WaterTable (
	Water_ID INT PRIMARY KEY AUTO_INCREMENT,
    Water_Amount DOUBLE NOT NULL,
    Water_TimeStamp TIMESTAMP NOT NULL
);
DROP TABLE IF EXISTS `WaterTable`;
SELECT * FROM WaterTable;



-- Create Harvest Table
CREATE TABLE HarvestTable (
	Harvest_ID INT PRIMARY KEY AUTO_INCREMENT,
    Harvest_Amount INT NOT NULL,
    Harvest_TimeStamp TIMESTAMP NOT NULL
);
DROP TABLE IF EXISTS `HarvestTable`;
SELECT * FROM HarvestTable;



-- Create Livestock Table [Deprecated]
CREATE TABLE Livestock (
	Livestock_ID INT PRIMARY KEY AUTO_INCREMENT,
    Livestock_Feeds INT,
    Livestock_Water FLOAT,
    Livestock_Harvest INT,
    Livestock_Welfare INT
);
DROP TABLE IF EXISTS `Livestock`;
SELECT * FROM Livestock;