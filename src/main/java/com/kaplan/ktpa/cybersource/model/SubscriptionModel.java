package com.kaplan.ktpa.cybersource.model;

public class SubscriptionModel {
	private SubscriptionDetails subscriptionInfo;
	private TransactionResponse subscriptionCreationResponse;

	public SubscriptionDetails getSubscriptionInfo() {
		return subscriptionInfo;
	}

	public void setSubscriptionInfo(SubscriptionDetails subscriptionInfo) {
		this.subscriptionInfo = subscriptionInfo;
	}

	public TransactionResponse getSubscriptionCreationResponse() {
		return subscriptionCreationResponse;
	}

	public void setSubscriptionCreationResponse(
			TransactionResponse subscriptionCreationResponse) {
		this.subscriptionCreationResponse = subscriptionCreationResponse;
	}

}
