package org.launchcode.studio7;

import java.util.HashMap;

public abstract class Discs {
    private String contents;
    HashMap<String, String> discInfo;
    private boolean isInserted;
    private final int storageCapacityInMB;
    private final int spinSpeedInRPM;

    public Discs(int storageCapacity, int spinSpeed) {
        this.contents = "";
        this.discInfo = new HashMap<String, String>();

        this.storageCapacityInMB = storageCapacity;
        this.spinSpeedInRPM = spinSpeed;

        this.discInfo.put("Storage Capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin Speed", String.valueOf(spinSpeed));
    }

    public Discs(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);
    }

    //getters and setters


    public int getStorageCapacityInMB() {
        return storageCapacityInMB;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getSpinSpeedInRPM() {
        return spinSpeedInRPM;
    }


    public boolean isInserted() {
        return isInserted;
    }

    public void setInserted(boolean inserted) {
        isInserted = inserted;
    }

    //methods

    protected void writeData(String newData) {
        this.contents += newData;
    };

    public String readData() {
        return this.contents;
    };

    public HashMap<String, String> getInfo() {
        return this.discInfo;
    };

    public void insertDisc() {
        this.isInserted = true;
    }
}
