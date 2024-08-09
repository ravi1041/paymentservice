package com.practice.paymentservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PaymentDto {
	private String orderId;
	private String cardNumber;
	private double amount;
}
