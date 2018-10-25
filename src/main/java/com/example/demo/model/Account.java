
package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;


@Entity
@Table(name="account")

public class Account
    extends AccountDescriptor
    implements Serializable
{

    final static long serialVersionUID = 71331538647348038L;
    
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

	public Double getTransferIn() {
		return transferIn;
	}

	public void setTransferIn(Double transferIn) {
		this.transferIn = transferIn;
	}

	public Double getTransferOut() {
		return transferOut;
	}

	public void setTransferOut(Double transferOut) {
		this.transferOut = transferOut;
	}

	public String getInterestRateType() {
		return interestRateType;
	}

	public void setInterestRateType(String interestRateType) {
		this.interestRateType = interestRateType;
	}

	@Column
    private Double transferIn;
    @Column
    private Double transferOut;
    
    @Column
    private String interestRateType; 
    
    @Column
    private String accountId;
    @Id
    @Column
    private Double accountDescriptorId;
    
    
    @Column
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    
    @Column
    private String displayName;
    
    @Column
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @Column
    private String Description;
    
    @Column
    private String CustomerId;


    /**
     * Creates a new Account.
     * 
     */
    public Account() {
        super();
    }

    /**
     * Creates a new Account.
     * 
     */
    

    /**
     * Returns the parentAccountId.
     * 
     * @return
     *     parentAccountId
     */
    public String getParentAccountId() {
        return parentAccountId;
    }

  

	

	

	


	public Account(Integer accountMasterId, String parentAccountId, String nickname, String accountNumber,
			Double interestRate, String currency, String lineOfBusiness, Double accDescriptorId, Double transferIn,
			Double transferOut, String interestRateType, String accountId, Double accountDescriptorId,
			AccountType accountType, String displayName, Status status, String description, String customerId) {
		super( accountId,  accountDescriptorId,  accountType,  displayName,
				description,  status,  customerId);
		this.accountMasterId = accountMasterId;
		this.parentAccountId = parentAccountId;
		this.nickname = nickname;
		this.accountNumber = accountNumber;
		this.interestRate = interestRate;
		this.currency = currency;
		this.lineOfBusiness = lineOfBusiness;
		this.accDescriptorId = accDescriptorId;
		this.transferIn = transferIn;
		this.transferOut = transferOut;
		this.interestRateType = interestRateType;
		this.accountId = accountId;
		this.accountDescriptorId = accountDescriptorId;
		this.accountType = accountType;
		this.displayName = displayName;
		this.status = status;
		Description = description;
		CustomerId = customerId;
	}

	/**
     * Set the parentAccountId.
     * 
     * @param parentAccountId
     *     the new parentAccountId
     */
    public void setParentAccountId(String parentAccountId) {
        this.parentAccountId = parentAccountId;
    }

    /**
     * Returns the nickname.
     * 
     * @return
     *     nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Set the nickname.
     * 
     * @param nickname
     *     the new nickname
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * Returns the accountNumber.
     * 
     * @return
     *     accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Set the accountNumber.
     * 
     * @param accountNumber
     *     the new accountNumber
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Returns the interestRate.
     * 
     * @return
     *     interestRate
     */
    public Double getInterestRate() {
        return interestRate;
    }

    /**
     * Set the interestRate.
     * 
     * @param interestRate
     *     the new interestRate
     */
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Returns the currency.
     * 
     * @return
     *     currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Set the currency.
     * 
     * @param currency
     *     the new currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(parentAccountId).append(nickname).append(accountNumber).append(interestRate).append(currency).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (this.getClass()!= other.getClass()) {
            return false;
        }
        Account otherObject = ((Account) other);
        return new EqualsBuilder().appendSuper(super.equals(otherObject)).append(parentAccountId, otherObject.parentAccountId).append(nickname, otherObject.nickname).append(accountNumber, otherObject.accountNumber).append(interestRate, otherObject.interestRate).append(currency, otherObject.currency).isEquals();
    }

    
	@Override
	public String toString() {
		return "Account [accountMasterId=" + accountMasterId + ", parentAccountId=" + parentAccountId + ", nickname="
				+ nickname + ", accountNumber=" + accountNumber + ", interestRate=" + interestRate + ", currency="
				+ currency + ", lineOfBusiness=" + lineOfBusiness + ", accDescriptorId=" + accDescriptorId
				+ ", transferIn=" + transferIn + ", transferOut=" + transferOut + ", interestRateType="
				+ interestRateType + ", accountId=" + accountId + ", accountDescriptorId=" + accountDescriptorId
				+ ", accountType=" + accountType + ", displayName=" + displayName + ", status=" + status
				+ ", Description=" + Description + ", CustomerId=" + CustomerId + "]";
	}

	public Integer getAccountMasterId() {
		return accountMasterId;
	}

	public void setAccountMasterId(Integer accountMasterId) {
		this.accountMasterId = accountMasterId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Double getAccountDescriptorId() {
		return accountDescriptorId;
	}

	public void setAccountDescriptorId(Double accountDescriptorId) {
		this.accountDescriptorId = accountDescriptorId;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

}
