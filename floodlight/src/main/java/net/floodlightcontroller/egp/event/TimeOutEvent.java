package net.floodlightcontroller.egp.event;


public class TimeOutEvent extends ControllerEvent {

    public TimeOutEvent() {
        this.setType(ControllerEvent.TIMEOUT);
        this.setInfo("TIMEOUT");
    }

}
