package net.floodlightcontroller.egp.routing;


public class RoutingCount {

    int count;

    public RoutingCount() {
        count = 0;
    }

    public synchronized int getCount() {
        return ++count;
    }

}
