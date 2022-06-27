package phonebook;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBookRepository {

    private static final List<PhoneBookEntry> phoneBook = new ArrayList<>();

    /**
     * <p>
     * Метод add добавляет в хранилище phoneBook запись PhoneBookEntry
     * </p>
     * 
     * @param entry
     */
    public void add(PhoneBookEntry entry) {

        phoneBook.add(entry);

    }

    /**
     * <p>
     * Метод get ищет в хранилище phoneBook телефонные номера с фамилией surname
     * (переводит в нижний регистр) и возвращает найденные значение в виде
     * List<String>
     * </p>
     * 
     * @param surname
     * @return List<String>
     */
    public List<String> get(String surname) {

        return phoneBook.stream().filter(pb -> {
            return surname.toLowerCase().equals(pb.getSurname().toLowerCase());
        }).map(pb -> pb.getPhone()).collect(Collectors.toList());

    }

}
