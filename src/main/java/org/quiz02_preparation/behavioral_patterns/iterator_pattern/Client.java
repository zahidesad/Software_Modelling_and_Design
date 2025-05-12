package org.quiz02_preparation.behavioral_patterns.iterator_pattern;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate<String> names = new ConcreteAggregate<>();
        names.addItem("Ali");
        names.addItem("Ayşe");
        names.addItem("Mehmet");
        names.addItem("Zeynep");

        Iterator<String> it = names.createIterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("Merhaba, " + name + "!");
        }
    }
}
