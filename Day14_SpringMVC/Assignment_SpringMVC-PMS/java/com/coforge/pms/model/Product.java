package com.coforge.pms.model;

public class Product {
	private int pid;
	private String pname;
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", pquantity=" + pquantity + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public int getPquantity() {
		return pquantity;
	}
	public void setPquantity(int pquantity) {
		this.pquantity = pquantity;
	}
	public Product(int pid, String pname, int pprice, int pquantity) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.pquantity = pquantity;
	}
	private int pprice;
	private int pquantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
}
