package org.Week03Lab.Example04;

abstract class DatabaseConnection implements Cloneable {
    protected String type;

    public abstract void connect();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

