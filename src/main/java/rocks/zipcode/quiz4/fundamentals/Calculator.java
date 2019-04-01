package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class Calculator {
    Double input;

    public Calculator() {
        this.input =0.0;
    }

    public Double squareRoot(Double value) {


        return Math.sqrt(value) ;
    }

    public static Double square(Double value) {
        return value * value ;
    }

    public static Double[] squareRoots(Double... value) {
        Double[] result = new Double[value.length];
            for(int i = 0; i < value.length ; i++ ){
                result[i] = Math.sqrt(value[i]);
        }
        return result;
    }

    public static Double[] squares(Double... values) {

        Double[] newArray = new Double[values.length];
        for(int j = 0; j < values.length ; j++ ){
            newArray[j] = (values[j] * values[j]);
        }
        return newArray;
    }

    public static Double add(Double value1, Double value2) {

        return value1 + value2 ;
    }

    public static Double subtract(Double value1, Double value2) {

        return value1 - value2;
    }


    public static Double divide(Double divisor, Double dividend) {

        return divisor / dividend ;
    }
}
