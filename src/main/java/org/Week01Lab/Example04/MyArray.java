package org.Week01Lab.Example04;

import java.util.ArrayList;
import java.util.List;

public class MyArray {
    public static List<Integer> filter(int[] array, IFilter filter) {
        List<Integer> result = new ArrayList<>();
        for (int value : array) {
            if (filter.apply(value)) {
                result.add(value);
            }
        }
        return result;
    }
}
