INSERT INTO tb_Pessoa (pessoa_id, nome, matricula, email, cpf, tipo_Usuario, telefone) 
VALUES (1, 'Ana', '123456789', 'ana@gmail.com', '0987654321', 0, '92991921009');

INSERT INTO tb_Pessoa (pessoa_id, nome, matricula, email, cpf, tipo_Usuario, telefone) 
VALUES (2, 'Isaac', '0987654', 'isaac@gmail.com', '09876543213', 1, '92994819284');

INSERT INTO tb_Pessoa (pessoa_id, nome, matricula, email, cpf, tipo_Usuario, telefone) 
VALUES (3, 'Felipe', '0000000', 'felipe@gmail.com', '7738290433', 2, '9297856743');

INSERT INTO tb_Pessoa (pessoa_id, nome, matricula, email, cpf, tipo_Usuario, telefone)
VALUES (4, 'Maria', '1111111', 'maria@gmail.com', '1234567890', 1, '9291234567');

INSERT INTO tb_Pessoa (pessoa_id, nome, matricula, email, cpf, tipo_Usuario, telefone)
VALUES (5, 'Carlos', '2222222', 'carlos@gmail.com', '0987654321', 2, '9297654321');

INSERT INTO tb_colecao (colecao_id, nome)
VALUES (1, 'Colecao Aventuras na Floresta');

INSERT INTO tb_colecao (colecao_id, nome)
VALUES (2, 'Colecao Misterios do Oceano');

INSERT INTO tb_colecao (colecao_id, nome)
VALUES (3, 'Colecao Viagem ao Espaço');

INSERT INTO tb_colecao (colecao_id, nome)
VALUES (4, 'Colecao Historias de Amor');

INSERT INTO tb_colecao (colecao_id, nome)
VALUES (5, 'Colecao Vida e Obra');


INSERT INTO tb_bibliotecario (bibliotecario_id, nome)
VALUES (1, 'Joao Silva');

INSERT INTO tb_bibliotecario (bibliotecario_id, nome) 
VALUES (2, 'Maria Santos');

INSERT INTO comprovante (comprovante_id, quantidade)
VALUES (1, 3);

INSERT INTO comprovante (comprovante_id, quantidade)
VALUES (2, 2);

INSERT INTO comprovante (comprovante_id, quantidade)
VALUES (3, 1);

INSERT INTO comprovante (comprovante_id, quantidade)
VALUES (4, 4);

INSERT INTO comprovante (comprovante_id, quantidade)
VALUES (5, 2);

INSERT INTO tb_livro (colecao_id, livro_id, num_paginas, ano_publicacao, autor, editora, genero, nome, titulo)
VALUES (1, 1, 350, '2023', 'João Silva', 'Editora Floresta', 'Aventura', 'Aventuras na Floresta', 'Aventuras na Floresta: Volume 1');

INSERT INTO tb_livro (colecao_id, livro_id, num_paginas, ano_publicacao, autor, editora, genero, nome, titulo)
VALUES (2, 2, 400, '2022', 'Maria Fernanda', 'Editora Oceano', 'Mistério', 'Mistérios do Oceano', 'Misterios do Oceano: O Tesouro Perdido');

INSERT INTO tb_livro (colecao_id, livro_id, num_paginas, ano_publicacao, autor, editora, genero, nome, titulo)
VALUES (3, 3, 450, '2021', 'Carlos Eduardo', 'Editora Espaco', 'Ficcao Cientifica', 'Viagem ao Espaco', 'Viagem ao Espaco: A Estrela Desconhecida');

INSERT INTO tb_livro (colecao_id, livro_id, num_paginas, ano_publicacao, autor, editora, genero, nome, titulo)
VALUES (4, 4, 500, '2020', 'Ana Clara', 'Editora Amor', 'Romance', 'Historias de Amor', 'Historias de Amor: O Primeiro Beijo');

INSERT INTO tb_livro (colecao_id, livro_id, num_paginas, ano_publicacao, autor, editora, genero, nome, titulo)
VALUES (5, 5, 550, '2019', 'Pedro Alves', 'Editora Vida', 'Biografia', 'Vida e Obra', 'Vida e Obra: Uma Jornada Inesquecivel');

INSERT INTO tb_emprestimo (Comprovante_id, Data_devolucao, Data_emprestimo, id, livro_id, pessoa_id, status)
VALUES (1, '2024-02-18', '2024-02-10', 1, 1, 1, 0);

INSERT INTO tb_emprestimo (Comprovante_id, Data_devolucao, Data_emprestimo, id, livro_id, pessoa_id, status)
VALUES (2, '2024-02-19', '2024-02-11', 2, 2, 2, 1);

INSERT INTO tb_emprestimo (Comprovante_id, Data_devolucao, Data_emprestimo, id, livro_id, pessoa_id, status)
VALUES (3, '2024-02-20', '2024-02-12', 3, 3, 3, 2);

INSERT INTO tb_emprestimo (Comprovante_id, Data_devolucao, Data_emprestimo, id, livro_id, pessoa_id, status)
VALUES (4, '2024-02-21', '2024-02-13', 4, 4, 4, 0);

INSERT INTO tb_emprestimo (Comprovante_id, Data_devolucao, Data_emprestimo, id, livro_id, pessoa_id, status)
VALUES (5, '2024-02-22', '2024-02-14', 5, 5, 5, 1);
