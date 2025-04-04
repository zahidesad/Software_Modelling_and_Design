package org.quiz01_preparation.creational_patterns.builder;

public class Computer {
    private String cpu;
    private int ram;

    private boolean hasGraphicsCard;
    private boolean hasSSD;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasSSD = builder.hasSSD;
    }

    public static class Builder{
        private String cpu;
        private int ram;

        private boolean hasGraphicsCard;
        private boolean hasSSD;

        public Builder(String cpu, int ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard){
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setSSD(boolean hasSSD){
            this.hasSSD = hasSSD;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + "GB, GraphicsCard=" + hasGraphicsCard + ", SSD=" + hasSSD + "]";
    }
}
