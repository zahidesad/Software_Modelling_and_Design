package org.Week04Lab.Queestion02;

public class TurkishLanguage implements Language {
    @Override
    public String getLanguageCode() {
        return "tr";
    }

    @Override
    public String getContent(String pageName) {
        switch (pageName) {
            case "Home":     return "Ana Sayfa'ya Hoşgeldiniz";
            case "Services": return "Hizmetlerimiz";
            case "Contact":  return "Bize Ulaşın";
            default:         return "Varsayılan Türkçe İçerik";
        }
    }
}
