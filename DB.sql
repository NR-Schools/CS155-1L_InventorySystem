USE sql6589200;

-- Create Auth Table: 12345; Will only have 1 row because of single user
CREATE TABLE AuthTable (
	Username VARCHAR(50) NOT NULL UNIQUE,
	HashedPassword VARCHAR(100) NOT NULL
);

-- Place Default Password: 12345 :::::::838302694ec6710e2873daacbec8c3ed
INSERT INTO AuthTable VALUES ('Admin', '838302694ec6710e2873daacbec8c3ed');
SELECT * FROM AuthTable WHERE Username="Admin";
SELECT * FROM AuthTable;

DROP TABLE AuthTable;


-- Create Livestock Table
CREATE TABLE Livestock (
	Livestock_ID INT PRIMARY KEY AUTO_INCREMENT,
    Livestock_Feeds INT,
    Livestock_Water FLOAT,
    Livestock_Harvest INT,
    Livestock_Welfare INT
);

DROP TABLE Livestock;


SELECT * FROM Livestock;