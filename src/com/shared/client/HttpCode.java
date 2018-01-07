package com.shared.client;

public enum HttpCode {

	HTTP_OK(200);
	
	private int code;
	
	private HttpCode(Integer code){
		this.code = code;
	}
	
	public int getCode(){
		return code;
	}
}
