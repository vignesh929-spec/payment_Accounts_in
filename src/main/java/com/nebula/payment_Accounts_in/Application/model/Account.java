package com.nebula.payment_Accounts_in.Application.model;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private String AccountID;
    private String customerID;
    private String AccountType;
    private String Name;
    private String IFSC;
    private String AccountNumber;
    private String CardBrand;
    private String CardNumber;
    private String ExpiryDate;
    private boolean saveForFutureUse;

    public Account() {
        super();
    }

    public Account(String accountID, String customerID, String accountType, String name, String IFSC, String accountNumber, String cardBrand, String cardNumber, String expiryDate, boolean saveForFutureUse) {
        this.AccountID = accountID;
        this.customerID = customerID;
        AccountType = accountType;
        Name = name;
        this.IFSC = IFSC;
        AccountNumber = accountNumber;
        CardBrand = cardBrand;
        CardNumber = cardNumber;
        ExpiryDate = expiryDate;
        this.saveForFutureUse = saveForFutureUse;
    }

    public String getAccountID() {
        return AccountID;
    }

    public void setAccountID(String accountID) {
        AccountID = accountID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String accountType) {
        AccountType = accountType;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String iFSC) {
        IFSC = iFSC;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getCardBrand() {
        return CardBrand;
    }

    public void setCardBrand(String cardBrand) {
        CardBrand = cardBrand;
    }

    public String getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(String cardNumber) {
        CardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public boolean isSaveForFutureUse() {
        return saveForFutureUse;
    }

    public void setSaveForFutureUse(boolean saveForFutureUse) {
        this.saveForFutureUse = saveForFutureUse;
    }

    @Override
    public String toString() {
        return "Account [AccountID=" + AccountID + ", customerID=" + customerID + ", AccountType=" + AccountType
                + ", Name=" + Name + ", IFSC=" + IFSC + ", AccountNumber=" + AccountNumber + ", CardBrand=" + CardBrand
                + ", CardNumber=" + CardNumber + ", ExpiryDate=" + ExpiryDate + ", saveForFutureUse=" + saveForFutureUse
                + "]";
    }


}
