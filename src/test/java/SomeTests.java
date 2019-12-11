import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import io.github.cdimascio.dotenv.Dotenv;

Dotenv dotenv = Dotenv.load();
        dotenv.get("LOGIN")

public class SomeTests {

    @Test
    @DisplayName("Positive test")
    void positiveTest() {
        open("http://market.yandex.ru");

        $("#header-search").val("холодильник").pressEnter();
        $(byTitle("Холодильник ATLANT ХМ 4208-000")).click();
        $(withText("Холодильник")).should(exist);
        /*open("https://www.e-katalog.ru/"); //открывакем я.маркет
        $("#ek-search").val("холодильник").pressEnter(); //находим поле поиска, вводим холодильник, жмем enter
        $(By.xpath("//a[@class='model-short-title no-u']")).click(); //находим первую ссылку в выдаче, кликаем
        $(byText("Холодильник")).should(exist); //позитивный тест на слово "Холодильник"*/

    }
}
