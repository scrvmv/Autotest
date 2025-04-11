import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {
    @Test
    void successfulLoginTest() {

// Не закрывать барузер, после выполения теста
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "google";
        Configuration.pageLoadTimeout = 60000;
// Открыть форму авторизации
        open("https://qa.guru/cms/system/login");

// Ввод логина
        $(By.xpath("//div[contains(@class, 'login-form')]//input[@placeholder='Введите ваш эл. адрес']")).setValue("qagurubot@gmail.com");
// Ввод Пароля
        $(By.xpath("//div[contains(@class, 'login-form')]//input[@placeholder='Введите пароль']")).setValue("fqagurupassword");
// Нажать на кнопку войти
        $(By.xpath("//div[contains(@class, 'login-form')]//button[contains(@class, 'btn-success')]")).click();

    }


}
