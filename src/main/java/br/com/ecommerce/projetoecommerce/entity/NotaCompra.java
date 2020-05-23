package br.com.ecommerce.projetoecommerce.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name = "tb_nota_compra")
public class NotaCompra {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_garantia_padrao")
	private Date garantiaPadrao;

	@Temporal(TemporalType.DATE)
	@Column(name = "dt_garantia_extendida")
	private Date garantiaExtendida;
	
	@Column(name = "vl_valor_total", nullable = false)
	private float valorTotal;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_compra", nullable = false)
	private Date dataCompra;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_entrega", nullable = false)
	private Date dataEntrega;
	
	private Cliente cliente;
	
	private Produto produto;
	
	public NotaCompra() {
	}

	public NotaCompra(int codigo, Date garantiaPadrao, Date garantiaExtendida, float valorTotal,
			Date dataCompra, Date dataEntrega, Cliente cliente, Produto produto) {
		super();
		this.codigo = codigo;
		this.garantiaPadrao = garantiaPadrao;
		this.garantiaExtendida = garantiaExtendida;
		this.valorTotal = valorTotal;
		this.dataCompra = dataCompra;
		this.dataEntrega = dataEntrega;
		this.cliente = cliente;
		this.produto = produto;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getGarantiaPadrao() {
		return garantiaPadrao;
	}

	public void setGarantiaPadrao(Date garantiaPadrao) {
		this.garantiaPadrao = garantiaPadrao;
	}

	public Date getGarantiaExtendida() {
		return garantiaExtendida;
	}

	public void setGarantiaExtendida(Date garantiaExtendida) {
		this.garantiaExtendida = garantiaExtendida;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Date dataCompra) {
		this.dataCompra = dataCompra;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

}
