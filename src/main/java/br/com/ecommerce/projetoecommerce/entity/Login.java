package br.com.ecommerce.projetoecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "tb_login")
public class Login {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	@Column(name = "ds_usuario")
	private String usuario;
	
	@Column(name = "ds_senha")
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
