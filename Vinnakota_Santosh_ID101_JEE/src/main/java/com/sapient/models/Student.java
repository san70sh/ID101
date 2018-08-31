package com.sapient.models;

public class Student {

	private String RollNo;
	private int percent;
	private int sc1;
	private int sc2;
	private int sc3;
	private boolean valid;
	

	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	public int getSc1() {
		return sc1;
	}
	public void setSc1(int sc1) {
		this.sc1 = sc1;
	}
	public int getSc2() {
		return sc2;
	}
	public void setSc2(int sc2) {
		this.sc2 = sc2;
	}
	public int getSc3() {
		return sc3;
	}
	public void setSc3(int sc3) {
		this.sc3 = sc3;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	@Override
	public String toString() {
		return "Student [RollNo=" + RollNo + ", percent=" + percent + ", sc1=" + sc1 + ", sc2=" + sc2 + ", sc3="
				+ sc3 + ", valid=" + valid + "]";
	}


	
}
