package com.yzx.cloudproviderpayment8001.servicetest;


import com.yzx.cloudcommon.entity.cloudproviderpayment8001.Payment;
import com.yzx.cloudproviderpayment8001.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PaymentServiceTest {

    @Autowired
    private PaymentService paymentService;

    @Test
    public void selectTest() {
        Payment byId = paymentService.getById(1L);
        System.err.println(byId);

    }
}
