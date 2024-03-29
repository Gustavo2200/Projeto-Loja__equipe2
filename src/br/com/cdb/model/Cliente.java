package br.com.cdb.model;

public class Cliente {
	
	String nome;
	double saldo;
	String email;
	String cpf;
	String dataDeNascimento;
	String senha;
	
	public Cliente() {}
	
	public Cliente( String nome, double saldo, String email, String cpf, String dataDeNascimento,
			String senha) {
		this.nome = nome;
		this.saldo = saldo;
		this.email = email;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.senha = senha;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double depositar(double valor) {
		saldo += valor;
		return saldo;
		
	}
}
	
	
	
	


