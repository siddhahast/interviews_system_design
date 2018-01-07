package com.shared.client;

public class IdentityServiceClient extends BaseServiceClient implements BaseClient<User>{
	
	public String path = "identity";
	public String API_VERSION = "2";
	
	@Override
	public ServiceResponse<User> post(User request) {
		return null;
	}
	@Override
	public ServiceResponse<User> filter(UserFilter entity) {
		return null;
	}
}