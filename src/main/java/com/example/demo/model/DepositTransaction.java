
package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
@Entity
@Table(name="deposittransaction")
public class DepositTransaction
    extends Transaction
    implements Serializable
{

    final static long serialVersionUID = 8105802149458753967L;
    
    @Column(name="TransactionType")
    private TransactionType transactionType;
    
    @Column(name="Payee")
    private String payee;
   
    @Column(name="CheckNumber")
    private Long checkNumber;
    
    @Column(name = "TransactionId")
	private String transactionId;
   
    /**
     * Creates a new DepositTransaction.
     * 
     */
    public DepositTransaction() {
        super();
    }

    /**
     * Creates a new DepositTransaction.
     * 
     */
   

    /**
     * Returns the transactionType.
     * 
     * @return
     *     transactionType
     */
   
    public TransactionType getTransactionType() {
        return transactionType;
    }

   

	public DepositTransaction(TransactionType transactionType, String payee, Long checkNumber, String transactionId) {
		super();
		this.transactionType = transactionType;
		this.payee = payee;
		this.checkNumber = checkNumber;
		this.transactionId = transactionId;
	}

	/**
     * Set the transactionType.
     * 
     * @param transactionType
     *     the new transactionType
     */
    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * Returns the payee.
     * 
     * @return
     *     payee
     */
   
    public String getPayee() {
        return payee;
    }

    /**
     * Set the payee.
     * 
     * @param payee
     *     the new payee
     */
    public void setPayee(String payee) {
        this.payee = payee;
    }

    /**
     * Returns the checkNumber.
     * 
     * @return
     *     checkNumber
     */
   
    public Long getCheckNumber() {
        return checkNumber;
    }

    /**
     * Set the checkNumber.
     * 
     * @param checkNumber
     *     the new checkNumber
     */
    public void setCheckNumber(Long checkNumber) {
        this.checkNumber = checkNumber;
    }

    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(transactionType).append(payee).append(checkNumber).toHashCode();
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
        DepositTransaction otherObject = ((DepositTransaction) other);
        return new EqualsBuilder().appendSuper(super.equals(otherObject)).append(transactionType, otherObject.transactionType).append(payee, otherObject.payee).append(checkNumber, otherObject.checkNumber).isEquals();
    }

    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("transactionType", transactionType).append("payee", payee).append("checkNumber", checkNumber).toString();
    }

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

}
