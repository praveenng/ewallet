package com.unibrain.dao;

import com.unibrain.entity.EwalletTransaction;
import com.unibrain.entity.Payments;
import com.unibrain.entity.User;

public interface PaymentDao {

	public void saveInitiatedEPaymentDetails(Payments payments);

	public EwalletTransaction getPaymentsBasedOnEbidReference(String ebidReference);

	public Boolean updatePaymentDataWithEWallet(Payments payments, User user);
	
	public Payments getPaymentByEbidReference(String ebidReference);
	public Boolean checkAccountNumberExist(String accountNumber);
	public Boolean saveInitiatedPayment(EwalletTransaction payment);
	public Boolean updatePayment(EwalletTransaction payment,User user);
	
}
