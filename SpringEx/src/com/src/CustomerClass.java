package com.src;
public class CustomerClass 
{
	private int custID;
	private String custName;
	private long mobileNo;
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {  //getter and setter methods
		this.custID = custID;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public void display()
	{
		System.out.println("Customer ID : "+custID);
	}
}
