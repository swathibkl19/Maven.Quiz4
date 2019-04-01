package rocks.zipcode.quiz4.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {

        char c = string.charAt(string.length()/2);

        return c;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int i = str.length() % 2;
        if (str.length() <= 1) {
            String result = str.toUpperCase();
            return result;
              }

        String result=str.substring(0,i)+str.substring(i,i+1).
                toUpperCase()+str.substring(i+1);

        return result;
        }


    public static String lowerCaseMiddleCharacter(String str) {

        int i = str.length() / 2;
        if (str.length() <= 1) {
            String result = str.toLowerCase();
            return result;
        }

        String result=str.substring(0,i)+str.substring(i,i+1).toLowerCase()+str.substring(i+1);

        return result;
    }



    public static Boolean isIsogram(String str) {

        str = str.toLowerCase();

        char arr[] = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < str.length() - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }




    public static Boolean hasDuplicateConsecutiveCharacters(String str) {

        for (int i = 0; i < str.length() -1; i++) {

                if (str.charAt(i) == str.charAt(i+1)) {

                    return true;
                }
            }
            return false;
        }


    public static String removeConsecutiveDuplicateCharacters(String str) {

        for (int i = 0; i < str.length() -1; i++) {

            if (str.charAt(i) == str.charAt(i+1)) {
            char ch1 =str.charAt(i);
                //char ch2 =str.charAt(i+1);

               String str1 = str.replace("ch1","");
               //String str2 =str1.replace("ch2","");

                return str1;

            }
        }
        return str;
    }

    public static String invertCasing(String str) {

        char[] charArray = str.toCharArray();

        for(int i=0; i < charArray.length; i++) {

            if (Character.isUpperCase(charArray[i])) {

                charArray[i] = Character.toLowerCase(charArray[i]);

            } else if (Character.isLowerCase(charArray[i])) {

                charArray[i] = Character.toUpperCase(charArray[i]);
            }

        }

        str = new String(charArray);
        return str;
    }
}