import java.util.Arrays;

import utils.ArrayUtil;
import phonebook.PhoneBookEntry;
import phonebook.PhoneBookService;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Первоначальный массив:");
        System.out.println(Arrays.deepToString(ArrayUtil.getNotUniqueArray()));

        System.out.println("Подсчет вхождения слов:");
        System.out.println(ArrayUtil.countWordsFromArray());

        System.out.println("Список уникальных слов (число вхождений 1):");
        System.out.println(ArrayUtil.getUniqueWordsFromArray());

        System.out.println("=======================");
        PhoneBookService.get("Marley");
        PhoneBookService.add(new PhoneBookEntry("Marley", "+11111111111"));
        PhoneBookService.get("Marley");
        PhoneBookService.add(new PhoneBookEntry("marley", "+22222222222"));
        PhoneBookService.get("marley");
        

       
       
    }
}
