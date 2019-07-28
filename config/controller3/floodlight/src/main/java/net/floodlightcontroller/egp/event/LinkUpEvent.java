package net.floodlightcontroller.egp.event;


public class LinkUpEvent extends ControllerEvent{

    public LinkUpEvent() {
        this.setType(ControllerEvent.LINKUP);
        this.setInfo("LINKUP");
    }

}
