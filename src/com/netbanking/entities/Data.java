package com.netbanking.entities;

import java.util.Date;

public class Data {
	private String userid;
	private Date date;
	private String type;
	private long amount;
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Data(String userid, Date date, String type, long amount) {
		super();
		this.userid = userid;
		this.date = date;
		this.type = type;
		this.amount = amount;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Data [userid=" + userid + ", date=" + date + ", type=" + type + ", amount=" + amount + "]";
	}
	
}
