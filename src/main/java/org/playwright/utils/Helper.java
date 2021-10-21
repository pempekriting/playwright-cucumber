package org.playwright.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Helper {
    static Faker faker = new Faker(new Locale("en-IND"));

    public static Faker getFaker() {
        return faker;
    }
}
