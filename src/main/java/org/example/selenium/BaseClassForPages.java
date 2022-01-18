package org.example.selenium;

import org.example.selenium.PageElements.SidebarMenu;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Базовый класс для наследования остальными классами страниц
 * Ответственный за создание класса - А.А. Дюжаков
 */

public abstract class BaseClassForPages {

    // Создаём экземпляр драйвера для возможности доступа к нему по всему классу (!!! приватность нужна или нет)
    private ChromeDriver webDriver;

    // Создаём конструктор
    public BaseClassForPages(ChromeDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this); // !!! разобраться с кодом
    }

    public ChromeDriver getWebDriver() {
        return webDriver;
    }
}
