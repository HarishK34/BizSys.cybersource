package com.kaplan.ktpa.cybersource.common;


public enum HubNameEnum {
	Default(00, "Default"),
	Business(45, "Business"),
	Health(44, "Health"),
	Law(43, "Law"),
	PC(42, "PC"),
	Med(37, "Med"),
	Toronto(26, "Toronto"),
	SanJuan(24, "San Juan");
	
	String hubName;
	Integer hubId;
	
	HubNameEnum(Integer hubId, String hubName) {

		this.hubName = hubName;

		this.hubId = hubId;

	}
	
	public static HubNameEnum valueOf(Integer hubId) {

		for (HubNameEnum groupNameEnum : values()) {

			if (groupNameEnum.getHubId()==hubId)

				return groupNameEnum;

		}

		return null;

	}

	public String getHubName() {
		return hubName;
	}

	public void setHubName(String hubName) {
		this.hubName = hubName;
	}

	public Integer getHubId() {
		return hubId;
	}

	public void setHubId(Integer hubId) {
		this.hubId = hubId;
	}


	
}
