package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class gitHomework {

    @Test
    void gitHubWork() {
        //    Открытие страницы по абсолютному url
        open("https://github.com/");
        $(byText("Solutions")).hover();

        $(".border-bottom").$$("ul li").first().click();
        $(byText("developer platform.")).hover();


        sleep(5000);
    }
}
