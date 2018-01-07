package com.shared.client;

public enum AnchorSourceType {

	USER("USER");
	
	private String code;
	
	private AnchorSourceType(String code){
		this.code = code;
	}
	
	public String getCode(){
		return code;
	}
	
	public AnchorSourceType getAnchorSourceType(){
		return this;
	}
}
