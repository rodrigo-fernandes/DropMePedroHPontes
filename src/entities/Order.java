package entities;

import java.time.LocalDateTime;

public final class Order {

	private LocalDateTime d02 = LocalDateTime.now();
	private Products prod;
	private Double subTotal;
	private Registration reg;
	private String prodName;

	public Order(Products prod) {
		this.prod = prod;
		this.prodName = prod.getNameProduct(); // Atualiza o nome do produto
	}

	public Registration getReg() {
		return reg;
	}

	public void setReg(Registration reg) {
		this.reg = reg;
	}

	public Products getProd() {
		return prod;
	}

	public void setProd(Products prod) {
		this.prod = prod;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	@Override
	public String toString() {
		return prod.productsTag() + " Horario do pedido: " + d02;
	}

}
