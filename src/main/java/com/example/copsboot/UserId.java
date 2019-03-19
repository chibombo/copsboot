package com.example.copsboot;

import java.util.UUID;

import com.example.orm.jpa.AbstractEntityId;

public class UserId extends AbstractEntityId<UUID>{
	protected UserId() {}

	public UserId(UUID id) {
		super(id);		
	}
	
	
}
