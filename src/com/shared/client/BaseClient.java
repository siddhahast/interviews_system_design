package com.shared.client;

public interface BaseClient<ServiceEntity> {

	public String BASE_URL = "com";
	public String URL_VERSION = "1";
	
	public ServiceResponse<ServiceEntity> filter(UserFilter entity);

	public ServiceResponse<ServiceEntity> post(User request);

}
