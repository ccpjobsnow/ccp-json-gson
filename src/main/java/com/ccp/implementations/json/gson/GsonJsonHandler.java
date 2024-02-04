package com.ccp.implementations.json.gson;

import java.util.Map;

import com.ccp.especifications.json.CcpJsonHandler;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class GsonJsonHandler implements CcpJsonHandler {

	private static final GsonBuilder GSON_BUILDER = new GsonBuilder();
	private static final Gson GSON = new Gson();

	
	public String toJson(Object md) {
		String json = GSON.toJson(md);
		return json;
	}

	
	public String asPrettyJson(Object md) {
		return GSON_BUILDER.setPrettyPrinting().create().toJson(md);
	}

	@SuppressWarnings("unchecked")
	
	public <T> T  fromJson(String str) {
		Map<String, Object> fromJson = GSON.fromJson(str, Map.class);
		return (T)fromJson;
	}

	
	public boolean isValidJson(String src) {
		try {
			GSON.fromJson(src, Map.class);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	

}
