package br.com.ecommerce.projetoecommerce.entity;

public class Produto {
	
	private int codigo;
	private String nome;
	private float preço;
	private String cor;
	private String marca;
	private String descricao;
	private int estoque;
	private int codigoAdministrador;
	
	public Produto() {
		
	}

	
	public Produto(int codigo, String nome, float preço, String cor, String marca, String descricao, int estoque,
			int codigoAdministrador) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preço = preço;
		this.cor = cor;
		this.marca = marca;
		this.descricao = descricao;
		this.estoque = estoque;
		this.codigoAdministrador = codigoAdministrador;
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
	public int getCodigoAdministrador() {
		return codigoAdministrador;
	}
	public void setCodigoAdministrador(int codigoAdministrador) {
		this.codigoAdministrador = codigoAdministrador;
	}
	

}
