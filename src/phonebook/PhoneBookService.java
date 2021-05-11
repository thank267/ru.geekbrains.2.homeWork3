package phonebook;

import java.util.List;

public class PhoneBookService {

    private static final PhoneBookRepository phoneBook = new PhoneBookRepository();

    /**
     * <p>
     * Метод add проверяет на значения свойств PhoneBookEntry на null и пустоту. В
     * случае положительной проверки добавляет PhoneBookEntry в хранилище
     * PhoneBookRepository. В случае отрицательной проверки выдает соответствующее
     * предупреждение
     * 
     * В случае успешного добавления в хранилище выводит соответствующее уведомление
     * </p>
     * 
     * @param entry Запись телефонной книги
     */
    public static void add(PhoneBookEntry entry) {

        if (entry.getPhone() == null || entry.getPhone().trim().equals("")) {
            System.out.println("Телефонный номер не может быть пустым или содержать одни пробелы");
            return;
        }

        if (entry.getSurname() == null || entry.getSurname().trim().equals("")) {
            System.out.println("Отчество не может быть пустым или содержать одни пробелы");
            return;
        }

        phoneBook.add(entry);

        System.out.println("Вы успешно добавили запись в телефонную книгу " + entry);

    }

    /**
     * *
     * <p>
     * Метод get проверяет строку поиска surname на null и пустоту. В случае
     * положительной проверки осуществляет поиск телефонных номеров в хранилище
     * PhoneBookRepository.
     * 
     * В случае успешного поиска выводит список найденных номеров, иначе выдает
     * соответствующее предупреждение
     * </p>
     * 
     * @param surname Фамилия для поиска
     */
    public static void get(String surname) {

        if (surname == null || surname.trim().equals("")) {
            System.out.println("Отчество не может быть пустым или содержать одни пробелы");
            return;
        }

        List<String> entries = phoneBook.get(surname);

        if (entries.size() != 0) {
            System.out.printf("По фамилии \"%s\" нашли телефонные номера: %s\n", surname, entries);
        } else {
            System.out.printf("Для фамилии \"%s\" нет записей в телефонной книге\n", surname);
        }

    }

}
