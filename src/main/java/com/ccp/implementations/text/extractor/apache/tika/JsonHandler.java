package com.ccp.implementations.text.extractor.apache.tika;

import com.ccp.dependency.injection.CcpInstanceProvider;

public class JsonHandler implements CcpInstanceProvider{

	@Override
	public Object getInstance() {
		return new JsonWithGson();
	}

}
