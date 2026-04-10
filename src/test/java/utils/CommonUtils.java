package utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtils {

    public static void printDropdownValues(Select select) {

        List<WebElement> options = select.getOptions();

        System.out.println("Total Countries: " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());
        }
    }
}