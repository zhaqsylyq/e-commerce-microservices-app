package com.zhaqsylyq.ecommerce.payment;

import com.zhaqsylyq.ecommerce.customer.CustomerResponse;
import com.zhaqsylyq.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
