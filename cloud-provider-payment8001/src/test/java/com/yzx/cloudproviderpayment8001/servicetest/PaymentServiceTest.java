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

    /**
     * @Description: 根据主键查询
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-03-15 18:42
     */
    @Test
    public void selectTest() {
        Payment byId = paymentService.getById(1L);
        System.err.println(byId);
    }

    /**
     * @Description: 添加测试
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-03-15 18:42
     */
    @Test
    public void addTest() {

        paymentService.save(new Payment().setSerial("mastermind"));

    }
}
