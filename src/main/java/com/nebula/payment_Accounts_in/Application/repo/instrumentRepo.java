package com.nebula.payment_Accounts_in.Application.repo;

import com.nebula.payment_Accounts_in.Application.model.Account;
import com.nebula.payment_Accounts_in.Application.model.EFTAccountRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class instrumentRepo {

    List<Account> AccountList =new ArrayList<>();

    public instrumentRepo() {

        AccountList.add(new Account("1","LIC-cc","CC","vignesh","","","VI","334455668877","0526",true));

        AccountList.add(new Account("2","motocorp-cc","CC","amrutha","","","MC","887766554433","0726",false));

        AccountList.add(new Account("3","motocorp-eft","EFT","amrutha","IIBFC345","1234567890","","","",false));

        AccountList.add(new Account("4","LIC-eft","EFT","amrutha","Ifsc345","1234567890","","","",true));

    }

    public Account getAccountByID(String AccountID){

        for (Account list:AccountList){
            if (Objects.equals(list.getAccountID(),AccountID)) return list;
        }
        return null;
    }
    public Account addAccount(Account PaymentAccount){

        AccountList.add(PaymentAccount);

        return PaymentAccount;
    }


}
