CREATE TABLE Addresses (
    ID INT NOT NULL AUTO_INCREMENT,
    Line1 VARCHAR(255),
    Line2 VARCHAR(255),
    City VARCHAR(255),
    State INT NOT NULL,
    Zipcode VARCHAR(255),
    Latitude FLOAT,
    Longitude FLOAT,
    CreatedUtc DATETIME DEFAULT CURRENT_TIMESTAMP,
    ChangedUtc DATETIME NULL ON UPDATE CURRENT_TIMESTAMP,

    PRIMARY KEY(ID)
);
