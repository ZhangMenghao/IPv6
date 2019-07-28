package net.floodlightcontroller.egp.config;

import net.floodlightcontroller.egp.exception.ConfigFormatErrorException;

import java.util.List;


public class AllConfig {
    private String localId;
    private List<LocalAsConfig> localAs;
    private String localPort;
    private List<RemoteControllerConfig> listController;

    public String getLocalId() {
        return localId;
    }

    public List<LocalAsConfig> getLocalAs() {
        return localAs;
    }

    public String getLocalPort() {
        return localPort;
    }

    public List<RemoteControllerConfig> getListController() {
        return listController;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public void setLocalAs(List<LocalAsConfig> localAs) {
        this.localAs = localAs;
    }

    public void setLocalPort(String localPort) {
        this.localPort = localPort;
    }

    public void setListController(List<RemoteControllerConfig> listController) {
        this.listController = listController;
    }

    public void check() throws Exception{ // check if all elements have been set correctly.
        if (localAs == null) throw new ConfigFormatErrorException("Format error! Cannot get localAs");
        if (localId == null) throw new ConfigFormatErrorException("Format error! Cannot get localId");
        if (localPort == null) throw new ConfigFormatErrorException("Format error! Cannot get localPort");
        if (listController == null || listController.size() == 0) throw new ConfigFormatErrorException("Format error! Cannot get remote controllers!");
        for (RemoteControllerConfig c:listController) {
            if (c.getListLink().size() == 0) throw new ConfigFormatErrorException("Format error! Cannot get links!");
        }
    }
}
