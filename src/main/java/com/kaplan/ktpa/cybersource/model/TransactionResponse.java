package com.kaplan.ktpa.cybersource.model;

public class TransactionResponse {

	private String trxnStatus;
	private String requestId;
	private String requestToken;
	private String authNumber;
	private String trxnRemarks;
	private String trxnCode;
	private String reconciliationID;
	private String processorTransactionId;

	public String getProcessorTransactionId() {
		return processorTransactionId;
	}

	public void setProcessorTransactionId(String processorTransactionId) {
		this.processorTransactionId = processorTransactionId;
	}

	/**
	 * @return the trxnStatus
	 */
	public String getTrxnStatus() {
		return trxnStatus;
	}

	/**
	 * @param trxnStatus
	 *            the trxnStatus to set
	 */
	public void setTrxnStatus(String trxnStatus) {
		this.trxnStatus = trxnStatus;
	}

	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * @param requestId
	 *            the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * @return the requestToken
	 */
	public String getRequestToken() {
		return requestToken;
	}

	/**
	 * @param requestToken
	 *            the requestToken to set
	 */
	public void setRequestToken(String requestToken) {
		this.requestToken = requestToken;
	}

	/**
	 * @return the authNumber
	 */
	public String getAuthNumber() {
		return authNumber;
	}

	/**
	 * @param authNumber
	 *            the authNumber to set
	 */
	public void setAuthNumber(String authNumber) {
		this.authNumber = authNumber;
	}

	/**
	 * @return the trxnRemarks
	 */
	public String getTrxnRemarks() {
		return trxnRemarks;
	}

	/**
	 * @param trxnRemarks
	 *            the trxnRemarks to set
	 */
	public void setTrxnRemarks(String trxnRemarks) {
		this.trxnRemarks = trxnRemarks;
	}

	public String getTrxnCode() {
		return trxnCode;
	}

	public void setTrxnCode(String trxnCode) {
		this.trxnCode = trxnCode;
	}
	
	public String getReconciliationID() {
		return reconciliationID;
	}

	public void setReconciliationID(String reconciliationID) {
		this.reconciliationID = reconciliationID;
	}

}
