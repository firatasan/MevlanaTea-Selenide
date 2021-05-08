package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.codeborne.selenide.Configuration.clickViaJs;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static pages.Locators.*;


import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.*;

public class MevlanaTeaTC1 {


    @Test
    public void siteyiAc(){

        startMaximized=true;
        open(url.getStr());
        sleep(3000);

        $(cerezleriKabulEt.locator()).click();

    }
    @Test
    public void test01Chrome(){

        startMaximized=true;
        open(url.getStr());
        sleep(3000);

        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}

        // Menu de hover yapıp submenulerin görünürlüğünü test etti:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText()=="MEVLANA TEE"){
                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                    }
                }
            else if (e.getText()=="DE"){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                }
            }

            sleep(300);
        }

        // Dil değişikliği EN yapılırsa:
        // BUrası failed oluyor cunku En dilinde menuler gozukmuyor.
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-2).hover();
        sleep(1000);
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-1).click();

        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        // Menu de hover yapıp submenulerin görünürlüğünü test etti:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText()=="MEVLANA TEE"){
                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                }
            }
            else if (e.getText()=="EN"){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                }
            }

        }


        // Dil değişikliği TR yapılırsa:
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-2).hover();
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-2).click();
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        // Menu de hover yapıp submenulerin görünürlüğünü test etti:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText()=="MEVLANA TEE"){
                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                }
            }
            else if (e.getText()=="TR"){
                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                }
            }

            sleep(300);
        }




    }

    @Test
    public void test01Firefox(){

        Configuration.browser = "firefox";
        startMaximized=true;
        open(url.getStr());
        sleep(3000);

        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}

        // Menu de hover yapıp submenulerin görünürlüğünü test etti:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText()=="MEVLANA TEE"){
                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                }
            }
            else if (e.getText()=="DE"){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                }
            }

            sleep(300);
        }


        // Dil değişikliği EN yapılırsa:
        // BUrası ilk gün failed oldu cunku En dilinde menuler gozukmuyor.

        $$(mainMenuListe.locator()).get($$(mainMenuListe.locator()).size()-1).hover();
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-1).click();
        sleep(1000);

        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        // Menu de hover yapıp submenulerin görünürlüğünü test etti:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText()=="MEVLANA TEE"){
                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                }
            }
            else if (e.getText()=="EN"){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {

                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);

                }
            }

        }


//        // Dil değişikliği TR yapılırsa:

        sleep(1500);
        $$(mainMenuListe.locator()).get($$(mainMenuListe.locator()).size()-1).hover();
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-1).click();
        sleep(1000);



        //$$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-2).hover();
       //$$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-2).click();
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        // Menu de hover yapıp submenulerin görünürlüğünü test etti:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText()=="MEVLANA TEE"){
                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                }
            }
            else if (e.getText()=="TR"){
                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                }
            }

            sleep(300);
        }
    }



    @Test
    public void test02Chrome() {

       Configuration.browserSize = "500x720";
        open(url.getStr());
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        $(menuButton.locator()).click();

        //Acık olmayan menuleri acıyoruz:
        for (SelenideElement e2: $$(mainMenuPlusListe.locator())) {
            e2.click();
        }

        //Menuleri test:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText().equals("MEVLANA TEE")){


                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }
            else if (e.getText().equals("DE")){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }

            sleep(300);
        }

        //Dil değişikliği yapılır EN:
        int menuListeSize = $$(mainMenuListe.locator()).size();
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-1).click();
        sleep(300);
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        $(menuButton.locator()).click();

        //İngilizce olan sayfada test tekrarlanır:

        sleep(300);
        for (SelenideElement e2: $$(mainMenuPlusListe.locator())) {
            e2.click();
        }



        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText().equals("MEVLANA TEA")){

                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }
            else if (e.getText().equals("EN")){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }

            sleep(300);
        }


        //Dili değiştiriyoruz TR oluyor:
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-1).click();
        sleep(300);
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        $(menuButton.locator()).click();

        //Açık olmayan menuleri açıyoruz:
        for (SelenideElement e2: $$(mainMenuPlusListe.locator())) {
            e2.click();
        }

        //TR olan menuleri test:

        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText().equals("MEVLANA ÇAY")){

                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }
            else if (e.getText().equals("TR")){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }

            sleep(300);
        }




        sleep(3000);
    }

    @Test
    public void test02Firefox(){

        Configuration.browser = "firefox";
        Configuration.browserSize = "500x720";
        open(url.getStr());
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        $(menuButton.locator()).click();

        //Acık olmayan menuleri acıyoruz:
        for (SelenideElement e2: $$(mainMenuPlusListe.locator())) {
            e2.click();
        }

        //Menuleri test:
        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText().equals("MEVLANA TEE")){


                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }
            else if (e.getText().equals("DE")){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }

            sleep(300);
        }

        //Dil değişikliği yapılır EN:
        int menuListeSize = $$(mainMenuListe.locator()).size();
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-1).click();
        sleep(300);
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        $(menuButton.locator()).click();

        //İngilizce olan sayfada test tekrarlanır:

        sleep(300);
        for (SelenideElement e2: $$(mainMenuPlusListe.locator())) {
            e2.click();
        }



        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText().equals("MEVLANA TEA")){

                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }
            else if (e.getText().equals("EN")){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }

            sleep(300);
        }


        //Dili değiştiriyoruz TR oluyor:
        $$(mevlanaTeaSubMenu.locator()).get($$(mevlanaTeaSubMenu.locator()).size()-1).click();
        sleep(300);
        if($(cerezleriKabulEt.locator()).is(Condition.visible)){ $(cerezleriKabulEt.locator()).click();}
        $(menuButton.locator()).click();

        //Açık olmayan menuleri açıyoruz:
        for (SelenideElement e2: $$(mainMenuPlusListe.locator())) {
            e2.click();
        }

        //TR olan menuleri test:

        for (SelenideElement e: $$(mainMenuListe.locator())) {
            e.hover();

            if (e.getText().equals("MEVLANA ÇAY")){

                for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2 ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }
            else if (e.getText().equals("TR")){

                for (int i = $$(mevlanaTeaSubMenu.locator()).size()-2; i < $$(mevlanaTeaSubMenu.locator()).size() ; i++) {
                    $$(mevlanaTeaSubMenu.locator()).get(i).hover();
                    $$(mevlanaTeaSubMenu.locator()).get(i).shouldBe(Condition.visible);
                    sleep(200);
                }
            }

            sleep(300);
        }

    }

    @Test
    public void test03Chrome() {

        startMaximized = true;
        open(url.getStr());
        sleep(3000);

        if ($(cerezleriKabulEt.locator()).is(Condition.visible)) {
            $(cerezleriKabulEt.locator()).click();
        }


        // Menu ust link kontrolü yapıldı:
        for (int i = 0; i < $$(mainMenuListe.locator()).size(); i++) {

            $$(mainMenuListe.locator()).get(i).click();
            String menuBasligi = $$(mainMenuListe.locator()).get(i).getText();

            switch (menuBasligi) {
                case "HOME":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
                case "PRODUKTE":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/produkte/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
                case "MEVLANA TEE":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/uber-uns/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
                case "BLOG":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/blog/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
                case "KONTAKT":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/kontakt/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
            }

        }

        //Ust menu link kontrolu yukarıda yapıldı.
        //Submenu link kontrolu asagıda yapılacak.



        for (int i = 0; i < $$(mevlanaTeaSubMenu.locator()).size()-2; i++) {

            $$(mainMenuListe.locator()).get(2).hover();
            $$(mevlanaTeaSubMenu.locator()).get(i).click();
            String subMenuBasligi = $$(mevlanaTeaSubMenu.locator()).get(i).getOwnText();

            System.out.println("baslik : " + subMenuBasligi);

            switch (subMenuBasligi) {
                case "ÜBER UNS":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/uber-uns/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
                case "IMPRESSUM":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/impressum/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
                case "HÄUFIG GESTELLTE FRAGEN":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/haufig-gestellte-fragen/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
                case "TV SPOTS":
                    getWebDriver().getCurrentUrl().equals("https://www.mevlanacay.de/tv-spots/");
                    System.out.println("Suandaki adress: " + getWebDriver().getCurrentUrl());
                    break;
            }

        }

    }

}
