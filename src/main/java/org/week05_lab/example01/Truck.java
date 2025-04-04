package org.week05_lab.example01;

public class Truck {
    private final boolean airConditioning;
    private final boolean sunroof;
    private final boolean gps;

    private Truck(Builder builder) {
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

        public Truck build() {
            return new Truck(this);
        }
    }

    @Override
    public String toString() {
        return "Truck [AC=" + airConditioning + ", Sunroof=" + sunroof + ", GPS=" + gps + "]";
    }
}


