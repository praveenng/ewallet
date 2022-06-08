package com.unibrain.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentDetails {

	private String ewalletNumber;
	
	private String userName;
	
	private Integer userId;
	
	private BigDecimal initiatedAmount;
	
	private String orderId;
	
	private String ebidReference;
	
	private LocalDateTime paymentInitiatedDate;
	
	private BigDecimal reconciledAmount;
	
	private String paymentStatus;
	
	private String paymentBankReference;
	
	private LocalDateTime paymentReconciledDate;
	
	private BigDecimal ewalletBalance;
	
	private String key;
	
	private String salt;
	
	private BigDecimal paymentCommission;
	
	private BigDecimal paymentAmountWithCommsion;
	
	public PaymentDetails(){
		
	}

	public PaymentDetails(String ewalletNumber, String userName, Integer userId, BigDecimal initiatedAmount,
			String orderId, String ebidReference, LocalDateTime paymentInitiatedDate, BigDecimal reconciledAmount,
			String paymentStatus, String paymentBankReference, LocalDateTime paymentReconciledDate,
			BigDecimal ewalletBalance, String key, String salt, BigDecimal paymentCommssion, 
			BigDecimal paymentAmountWithCommission) {
		super();
		this.ewalletNumber = ewalletNumber;
		this.userName = userName;
		this.userId = userId;
		this.initiatedAmount = initiatedAmount;
		this.orderId = orderId;
		this.ebidReference = ebidReference;
		this.paymentInitiatedDate = paymentInitiatedDate;
		this.reconciledAmount = reconciledAmount;
		this.paymentStatus = paymentStatus;
		this.paymentBankReference = paymentBankReference;
		this.paymentReconciledDate = paymentReconciledDate;
		this.ewalletBalance = ewalletBalance;
		this.key = key;
		this.salt = salt;
		this.paymentAmountWithCommsion = paymentAmountWithCommission;
		this.paymentCommission = paymentCommssion;
	}

	public String getEwalletNumber() {
		return ewalletNumber;
	}

	public void setEwalletNumber(String ewalletNumber) {
		this.ewalletNumber = ewalletNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public BigDecimal getInitiatedAmount() {
		return initiatedAmount;
	}

	public void setInitiatedAmount(BigDecimal initiatedAmount) {
		this.initiatedAmount = initiatedAmount;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getEbidReference() {
		return ebidReference;
	}

	public void setEbidReference(String ebidReference) {
		this.ebidReference = ebidReference;
	}

	public LocalDateTime getPaymentInitiatedDate() {
		return paymentInitiatedDate;
	}

	public void setPaymentInitiatedDate(LocalDateTime paymentInitiatedDate) {
		this.paymentInitiatedDate = paymentInitiatedDate;
	}

	public BigDecimal getReconciledAmount() {
		return reconciledAmount;
	}

	public void setReconciledAmount(BigDecimal reconciledAmount) {
		this.reconciledAmount = reconciledAmount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getPaymentBankReference() {
		return paymentBankReference;
	}

	public void setPaymentBankReference(String paymentBankReference) {
		this.paymentBankReference = paymentBankReference;
	}

	public LocalDateTime getPaymentReconciledDate() {
		return paymentReconciledDate;
	}

	public void setPaymentReconciledDate(LocalDateTime paymentReconciledDate) {
		this.paymentReconciledDate = paymentReconciledDate;
	}

	public BigDecimal getEwalletBalance() {
		return ewalletBalance;
	}

	public void setEwalletBalance(BigDecimal ewalletBalance) {
		this.ewalletBalance = ewalletBalance;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	
	public BigDecimal getPaymentCommission() {
		return paymentCommission;
	}

	public void setPaymentCommission(BigDecimal paymentCommission) {
		this.paymentCommission = paymentCommission;
	}

	public BigDecimal getPaymentAmountWithCommsion() {
		return paymentAmountWithCommsion;
	}

	public void setPaymentAmountWithCommsion(BigDecimal paymentAmountWithCommsion) {
		this.paymentAmountWithCommsion = paymentAmountWithCommsion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ebidReference == null) ? 0 : ebidReference.hashCode());
		result = prime * result + ((ewalletBalance == null) ? 0 : ewalletBalance.hashCode());
		result = prime * result + ((ewalletNumber == null) ? 0 : ewalletNumber.hashCode());
		result = prime * result + ((initiatedAmount == null) ? 0 : initiatedAmount.hashCode());
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((paymentAmountWithCommsion == null) ? 0 : paymentAmountWithCommsion.hashCode());
		result = prime * result + ((paymentBankReference == null) ? 0 : paymentBankReference.hashCode());
		result = prime * result + ((paymentCommission == null) ? 0 : paymentCommission.hashCode());
		result = prime * result + ((paymentInitiatedDate == null) ? 0 : paymentInitiatedDate.hashCode());
		result = prime * result + ((paymentReconciledDate == null) ? 0 : paymentReconciledDate.hashCode());
		result = prime * result + ((paymentStatus == null) ? 0 : paymentStatus.hashCode());
		result = prime * result + ((reconciledAmount == null) ? 0 : reconciledAmount.hashCode());
		result = prime * result + ((salt == null) ? 0 : salt.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentDetails other = (PaymentDetails) obj;
		if (ebidReference == null) {
			if (other.ebidReference != null)
				return false;
		} else if (!ebidReference.equals(other.ebidReference))
			return false;
		if (ewalletBalance == null) {
			if (other.ewalletBalance != null)
				return false;
		} else if (!ewalletBalance.equals(other.ewalletBalance))
			return false;
		if (ewalletNumber == null) {
			if (other.ewalletNumber != null)
				return false;
		} else if (!ewalletNumber.equals(other.ewalletNumber))
			return false;
		if (initiatedAmount == null) {
			if (other.initiatedAmount != null)
				return false;
		} else if (!initiatedAmount.equals(other.initiatedAmount))
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (paymentAmountWithCommsion == null) {
			if (other.paymentAmountWithCommsion != null)
				return false;
		} else if (!paymentAmountWithCommsion.equals(other.paymentAmountWithCommsion))
			return false;
		if (paymentBankReference == null) {
			if (other.paymentBankReference != null)
				return false;
		} else if (!paymentBankReference.equals(other.paymentBankReference))
			return false;
		if (paymentCommission == null) {
			if (other.paymentCommission != null)
				return false;
		} else if (!paymentCommission.equals(other.paymentCommission))
			return false;
		if (paymentInitiatedDate == null) {
			if (other.paymentInitiatedDate != null)
				return false;
		} else if (!paymentInitiatedDate.equals(other.paymentInitiatedDate))
			return false;
		if (paymentReconciledDate == null) {
			if (other.paymentReconciledDate != null)
				return false;
		} else if (!paymentReconciledDate.equals(other.paymentReconciledDate))
			return false;
		if (paymentStatus == null) {
			if (other.paymentStatus != null)
				return false;
		} else if (!paymentStatus.equals(other.paymentStatus))
			return false;
		if (reconciledAmount == null) {
			if (other.reconciledAmount != null)
				return false;
		} else if (!reconciledAmount.equals(other.reconciledAmount))
			return false;
		if (salt == null) {
			if (other.salt != null)
				return false;
		} else if (!salt.equals(other.salt))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PaymentDetails [ewalletNumber=" + ewalletNumber + ", userName=" + userName + ", userId=" + userId
				+ ", initiatedAmount=" + initiatedAmount + ", orderId=" + orderId + ", ebidReference=" + ebidReference
				+ ", paymentInitiatedDate=" + paymentInitiatedDate + ", reconciledAmount=" + reconciledAmount
				+ ", paymentStatus=" + paymentStatus + ", paymentBankReference=" + paymentBankReference
				+ ", paymentReconciledDate=" + paymentReconciledDate + ", ewalletBalance=" + ewalletBalance + ", key="
				+ key + ", salt=" + salt + ", paymentCommission=" + paymentCommission + ", paymentAmountWithCommsion="
				+ paymentAmountWithCommsion + "]";
	}
	
	

		
}
