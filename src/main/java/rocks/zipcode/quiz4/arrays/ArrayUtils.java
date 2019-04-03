package rocks.zipcode.quiz4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {


        int index = values.length / 2;


        return values[index];
    }

    public static String[] removeMiddleElement(String[] values) {

        int index = values.length / 2;
        List<String> list  = new ArrayList<>(Arrays.asList(values));
        list.remove(index);
        return list.toArray(new String[0]);

//        String[] newArray = new String[values.length - 1];
//        for (int j = 0, i = 0; i < values.length; i++) {
//            if (i == index) {
//                continue;
//            }
//            newArray[j] = values[i];
//            j++;
//        }
//        return newArray;
    }

    public static String getLastElement(String[] values) {
        int index = values.length - 1;
        return values[index];
    }

    public static String[] removeLastElement(String[] values) {
        int index = values.length-1;
        List<String> list = new ArrayList<>(Arrays.asList(values));
        list.remove(index);

        return list.toArray(new String[0]);
    }
}