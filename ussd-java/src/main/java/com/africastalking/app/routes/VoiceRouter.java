package com.africastalking.app.routes;
import static spark.Spark.post;

public class VoiceRouter extends BareBonesRouter {
	public String message;

	public void voiceRouterCall(String msg){
		message = msg;
	}

	@Override
	protected void doPost(){
		post("/voice", (req, res)->{
			String status = req.queryParams("isActive");
			String response;
			if (status == null){
				status="";
			}
			if(status.equals("1")){
				response = "<?xml version='1.0' encoding='UTF-8'?><Response><Say>"+this.message+"</Say></Response>";
				res.header("content-type", "text/plain");
				res.status(201);
				res.body(response);
				return response;
			} else {
				return " ";
			}
		});
	}
}