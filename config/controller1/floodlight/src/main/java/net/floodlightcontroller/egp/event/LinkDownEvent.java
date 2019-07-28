package net.floodlightcontroller.egp.event;


public class LinkDownEvent extends ControllerEvent{

    public LinkDownEvent() {
        this.setType(ControllerEvent.LINKDOWN);
        this.setInfo("LINKDOWN");
    }

}
