package org.week04_lab.example02;

public abstract class WebPage {
    protected Language language;

    public WebPage(Language language) {
        this.language = language;
    }

    public abstract void showPage();
}
