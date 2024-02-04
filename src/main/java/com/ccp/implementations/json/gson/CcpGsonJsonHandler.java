package com.ccp.implementations.json.gson;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class CcpGsonJsonHandler implements CcpInstanceProvider{

	
	public Object getInstance() {
		return new GsonJsonHandler();
	}

}
