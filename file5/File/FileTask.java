package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * Класс для обработки текстового файла.
 * Определяет, какие глухие согласные буквы русского алфавита
 * не встречаются ни в одном слове файла.
 */
public class FileTask {

    /** Множество всех глухих согласных */
    private static final Set<Character> DEAF = Set.of(
            'к','п','с','т','ф','х','ц','ч','ш','щ'
    );

    /**
     * Читает файл и определяет глухие согласные,
     * которые не встречаются ни в одном слове.
     *
     * @param filename имя файла для чтения
     */
    public static void process(String filename) {

        // сюда будем складывать найденные глухие согласные
        Set<Character> found = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            String line;

            while ((line = reader.readLine()) != null) {
                for (char c : line.toLowerCase().toCharArray()) {
                    if (DEAF.contains(c)) {
                        found.add(c);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Файл не найден: " + filename);
            return;
        }

        // теперь найдём те, которые НЕ встретились
        Set<Character> notUsed = new TreeSet<>(DEAF);
        notUsed.removeAll(found);

        System.out.println("Глухие согласные, которые не входят ни в одно слово:");

        if (notUsed.isEmpty()) {
            System.out.println("Таких букв нет.");
        } else {
            for (char c : notUsed) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
