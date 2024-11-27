package com.nebula.payment_Accounts_in.Application.service;

import com.nebula.payment_Accounts_in.Application.model.Account;
import com.nebula.payment_Accounts_in.Application.model.EFTAccountRequest;
import com.nebula.payment_Accounts_in.Application.repo.instrumentRepo;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    instrumentRepo instrumentRepo =new instrumentRepo();

    public Account getAccountbyIDService(String AccountID){

        return instrumentRepo.getAccountByID(AccountID);
    }
    public Account addAccountService(Account PaymentAccount){
        return instrumentRepo.addAccount(PaymentAccount);
    }
}
