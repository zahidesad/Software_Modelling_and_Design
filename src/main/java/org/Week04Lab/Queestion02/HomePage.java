package org.Week04Lab.Queestion02;

public class HomePage extends WebPage {
    public HomePage(Language language) {
        super(language);
    }

    @Override
    public void showPage() {
        System.out.println(language.getContent("Home"));
    }
}
