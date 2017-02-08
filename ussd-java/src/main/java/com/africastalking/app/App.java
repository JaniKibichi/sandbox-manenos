package com.africastalking.app;

import static spark.Spark.*;

public class App {

  public static void main(String[] args){
  //set up threading
	int maxThreads = 99;
	int minThreads = 9;
	port(8000);

	int timeOutMillis = 30000;
	threadPool(maxThreads, minThreads, timeOutMillis);

	before((request, response)-> {
		System.out.println(request);
	});

	after((request,response)-> {
		response.header("Content-Encoding","gzip");
	});
  }
}
