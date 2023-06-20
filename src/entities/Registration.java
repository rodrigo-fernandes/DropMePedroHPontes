package entities;

import java.util.ArrayList;
import java.util.List;

import entities.domain.ValueMoney;

public class Registration {

	private String nameShipper;
	private String userName;
	private String email;
	private String password;
	private SupplierRegistratio supplier; // Sempre que compor objetos lembrar de criar os gets e sets
	private Double initialMoney = ValueMoney.VALUE_MONEY_3500;
	private Products prod;
	private static List<Registration> list = new ArrayList<>();

	public Registration() {
	}

	public Registration(String nameShipper, String userName, String email, String password) {
		super();
		this.nameShipper = nameShipper;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}

	public String getNameShipper() {
		return nameShipper;
	}

	public void setNameShipper(String nameShipper) {
		this.nameShipper = nameShipper;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SupplierRegistratio getSupplier() {
		return supplier;
	}

	public void setSupplier(SupplierRegistratio supplier) {
		this.supplier = supplier;
	}

	public Double getInitialMoney() {
		return initialMoney;
	}

	public void setInitialMoney(Double initialMoney) {
		this.initialMoney = initialMoney;
	}

	public Products getProd() {
		return prod;
	}

	public void setProd(Products prod) {
		this.prod = prod;
	}

	public void requestRegister(String nameShipper, String userName, String email, String password) {
		StringBuilder sb = new StringBuilder();
		sb.append("=========================================");
		sb.append("Registration completed!");
		sb.append("Name: ").append(nameShipper);
		sb.append("Username: ").append(userName);
		sb.append("Email: ").append(email);
		sb.append("Password: ").append(password);
		sb.append("=========================================");
		sb.append("");
		System.out.println(sb.toString());
	}

	public static void addRegistration(Registration registration) {
		list.add(registration);
	}

	public static void removeRegistration(Registration registration) {
		list.remove(registration);
	}

	public static List<Registration> getList() {
		return list;
	}

	public static void setList(List<Registration> list) {
		Registration.list = list;
	}

	public void autentication(String pass) {
		if (this.getPassword().equals(pass)) {
			System.out.println("Welcome, " + this.getUserName());
			System.out.println("Lets begin something");
		} else {
			System.out.println("Autentication error, try again later!");
		}

	}

	@Override
	public String toString() {
		return "Registration [nameShipper=" + nameShipper + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + ", supplier=" + supplier + ", initialMoney=" + initialMoney + ", prod="
				+ prod + "]";
	}

	public static void setList(int i, Registration shipper1) {
		// TODO Auto-generated method stub

	}

}
