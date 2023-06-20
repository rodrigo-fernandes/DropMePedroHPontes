package entities;

import entities.domain.ValueMoney;

public class Products {

	private String nameProduct;
	private Double productPrice;
	private Registration register;
	private SupplierRegistratio supp;
	private Order order;
	private Double initialMoney = ValueMoney.VALUE_MONEY_3500;

	public Products() {
	}

	public Products(String namePrdouct, Double productPrice) {
		this.nameProduct = namePrdouct;
		this.productPrice = productPrice;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Registration getRegister() {
		return register;
	}

	public void setRegister(Registration register) {
		this.register = register;
	}

	public SupplierRegistratio getSupp() {
		return supp;
	}

	public void setSupp(SupplierRegistratio supp) {
		this.supp = supp;
	}

	public Double initialMoney() {
		return initialMoney = ValueMoney.VALUE_MONEY_3500;
	}

	public Double descountedMoney() {
		return initialMoney -= getProductPrice();
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String productsTag() {
		return "Products: " + this.nameProduct + ", Products Price: " + productPrice;
	}
}