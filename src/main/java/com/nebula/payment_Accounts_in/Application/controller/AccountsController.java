package com.nebula.payment_Accounts_in.Application.controller;

import com.nebula.payment_Accounts_in.API.PaymentAccountApi;
import com.nebula.payment_Accounts_in.Application.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController implements PaymentAccountApi {

    @Autowired
    public AccountService AccountService;
    @Override
    public String GetInstrumentDetails(String AccountID) {
        return AccountService.getAccount(AccountID);
    }
}
