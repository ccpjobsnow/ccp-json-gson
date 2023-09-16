package com.ccp.implementations.text.extractor.apache.tika;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class CcpGsonJsonHandler implements CcpInstanceProvider{

	@Override
	public Object getInstance() {
		return new GsonJsonHandler();
	}

}
