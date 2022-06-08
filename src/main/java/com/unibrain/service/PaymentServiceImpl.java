package com.unibrain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unibrain.dao.PaymentDao;
import com.unibrain.entity.EwalletTransaction;
import com.unibrain.entity.PaymentDetails;
import com.unibrain.entity.Payments;
import com.unibrain.entity.User;
import com.unibrain.enums.PaymentStatusEnum;

@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentDao paymentDao;

	@Override
	public void saveInitiatedEPaymentDetails(PaymentDetails paymentDetails) {
		Payments payments = new Payments();
		payments.setUserId(paymentDetails.getUserId());
		payments.setUserName(paymentDetails.getUserName());
		payments.setBankId(1);
		payments.setBankName("RAZORPAY");
		payments.setEwalletId(paymentDetails.getUserId());
		payments.setEwalletNumber(paymentDetails.getEwalletNumber());
		payments.setOrderId(paymentDetails.getOrderId());
		payments.setPaymentEbidReference(paymentDetails.getEbidReference());
		payments.setPaymentPrimaryMode('E');
		payments.setPaymentModeId(5);
		payments.setPaymentInitiatedAmount(paymentDetails.getInitiatedAmount());
		payments.setPaymentStatus(PaymentStatusEnum.initiated.getStatusValue());
		payments.setPaymentInitiatedDate(paymentDetails.getPaymentInitiatedDate());
		
		paymentDao.saveInitiatedEPaymentDetails(payments);
		
	}

	@Override
	public Payments getPaymentsBasedOnEbidReference(String ebidReference) {
		return paymentDao.getPaymentsBasedOnEbidReference(ebidReference);
	}

	@Override
	public Boolean updatePaymentDataWithEWallet(Payments payments, User user) {
		return paymentDao.updatePaymentDataWithEWallet(payments, user);
	}
	
	@Override
	public Payments getPaymentByEbidReference(String ebidReference) {
		return paymentDao.getPaymentByEbidReference(ebidReference);
		
	}

	@Override
	public Boolean checkAccountNumberExist(String accountNumber) {
		return paymentDao.checkAccountNumberExist(accountNumber);
	}

	@Override
	public Boolean saveInitiatedPayment(EwalletTransaction payment) {
		return paymentDao.saveInitiatedPayment(payment);
	}

	@Override
	public Boolean updatePayment(EwalletTransaction payment,User user) {
		return paymentDao.updatePayment(payment,user);
	}


}
