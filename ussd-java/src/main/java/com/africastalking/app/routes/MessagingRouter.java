package com.africastalking.app.routes;

import static spark.Spark.post;

public class MessagingRouter extends BareBonesRouter {
	@Override
	protected void doPost(){
		post("/sms", (req, resp)->{
			System.out.println(req.body());

			String from = req.queryParams("from");
			String to = req.queryParams("to");
			String text = req.queryParams("text");	
			String date = req.queryParams("date");	
			String id = req.queryParams("id");										

			System.out.println(String.format("%s %s %s %s %s", from, to, text, date, id ));
			resp.status(200);
			return "ok";
		});

		post("/dlr", (req, resp)->{
			System.out.println(req.body());

			String status = req.queryParams("status");
			String id = req.params("id");

			if(status.equals("Failed") || status.equals("Rejected")){
				System.out.println(req.queryParams("failureReason"));
			}else{
				System.out.println(String.format("%s %s", status, id));
			}
			resp.status(200);
			return resp;
		});
	}
}