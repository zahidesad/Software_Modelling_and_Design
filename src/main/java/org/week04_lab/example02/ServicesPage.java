package org.week04_lab.example02;

public class ServicesPage extends WebPage {
    public ServicesPage(Language language) {
        super(language);
    }

    @Override
    public void showPage() {
        System.out.println(language.getContent("Services"));
    }
}
