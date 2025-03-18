package org.Week01Lab.Example04;

public class GreaterThanTenFilter implements IFilter{

    @Override
    public boolean apply(int i) {
        return i > 10;
    }
}
