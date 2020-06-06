package br.com.ecommerce.projetoecommerce.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	private Date dataNascimento;
	
	@Column (name = "ds_cpf", length = 12, nullable = false)
	private String cpf;
	
	@Column (name = "ds_rg", length = 10, nullable = false)
	private String rg;
	
	@OneToOne (cascade = { CascadeType.PERSIST, CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_login", nullable = false, unique = true)
	private Login login;
	
	@OneToMany (mappedBy = "administrador" )
	private List <Produto> produtos = new ArrayList <>(); 
	
	
	public Administrador() {
	
	}

	public Administrador(int codigo, String nome, Date dataNascimento, String cpf, String rg) {
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

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List <Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List <Produto> produtos) {
		this.produtos = produtos;
	}
	
	

}
