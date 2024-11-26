package com.nebula.payment_Accounts_in.Application.model;



public class EFTAccountRequest {

    private String customerID;
    private String AccountType;
    private String Name;
    private String IFSC;
    private String AccountNumber;
    private boolean saveForFutureUse;
	public EFTAccountRequest() {
		super();
	}
	
	
	public EFTAccountRequest(String customerID, String accountType, String name, String iFSC, String accountNumber,
			boolean saveForFutureUse) {
		super();
		this.customerID = customerID;
		AccountType = accountType;
		Name = name;
		IFSC = iFSC;
		AccountNumber = accountNumber;
		this.saveForFutureUse = saveForFutureUse;
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
	public boolean isSaveForFutureUse() {
		return saveForFutureUse;
	}
	public void setSaveForFutureUse(boolean saveForFutureUse) {
		this.saveForFutureUse = saveForFutureUse;
	}
	@Override
	public String toString() {
		return "EFTInstrumentRequest [customerID=" + customerID + ", AccountType=" + AccountType + ", Name=" + Name
				+ ", IFSC=" + IFSC + ", AccountNumber=" + AccountNumber + ", saveForFutureUse=" + saveForFutureUse
				+ "]";
	}
    
    
}
