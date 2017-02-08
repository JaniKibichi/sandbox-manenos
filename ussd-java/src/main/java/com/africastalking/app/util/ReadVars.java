package com.africastalking.app.util;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class ReadVars {
    public String userName, apiKey, africasTalkingVirtualNumber;

    public void setVars() {
		JSONParser parser = new JSONParser();

		try {
		    Object object = parser.parse(new FileReader("../config.json"));
		    JSONObject jsonObject = (JSONObject) object;
		    this.userName = (String) jsonObject.get("username");
		    this.apiKey = (String) jsonObject.get("apikey");
		    this.africasTalkingVirtualNumber = (String) jsonObject.get("africasTalkingVirtualNumber");
		}
		catch (Exception e){
		}
    }

  public String getUsername() {
	return this.userName;
  }

  public String getApiKey() {
	return this.apiKey;
  }

  public String getAfricasTalkingVirtualNumber(){
        return this.africasTalkingVirtualNumber;
  }

}
