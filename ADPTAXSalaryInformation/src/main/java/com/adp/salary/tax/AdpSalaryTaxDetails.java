package com.adp.salary.tax;

public class AdpSalaryTaxDetails {

	private Integer eno;
	private Double taxAmount;
	private Double salaryAfterTax;
	private Integer portNumber;

	public AdpSalaryTaxDetails() {
		super();
	}

	public AdpSalaryTaxDetails(Integer eno, Double taxAmount, Double salaryAfterTax, Integer portNumber) {
		super();
		this.eno = eno;
		this.taxAmount = taxAmount;
		this.salaryAfterTax = salaryAfterTax;

	}

	
	public Integer getPortNumber() {
		return portNumber;
	}

	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}

	public Integer getEno() {
		return eno;
	}

	public void setEno(Integer eno) {
		this.eno = eno;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Double getSalaryAfterTax() {
		return salaryAfterTax;
	}

	public void setSalaryAfterTax(Double salaryAfterTax) {
		this.salaryAfterTax = salaryAfterTax;
	}

}
