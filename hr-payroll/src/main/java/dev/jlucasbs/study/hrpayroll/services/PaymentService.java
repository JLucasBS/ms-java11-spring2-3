package dev.jlucasbs.study.hrpayroll.services;

import org.springframework.stereotype.Service;

import dev.jlucasbs.study.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 200.00, days);
	}
}
