import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Авторизация")
@Story("Пользователь 1")
@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    public void auth() {
        driver.get("https://geekbrains.ru/");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login, password)
                .checkNamePage("Главная");

        new AuthorizationPage(driver)
                .coursessearch();
        new AuthorizationPage(driver)
                .testingcheck("Тестирование ПО. Уровень 1", "Тестирование ПО. Уровень 2");
























    }

}
