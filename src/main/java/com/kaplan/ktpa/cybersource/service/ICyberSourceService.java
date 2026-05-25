package com.kaplan.ktpa.cybersource.service;



import com.kaplan.ktpa.cybersource.exception.BaseApplicationException;
import com.kaplan.ktpa.cybersource.model.SubscriptionDetails;
import com.kaplan.ktpa.cybersource.model.SubscriptionModel;
import com.kaplan.ktpa.cybersource.model.TransactionRequest;
import com.kaplan.ktpa.cybersource.model.TransactionResponse;

import java.util.List;

/**
 * @author Harish K
 * 
 */

public interface ICyberSourceService {

	public List<SubscriptionDetails> getSubscriptionListDetails(
			List<TransactionRequest> transactionRequestList)
			throws BaseApplicationException;

	public TransactionResponse modifySubscriptionDetail(
			SubscriptionDetails subscriptionDetails)
			throws BaseApplicationException;

	public List<SubscriptionModel> createSubscription(
			List<SubscriptionModel> subscriptionModelList)
			throws BaseApplicationException;
	
	public List<TransactionResponse> processTransaction(List<TransactionRequest> transactionRequestList)
			throws BaseApplicationException;
	
	public TransactionResponse processTransaction(TransactionRequest transactionRequest)
			throws BaseApplicationException;

	public TransactionResponse processTransactionKBS(TransactionRequest transactionRequest)
			throws BaseApplicationException;
			
}
