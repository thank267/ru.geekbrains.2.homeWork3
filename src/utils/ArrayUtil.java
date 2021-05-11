package utils;

import static constants.Constants.COUNT_WORDS;
import static constants.Constants.DICTINCT_WORDS;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayUtil {

    private final static String[] notUniqueArray = getWordsArray();

    
    /**
     * <p>
     * Генерирует случайным образом массив
     * из заданного массива строк DICTINCT_WORDS
     * длиной COUNT_WORDS</p>
     * 
     * @return String[]
     */
    private static String[] getWordsArray() {

        String[] tmpArray = new String[COUNT_WORDS];

        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = DICTINCT_WORDS[new Random().nextInt(DICTINCT_WORDS.length)];
        }

        return tmpArray;

    }

    
    /**
     * <p> Геттер для notUniqueArray </p>
     * 
     * @return String[]
     */
    public static String[] getNotUniqueArray() {
        return notUniqueArray;
    }

    
    /**
     * <p>
     * Возвращет список уникальных (не имеющих дубликатов) слов из внутреннего
     * массива notUniqueArray</p>
     * 
     * @return List<String>
     */
    public static List<String> getUniqueWordsFromArray() {

        Map<String, Integer> tmpMap = countWordsFromArray();
        
        return tmpMap
            .entrySet()
            .stream()
            .filter(x -> x.getValue()==1)
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()))
            .keySet()
            .stream()
            .sorted()
            .collect(Collectors.toList());

    }

    
    /**
     * <p>
     * Возвращет Map<String, Integer> числа вхождения слов
     * во внутреннем массиве notUniqueArray</p>
     * 
     * @return Map<String, Integer>
     */
    public static Map<String, Integer> countWordsFromArray() {

        return Arrays
            .asList(getNotUniqueArray())
            .stream()
            .collect(Collectors.toMap(word -> word, word -> 1, Integer::sum))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<String,Integer>comparingByKey())
            .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue(), (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    }

}