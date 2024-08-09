/**
 * 
 */
package com.practice.paymentservice.service;

import com.practice.paymentservice.dto.PaymentDto;

/**
 * @author Ravi Avala
 *
 */
public interface PaymentService {
	public String doOrderPayment(PaymentDto paymentDto);

}
