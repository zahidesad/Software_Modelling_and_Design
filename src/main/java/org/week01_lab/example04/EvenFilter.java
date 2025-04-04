package org.week01_lab.example04;

public class EvenFilter implements IFilter{

    @Override
    public boolean apply(int i) {
        return i % 2 == 0;
    }
}
