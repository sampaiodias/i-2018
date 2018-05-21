DROP DATABASE ident_paciente
CREATE DATABASE ident_paciente

CREATE TABLE nacionalidade(
	municipio varchar(50) NOT NULL,
	estado varchar(50) NOT NULL,
	pais varchar(50) NOT NULL,
	dataEntradaPais date NOT NULL DEFAULT 1900-12-31
);

CREATE TABLE vinculo(
	relacionamento varchar(50),
	datainicio date DEFAULT 1900-12-31,
	datafim date DEFAULT 1900-12-31
);

CREATE TABLE ctps(
	serie int(10) unsigned,
	estado varchar(50)
);

CREATE TABLE certidao(
	tipo varchar(50),
	cartorio varchar(50),
	livro varchar(50),
	folha varchar(50),
	termo varchar(50)
);

CREATE TABLE tituloEleitorial(
	secao varchar(50),
	zona varchar(50)
);

CREATE TABLE identificador(
	id char(16) NOT NULL,
	designacao varchar(50),
	area varchar(50),
	emissor varchar(50),
	data date,
	tipo varchar(50),
	PRIMARY KEY (id)
);

CREATE TABLE utilizacao(
	uso varchar(60),
	datainicio date,
	datafim date
);

CREATE TABLE endereco(
	id char(16) NOT NULL,
	bairro varchar(50),
	distrito varchar(50),
	codigomunicipio varchar(50),
	cep int(8) unsigned,
	caixapostal int(11) unsigned,
	pais varchar(50),
	tipo varchar(50),
	PRIMARY KEY (id)
);
