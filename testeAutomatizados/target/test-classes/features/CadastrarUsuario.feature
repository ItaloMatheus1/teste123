#language: pt
#enconding: UTF-8

@cadastrarUsuario
Funcionalidade: Cadastrar usuario

	@cadastro
	Cenario: cadastrar usuario
		Quando eu acionar a aba admin
		E acionar o botao add
		E informar o campo Employee Name "Fiona  Grace"
		E informar o campo Username "Pedro"
		E informar o campo Password "12345678"
		E informar o campo Confirm Password "12345678"
		E acionar o botao salvar
		Entao o sistema cadrastrar o usuario "Pedro"
		
		
		




