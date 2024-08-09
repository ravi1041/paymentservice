/**
 * 
 */
package com.practice.paymentservice.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.practice.paymentservice.bean.PaymentStatus;
import com.practice.paymentservice.dto.PaymentDto;
import com.practice.paymentservice.model.PaymentDetails;
import com.practice.paymentservice.util.PaymentServiceUtil;

/**
 * This is a Payment Service Calss
 * 
 * @author ravia
 *
 */

@Service
public class PaymentServiceImpl implements PaymentService {

	/**
	 * This Payment service method used to validate the payment details and done the
	 * payment
	 */
	@Override
	public String doOrderPayment(PaymentDto paymentDto) {
		PaymentDetails pDetails = new PaymentDetails(paymentDto.getOrderId(), paymentDto.getCardNumber(),
				paymentDto.getAmount());
		if (null == paymentDto.getCardNumber() || paymentDto.getCardNumber().isBlank()
				|| paymentDto.getCardNumber().startsWith("999") || paymentDto.getAmount() <= 0) {
			pDetails.setPaymentStatus(PaymentStatus.FAILED);
			PaymentServiceUtil.PAYMENT_LIST.add(pDetails);
			return "FAIL";
		}
		pDetails.setPaymentId(UUID.randomUUID().toString());
		pDetails.setPaymentStatus(PaymentStatus.SUCCESS);
		PaymentServiceUtil.PAYMENT_LIST.add(pDetails);
		return UUID.randomUUID().toString();
	}

}
