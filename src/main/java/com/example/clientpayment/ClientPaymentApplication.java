package com.example.clientpayment;

import com.example.clientpayment.model.PaymentRequest;
import com.example.clientpayment.repository.PaymentEntity;
import com.example.clientpayment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientPaymentApplication implements CommandLineRunner {
	@Autowired
	private PaymentService paymentService;

	@Override
	public void run(String... args) throws Exception {
		paymentService.createPayment(new PaymentRequest("asd", "wad", 123));
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientPaymentApplication.class, args);
	}

}
