#language: pt
#enconding: UTF-8

@login 
Funcionalidade: Acessar Sistema

	contexto:
		Dado que eu estou acessando o sistema
		Quando eu informar o usuario
		E informar a senha
		Entao o sistema apresenta o usuario logado

@informarcampo		
	Cenario: cenario 1 
		Quando eu cadastrar um usuario

	Cenario: cenario 2
		Quando eu editar um usuario

	Cenario: cenario 3 
		Quando eu iditar um usuario
		
	Cenario: cenario 4
		Quando eu editar um usuario 	