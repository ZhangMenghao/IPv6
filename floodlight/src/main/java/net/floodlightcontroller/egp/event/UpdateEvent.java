package net.floodlightcontroller.egp.event;


import com.fasterxml.jackson.databind.ObjectMapper;


public class UpdateEvent extends ControllerEvent {


    public UpdateEvent(String info) {
        this.setInfo(info);
        this.setType(ControllerEvent.UPDATE);
    }

    public UpdateEvent(UpdateInfo updateInfo) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            this.setInfo("UPDATE " + mapper.writeValueAsString(updateInfo));
        }  catch (Exception e){
            e.printStackTrace();
        }
        this.setType(ControllerEvent.UPDATE);
    }

}
