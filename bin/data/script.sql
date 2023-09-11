create database  	;
use bdExemploManha;

create table Pessoas(
	id int not null identity primary key,
	nome varchar(200) not null,
	email varchar(200) not null,
	senha varchar(20) not null
);
create table Funcionarios(
	idPessoa int not null references Pessoas(id),
	cargo varchar(50) not null
);
create procedure cadastrarFuncionario
@nome varchar(200),@email varchar(200),
@senha varchar(20) ,@cargo varchar(50)
as 
	begin
	insert into Pessoas(nome,email,senha) 
	   values(@nome,@email, @senha)
	insert into Funcionarios(idPessoa, cargo)
	   values (@@IDENTITY,@cargo);
end;
create procedure excluirFuncionario
@id int
as 
	begin
	delete from Funcionarios where idPessoa=@id;
	delete from Pessoas where id=@id;
end;
create procedure atualizarFuncionario
@id int, --chave primária para o Update
@nome varchar(200),@email varchar(200),
@senha varchar(20) ,@cargo varchar(50)
as 
	begin
	update Pessoas set nome= @nome,
	email=@email,senha=@senha
	   where id=@id;
	update Funcionarios set cargo=@cargo
	   where idPessoa=@id
end;