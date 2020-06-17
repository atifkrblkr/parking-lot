package com.karbelkardesigns.parkinglot.bean;

public class Vehicle {
    private String plate;
    private String sizeCode;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (plate != null ? !plate.equals(vehicle.plate) : vehicle.plate != null) return false;
        return sizeCode != null ? sizeCode.equals(vehicle.sizeCode) : vehicle.sizeCode == null;
    }

    @Override
    public int hashCode() {
        int result = plate != null ? plate.hashCode() : 0;
        result = 31 * result + (sizeCode != null ? sizeCode.hashCode() : 0);
        return result;
    }
}
