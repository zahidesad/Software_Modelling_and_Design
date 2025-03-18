package org.Week01Lab.Example04;

public class EvenFilter implements IFilter{

    @Override
    public boolean apply(int i) {
        return i % 2 == 0;
    }
}
