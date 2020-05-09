package br.com.ecommerce.projetoecommerce.entity;

import java.time.LocalDateTime;

public class Cliente {
	private int codigo;

	private String nome;

	private String email;

	private LocalDateTime dataNascimento;

	private String cpf;

	private String rg;

	private Long numeroCatao;

	private Endereco endereco;


	 public Cliente() {
	}

	public Cliente(int codigo, String nome, String email, LocalDateTime dataNascimento, String cpf, String rg,
			Long numeroCatao, Endereco endereco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.numeroCatao = numeroCatao;
		this.endereco = endereco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Long getNumeroCatao() {
		return numeroCatao;
	}

	public void setNumeroCatao(Long numeroCatao) {
		this.numeroCatao = numeroCatao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

