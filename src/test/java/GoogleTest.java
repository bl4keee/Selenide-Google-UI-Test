import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleTest {

    @Test
    public void userCanSearchKeywordWithGoogle() {
        Selenide.open("https://www.google.pl/");
        $(By.name("q")).setValue("Selenide").pressEnter();
        //$$(By.id("ires"));
        $$(".r").shouldHave(size(11));
        $(".r").shouldHave(com.codeborne.selenide.Condition.text("Selenide: concise UI tests in Java"));
        $(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
        Selenide.sleep(5000);

    }
}
