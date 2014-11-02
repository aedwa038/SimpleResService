package com.simple.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/simpleservice")
public class SimpleService
{
	 private static final Logger LOG = LoggerFactory
		       .getLogger(SimpleService.class);

	 @GET
	 public String hello()
	 {
		  LOG.info("hello");
		  return "Hello World";
	 }

}
