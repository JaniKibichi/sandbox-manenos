package com.africastalking.app.routes;
import com.africastalking.app.util.JsonTransformer;
import spark.Route;

import static spark.Spark.get;

public abstract class BaseRouter {
	public final void initiate(){
		this.doGet();
		this.doPost();
	}

	protected abstract void doGet();
	protected abstract void doPost();
	protected void getJSON(String path, Route route){
		get(path, route, new JsonTransformer());
	}
}