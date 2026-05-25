package com.kaplan.ktpa.cybersource.common;

/**
 * @author John Piser - Senior Developer - Kaplan Test Prep and Admissions
 *         Date: 12/20/11
 *         Time: 11:40 AM
 */
public enum CyberSourceCardType {
    VISA("001","Visa", "VS"),
    MASTERCARD("002","MasterCard", "MC"),
    AMERICAN_EXPRESS("003","American Express", "AE"),
    DISCOVER("004","Discover", "DS"),
    DINERSCLUB("005","Diners Club", "DC"),
    ENROUTE("014","Enroute", "EN"),
    JCB("007","JCB", "JC");

    public static final String UNKOWN_ABBREVIATION = "un";

    private String code;
    private String name;
    private String abbreviation;

    private CyberSourceCardType (String code, String name, String abbreviation){
        this.code = code;
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public static String abbreviationForCode(String code){
        for (CyberSourceCardType cyberSourceCardType : values()) {
            if(cyberSourceCardType.code.equals(code)) return cyberSourceCardType.abbreviation;
        }
        return UNKOWN_ABBREVIATION;
    }
	
	public static String getMaskedCCNumber(String cCardNo)
	{
		StringBuffer maskdCcNo = new StringBuffer();
		if (cCardNo != null) {
			int length = cCardNo.length();
			int mask = length;
			mask = length - 4;
			for (int i = 0; i < mask; i++) {
				maskdCcNo.append("*");
			}		
			maskdCcNo.append(cCardNo.substring(mask));
		}		
		return maskdCcNo.toString();
	}

    public static String codeForType(String type){
        if (type==null) return null;
        for (CyberSourceCardType cyberSourceCardType : values()) {
            if(cyberSourceCardType.name.toUpperCase().equals(type.toUpperCase())) return cyberSourceCardType.code;
        }
        return null;
    }
}
