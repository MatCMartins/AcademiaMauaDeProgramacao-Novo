-- MySQL Script generated by MySQL Workbench
-- Wed May 11 08:01:04 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering



CREATE DATABASE AcademiaMauaDeProgramacao;
USE AcademiaMauaDeProgramacao;

CREATE TABLE Ranking(
  `posicao` INT NOT NULL,
  `nomeUsuario` VARCHAR(30) NOT NULL,
  `pontuacao` INT NOT NULL,
  `tentativas` INT NOT NULL,
  PRIMARY KEY (`posicao`));


DESCRIBE Ranking;

CREATE TABLE Jogador(
  `nome` VARCHAR(30) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `idade` INT NOT NULL,
  `telefone` VARCHAR(11) NOT NULL,
  `nomeUsuario` VARCHAR(20) NOT NULL,
  `senhaUsuario` VARCHAR(20) NOT NULL,
  `tentativas` INT NOT NULL,
  `pontuacao` INT NOT NULL,
  `Ranking_posicao` INT NOT NULL,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) ,
  UNIQUE INDEX `telefone_UNIQUE` (`telefone` ASC),
  UNIQUE INDEX `nomeUsuario_UNIQUE` (`nomeUsuario` ASC),
  PRIMARY KEY (`nomeUsuario`),
  INDEX `fk_Jogador_Ranking1_idx` (`Ranking_posicao` ASC),
  CONSTRAINT `fk_Jogador_Ranking1`
    FOREIGN KEY (`Ranking_posicao`)
    REFERENCES Ranking(`posicao`)
    ON DELETE CASCADE
    ON UPDATE CASCADE);

DESCRIBE Jogador;
-- -----------------------------------------------------
-- Table `Material de Apoio`
-- -----------------------------------------------------
CREATE TABLE MaterialDeApoio (
  nomeMaterial VARCHAR(15) NOT NULL,
  escopo VARCHAR(10) NOT NULL,
  material VARCHAR(64)	 NOT NULL,
  PRIMARY KEY(nomeMaterial));


DESCRIBE MaterialDeApoio;

-- -----------------------------------------------------
-- Table `Premio`
-- -----------------------------------------------------

CREATE TABLE Premio (
  `nomePremio` VARCHAR(15) NOT NULL,
  `descricaoPremio` TEXT NOT NULL,
  PRIMARY KEY (`nomePremio`),
  UNIQUE INDEX `nomePremio_UNIQUE` (`nomePremio` ASC));

describe Premio;

-- -----------------------------------------------------
-- Table `Fase`
-- -----------------------------------------------------


CREATE TABLE Fase(
  `numeroFase` INT NOT NULL,
  `escopoFase` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`numeroFase`),
  UNIQUE INDEX `escopoFase_UNIQUE` (`escopoFase` ASC) ,
  UNIQUE INDEX `numeroFase_UNIQUE` (`numeroFase` ASC));

DESCRIBE Fase;
-- -----------------------------------------------------
-- Table `Pergunta`
-- -----------------------------------------------------

CREATE TABLE Pergunta(
  `numeroQuestao` INT NOT NULL,
  `alternativaCorreta` VARCHAR(64) NOT NULL,
  `alternativa1` VARCHAR(64) NOT NULL,
  `alternativa2` VARCHAR(64) NOT NULL,
  `alternativa3` VARCHAR(64) NOT NULL,
  `alternativa4` VARCHAR(64) NOT NULL,
   `questao` VARCHAR(64) NOT NULL,
  PRIMARY KEY (`numeroQuestao`));

DESCRIBE Pergunta;
-- -----------------------------------------------------
-- Table `Jogador_has_Material de Apoio`
-- -----------------------------------------------------

CREATE TABLE Jogador_has_MaterialDeApoio (
  `Jogador_nomeUsuario` VARCHAR(20) NOT NULL,
  `Material de Apoio_nomeMaterial` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`Jogador_nomeUsuario`, `Material de Apoio_nomeMaterial`),
  INDEX `fk_Jogador_has_Material de Apoio_Material de Apoio1_idx` (`Material de Apoio_nomeMaterial` ASC),
  INDEX `fk_Jogador_has_Material de Apoio_Jogador_idx` (`Jogador_nomeUsuario` ASC),
  CONSTRAINT `fk_Jogador_has_Material de Apoio_Jogador`
    FOREIGN KEY (`Jogador_nomeUsuario`)
    REFERENCES Jogador(`nomeUsuario`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_Jogador_has_MaterialDeApoio_Material de Apoio1`
    FOREIGN KEY (`Material de Apoio_nomeMaterial`)
    REFERENCES MaterialDeApoio(`nomeMaterial`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);

DESCRIBE Jogador_has_MaterialDeApoio;

-- -----------------------------------------------------
-- Table `Jogador_has_Fase`
-- -----------------------------------------------------


CREATE TABLE Jogador_has_Fase  (
  `Jogador_nomeUsuario` VARCHAR(20) NOT NULL,
  `Fase_numeroFase` INT NOT NULL,
  PRIMARY KEY (`Jogador_nomeUsuario`, `Fase_numeroFase`),
  INDEX `fk_Jogador_has_Fase_Fase1_idx` (`Fase_numeroFase` ASC),
  INDEX `fk_Jogador_has_Fase_Jogador1_idx` (`Jogador_nomeUsuario` ASC),
  CONSTRAINT `fk_Jogador_has_Fase_Jogador1`
    FOREIGN KEY (`Jogador_nomeUsuario`)
    REFERENCES Jogador(`nomeUsuario`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_Jogador_has_Fase_Fase1`
    FOREIGN KEY (`Fase_numeroFase`)
    REFERENCES Fase(`numeroFase`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);

DESCRIBE Jogador_has_Fase;

-- -----------------------------------------------------
-- Table `Fase_has_Pergunta`
-- -----------------------------------------------------

CREATE TABLE Fase_has_Pergunta (
  `Fase_numeroFase` INT NOT NULL,
  `Pergunta_numeroQuestao` INT NOT NULL,
  PRIMARY KEY (`Fase_numeroFase`, `Pergunta_numeroQuestao`),
  INDEX `fk_Fase_has_Pergunta_Pergunta1_idx` (`Pergunta_numeroQuestao` ASC) ,
  INDEX `fk_Fase_has_Pergunta_Fase1_idx` (`Fase_numeroFase` ASC) ,
  CONSTRAINT `fk_Fase_has_Pergunta_Fase1`
    FOREIGN KEY (`Fase_numeroFase`)
    REFERENCES Fase(`numeroFase`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_Fase_has_Pergunta_Pergunta1`
    FOREIGN KEY (`Pergunta_numeroQuestao`)
    REFERENCES  Pergunta(`numeroQuestao`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);

describe Fase_has_Pergunta;

-- -----------------------------------------------------
-- Table `Jogador_has_Premio`
-- -----------------------------------------------------


CREATE TABLE Jogador_has_Premio (
  `Jogador_nomeUsuario` VARCHAR(20) NOT NULL,
  `Premio_nomePremio` VARCHAR(15) NOT NULL,
  PRIMARY KEY (`Jogador_nomeUsuario`, `Premio_nomePremio`),
  INDEX `fk_Jogador_has_Premio_Premio1_idx` (`Premio_nomePremio` ASC) ,
  INDEX `fk_Jogador_has_Premio_Jogador1_idx` (`Jogador_nomeUsuario` ASC) ,
  CONSTRAINT `fk_Jogador_has_Premio_Jogador1`
    FOREIGN KEY (`Jogador_nomeUsuario`)
    REFERENCES Jogador(`nomeUsuario`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT,
  CONSTRAINT `fk_Jogador_has_Premio_Premio1`
    FOREIGN KEY (`Premio_nomePremio`)
    REFERENCES Premio(`nomePremio`)
    ON DELETE RESTRICT
    ON UPDATE RESTRICT);

DESCRIBE Jogador_has_Premio;

SELECT * FROM Pergunta;

DROP DATABASE AcademiaMauaDeProgramacao;