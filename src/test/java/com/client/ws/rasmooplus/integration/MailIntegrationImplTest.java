package com.client.ws.rasmooplus.integration;

import com.client.ws.rasmooplus.dto.wsraspay.CreditCardDto;
import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class MailIntegrationImplTest {

    @Autowired
    private MailIntegration mailIntegration;

//    @Test
//    void createCustomerWhenDtoOK(){
//        mailIntegration.send("rasmoocontateste@gmail.com", "OLá Gmail","Acesso liberado");
//    }
}
