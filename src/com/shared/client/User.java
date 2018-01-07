package com.shared.client;

public class User extends ServiceEntity implements Anchorable{

	private String id;

	@Override
	public Anchor getAnchor() {
		return new Anchor(id, AnchorSourceType.USER);
	}
	
}