package Homeworks.hw8;

public class ModifiedText {
    public static void getModifiedText() {

        String text = "Каждая строка, создаваемая с помощью оператора new, литерала" +
                " (заключенная в двойные апострофы) и ли метода класса, создающего строку, является экземпляром" +
                "класса String. Особенностью объекта класса String является то, что его значение не может быть" +
                " изменено после создания объекта при помощи любого метода класса. Изменение строки всегда " +
                "приводит к созданию нового объекта в heap. Сама объектная ссылка при этом сохраняет прежнее" +
                " значение и хранится в стеке. Произведенные изменения можно сохранить переинициализируя" +
                "ссылку.";
        int k = 3;
        String str = "__";
        String result = insertSubstring(text, k, str);
        System.out.println(result);
    }

    public static String insertSubstring(String text, int k, String str) {
            String[] words = text.split(" ");
            String modifiedText = "";

            for (String word : words) {
                if (k < word.length()) {
                    String modifiedWord = word.substring(0, k) + str + word.substring(k);
                    modifiedText += modifiedWord + " ";
                } else {
                    modifiedText += word + " ";
                }
            }

            return modifiedText;
    }


}
