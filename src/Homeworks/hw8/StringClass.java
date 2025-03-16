package Homeworks.hw8;

public class StringClass {


    public static String combineStrings(String str1, String str2) {
        if (str1.endsWith(str2)) {
            int index = str1.indexOf(str2);
            return str1.substring(0, index);
            }
            else{
                return str1.toUpperCase();
            }
        }


    }


