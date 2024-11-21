package com.nebula.payment_Accounts_in.API;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.lang.reflect.Parameter;

@Validated

public interface PaymentAccountApi {

    @GetMapping(value = "/PaymentAccounts/{AccountID}" )
    String GetInstrumentDetails(  @PathVariable("AccountID") String AccountID );

}
