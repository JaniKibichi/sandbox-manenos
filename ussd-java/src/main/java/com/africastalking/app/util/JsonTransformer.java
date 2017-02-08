package com.africastalking.app.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {
  @Override
  public String render(Object model){
    Gson gson = new GsonBuilder().serializeNulls().create();
    return gson.toJson(model);
  }
}
