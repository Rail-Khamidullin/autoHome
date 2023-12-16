package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class gitHomework {

    @Test
    void gitHubWork() {
        //    Открытие страницы по абсолютному url
        open("https://github.com/");
        // Находим в хедере текст Solutions и подводим к нему мышь
        $(byText("Solutions")).hover();
        // Берём первый элемент из выпадающего списка и кликаем его
        $(".border-bottom").$$("ul li").first().click();
        // Находим текст на новой странице developer platform. и подводим к нему мышь
        $(byText("developer platform.")).hover();

        // Тайм аут в 5 секунд, чтобы посмотреть результат
        sleep(5000);
    }
}
