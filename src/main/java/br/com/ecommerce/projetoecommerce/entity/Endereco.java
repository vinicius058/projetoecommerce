package br.com.ecommerce.projetoecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "tb_endereco")
public class Endereco {
	@Id
	@Column(name = "id_endereco")
	private int codigo;
	
	@Column(name = "ds_logradouro", nullable = false)
	private String logradouro;
	
	@Column(name = "ds_numero", nullable = false)
	private int numero;
	
	@Column(name = "ds_complemento")
	private String complemento;
	
	@Column(name = "ds_cep", nullable = false)
	private String cep;
	
	@Column(name = "ds_bairro", nullable = false)
	private String bairro;
	
	@Column(name = "ds_cidade", nullable = false)
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ds_uf", length = 2)
	private UF uf;

	@ManyToMany (mappedBy = "enderecos", cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER )
	private List <Cliente> clientes = new ArrayList <>();
	
	
	
	public Endereco() {
		
	}
	
	public Endereco(int codigo, String logradouro, int numero, String complemento, String cep, String bairro,
			String cidade) {
		super();
		this.codigo = codigo;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public List <Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List <Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
