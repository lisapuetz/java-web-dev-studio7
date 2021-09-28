package org.launchcode.studio7;

public class DVD extends Discs implements OpticalDisc {

    public DVD (String title) {
        super(4000, 1600, title);
    }


    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a rate of: " + this.getSpinSpeedInRPM() + " rpm");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }

    @Override
    public boolean isFull() {
        if (this.readData().length() >= this.getStorageCapacityInMB()) {
            return true;
        } else {
            return false;
        }
    }
}
