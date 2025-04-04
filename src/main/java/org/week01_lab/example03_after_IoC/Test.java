package org.week01_lab.example03_after_IoC;

public class Test {
    public static void main(String[] args) {
        ICar c=new Car("Togg");
        RepaireServices rs=new RepaireServices(c);
    }
}
