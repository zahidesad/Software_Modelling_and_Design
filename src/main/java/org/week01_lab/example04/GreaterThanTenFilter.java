package org.week01_lab.example04;

public class GreaterThanTenFilter implements IFilter{

    @Override
    public boolean apply(int i) {
        return i > 10;
    }
}
