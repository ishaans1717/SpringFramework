package com.Ishaan.demo.restaurant.service;

import com.Ishaan.demo.restaurant.entities.PaymentMethods;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class RestaurantPaymentMethodsService {

    public List<PaymentMethods> getPaymentMethods() {
        List<PaymentMethods> paymentMethods = new ArrayList<>();
        PaymentMethods paymentMethod = new PaymentMethods();
        paymentMethod.setCash("cash is allowed");
        paymentMethod.setCreditCards("Credit Cards are allowed");
        paymentMethod.setDebitCards("Debit cards are allowed");
        PaymentMethods paymentMethod1 = new PaymentMethods();
        paymentMethod1.setCash("cash is allowed");
        paymentMethod1.setCreditCards("Credit Cards are not allowed");
        paymentMethod1.setDebitCards("Debit cards are allowed");
        PaymentMethods paymentMethod2 = new PaymentMethods();
        paymentMethod2.setCash("cash is allowed");
        paymentMethod2.setCreditCards("Credit Cards are not allowed");
        paymentMethod2.setDebitCards("Debit cards are not allowed");

        paymentMethods.add(paymentMethod);
        paymentMethods.add(paymentMethod1);
        paymentMethods.add(paymentMethod2);
        return paymentMethods;
    }
}
