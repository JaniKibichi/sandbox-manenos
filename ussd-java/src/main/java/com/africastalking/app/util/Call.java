package com.africastalking.app.util;

import com.africastalking.app.routes.VoiceRouter;
import org.json.JSONArray;
import org.json.JSONObject;

public class Call {
	public void call(String message, String phoneNumber){
		String userName = new ReadVars().getUsername();
		String apiKey = new ReadVars().getApiKey();
		String from = new ReadVars().getAfricasTalkingVirtualNumber();
		
		String to = phoneNumber;
	AfricasTalkingGateway gateway = new AfricasTalkingGateway(userName, apiKey);

	try {
		JSONArray results = gateway.call(from, to);
		new VoiceRouter().voiceRouterCall(message);
		int len = results.length();

		String status;
		for (int i = 0; i<len; i++){
		  JSONObject result = results.getJSONObject(i);
		  status = result.getString("status");
		  System.out.println(status);
		 }
	} catch (Exception e){
		System.out.println("Encountered an error" + e.getMessage());
	}
	}
}
