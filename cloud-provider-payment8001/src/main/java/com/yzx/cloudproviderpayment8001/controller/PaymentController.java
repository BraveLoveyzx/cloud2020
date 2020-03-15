package com.yzx.cloudproviderpayment8001.controller;

import com.yzx.cloudcommon.api.CommonResult;
import com.yzx.cloudcommon.entity.cloudproviderpayment8001.Payment;
import com.yzx.cloudproviderpayment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Description: 支付控制层
 * @Param:
 * @return:
 * @Author: mastermind
 * @Date: 2020-03-15 18:45
 */
@Slf4j
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * @Description: 添加
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-03-15 18:46
     */
    @PostMapping("/add")
    public CommonResult add(@RequestBody Payment payment) {
        boolean save = paymentService.save(payment);
        if (save) {
            return new CommonResult(200, "操作成功");
        } else {
            return new CommonResult(444, "操作失败");
        }
    }

    /**
     * @Description: 根据主键查询
     * @Param:
     * @return:
     * @Author: mastermind
     * @Date: 2020-03-15 18:49
     */
    @GetMapping("/queryById")
    public CommonResult queryById(Long id) {
        Payment payment = paymentService.getById(id);
        if (!ObjectUtils.isEmpty(payment)) {
            return new CommonResult(200, "操作成功", payment);

        } else {
            return new CommonResult(200, "无记录", null);
        }
    }
}
