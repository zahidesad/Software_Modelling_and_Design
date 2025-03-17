package org.Week01Lab.Example04;

public class MyArray {
    int[] array;
    void filterArray(IFilter f){
        for (int i : array) {
            if (f.apply(i)){
                System.out.println(i);
            }
        }
    }
}
