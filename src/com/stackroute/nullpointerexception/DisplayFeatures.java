package com.stackroute.nullpointerexception;

public class DisplayFeatures {

    private String size; // In inches
    private HDR hdr;

    public DisplayFeatures(String size, HDR hdr){
        this.size = size;
        this.hdr = hdr;
    }

    public String getSize() {
        return size;
    }
    public HDR getHdr() {
        return hdr;
    }

}
