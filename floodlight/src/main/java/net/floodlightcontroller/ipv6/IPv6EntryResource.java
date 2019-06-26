package net.floodlightcontroller.ipv6;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import redis.clients.jedis.Jedis;

public class IPv6EntryResource extends ServerResource {
	
	private Logger logger = LoggerFactory.getLogger(IPv6EntryResource.class);
	private Jedis jedis = new Jedis("localhost");
	
	@Get("json")
	public String getEntries() {
		try {
			String fmJson = jedis.get("test");
			
			if (fmJson.equals("")) {
				return "test does not exist!";
			} else {
				return fmJson;	
			}
		} catch (Exception e) {
			String error = "Error geting ipv6 entries: " + e;
			logger.error(error);
			
			return error;
		}	
	}
	
	@Post("json")
	public String storeEntries(String fmJson) {
		try {
			jedis.set("test", fmJson);
			
			return "successfully set " + fmJson;	
		} catch (Exception e) {
			String error = "Error storing ipv6 entries: " + e;
			logger.error(error);
			
			return error;
		}	
	}
	
	@Delete
	public String deleteEntries() {
		try {
			long status = jedis.del("test");
			if (status == 1) {
				return "delete ipv6 entries successfully!";
			} else {
				return "Error deleting ipv6 entries !";
			}
			
		} catch (Exception e) {
			String error = "Error deleting ipv6 entries: " + e;
			logger.error(error);
			
			return error;
		}	
	}

}
