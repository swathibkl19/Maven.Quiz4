package rocks.zipcode.quiz4.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    Map<String , Integer> map = new HashMap<>();

    public WordCounter(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            String currentString =strings[i];
            map.put(currentString , count(strings , currentString));
        }
    }
    private Integer count(String[] strings , String currentString){
        return Collections.frequency(Arrays.asList(strings),currentString);
    }
    public Map<String, Integer> getWordCountMap() {

        //String[] words = WordCounter.string.split(" ");
        return map;
    }
}
