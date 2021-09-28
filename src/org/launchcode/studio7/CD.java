package org.launchcode.studio7;

public class CD extends Discs implements OpticalDisc {

    public CD () {
        super(700, 500);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a rate of: " + this.getSpinSpeedInRPM() + " rpm");
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
