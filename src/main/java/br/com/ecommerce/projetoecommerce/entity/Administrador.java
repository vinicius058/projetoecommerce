package br.com.ecommerce.projetoecommerce.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_administrador")
public class Administrador {
	
	@Id
	@Column (name = "id_administrador")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column (name = "nome", length = 100, nullable = false)
	private String nome;
	
	@Column (name = "dt_nascimento", nullable = false)
	private LocalDateTime dataNascimento;
	
	@Column (name = "ds_cpf", length = 12, nullable = false)
	private String cpf;
	
	@Column (name = "ds_rg", length = 10, nullable = false)
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
