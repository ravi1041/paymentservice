package com.practice.paymentservice.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.paymentservice.dto.PaymentDto;
import com.practice.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentServiceControler {

	@Autowired
	private PaymentService paymentService;

	@PostMapping
	public String doOrderPayment(@RequestBody PaymentDto paymentDto) {
		return paymentService.doOrderPayment(paymentDto);
	}
}
