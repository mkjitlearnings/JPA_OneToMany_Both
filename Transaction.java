package com.capg.jpa.p1;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tId;
	private LocalDateTime transactionTimestamp;
	private int transactionAmount;
	private String transactionName;
	
	/*
	 * Note : mapped by is not avalibale with @ManyToOne 
	 * because in the parent table no child PK column will be created 
	 * */
	
	@ManyToOne
	@JoinColumn(name="Account_Number")
	private Account account;
	
	public Transaction(LocalDateTime transactionTimestamp, int transactionAmount, String transactionName) {
		super();
		this.transactionTimestamp = transactionTimestamp;
		this.transactionAmount = transactionAmount;
		this.transactionName = transactionName;
	}
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public LocalDateTime getTransactionTimestamp() {
		return transactionTimestamp;
	}
	public void setTransactionTimestamp(LocalDateTime transactionTimestamp) {
		this.transactionTimestamp = transactionTimestamp;
	}
	public int getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	public String getTransactionName() {
		return transactionName;
	}
	public void setTransactionName(String transactionName) {
		this.transactionName = transactionName;
	}
	@Override
	public String toString() {
		return "Transaction [tId=" + tId + ", transactionTimestamp=" + transactionTimestamp + ", transactionAmount="
				+ transactionAmount + ", transactionName=" + transactionName + "]";
	}
	
	

}
