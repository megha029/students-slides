package com.example.demo.model;





import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.JoinColumn;


/*@Entity
@Table(name="depositaccount")*/
public class DepositAccount 
    extends Account
    implements Serializable
{

    final static long serialVersionUID = -1855989374714820950L;
    
    @Column(name="RefAccountId")
    protected Integer refAccountId;
    
    
    /**
     * Balance of funds in account
     * 
     */
    @Column
    private Double currentBalance;
    
    @Column
    private Double availableBalance;
    
    @Column
    private Date BalanceAsOf;
    @Column
   private  String CurrentBalance;
    @Column
    private String Term;
    @Column
    private String AvailableBalance;
    @Column
    private String DepositAccountId;
    @Column
    private Date MaturityDate;
    
    
    
    @Column(name="AccountMasterId")
   	protected Integer accountMasterId;
    
    @Column(name="ParentAccountId")
    private String parentAccountId;
    
    @Column(name="Nickname")
    private String nickname;
    
    @Column(name="AccountNumber")
    private String accountNumber;
    
    @Column(name="InterestRate")
    private Double interestRate;
    
    @Column(name="Currency")
    private String currency;
    
    @Column(name="LineOfBusiness")
    private String lineOfBusiness;
    
    @Column(name="AccDescriptorId")
    @JoinColumn(name="AccDescriptorId")
    private Double accDescriptorId;
    
    
    public String getLineOfBusiness() {
		return lineOfBusiness;
	}

	public void setLineOfBusiness(String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public Double getAccDescriptorId() {
		return accDescriptorId;
	}

	public void setAccDescriptorId(Double accDescriptorId) {
		this.accDescriptorId = accDescriptorId;
	}

	

	

	
	public Integer getAccountMasterId() {
		return accountMasterId;
	}

	public void setAccountMasterId(Integer accountMasterId) {
		this.accountMasterId = accountMasterId;
	}

	public String getParentAccountId() {
		return parentAccountId;
	}

	public void setParentAccountId(String parentAccountId) {
		this.parentAccountId = parentAccountId;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public DepositAccount(Integer refAccountId, Double currentBalance, Double availableBalance, Date balanceAsOf,
			String currentBalance2, String term, String availableBalance2, String depositAccountId, Date maturityDate) {
		super();
		this.refAccountId = refAccountId;
		this.currentBalance = currentBalance;
		this.availableBalance = availableBalance;
		BalanceAsOf = balanceAsOf;
		CurrentBalance = currentBalance2;
		Term = term;
		AvailableBalance = availableBalance2;
		DepositAccountId = depositAccountId;
		MaturityDate = maturityDate;
	}

	public DepositAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Double getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(Double currentBalance) {
		this.currentBalance = currentBalance;
	}
	public Double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}
	@Override
	public String toString() {
		return "DepositAccount [currentBalance=" + currentBalance + ", availableBalance=" + availableBalance + "]";
	}

	public Integer getRefAccountId() {
		return refAccountId;
	}

	public void setRefAccountId(Integer refAccountId) {
		this.refAccountId = refAccountId;
	}

	public Date getBalanceAsOf() {
		return BalanceAsOf;
	}

	public void setBalanceAsOf(Date balanceAsOf) {
		BalanceAsOf = balanceAsOf;
	}

	public String getTerm() {
		return Term;
	}

	public void setTerm(String term) {
		Term = term;
	}

	public String getDepositAccountId() {
		return DepositAccountId;
	}

	public void setDepositAccountId(String depositAccountId) {
		DepositAccountId = depositAccountId;
	}

	public Date getMaturityDate() {
		return MaturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		MaturityDate = maturityDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setCurrentBalance(String currentBalance) {
		CurrentBalance = currentBalance;
	}

	public void setAvailableBalance(String availableBalance) {
		AvailableBalance = availableBalance;
	}
   
   
     
   
    }

  

   
  


    
   
  

 

   



