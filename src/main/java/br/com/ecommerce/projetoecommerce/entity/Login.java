package br.com.ecommerce.projetoecommerce.entity;

public class Login {

	private int codigo;
	private String usuario;
	private String senha;
	
	public Login() {
		
	}
	
	public Login(int codigo, String usuario, String senha) {
		super();
		this.codigo = codigo;
		this.usuario = usuario;
		this.senha = senha;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int id_login) {
		this.codigo = id_login;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}	
}
