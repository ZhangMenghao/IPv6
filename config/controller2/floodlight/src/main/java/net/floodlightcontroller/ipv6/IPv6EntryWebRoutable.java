package net.floodlightcontroller.ipv6;

import org.restlet.Context;
import org.restlet.Restlet;
import org.restlet.routing.Router;

import net.floodlightcontroller.restserver.RestletRoutable;

public class IPv6EntryWebRoutable implements RestletRoutable {

	@Override
	public Restlet getRestlet(Context context) {
		Router router = new Router(context);
		router.attach("/json", IPv6EntryResource.class);
		
		return router;
	}

	@Override
	public String basePath() {
		return "/wm/ipv6";
	}

}
