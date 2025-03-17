package org.Week01Lab.Example03AfterIoC;

public class Test {
    public static void main(String[] args) {
        ICar c=new Car("Togg");
        RepaireServices rs=new RepaireServices(c);
    }
}
