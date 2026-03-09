package StreamName;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Класс для обработки файла с именами и возрастами с использованием Stream API.
 * Данные группируются по возрасту.
 */
public class StreamNameTask {

    /**
     * Читает файл, извлекает имена и возраста и группирует имена по возрасту.
     *
     * Формат строки файла:
     * имя:возраст
     *
     * @param filename имя файла для чтения
     * @throws Exception если возникает ошибка при чтении файла
     */
    public static void process(String filename) throws Exception {

        Map<Integer, List<String>> map =
                new BufferedReader(new FileReader(filename))
                        .lines()
                        .map(line -> line.split(":"))
                        .filter(arr -> arr.length == 2 && !arr[1].isBlank())
                        .collect(Collectors.groupingBy(
                                arr -> Integer.parseInt(arr[1]),
                                Collectors.mapping(
                                        arr -> capitalize(arr[0].toLowerCase()),
                                        Collectors.toList()
                                )
                        ));

        System.out.println(map);
    }

    /**
     * Делает первую букву строки заглавной.
     *
     * @param s исходная строка
     * @return строка с заглавной первой буквой
     */
    private static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }
}
