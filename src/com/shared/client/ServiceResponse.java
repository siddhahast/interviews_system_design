package com.shared.client;

import java.io.Serializable;

public interface ServiceResponse<D> extends Serializable{

	public HttpCode getHttpCode();
	public void setHttpCode(HttpCode httpCode);
	
}
