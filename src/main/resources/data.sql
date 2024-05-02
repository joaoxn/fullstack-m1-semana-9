INSERT INTO livro (titulo, autor, data_publicacao)
VALUES ('A sombra de Innsmouth', 'Howard Phillips Lovecraft', 1936-01-01),
       ('O Chamado de Cthulhu', 'Howard Phillips Lovecraft', 1928-01-01)

INSERT INTO membro (nome, endereco, telefone)
VALUES ('João Victor', 'Rua Emanuel Francisco Darella, 691', '047997833550'),
       ('Guilherme Bardalho', 'Rua Osvaldo Benjamin 726', '048984324518')

INSERT INTO emprestimo (livro_id, membro_id, data_emprestimo, data_publicacao)
VALUES (1, 1, 2024-05-02, 2024-05-16),
       (2, 2, 2023-08-15, 2023-08-29)

INSERT INTO visitante (nome, telefone)
VALUES ('Miguel Assunção', '48988462046'),
       ('Vitor Spiazi', '4896287243')

INSERT INTO bibliotecario (nome, email, senha)
VALUES ('Sônia Pinto', 'sonia.pinto@edu.sc.senai.br', 'melhorprof2024'),
       ('Sérgio Alexandre', 'sergio_alexandre@edu.sc.senai.br', 'amoportugol2001')