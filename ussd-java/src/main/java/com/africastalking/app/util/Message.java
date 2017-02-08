package com.africastalking.app.util;

import org.json.JSONArray;
import org.json.JSONObject;

public class Message {
  public void sms(String message, String phoneNumber){
	String username = new ReadVars().getUsername();
	String apiKey = new ReadVars().getApiKey();
	String recipients = phoneNumber;
	String environ = "sandbox";

	AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey, environ );

	try {
	     JSONArray results = gateway.sendMessage(recipients, message);
	     for(int i=0; i<results.length(); ++i){
				JSONObject result = results.getJSONObject(i);
				System.out.print(result.getString("status")+",");
                System.out.print(result.getString("number")+",");
                System.out.print(result.getString("messageId")+",");
                System.out.print(result.getString("cost"));
	     }
	    } catch (Exception e) {
		System.out.println("Encountered an error while sending " + e.getMessage());
	    }
  }
}
