package br.com.ecommerce.projetoecommerce.entity;

import java.time.LocalDateTime;

public class NotaCompra {
	private int codigo;

	private LocalDateTime garantiaPadrao;

	private LocalDateTime garantiaExtendida;

	private float valorTotal;

	private LocalDateTime dataCompra;

	private LocalDateTime dataEntrega;

	private Cliente cliente;

	private Produto produto;

	public NotaCompra() {
	}

	public NotaCompra(int codigo, LocalDateTime garantiaPadrao, LocalDateTime garantiaExtendida, float valorTotal,
			LocalDateTime dataCompra, LocalDateTime dataEntrega, Cliente cliente, Produto produto) {
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

	public LocalDateTime getGarantiaPadrao() {
		return garantiaPadrao;
	}

	public void setGarantiaPadrao(LocalDateTime garantiaPadrao) {
		this.garantiaPadrao = garantiaPadrao;
	}

	public LocalDateTime getGarantiaExtendida() {
		return garantiaExtendida;
	}

	public void setGarantiaExtendida(LocalDateTime garantiaExtendida) {
		this.garantiaExtendida = garantiaExtendida;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public LocalDateTime getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(LocalDateTime dataCompra) {
		this.dataCompra = dataCompra;
	}

	public LocalDateTime getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDateTime dataEntrega) {
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
