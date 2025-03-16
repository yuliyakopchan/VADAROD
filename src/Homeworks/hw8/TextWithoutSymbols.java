package Homeworks.hw8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextWithoutSymbols {
    public static String cleanText(String text) {
        Pattern pattern = Pattern.compile("[^\\p{L}\\s]+"); // Создаем паттерн
        Matcher matcher = pattern.matcher(text);               // Создаем матчер
        return matcher.replaceAll("");
    }
}
