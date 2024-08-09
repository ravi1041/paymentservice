package com.practice.paymentservice.model;

import java.util.Date;

import com.practice.paymentservice.bean.PaymentStatus;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PaymentDetails {
	private String paymentId;
	private String orderId;
	private String cardNumber;
	private double amount;
	private PaymentStatus paymentStatus;
	private Date paymentTime;
	public PaymentDetails(String orderId, String cardNumber, double amount) {
		super();
		this.orderId = orderId;
		this.cardNumber = cardNumber;
		this.amount = amount;
		this.paymentStatus = PaymentStatus.PENDING;
		this.paymentTime = new Date();
	}	
}
