package com.codingexercise.model;

public class MonthlyPayslip {
	
	Employee employee;
	String fromDate;
	String toDate;
	int grossIncome;
	int incomeTax;
	int superannuation;
	int netIncome;
	
	public MonthlyPayslip(Employee employee, String fromDate, String toDate, int grossIncome, int incomeTax, int superannuation, int netIncome) {
		setEmployee(employee);
		setFromDate(fromDate);
		setToDate(toDate);
		setGrossIncome(grossIncome);
		setIncomeTax(incomeTax);
		setSuperannuation(superannuation);
		setNetIncome(netIncome);
	}
	
	public Employee getEmployee() {
		return employee;
	}
	
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String getFromDate() {
		return fromDate;
	}
	
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getToDate() {
		return toDate;
	}
	
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public int getGrossIncome() {
		return grossIncome;
	}
	
	public void setGrossIncome(int grossIncome) {
		this.grossIncome = grossIncome;
	}
	
	public int getIncomeTax() {
		return incomeTax;
	}
	
	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}
	
	public int getSuperannuation() {
		return superannuation;
	}
	
	public void setSuperannuation(int superannuation) {
		this.superannuation = superannuation;
	}
	
	public int getNetIncome() {
		return netIncome;
	}
	
	public void setNetIncome(int netIncome) {
		this.netIncome = netIncome;
	}
	
}
