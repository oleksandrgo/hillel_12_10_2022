package ua.ithillel.automation.api;

public final class Data {
    public static String randomEmail() {
        return "test" + (int) ((Math.random() * 10000)) + "@gmail.com";
    }
}
