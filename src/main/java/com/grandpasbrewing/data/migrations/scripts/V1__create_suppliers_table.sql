CREATE TABLE Addresses (
    ID INT NOT NULL AUTO_INCREMENT,
    Line1 VARCHAR(255),
    Line2 VARCHAR(255),
    City VARCHAR(255),
    State INT NOT NULL,
    Zipcode VARCHAR(255),
    Latitude FLOAT,
    Longitude FLOAT,
    CreatedUtc DATE NOT NULL,
    ChangedUtc DATE,

    PRIMARY KEY(ID)
);

CREATE TABLE Suppliers
    ID INT NOT NULL AUTO_INCREMENT,
    Name VARCHAR(128) NOT NULL,
    Url VARCHAR(255),
    Username VARCHAR(255),
    Email VARCHAR(255),
    Phone VARCHAR(255),
    Fax VARCHAR(255,
    Contact VARCHAR(255),
    CustomerNumber VARCHAR(255),
    CreatedUtc DATE NOT NULL,
    ChangedUtc DATE,
    MailingAddressId INT,

    PRIMARY KEY(ID),
    INDEX (MailingAddressId),
    INDEX (Name),

    FOREIGN KEY (MailingAddressId)
        REFERENCES Addresses(ID)
);

