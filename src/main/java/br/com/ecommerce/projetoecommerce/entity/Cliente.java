package br.com.ecommerce.projetoecommerce.entity;

import java.util.Date;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name = "tb_cliente")
public class Cliente {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name ="ds_nome", nullable = false, length = 100)
	private String nome;
	
	@Column(name ="ds_email", nullable = false, length = 30)
	private String email;
	
	@Temporal(TemporalType.DATE)
	@Column(name ="dt_nascimento", nullable = false)
	private Date dataNascimento;
	
	@Column(name ="ds_cpf", nullable = false, length = 13)
	private String cpf;
	
	@Column(name ="ds_rg", nullable = false, length = 10)
	private String rg;
	
	@Column(name ="id_numero_cartao", length = 16)
	private Long numeroCartao;
	
	private Endereco endereco;

	
	 public Cliente() {
	}
	
	public Cliente(int codigo, String nome, String email, Date dataNascimento, String cpf, String rg,
			Long numeroCatao, Endereco endereco) {
		super();
		this.setCodigo(codigo);
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.numeroCartao = numeroCatao;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
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

	public Long getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(Long numeroCatao) {
		this.numeroCartao = numeroCatao;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	


}

