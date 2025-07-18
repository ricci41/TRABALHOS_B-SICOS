CREATE DATABASE BDROUPAS;

USE BDROUPAS;

CREATE TABLE TBCLIENTE (
    ID_CLI INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NOME_CLI VARCHAR(20) NOT NULL,
    SEXO_CLI CHAR(1),
    DTNASC_CLI DATE NOT NULL,
    RG_CLI VARCHAR(20),
    CPF_CLI VARCHAR(20),
    ESTADOCIVIL_CLI VARCHAR(20),
    RUA_CLI VARCHAR(20),
    NUMERO_CLI VARCHAR(20),
    COMPLEMENTO_CLI VARCHAR(20),
    BAIRRO_CLI VARCHAR(20),
    CEP_CLI VARCHAR(20),
    CIDADE_CLI VARCHAR(30),
    ESTADO_CLI VARCHAR(20),
    TELFIXO_CLI VARCHAR(20),
    TELCELULAR_CLI VARCHAR(20) NOT NULL,
    EMAIL_CLI VARCHAR(30),
    STATOS_CLI VARCHAR(7) NOT NULL,
    DTCADASTRO_CLI DATETIME NOT NULL
    
)ENGINE=INNODB;

INSERT INTO TBCLIENTE (NOME_CLI, DTNASC_CLI, TELCELULAR_CLI, STATOS_CLI, DTCADASTRO_CLI) VALUES

('LUCAS', '2000-01-15', '(21)988881234', 'ATIVO', '2025-04-28'),
('MARIANA', '1998-05-22', '(11)987773456', 'INATIVO', '2025-04-28'),
('ROBERTO', '1987-09-30', '(31)991122334', 'ATIVO', '2025-04-28'),
('JULIA', '1995-11-11', '(41)992256789', 'ATIVO', '2025-04-28'),
('CARLA', '1990-12-05', '(51)993398877', 'ATIVO', '2025-04-28'),
('RAFAEL', '1992-08-19', '(62)994456789', 'INATIVO', '2025-04-28'),
('TIAGO', '1989-03-25', '(81)995509123', 'ATIVO', '2025-04-28'),
('ISABELA', '1996-07-04', '(91)996601234', 'INATIVO', '2025-04-28');

SELECT *
FROM tbcliente
WHERE CIDADE_CLI = "SÃO JOSÉ DO RIO PRETO" OR CIDADE_CLI = "CEDRAL";

SELECT *
FROM tbcliente
WHERE CIDADE_CLI = "SÃO JOSÉ DO RIO PRETO" AND SEXO_CLI = "M";

CREATE TABLE TBFORNECEDOR (
    IDFORN INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NOME_FORN VARCHAR(20) NOT NULL,
    CNPJ_FORN VARCHAR(30) NOT NULL,
    RUA_FORN VARCHAR(20),
    NUMERO_FORN VARCHAR(20),
    COMPLEMENTO_FORN VARCHAR(20),
    BAIRRO_FORN VARCHAR(20),
    CEP_FORN VARCHAR(30),
    CIDADE_FORN VARCHAR(20),
    ESTADO_FORN VARCHAR(20),
    TELFIXO_FORN VARCHAR(20),
    TELCELULAR_FORN VARCHAR(20) NOT NULL,
    EMAIL_FORN VARCHAR(30),
    NOMECONTATO_FORN VARCHAR(20),
    OBSERVACAO_FORN VARCHAR(50),
    STATOS_FORN VARCHAR(7) NOT NULL,
    DTCADASTRO_FORN DATE NOT NULL

)ENGINE=INNODB;

INSERT INTO TBFORNECEDOR (NOME_FORN, CNPJ_FORN, TELCELULAR_FORN, STATOS_FORN, DTCADASTRO_FORN) VALUES 
('GLOBAL SPORTS','11.111.111/0001-11','(92)987654321','ATIVO','2025-04-28'),
('MODA BRASIL','22.222.222/0001-22','(93)988776655','ATIVO','2025-04-28'),
('IMPORTS TECH','33.333.333/0001-33','(94)989887766','ATIVO','2025-04-28');

CREATE TABLE TBFUNCIONARIO (
    IDFUNC INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NOME_FUNC VARCHAR(20) NOT NULL,
    SEXO_FUNC CHAR(1),
    DTNASC_FUNC DATE NOT NULL,
    RG_FUNC VARCHAR(20),
    CPF_FUNC VARCHAR(20),
    ESTADOCIVIL_FUNC VARCHAR(20),
    DTADMI_FUNC DATETIME,
    TELCELULAR_FUNC VARCHAR(20) NOT NULL,
    EMAIL_FUNC VARCHAR(30),
    OBSERVACAO_FUNC VARCHAR(50),
    STATOS_FUNC VARCHAR(7) NOT NULL,
    CARGO_FUNC VARCHAR(20) NOT NULL

)ENGINE=INNODB;

INSERT INTO TBFUNCIONARIO (NOME_FUNC, DTNASC_FUNC, TELCELULAR_FUNC, STATOS_FUNC, CARGO_FUNC) 
VALUES 
('CARLOS', '1980-04-10', '(17)998812345', 'ATIVO', 'SUPERVISOR'),
('BEATRIZ', '1993-12-02', '(17)997789999', 'ATIVO', 'VENDEDOR'),
('ALINE', '1991-06-28', '(17)996667788', 'ATIVO', 'VENDEDOR'),
('RICARDO', '1986-10-17', '(17)995556677', 'ATIVO', 'GERENTE');


CREATE TABLE TBPRODUTOS (
    ID_PROD INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    CODFORN INT NOT NULL,
    NOME_PROD VARCHAR(20) NOT NULL,
    TAMANHO VARCHAR(20),
    PCOMPRA DECIMAL(5,2),
    PVENDA DECIMAL(5,2),
    QTDESTOQUE INT,
    OBSERVACAO_PROD VARCHAR(50),
    STATOS_PROD VARCHAR(7) NOT NULL,
    CATEGORIA VARCHAR(20),
    DTULTIMOFORN DATE,
    MARCA VARCHAR(20) NOT NULL,
    FOREIGN KEY (CODFORN) REFERENCES TBFORNECEDOR(IDFORN)

)ENGINE=INNODB;

tbitensvenda


CREATE TABLE TBVENDA (
    IDVEND INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    CODFUNC INT NOT NULL,
    CODCLI INT NOT NULL,
    DESCONTO__VEND VARCHAR(4),
    DATAVENDA DATE NOT NULL,
    FOREIGN KEY (CODFUNC) REFERENCES TBFUNCIONARIO(IDFUNC),
    FOREIGN KEY (CODCLI) REFERENCES TBCLIENTE(ID_CLI)

)ENGINE=INNODB;

INSERT INTO TBVENDA (CODFUNC, CODCLI, DATAVENDA) VALUES 
(2, 1, '2025-04-01'),
(2, 2, '2025-04-05'),
(3, 3, '2025-04-10'),
(2, 4, '2025-04-12'),
(3, 5, '2025-04-14'),
(3, 6, '2025-04-16'),
(3, 7, '2025-04-18'),
(2, 8, '2025-04-20'),
(3, 1, '2025-04-22'),
(2, 2, '2025-04-25');


CREATE TABLE TBITENSVENDA (
    IDITENSVENDA INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    CODPROD INT NOT NULL,
    CODVEND INT NOT NULL,
    QTD_ITEM INT NOT NULL,
    VALORUNI_ITEM DECIMAL(5,2) NOT NULL,
    FOREIGN KEY (CODPROD) REFERENCES TBPRODUTOS(ID_PROD),
    FOREIGN KEY (CODVEND) REFERENCES TBVENDA(IDVEND)

)ENGINE=INNODB;

tbitensvenda
-- Sem condições

SELECT NOME_PROD, PCOMPRA, PVENDA, QTDESTOQUE
FROM TBPRODUTOS;

-- Com condições

SELECT NOME_FORN, NOMECONTATO_FORN, TELCELULAR_FORN
FROM TBFORNECEDOR
WHERE STATOS_FORN = 'ATIVO';

-- com Condição numerica

SELECT NOME_FORN
FROM TBFORNECEDOR
WHERE CNPJ_FORN > 50.00;

--  com OR e AND

SELECT 


