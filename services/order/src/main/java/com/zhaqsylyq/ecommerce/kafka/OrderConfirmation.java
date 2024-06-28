package com.zhaqsylyq.ecommerce.kafka;

import com.zhaqsylyq.ecommerce.customer.CustomerResponse;
import com.zhaqsylyq.ecommerce.order.PaymentMethod;
import com.zhaqsylyq.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
