---Crear Usuario---
CREATE DATABASE universitas;

CREATE USER 'luisa'@'localhost' IDENTIFIED BY '321';

GRANT ALL PRIVILEGES ON universitas.* TO 'luisa'@'localhost';

FLUSH PRIVILEGES;


---Crear Tabla Libros---
CREATE TABLE LIBROS (
    ID INT NOT NULL AUTO_INCREMENT,
    TITULO VARCHAR(45) NOT NULL,
    AUTOR VARCHAR(45) NOT NULL,
    PRIMARY KEY (ID)
);


---Inserts Datos Libros----
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('1', 'Las mil y una noches', 'anonimo');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('2', 'Don quijote de la mancha', 'Miguel de cr');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('3', 'Orgullo y perjuicio', 'Jane austen');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('4', 'Frankenstain', 'Mary Shelley');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('5', 'Los tres mosqueteros', 'Alexandre Dumas');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('6', 'Jane Eyre', 'Charlotte');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('7', 'cumbres borrascosas', 'Emily');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('8', 'Moby dick', 'Herman');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('9', 'Madame Bolary', 'Gustave');
INSERT INTO `libros` (`ID`, `TITULO`, `AUTOR`) VALUES ('10', 'Grandes esperanzas', 'Charles ');
