CREATE TABLE livro (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    autor VARCHAR(255) NOT NULL,
    isbn VARCHAR(50) NOT NULL,
    ano_publicacao INT NOT NULL
);

SELECT id, titulo, autor, isbn, ano_publicacao
FROM biblioteca.livros;


CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE emprestimo (
    id SERIAL PRIMARY KEY,
    data_emprestimo DATE NOT NULL,
    data_devolucao DATE,
    livro_id INT NOT NULL,
    usuario_id INT NOT NULL,
    CONSTRAINT fk_livro FOREIGN KEY (livro_id) REFERENCES livro (id),
    CONSTRAINT fk_usuario FOREIGN KEY (usuario_id) REFERENCES usuario (id)
);