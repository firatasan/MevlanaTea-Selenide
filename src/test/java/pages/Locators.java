package pages;

import org.openqa.selenium.By;

public enum Locators {

    url("https://www.mevlanacay.de/"),
    cerezleriKabulEt(By.cssSelector("button[data-cf-action='accept']")),
    //mainMenuListe(By.cssSelector(".menu.menu-main>li")),
    mainMenuListe(By.cssSelector("#menu-ana-menu > li > a > span")),
    mevlanaTeaSubMenu(By.cssSelector(".sub-menu > li > a > span")),
    menuButton(By.cssSelector(".icon-menu-fine")),
    mainMenuPlusListe(By.cssSelector(".sub-menu+.menu-toggle")),
    ;

//    String url = "https://www.mevlanacay.de/";
//    By cerezleriKabulEt = By.cssSelector("button[data-cf-action='accept']");
//    By mainMenuListe = By.cssSelector(".menu.menu-main>li");
//    By mevlanaTeaSubMenu = By.cssSelector(".sub-menu > li");

    private String s;
    private By by;

    Locators(String s) {

        this.s=s;
    }

    Locators(By by){
        this.by=by;
    }

    public String getStr(){
        return s;
    }

    public By locator(){
        return by;
    }
}
