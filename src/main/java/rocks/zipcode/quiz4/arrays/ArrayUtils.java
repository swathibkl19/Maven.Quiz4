package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {


        int index =values.length/2;


        return values[index];
    }

    public static String[] removeMiddleElement(String[] values) {

        String[] newArray = new String[values.length];
        int index =values.length/2;
        for (int i = 0; i < values.length; i++) {
            if(i == index){
                newArray[i] = values[i+1];
            }
            newArray[i] =values[i];
        }
        return newArray;
    }

    public static String getLastElement(String[] values) {
        int  index =values.length-1;
        return values[index];
    }

    public static String[] removeLastElement(String[] values) {


        return null;
    }
}