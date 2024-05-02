CREATE TABLE IF NOT EXISTS livro
(
    id         BIGSERIAL PRIMARY KEY,
    titulo       VARCHAR(120) NOT NULL,
    data_publicacao DATE
);

CREATE TABLE IF NOT EXISTS membro
(
    id   BIGSERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    endereco VARCHAR(256),
    telefone VARCHAR(12)
);

CREATE TABLE IF NOT EXISTS emprestimo
(
    id           BIGSERIAL PRIMARY KEY,
    livro_id     BIGINT NOT NULL,
    membro_id    BIGINT NOT NULL,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE NOT NULL,
    FOREIGN KEY (livro_id) REFERENCES livro (id),
    FOREIGN KEY (membro_id) REFERENCES membro (id)
);

CREATE TABLE IF NOT EXISTS visitante
(
    id   BIGSERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    telefone VARCHAR(12)
);

CREATE TABLE IF NOT EXISTS bibliotecario
(
    id   BIGSERIAL PRIMARY KEY,
    nome VARCHAR(80) NOT NULL,
    email VARCHAR(256) NOT NULL,
    senha VARCHAR(50) NOT NULL
);