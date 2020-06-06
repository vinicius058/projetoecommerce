package br.com.ecommerce.projetoecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table(name = "tb_produto")
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "ds_nome" , nullable = false, length = 100)
	private String nome;
	
	@Column(name = "vl_preco", nullable = false)
	private float preço;
	
	@Column(name = "ds_cor")
	private String cor;
	
	@Column(name = "ds_marca", nullable = false , length = 100)
	private String marca;
	
	@Column(name = "ds_descricao")
	private String descricao;
	
	@Column(name = "qt_estoque")
	private int estoque;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn (name = "id_administrador", nullable = false) 
	private Administrador administrador ;
	


	private NotaCompra notaCompra;
	
	public Produto() {
		
	}

	
	public Produto(int codigo, String nome, float preço, String cor, String marca, String descricao, int estoque,
			Administrador administrador) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preço = preço;
		this.cor = cor;
		this.marca = marca;
		this.descricao = descricao;
		this.estoque = estoque;
		this.administrador = administrador;
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
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public NotaCompra getNotaCompra() {
		return notaCompra;
	}


	public void setNotaCompra(NotaCompra notaCompra) {
		this.notaCompra = notaCompra;
	}
	
	public Administrador getAdministrador() {
		return administrador;
	}


	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}

	

}
