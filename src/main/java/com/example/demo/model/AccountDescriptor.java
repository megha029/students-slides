
package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


@Entity
@Table(name="accountdescriptor")
public class AccountDescriptor implements Serializable
{

    final static long serialVersionUID = 72984021864032166L;
  
    @Column(name="AccountId")
    private String accountId;
    
    @Id
    @Column(name="AccountDescriptorId")
    private Double accountDescriptorId;
    
    
    @Column(name="AccountType")
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    
    @Column(name="DisplayName")
    private String displayName;
    
    @Column(name="Description")
    private String Description;
    
    @Column(name="Status")
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @Column(name="CustomerId")
    private String CustomerId;

    /**
     * Creates a new AccountDescriptor.
     * 
     */
    public AccountDescriptor() {
        super();
    }

    /**
     * Creates a new AccountDescriptor.
     * 
     */
    

    /**
     * Returns the accountId.
     * 
     * @return
     *     accountId
     */
    public String getAccountId() {
        return accountId;
    }

   



	public AccountDescriptor(String accountId, Double accountDescriptorId, AccountType accountType, String displayName,
			String description, Status status, String customerId) {
		super();
		this.accountId = accountId;
		this.accountDescriptorId = accountDescriptorId;
		this.accountType = accountType;
		this.displayName = displayName;
		Description = description;
		this.status = status;
		CustomerId = customerId;
	}

	/**
     * Set the accountId.
     * 
     * @param accountId
     *     the new accountId
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * Returns the accountDescriptorId.
     * 
     * @return
     *     accountDescriptorId
     */
    public Double getAccountDescriptorId() {
        return accountDescriptorId;
    }

    /**
     * Set the accountDescriptorId.
     * 
     * @param accountDescriptorId
     *     the new accountDescriptorId
     */
    public void setAccountDescriptorId(Double accountDescriptorId) {
        this.accountDescriptorId = accountDescriptorId;
    }

    /**
     * Returns the accountType.
     * 
     * @return
     *     accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Set the accountType.
     * 
     * @param accountType
     *     the new accountType
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * Returns the displayName.
     * 
     * @return
     *     displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Set the displayName.
     * 
     * @param displayName
     *     the new displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Returns the status.
     * 
     * @return
     *     status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Set the status.
     * 
     * @param status
     *     the new status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(accountDescriptorId).append(accountType).append(displayName).append(status).toHashCode();
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
        AccountDescriptor otherObject = ((AccountDescriptor) other);
        return new EqualsBuilder().append(accountId, otherObject.accountId).append(accountDescriptorId, otherObject.accountDescriptorId).append(accountType, otherObject.accountType).append(displayName, otherObject.displayName).append(status, otherObject.status).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).append("accountId", accountId).append("accountDescriptorId", accountDescriptorId).append("accountType", accountType).append("displayName", displayName).append("status", status).toString();
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
