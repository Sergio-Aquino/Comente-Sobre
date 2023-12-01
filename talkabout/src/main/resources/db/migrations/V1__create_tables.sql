CREATE TABLE Usuario
(
    id      int PRIMARY KEY,
    usuario varchar(50) NOT NULL,
    senha   varchar(50) NOT NULL
);

CREATE TABLE Topico
(
    id   int PRIMARY KEY,
    nome varchar(50) NOT NULL
);

CREATE TABLE Postagem
(
    id             int PRIMARY KEY,
    titulo         varchar(300) NOT NULL,
    corpo          varchar(300),
    curtida        int          NOT NULL,
    fk_Usuario_id  int          NOT NULL,
    fk_Topico_id   int          NOT NULL,
    email          varchar(50)  NOT NULL
);

CREATE TABLE Comentario
(
    id             int PRIMARY KEY,
    corpo     varchar(300) NOT NULL,
    curtida        int          NOT NULL,
    fk_Postagem_id int          NOT NULL,
    fk_Usuario_id  int          NOT NULL,
    email          varchar(50)  NOT NULL
);

ALTER TABLE Postagem
    ADD CONSTRAINT FK_Usuario
        FOREIGN KEY (fk_Usuario_id)
            REFERENCES Usuario (id)
            ON DELETE CASCADE;

ALTER TABLE Postagem
    ADD CONSTRAINT FK_Topico
        FOREIGN KEY (fk_Topico_id)
            REFERENCES Topico (id)
            ON DELETE CASCADE;

ALTER TABLE Comentario
    ADD CONSTRAINT FK_Postagem
        FOREIGN KEY (fk_Postagem_id)
            REFERENCES Postagem (id);

ALTER TABLE Comentario
    ADD CONSTRAINT FK_Usuario
        FOREIGN KEY (fk_Usuario_id)
            REFERENCES Usuario (id);



