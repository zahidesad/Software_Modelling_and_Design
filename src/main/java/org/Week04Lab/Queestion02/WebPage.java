package org.Week04Lab.Queestion02;

public abstract class WebPage {
    protected Language language;

    public WebPage(Language language) {
        this.language = language;
    }

    public abstract void showPage();
}
