-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema GrandpasBrewing
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema GrandpasBrewing
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `GrandpasBrewing` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `GrandpasBrewing` ;

-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`FermentableTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`FermentableTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`FermentableTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`HopForms`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`HopForms` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`HopForms` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`HopTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`HopTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`HopTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`HopUses`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`HopUses` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`HopUses` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`MashStepTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`MashStepTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`MashStepTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`MiscellaneousItemTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`MiscellaneousItemTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`MiscellaneousItemTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`MiscellaneousItemUses`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`MiscellaneousItemUses` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`MiscellaneousItemUses` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`RatingScores`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`RatingScores` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`RatingScores` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  `Value` DECIMAL(1,2) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`RecipeTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`RecipeTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`RecipeTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`ServiingTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`ServiingTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`ServiingTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`States`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`States` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`States` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Abbreviation` VARCHAR(2) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`StyleTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`StyleTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`StyleTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`YeastFlocculations`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`YeastFlocculations` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`YeastFlocculations` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`YeastForms`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`YeastForms` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`YeastForms` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`YeastTypes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`YeastTypes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`YeastTypes` (
  `ID` INT NOT NULL COMMENT '',
  `Name` VARCHAR(15) NOT NULL COMMENT '',
  `Description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Brewers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Brewers` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Brewers` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Name` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Beers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Beers` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Beers` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Name` VARCHAR(45) NOT NULL COMMENT '',
  `BrewerID` INT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_BrewerID_idx` (`BrewerID` ASC)  COMMENT '',
  CONSTRAINT `FK_BrewerID`
    FOREIGN KEY (`BrewerID`)
    REFERENCES `GrandpasBrewing`.`Brewers` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Reviewers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Reviewers` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Reviewers` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Name` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Addresses`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Addresses` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Addresses` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Line1` VARCHAR(45) NOT NULL COMMENT '',
  `Line2` VARCHAR(45) NULL COMMENT '',
  `City` VARCHAR(45) NULL COMMENT '',
  `State` CHAR(2) NULL COMMENT '',
  `ZipCode` VARCHAR(45) NULL COMMENT '',
  `Latitude` DECIMAL NULL COMMENT '',
  `Longitude` DECIMAL NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Suppliers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Suppliers` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Suppliers` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Name` VARCHAR(45) NOT NULL COMMENT '',
  `Url` VARCHAR(255) NULL COMMENT '',
  `Username` VARCHAR(45) NULL COMMENT '',
  `MailingAddressID` INT NULL COMMENT '',
  `Email` VARCHAR(255) NULL COMMENT '',
  `Phone` VARCHAR(45) NULL COMMENT '',
  `Fax` VARCHAR(45) NULL COMMENT '',
  `Contact` VARCHAR(45) NULL COMMENT '',
  `CustomerNumber` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_Address_idx` (`MailingAddressID` ASC)  COMMENT '',
  CONSTRAINT `FK_Address`
    FOREIGN KEY (`MailingAddressID`)
    REFERENCES `GrandpasBrewing`.`Addresses` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Waters`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Waters` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Waters` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Amount` DECIMAL NOT NULL COMMENT '',
  `Calcium` DECIMAL NULL COMMENT '',
  `Bicarbonate` DECIMAL NULL COMMENT '',
  `Sulfate` DECIMAL NULL COMMENT '',
  `Chloride` DECIMAL NULL COMMENT '',
  `Sodium` DECIMAL NULL COMMENT '',
  `Magnesium` DECIMAL NULL COMMENT '',
  `PH` DECIMAL NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `DisplayAmount` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Ratings`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Ratings` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Ratings` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `BeerID` INT NOT NULL COMMENT '',
  `BatchID` INT NULL COMMENT '',
  `ReviewerID` INT NOT NULL COMMENT '',
  `Date` DATETIME NOT NULL COMMENT '',
  `ServingTypeID` INT NULL COMMENT '',
  `AppearanceRatingScoreID` INT NULL COMMENT '',
  `SmellRatingScoreID` INT NULL COMMENT '',
  `TasteRatingScoreID` INT NULL COMMENT '',
  `MouthfeelRatingScoreID` INT NULL COMMENT '',
  `OverallRatingScoreID` INT NULL COMMENT '',
  `Comments` VARCHAR(1000) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_Beer_idx` (`BeerID` ASC)  COMMENT '',
  INDEX `FK_Reviewer_idx` (`ReviewerID` ASC)  COMMENT '',
  INDEX `FK_ServingType_idx` (`ServingTypeID` ASC)  COMMENT '',
  INDEX `FK_Appearance_RatingScore_idx` (`AppearanceRatingScoreID` ASC)  COMMENT '',
  INDEX `FK_Smell_RatingScore_idx` (`SmellRatingScoreID` ASC)  COMMENT '',
  INDEX `FK_Taste_RatingScore_idx` (`TasteRatingScoreID` ASC)  COMMENT '',
  INDEX `FK_MouthFeel_RatingScore_idx` (`MouthfeelRatingScoreID` ASC)  COMMENT '',
  INDEX `FK_Overall_RatingScore_idx` (`OverallRatingScoreID` ASC)  COMMENT '',
  CONSTRAINT `FK_Beer`
    FOREIGN KEY (`BeerID`)
    REFERENCES `GrandpasBrewing`.`Beers` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Reviewer`
    FOREIGN KEY (`ReviewerID`)
    REFERENCES `GrandpasBrewing`.`Reviewers` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_ServingType`
    FOREIGN KEY (`ServingTypeID`)
    REFERENCES `GrandpasBrewing`.`ServiingTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Appearance_RatingScore`
    FOREIGN KEY (`AppearanceRatingScoreID`)
    REFERENCES `GrandpasBrewing`.`RatingScores` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Smell_RatingScore`
    FOREIGN KEY (`SmellRatingScoreID`)
    REFERENCES `GrandpasBrewing`.`RatingScores` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Taste_RatingScore`
    FOREIGN KEY (`TasteRatingScoreID`)
    REFERENCES `GrandpasBrewing`.`RatingScores` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_MouthFeel_RatingScore`
    FOREIGN KEY (`MouthfeelRatingScoreID`)
    REFERENCES `GrandpasBrewing`.`RatingScores` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Overall_RatingScore`
    FOREIGN KEY (`OverallRatingScoreID`)
    REFERENCES `GrandpasBrewing`.`RatingScores` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`MiscellaneousItems`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`MiscellaneousItems` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`MiscellaneousItems` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `MiscellaneousItemTypeID` INT NOT NULL COMMENT '',
  `MiscellaneousItemUseID` INT NOT NULL COMMENT '',
  `Time` DECIMAL NULL COMMENT '',
  `Amount` DECIMAL NULL COMMENT '',
  `AmountIsWeight` TINYINT(1) NULL COMMENT '',
  `UseFor` VARCHAR(255) NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `DisplayAmount` VARCHAR(45) NULL COMMENT '',
  `Inventory` VARCHAR(45) NULL COMMENT '',
  `DisplayTime` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_MiscellaneousItemType_idx` (`MiscellaneousItemTypeID` ASC)  COMMENT '',
  INDEX `FK_MiscellaneousItemUse_idx` (`MiscellaneousItemUseID` ASC)  COMMENT '',
  CONSTRAINT `FK_MiscellaneousItemType`
    FOREIGN KEY (`MiscellaneousItemTypeID`)
    REFERENCES `GrandpasBrewing`.`MiscellaneousItemTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_MiscellaneousItemUse`
    FOREIGN KEY (`MiscellaneousItemUseID`)
    REFERENCES `GrandpasBrewing`.`MiscellaneousItemUses` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Mashes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Mashes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Mashes` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `TunTemperature` DECIMAL NULL COMMENT '',
  `SpargeTemperature` DECIMAL NULL COMMENT '',
  `PH` DECIMAL NULL COMMENT '',
  `TunWeight` DECIMAL NULL COMMENT '',
  `TunSpecificHeat` DECIMAL NULL COMMENT '',
  `EquipmentAdjust` TINYINT(1) NULL COMMENT '',
  `DisplayGrainTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplayTunTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplaySpargeTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplayTunWeight` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`MashSteps`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`MashSteps` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`MashSteps` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `MashID` INT NOT NULL COMMENT '',
  `MashStepTypeID` INT NOT NULL COMMENT '',
  `InfuseAmount` DECIMAL NULL COMMENT '',
  `StepTemperature` DECIMAL NULL COMMENT '',
  `StepTime` DECIMAL NULL COMMENT '',
  `RampTime` DECIMAL NULL COMMENT '',
  `EndTemperature` DECIMAL NULL COMMENT '',
  `Description` VARCHAR(1000) NULL COMMENT '',
  `WaterGrainRatio` VARCHAR(45) NULL COMMENT '',
  `DecoctionAmount` VARCHAR(45) NULL COMMENT '',
  `InfuseTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplayStepTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplayInfuseAmount` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_MashStepType_idx` (`MashStepTypeID` ASC)  COMMENT '',
  INDEX `FK_Mash_idx` (`MashID` ASC)  COMMENT '',
  CONSTRAINT `FK_MashStepType`
    FOREIGN KEY (`MashStepTypeID`)
    REFERENCES `GrandpasBrewing`.`MashStepTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Mash`
    FOREIGN KEY (`MashID`)
    REFERENCES `GrandpasBrewing`.`Mashes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Ingredients`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Ingredients` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Ingredients` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Name` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Fermentables`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Fermentables` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Fermentables` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `FermentableTypeID` INT NOT NULL COMMENT '',
  `Amount` DECIMAL NULL COMMENT '',
  `Yield` DECIMAL NULL COMMENT '',
  `Color` DECIMAL NULL COMMENT '',
  `AddAfterBoil` TINYINT(1) NULL COMMENT '',
  `PlaceOfOrigin` VARCHAR(45) NULL COMMENT '',
  `Supplier` VARCHAR(45) NULL COMMENT '',
  `Notes` VARCHAR(45) NULL COMMENT '',
  `CoarseFineDiff` DECIMAL NULL COMMENT '',
  `Moisture` DECIMAL NULL COMMENT '',
  `DiastaticPower` DECIMAL NULL COMMENT '',
  `Protein` DECIMAL NULL COMMENT '',
  `MaximumInBatch` DECIMAL NULL COMMENT '',
  `RecommendMash` TINYINT(1) NULL COMMENT '',
  `IBUGallonsPerPound` DECIMAL NULL COMMENT '',
  `DisplayAmount` VARCHAR(45) NULL COMMENT '',
  `Potential` VARCHAR(45) NULL COMMENT '',
  `Inventory` VARCHAR(45) NULL COMMENT '',
  `DisplayColor` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_FermentableType_idx` (`FermentableTypeID` ASC)  COMMENT '',
  CONSTRAINT `FK_FermentableType`
    FOREIGN KEY (`FermentableTypeID`)
    REFERENCES `GrandpasBrewing`.`FermentableTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Yeasts`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Yeasts` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Yeasts` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `YeastTypeID` INT NOT NULL COMMENT '',
  `YeastFormID` INT NOT NULL COMMENT '',
  `Amount` DECIMAL NULL COMMENT '',
  `AmountIsWeight` TINYINT(1) NULL COMMENT '',
  `Laboratory` VARCHAR(45) NULL COMMENT '',
  `ManufacturerProductID` VARCHAR(45) NULL COMMENT '',
  `MinimumTemperature` DECIMAL NULL COMMENT '',
  `MaximumTemperature` DECIMAL NULL COMMENT '',
  `YeastFlocculationID` INT NULL COMMENT '',
  `Attenuation` DECIMAL NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `BestFor` VARCHAR(45) NULL COMMENT '',
  `TimesCultured` INT NULL COMMENT '',
  `MaximumReuse` INT NULL COMMENT '',
  `AddToSecondary` TINYINT(1) NULL COMMENT '',
  `DisplayAmount` VARCHAR(45) NULL COMMENT '',
  `DisplayMinimumTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplayMaximumTemperature` VARCHAR(45) NULL COMMENT '',
  `Inventory` VARCHAR(45) NULL COMMENT '',
  `CultureDate` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_YeatType_idx` (`YeastTypeID` ASC)  COMMENT '',
  INDEX `FK_YeastForm_idx` (`YeastFormID` ASC)  COMMENT '',
  INDEX `FK_YeastFlocculation_idx` (`YeastFlocculationID` ASC)  COMMENT '',
  CONSTRAINT `FK_YeastType`
    FOREIGN KEY (`YeastTypeID`)
    REFERENCES `GrandpasBrewing`.`YeastTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_YeastForm`
    FOREIGN KEY (`YeastFormID`)
    REFERENCES `GrandpasBrewing`.`YeastForms` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_YeastFlocculation`
    FOREIGN KEY (`YeastFlocculationID`)
    REFERENCES `GrandpasBrewing`.`YeastFlocculations` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Styles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Styles` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Styles` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `Category` VARCHAR(45) NULL COMMENT '',
  `CategoryNumber` VARCHAR(45) NULL COMMENT '',
  `StyleLetter` VARCHAR(45) NULL COMMENT '',
  `StyleGuide` VARCHAR(45) NULL COMMENT '',
  `StyleTypeID` INT NOT NULL COMMENT '',
  `OriginalGravityMinimum` DECIMAL NULL COMMENT '',
  `OriginalGravityMaximum` DECIMAL NULL COMMENT '',
  `FinalGravityMinimum` DECIMAL NULL COMMENT '',
  `FinalGravityMaximum` DECIMAL NULL COMMENT '',
  `IBUMinimum` DECIMAL NULL COMMENT '',
  `IBUMaximum` DECIMAL NULL COMMENT '',
  `ColorMinimum` VARCHAR(45) NULL COMMENT '',
  `ColorMaximum` VARCHAR(45) NULL COMMENT '',
  `CarbonationMinimum` DECIMAL NULL COMMENT '',
  `CarbonationMaximum` DECIMAL NULL COMMENT '',
  `ABVMinimum` DECIMAL NULL COMMENT '',
  `ABVMaximum` DECIMAL NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `Profile` VARCHAR(45) NULL COMMENT '',
  `Ingredients` VARCHAR(45) NULL COMMENT '',
  `Examples` VARCHAR(45) NULL COMMENT '',
  `DisplayOriginalGravityMinimum` VARCHAR(45) NULL COMMENT '',
  `DisplayOriginalGravityMaximum` VARCHAR(45) NULL COMMENT '',
  `DisplayFinalGravityMinimum` VARCHAR(45) NULL COMMENT '',
  `DisplayFinalGravityMaximum` VARCHAR(45) NULL COMMENT '',
  `DisplayColorMinimum` VARCHAR(45) NULL COMMENT '',
  `DisplayColorMaximum` VARCHAR(45) NULL COMMENT '',
  `OriginalGravityRange` VARCHAR(45) NULL COMMENT '',
  `FinalGravityRange` VARCHAR(45) NULL COMMENT '',
  `IBURange` VARCHAR(45) NULL COMMENT '',
  `CarbonationRange` VARCHAR(45) NULL COMMENT '',
  `ColorRange` VARCHAR(45) NULL COMMENT '',
  `ABVRange` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_StyleType_idx` (`StyleTypeID` ASC)  COMMENT '',
  CONSTRAINT `FK_StyleType`
    FOREIGN KEY (`StyleTypeID`)
    REFERENCES `GrandpasBrewing`.`StyleTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Batches`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Batches` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Batches` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `StartDate` DATETIME NULL COMMENT '',
  `OriginalGravity` DECIMAL NULL COMMENT '',
  `FinalGravity` DECIMAL NULL COMMENT '',
  `Testing` VARCHAR(45) NULL COMMENT '',
  `RecipeInformation` VARCHAR(45) NULL COMMENT '',
  `Style` VARCHAR(45) NULL COMMENT '',
  `AlcoholByVolume` DECIMAL NULL COMMENT '',
  `Availability` VARCHAR(45) NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `Picture` VARCHAR(45) NULL COMMENT '',
  `Description` VARCHAR(1000) NULL COMMENT '',
  `TypeOfProduct` VARCHAR(45) NULL COMMENT '',
  `DateOfBrewing` DATETIME NULL COMMENT '',
  `WaterVolume` DECIMAL NULL COMMENT '',
  `TypeOfSugarsAdded` VARCHAR(45) NULL COMMENT '',
  `AmountOfSugarsAdded` DECIMAL NULL COMMENT '',
  `BestBeforeDate` DATETIME NULL COMMENT '',
  `YeastCodeOnSachet` VARCHAR(45) NULL COMMENT '',
  `TemperatureOfWortBeforeAddingYeast` INT NULL COMMENT '',
  `DateOfBottling` DATETIME NULL COMMENT '',
  `Sanitizing` VARCHAR(45) NULL COMMENT '',
  `Yield` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`BatchesIngredients`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`BatchesIngredients` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`BatchesIngredients` (
  `BatchID` INT NOT NULL COMMENT '',
  `IngredientID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`BatchID`, `IngredientID`)  COMMENT '',
  INDEX `FK_Ingredient_idx` (`IngredientID` ASC)  COMMENT '',
  CONSTRAINT `FK_Batch`
    FOREIGN KEY (`BatchID`)
    REFERENCES `GrandpasBrewing`.`Batches` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Ingredient`
    FOREIGN KEY (`IngredientID`)
    REFERENCES `GrandpasBrewing`.`Ingredients` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`EquipmentItems`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`EquipmentItems` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`EquipmentItems` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `BoilSize` DECIMAL NULL COMMENT '',
  `BatchSize` DECIMAL NULL COMMENT '',
  `TunVolume` DECIMAL NULL COMMENT '',
  `TunWeight` DECIMAL NULL COMMENT '',
  `TunSpecificHeat` DECIMAL NULL COMMENT '',
  `TopUpWater` DECIMAL NULL COMMENT '',
  `TrubChillerLoss` DECIMAL NULL COMMENT '',
  `EvaporationRate` DECIMAL NULL COMMENT '',
  `BoilTime` DECIMAL NULL COMMENT '',
  `CalculateBoilVolume` TINYINT(1) NULL COMMENT '',
  `LauterDeadspace` DECIMAL NULL COMMENT '',
  `TopUpKettle` DECIMAL NULL COMMENT '',
  `HopUtilization` DECIMAL NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `DisplayBoilSize` VARCHAR(45) NULL COMMENT '',
  `DisplayBatchSize` VARCHAR(45) NULL COMMENT '',
  `DisplayTunVolume` VARCHAR(45) NULL COMMENT '',
  `DisplayTunWeight` VARCHAR(45) NULL COMMENT '',
  `DisplayTopUpWater` VARCHAR(45) NULL COMMENT '',
  `DisplayTrubChillerLoss` VARCHAR(45) NULL COMMENT '',
  `DisplayLauterDeadspace` VARCHAR(45) NULL COMMENT '',
  `DisplayTopUpKettle` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Hops`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Hops` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Hops` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `AlphaPercentage` DECIMAL NULL COMMENT '',
  `Amount` DECIMAL NULL COMMENT '',
  `HopUseID` INT NULL COMMENT '',
  `Time` DECIMAL NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `HopTypeID` INT NULL COMMENT '',
  `HopFormID` INT NULL COMMENT '',
  `BetaPercentage` DECIMAL NULL COMMENT '',
  `HopStabilityIndex` DECIMAL NULL COMMENT '',
  `PlaceOfOrigin` VARCHAR(45) NULL COMMENT '',
  `Substitutes` VARCHAR(45) NULL COMMENT '',
  `HumuleneLevel` DECIMAL NULL COMMENT '',
  `CaryophylleneLevel` DECIMAL NULL COMMENT '',
  `CohumuloneLevel` DECIMAL NULL COMMENT '',
  `MyrceneLevel` DECIMAL NULL COMMENT '',
  `DisplayAmount` VARCHAR(45) NULL COMMENT '',
  `Inventory` VARCHAR(45) NULL COMMENT '',
  `DisplayTime` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_HopUse_idx` (`HopUseID` ASC)  COMMENT '',
  INDEX `FK_HopType_idx` (`HopTypeID` ASC)  COMMENT '',
  INDEX `FK_HopForm_idx` (`HopFormID` ASC)  COMMENT '',
  CONSTRAINT `FK_HopUse`
    FOREIGN KEY (`HopUseID`)
    REFERENCES `GrandpasBrewing`.`HopUses` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_HopType`
    FOREIGN KEY (`HopTypeID`)
    REFERENCES `GrandpasBrewing`.`HopTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_HopForm`
    FOREIGN KEY (`HopFormID`)
    REFERENCES `GrandpasBrewing`.`HopForms` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`Recipes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`Recipes` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`Recipes` (
  `ID` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `RecipeTypeID` INT NOT NULL COMMENT '',
  `StyleID` INT NULL COMMENT '',
  `EquipmentItemID` INT NULL COMMENT '',
  `Brewer` VARCHAR(45) NULL COMMENT '',
  `AssistantBrewer` VARCHAR(45) NULL COMMENT '',
  `BatchSize` DECIMAL NULL COMMENT '',
  `BoilSize` DECIMAL NULL COMMENT '',
  `BoilTime` DECIMAL NULL COMMENT '',
  `Efficiency` DECIMAL NULL COMMENT '',
  `MashID` INT NULL COMMENT '',
  `Notes` VARCHAR(1000) NULL COMMENT '',
  `TasteNotes` VARCHAR(1000) NULL COMMENT '',
  `Rating` DECIMAL NULL COMMENT '',
  `OriginalGravity` DECIMAL NULL COMMENT '',
  `FinalGravity` DECIMAL NULL COMMENT '',
  `FermentationStages` INT NULL COMMENT '',
  `PrimaryAge` DECIMAL NULL COMMENT '',
  `PrimaryTemperature` DECIMAL NULL COMMENT '',
  `SecondaryAge` DECIMAL NULL COMMENT '',
  `SecondaryTemperature` DECIMAL NULL COMMENT '',
  `TertiaryAge` DECIMAL NULL COMMENT '',
  `TertiaryTemperature` DECIMAL NULL COMMENT '',
  `Age` DECIMAL NULL COMMENT '',
  `AgeTemperature` DECIMAL NULL COMMENT '',
  `Date` VARCHAR(45) NULL COMMENT '',
  `Carbonation` DECIMAL NULL COMMENT '',
  `ForcedCarbonation` TINYINT(1) NULL COMMENT '',
  `PrimingSugarName` VARCHAR(45) NULL COMMENT '',
  `CarbonationTemperature` DECIMAL NULL COMMENT '',
  `PrimingSugarEquivalent` DECIMAL NULL COMMENT '',
  `KegPrimingFactor` DECIMAL NULL COMMENT '',
  `EstimatedOriginalGravity` VARCHAR(45) NULL COMMENT '',
  `EstimatedFinalGravity` VARCHAR(45) NULL COMMENT '',
  `EstimatedColor` VARCHAR(45) NULL COMMENT '',
  `IBU` DECIMAL NULL COMMENT '',
  `IBUMethod` VARCHAR(45) NULL COMMENT '',
  `EstimatedABV` DECIMAL NULL COMMENT '',
  `ABV` DECIMAL NULL COMMENT '',
  `ActualEfficiency` DECIMAL NULL COMMENT '',
  `Calories` VARCHAR(45) NULL COMMENT '',
  `DisplayBatchSize` VARCHAR(45) NULL COMMENT '',
  `DisplayBoilSize` VARCHAR(45) NULL COMMENT '',
  `DisplayOriginalGravity` VARCHAR(45) NULL COMMENT '',
  `DisplayFinalGravity` VARCHAR(45) NULL COMMENT '',
  `DisplayPrimaryTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplaySecondaryTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplayTertiaryTemperature` VARCHAR(45) NULL COMMENT '',
  `DisplayAgeTemperature` VARCHAR(45) NULL COMMENT '',
  `CarbonationUsed` VARCHAR(45) NULL COMMENT '',
  `DisplayCarbTemperature` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`ID`)  COMMENT '',
  INDEX `FK_RecipeType_idx` (`RecipeTypeID` ASC)  COMMENT '',
  INDEX `FK_Mash_idx` (`MashID` ASC)  COMMENT '',
  INDEX `FK_Style_idx` (`StyleID` ASC)  COMMENT '',
  INDEX `FK_EquipmentItem_idx` (`EquipmentItemID` ASC)  COMMENT '',
  CONSTRAINT `FK_RecipeType`
    FOREIGN KEY (`RecipeTypeID`)
    REFERENCES `GrandpasBrewing`.`RecipeTypes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Mash`
    FOREIGN KEY (`MashID`)
    REFERENCES `GrandpasBrewing`.`Mashes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Style`
    FOREIGN KEY (`StyleID`)
    REFERENCES `GrandpasBrewing`.`Styles` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_EquipmentItem`
    FOREIGN KEY (`EquipmentItemID`)
    REFERENCES `GrandpasBrewing`.`EquipmentItems` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`RecipesHops`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`RecipesHops` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`RecipesHops` (
  `RecipeID` INT NOT NULL COMMENT '',
  `HopID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`RecipeID`, `HopID`)  COMMENT '',
  INDEX `FK_Hop_idx` (`HopID` ASC)  COMMENT '',
  CONSTRAINT `FK_Recipe`
    FOREIGN KEY (`RecipeID`)
    REFERENCES `GrandpasBrewing`.`Recipes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Hop`
    FOREIGN KEY (`HopID`)
    REFERENCES `GrandpasBrewing`.`Hops` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`RecipesFermentables`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`RecipesFermentables` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`RecipesFermentables` (
  `RecipeID` INT NOT NULL COMMENT '',
  `FermentableID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`RecipeID`, `FermentableID`)  COMMENT '',
  INDEX `FK_Fermentable_idx` (`FermentableID` ASC)  COMMENT '',
  CONSTRAINT `FK_Recipe`
    FOREIGN KEY (`RecipeID`)
    REFERENCES `GrandpasBrewing`.`Recipes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Fermentable`
    FOREIGN KEY (`FermentableID`)
    REFERENCES `GrandpasBrewing`.`Fermentables` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`RecipesMiscellaneousItems`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`RecipesMiscellaneousItems` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`RecipesMiscellaneousItems` (
  `RecipeID` INT NOT NULL COMMENT '',
  `MiscellaneousItemID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`RecipeID`, `MiscellaneousItemID`)  COMMENT '',
  INDEX `FK_MiscellaneousItem_idx` (`MiscellaneousItemID` ASC)  COMMENT '',
  CONSTRAINT `FK_Recipe`
    FOREIGN KEY (`RecipeID`)
    REFERENCES `GrandpasBrewing`.`Recipes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_MiscellaneousItem`
    FOREIGN KEY (`MiscellaneousItemID`)
    REFERENCES `GrandpasBrewing`.`MiscellaneousItems` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`RecipesYeasts`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`RecipesYeasts` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`RecipesYeasts` (
  `RecipeID` INT NOT NULL COMMENT '',
  `YeastID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`RecipeID`, `YeastID`)  COMMENT '',
  INDEX `FK_Yeast_idx` (`YeastID` ASC)  COMMENT '',
  CONSTRAINT `FK_Recipe`
    FOREIGN KEY (`RecipeID`)
    REFERENCES `GrandpasBrewing`.`Recipes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Yeast`
    FOREIGN KEY (`YeastID`)
    REFERENCES `GrandpasBrewing`.`Yeasts` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `GrandpasBrewing`.`RecipeWaters`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `GrandpasBrewing`.`RecipeWaters` ;

CREATE TABLE IF NOT EXISTS `GrandpasBrewing`.`RecipeWaters` (
  `RecipeID` INT NOT NULL COMMENT '',
  `WaterID` INT NOT NULL COMMENT '',
  PRIMARY KEY (`RecipeID`, `WaterID`)  COMMENT '',
  INDEX `FK_Water_idx` (`WaterID` ASC)  COMMENT '',
  CONSTRAINT `FK_Recipe`
    FOREIGN KEY (`RecipeID`)
    REFERENCES `GrandpasBrewing`.`Recipes` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Water`
    FOREIGN KEY (`WaterID`)
    REFERENCES `GrandpasBrewing`.`Waters` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
