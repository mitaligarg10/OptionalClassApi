package com.stackroute.nullpointerexception;


public class TelevisionService {
    public String getTelevisionHDRColour(Television television) {

        if (television != null) {
            DisplayFeatures displayFeatures = television.getDisplayFeatures();
            if (displayFeatures != null) {
                HDR hdr = displayFeatures.getHdr();
                return hdr.getColour();
            }
        }
        return null;
    }
}
