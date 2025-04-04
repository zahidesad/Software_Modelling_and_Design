package org.week04_lab.example02;

public class EnglishLanguage implements Language {
    @Override
    public String getLanguageCode() {
        return "en";
    }

    @Override
    public String getContent(String pageName) {
        switch (pageName) {
            case "Home":     return "Welcome to the Home Page";
            case "Services": return "Our Services";
            case "Contact":  return "Contact Us";
            default:         return "Default English Content";
        }
    }
}
