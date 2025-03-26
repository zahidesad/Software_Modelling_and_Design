package org.Week05Lab.Example01;

public class Car {
    private final boolean airConditioning;
    private final boolean sunroof;
    private final boolean gps;

    private Car(Builder builder) {
        this.airConditioning = builder.airConditioning;
        this.sunroof = builder.sunroof;
        this.gps = builder.gps;
    }

    public static class Builder implements VehicleBuilder {
        private boolean airConditioning;
        private boolean sunroof;
        private boolean gps;

        @Override
        public Builder setAirConditioning(boolean airConditioning) {
            this.airConditioning = airConditioning;
            return this;
        }

        @Override
        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        @Override
        public Builder setGPS(boolean gps) {
            this.gps = gps;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car [AC=" + airConditioning + ", Sunroof=" + sunroof + ", GPS=" + gps + "]";
    }
}


