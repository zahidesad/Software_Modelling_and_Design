package org.Week01Lab.Example04;

public class Test {
    public static void main(String[] args) {
        MyArray m=new MyArray();
        m.array=new int[]{1,5,6,8,7};
        m.filterArray((i)->(i%2==0));
        System.out.println("-----");
        m.filterArray((i)->(i%5==0));
        System.out.println("------");
        m.filterArray((i)->(i>5));
    }
}
