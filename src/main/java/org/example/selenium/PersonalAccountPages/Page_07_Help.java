package org.example.selenium.PersonalAccountPages;

import org.example.selenium.BaseClassForPages;
import org.example.selenium.PageElements.SidebarMenu;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

/**
 * Базовый класс для страницы "Помощь"
 * Ответственный за создание класса - А.А. Дюжаков
 */

public class Page_07_Help extends BaseClassForPages {

    // Объект меню
    private SidebarMenu sidebarMenu;

    // Наименование страницы "Редактирование профиля"
    @FindBy(xpath = "//h1[@class=\"simple_page__name\"]")
    private WebElement h1PageName;

    // Конструктор класса
    public Page_07_Help(ChromeDriver webDriver) {
        super(webDriver);
        sidebarMenu = new SidebarMenu(webDriver);
    }

    // Геттер наименования страницы
    public String getPageName() {
        return h1PageName.getText();
    }

    public SidebarMenu getSidebarMenu() {
        return sidebarMenu;
    }
}
