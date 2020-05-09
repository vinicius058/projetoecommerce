package br.com.ecommerce.projetoecommerce.entity;

import java.time.LocalDateTime;

public class Administrador {
	
	private int codigo;
	private String nome;
	private LocalDateTime dataNascimento;
	private String cpf;
	private String rg;
	
	public Administrador() {
	
	}

	public Administrador(int codigo, String nome, LocalDateTime dataNascimento, String cpf, String rg) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
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
	
	

}
