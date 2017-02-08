package com.africastalking.app.routes;

import com.africastalking.app.util.JsonTransformer;

import spark.Route;

import static spark.Spark.*;

public abstract class BareBonesRouter {
    public final void initiate() {
	this.doPost();
    }

    protected abstract void doPost();

    protected void getJSON(String path, Route route){
      get(path, route, newJsonTransformer());
    }
}
