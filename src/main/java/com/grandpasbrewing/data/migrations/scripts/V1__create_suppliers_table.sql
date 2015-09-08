
CREATE TABLE Suppliers (
    ID INT NOT NULL AUTO_INCREMENT,
    Name VARCHAR(128) NOT NULL,
    Url VARCHAR(255),
    Username VARCHAR(255),
    Email VARCHAR(255),
    Phone VARCHAR(255),
    Fax VARCHAR(255),
    Contact VARCHAR(255),
    CustomerNumber VARCHAR(255),
    CreatedUtc DATETIME DEFAULT CURRENT_TIMESTAMP,
    ChangedUtc DATETIME NULL ON UPDATE CURRENT_TIMESTAMP,
    MailingAddressId INT,

    PRIMARY KEY(ID),
    INDEX (MailingAddressId),
    INDEX (Name),

    FOREIGN KEY (MailingAddressId)
        REFERENCES Addresses(ID)
);

