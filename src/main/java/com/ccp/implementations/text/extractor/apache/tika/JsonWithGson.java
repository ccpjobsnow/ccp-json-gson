package com.ccp.implementations.text.extractor.apache.tika;

import java.util.Map;

import com.ccp.especifications.json.CcpJson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class JsonWithGson implements CcpJson {

	private static final GsonBuilder GSON_BUILDER = new GsonBuilder();
	private static final Gson GSON = new Gson();

	@Override
	public String toJson(Object md) {
		String json = GSON.toJson(md);
		return json;
	}

	@Override
	public String asPrettyJson(Object md) {
		return GSON_BUILDER.setPrettyPrinting().create().toJson(md);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T  fromJson(String str) {
		Map<String, Object> fromJson = GSON.fromJson(str, Map.class);
		return (T)fromJson;
	}

	

}
