package org.acme.selenium

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

fun WebDriver.elementByCss(locator: String): WebElement = findElement(By.cssSelector(locator))