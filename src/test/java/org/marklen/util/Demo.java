package org.marklen.util;

import java.sql.SQLOutput;

public class Demo {
    public static void main(String[] args) {

        System.setProperty("browser", "firefox");
        Config.initialize();
        System.out.println(
                Config.get("selenium.grid.hubHost")
        );

    }
}
