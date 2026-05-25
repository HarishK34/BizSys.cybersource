package com.kaplan.ktpa.cybersource.model;

public class TransactionRequest {

	private String subscriptionId;
	private String groupName;
	private String currency;
	private Double grandTotalAmount;
	private String merchantRefernceCode;
	private Integer hubId;
	private String merchantID;
	private String transactionKey;
	private String serverURL;
	private String captureId;
	private String captureRequestId;
	private String captureRequestToken;
	private String refundRequestID;
	private String apPaymentType;
	



	public String getRefundRequestID() {
		return refundRequestID;
	}

	public void setRefundRequestID(String refundRequestID) {
		this.refundRequestID = refundRequestID;
	}

	public String getApPaymentType() {
		return apPaymentType;
	}

	public void setApPaymentType(String apPaymentType) {
		this.apPaymentType = apPaymentType;
	}

	public String getCaptureRequestId() {
		return captureRequestId;
	}

	public void setCaptureRequestId(String captureRequestId) {
		this.captureRequestId = captureRequestId;
	}

	public String getCaptureRquestToken() {
		return captureRequestToken;
	}

	public void setCaptureRquestToken(String captureRquestToken) {
		this.captureRequestToken = captureRquestToken;
	}

	public String getCaptureId() {
		return captureId;
	}

	public void setCaptureId(String captureId) {
		this.captureId = captureId;
	}

	/**
	 * @return the subscriptionId
	 */
	public String getSubscriptionId() {
		return subscriptionId;
	}

	/**
	 * @param subscriptionId the subscriptionId to set
	 */
	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	/**
	 * @return the groupName
	 */
	public String getGroupName() {
		return groupName;
	}

	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getGrandTotalAmount() {
		return grandTotalAmount;
	}

	public void setGrandTotalAmount(Double grandTotalAmount) {
		this.grandTotalAmount = grandTotalAmount;
	}

	public String getMerchantRefernceCode() {
		return merchantRefernceCode;
	}

	public void setMerchantRefernceCode(String merchantRefernceCode) {
		this.merchantRefernceCode = merchantRefernceCode;
	}

	public Integer getHubId() {
		return hubId;
	}

	public void setHubId(Integer hubId) {
		this.hubId = hubId;
	}

	
	public String getMerchantID() {
		return merchantID;
	}

	public void setMerchantID(String merchantID) {
		this.merchantID = merchantID;
	}

	public String getTransactionKey() {
		return transactionKey;
	}

	public void setTransactionKey(String transactionKey) {
		this.transactionKey = transactionKey;
	}

	public String getServerURL() {
		return serverURL;
	}

	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}

	public String getCaptureRequestToken() {
		return captureRequestToken;
	}

	public void setCaptureRequestToken(String captureRequestToken) {
		this.captureRequestToken = captureRequestToken;
	}


}
