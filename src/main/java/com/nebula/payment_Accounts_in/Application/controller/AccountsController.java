package com.nebula.payment_Accounts_in.Application.controller;

import com.nebula.payment_Accounts_in.API.PaymentAccountApi;
import com.nebula.payment_Accounts_in.Application.model.Account;
import com.nebula.payment_Accounts_in.Application.model.EFTAccountRequest;
import com.nebula.payment_Accounts_in.Application.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController implements PaymentAccountApi {

    @Autowired
    public AccountService AccountService;
    @Override
    public Account EFTInstrumentDetails(String AccountID) {
        return AccountService.getAccountbyIDService(AccountID);
    }

    @Override
    public Account EFTInstrumentDetails(Account PaymentAccount) {
        System.out.println(PaymentAccount);
        return AccountService.addAccountService(PaymentAccount);
    }


}
