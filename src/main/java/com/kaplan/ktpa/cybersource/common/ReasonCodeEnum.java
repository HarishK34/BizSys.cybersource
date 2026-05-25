package com.kaplan.ktpa.cybersource.common;

public enum ReasonCodeEnum {
	CODE_100(100,"Successful transaction.",7),
	CODE_101(101,"The request is missing one or more required fields.",8),
	CODE_102(102,"One or more fields in the request contains invalid data.",8),
	CODE_104(104,"Declined - The merchantReferenceCode sent with this authorization request matches the merchantReferenceCode of another authorization request that you sent in the last 15 minutes.",8),
	CODE_110(110,"Only a partial amount was approved.",8),
	CODE_150(150,"Error: General system failure.",8),
	CODE_151(151,"Error: The request was received but there was a server timeout. This error does not include timeouts between the client and the server.",8),
	CODE_152(152,"Error: The request was received, but a service did not finish running in time.",8),
	CODE_200(200,"The authorization request was approved by the issuing bank but declined by CyberSource because it did not pass the Address Verification Service (AVS), check.",7),
	CODE_201(201,"The issuing bank has questions about the request. You do not receive an authorization code programmatically, but you might receive one verbally by calling the processor.",9),
	CODE_202(202,"Expired card. You might also receive this if the expiration date you provided does not match the date the issuing bank has on file.",9),
	CODE_203(203,"General decline of the card. No other information provided by the issuing bank.",9),
	CODE_204(204,"Insufficient funds in the account.",9),
	CODE_205(205,"Stolen or lost card.",9),
	CODE_207(207,"Issuing bank unavailable.",9),
	CODE_208(208,"Inactive card or card not authorized for card-not-present transactions.",9),
	CODE_209(209,"American Express Card Identification Digits (CID), did not match.",9),
	CODE_210(210,"The card has reached the credit limit.",9),
	CODE_211(211,"Invalid CVN.",9),
	CODE_220(220,"This transaction has been declined.",9),
	CODE_221(221,"The customer matched an entry on the processors negative file.",9),
	CODE_222(222,"Decline - customer's account is frozen",9),
	CODE_223(223,"This transaction has been declined.",9),
	CODE_230(230,"The authorization request was approved by the issuing bank but declined by CyberSource because it did not pass the CVN check.",7),
	CODE_231(231,"Invalid account number.",9),
	CODE_232(232,"The card type is not accepted by the payment processor.",9),
	CODE_233(233,"General decline by the processor.",9),
	CODE_234(234,"There is a problem with your CyberSource merchant configuration.",8),
	CODE_235(235,"The requested amount exceeds the originally authorized amount. Occurs, for example, if you try to capture an amount larger than the original authorization amount.",8),
	CODE_236(236,"Processor failure.",8),
	CODE_237(237,"The authorization has already been reversed.",8),
	CODE_238(238,"The authorization has already been captured.",8),
	CODE_239(239,"The requested transaction amount must match the previous transaction amount.",8),
	CODE_240(240,"The card type sent is invalid or does not correlate with the credit card number.",8),
	CODE_241(241,"The request ID is invalid.",8),
	CODE_242(242,"You requested a capture, but there is no corresponding, unused authorization record. Occurs if there was not a previously successful authorization request or if the previously successful authorization has already been used by another capture request.",8),
	CODE_243(243,"The transaction has already been settled or reversed.",8),
	CODE_246(246,"The capture or credit is not voidable because the capture or credit information has already been submitted to your processor. Or, you requested a void for a type of transaction that cannot be voided.",8),
	CODE_247(247,"You requested a credit for a capture that was previously voided.",8),
	CODE_248(248,"Decline - The boleto request was declined by your processor.",8),
	CODE_250(250,"Error: The request was received, but there was a timeout at the payment processor.",8),
	CODE_251(251,"This transaction has been declined.",9),
	CODE_254(254,"Decline - Account is prohibited from processing stand-alone refunds.",9),
	CODE_400(400,"Soft Decline - Fraud score exceeds threshold.",9),
	CODE_450(450,"Apartment number missing or not found.",9),
	CODE_451(451,"Insufficient address information.",9),
	CODE_452(452,"House/Box number not found on street.",9),
	CODE_453(453,"Multiple address matches were found.",9),
	CODE_454(454,"P.O. Box identifier not found or out of range.",9),
	CODE_455(455,"Route service identifier not found or out of range.",9),
	CODE_456(456,"Street name not found in Postal code.",9),
	CODE_457(457,"Postal code not found in database.",9),
	CODE_458(458,"Unable to verify or correct address.",9),
	CODE_459(459,"Multiple address matches were found (international).",9),
	CODE_460(460,"Address match not found (no reason given).",9),
	CODE_461(461,"Unsupported character set.",8),
	CODE_475(475,"The cardholder is enrolled in Payer Authentication. Please authenticate the cardholder before continuing with the transaction.",9),
	CODE_476(476,"Encountered a Payer Authentication problem. Payer could not be authenticated.",8),
	CODE_478(478,"Strong customer authentication (SCA) is required for this transaction.",8),
	CODE_480(480,"The order is marked for review by Decision Manager.",9),
	CODE_481(481,"The order has been rejected by Decision Manager.",9),
	CODE_490(490,"Your aggregator or acquirer is not accepting transactions from you at this time.",8),
	CODE_491(491,"Your aggregator or acquirer is not accepting this transaction.",8),
	CODE_520(520,"Soft Decline - The authorization request was approved by the issuing bank but declined by CyberSource based on your Smart Authorization settings.",9),
	CODE_700(700,"The customer matched the Denied Parties List.",9),
	CODE_701(701,"Export bill_country/ship_country match.",8),
	CODE_702(702,"Export email_country match.",8),
	CODE_703(703,"Export hostname_country/ip_country match.",8);



	private Integer reasonCode;
	private String  reasonDescription;
	private Integer resonStatus;
	
	ReasonCodeEnum(Integer reasonCode,String  reasonDescription,Integer resonStatus){
		this.reasonCode = reasonCode;
		this.reasonDescription = reasonDescription;
		this.resonStatus = resonStatus;
		
	}
	
	public static ReasonCodeEnum valueOf(Integer reasonCode) {

		for (ReasonCodeEnum reasonCodeEnum : values()) {

			if (reasonCodeEnum.getReasonCode().toString().equals(reasonCode.toString()))

				return reasonCodeEnum;

		}

		return null;

	}

	public Integer getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(Integer reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getReasonDescription() {
		return reasonDescription;
	}

	public void setReasonDescription(String reasonDescription) {
		this.reasonDescription = reasonDescription;
	}

	public Integer getResonStatus() {
		return resonStatus;
	}

	public void setResonStatus(Integer resonStatus) {
		this.resonStatus = resonStatus;
	}
	

}
