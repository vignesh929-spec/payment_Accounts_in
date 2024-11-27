package com.nebula.payment_Accounts_in.API;

import com.nebula.payment_Accounts_in.Application.model.Account;
import com.nebula.payment_Accounts_in.Application.model.EFTAccountRequest;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Validated

public interface PaymentAccountApi {

    @GetMapping(value = "/PaymentAccounts/EFT/{AccountID}" )
    Account EFTInstrumentDetails(  @PathVariable("AccountID") String AccountID );

    @PostMapping(value ="/PaymentAccounts/EFT" )
    Account EFTInstrumentDetails(@RequestBody Account PaymentAccount);
}
