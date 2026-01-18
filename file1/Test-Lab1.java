/**
 * Класс Test.
 * Содержит решения заданий 1.1 – 4.9.
 */
public class Test {

    /**
     * Задание 1.1
     * Возвращает дробную часть вещественного числа.
     */
    public double fraction(double x) {
        return x - (int) x;
    }

    /**
     * Задание 1.3
     * Преобразует символ цифры в соответствующее число.
     */
    public int charToNum(char x) {
        return x - '0';
    }

    /**
     * Задание 1.5
     * Проверяет, является ли число двузначным.
     */
    public boolean is2Digits(int x) {
        return x >= 10 && x <= 99;
    }

    /**
     * Задание 1.7
     * Проверяет, находится ли число в заданном диапазоне.
     */
    public boolean isInRange(int a, int b, int num) {
        return num >= a && num <= b;
    }

    /**
     * Задание 1.9
     * Проверяет, равны ли три числа между собой.
     */
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    /**
     * Задание 2.1
     * Возвращает модуль числа.
     */
    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    /**
     * Задание 2.3
     * Проверяет, делится ли число на 3 или 5,
     * но не делится одновременно на оба.
     */
    public boolean is35(int x) {
        return (x % 3 == 0 || x % 5 == 0) &&
                !(x % 3 == 0 && x % 5 == 0);
    }

    /**
     * Задание 2.5
     * Возвращает максимальное из трёх чисел.
     */
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    /**
     * Задание 2.7
     * Возвращает сумму двух чисел,
     * либо 20, если сумма в диапазоне 10–19.
     */
    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    /**
     * Задание 2.9
     * Возвращает название дня недели по номеру.
     */
    public String day(int x) {
        switch (x) {
            case 1: return "понедельник";
            case 2: return "вторник";
            case 3: return "среда";
            case 4: return "четверг";
            case 5: return "пятница";
            case 6: return "суббота";
            case 7: return "воскресенье";
            default: return "это не день недели";
        }
    }

    /**
     * Задание 3.1
     * Формирует строку чисел от 0 до x.
     */
    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i + (i < x ? " " : "");
        }
        return result;
    }

    /**
     * Задание 3.3
     * Формирует строку чётных чисел от 0 до x.
     */
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) result.append(" ");
        }
        return result.toString();
    }

    /**
     * Задание 3.5
     * Возвращает количество цифр в числе.
     */
    public int numLen(long x) {
        if (x == 0) return 1;
        int count = 0;
        x = Math.abs(x);
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    /**
     * Задание 3.7
     * Выводит квадрат из символов '*'.
     */
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Задание 3.9
     * Выводит прямоугольный треугольник из символов '*'.
     */
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) System.out.print(" ");
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }
    }

    /**
     * Задание 4.1
     * Возвращает индекс первого вхождения элемента.
     */
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    /**
     * Задание 4.3
     * Возвращает элемент массива с наибольшим модулем.
     */
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int v : arr) {
            if (Math.abs(v) > Math.abs(max)) max = v;
        }
        return max;
    }

    /**
     * Задание 4.5
     * Вставляет массив ins в массив arr на позицию pos.
     */
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] res = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) res[i] = arr[i];
        for (int i = 0; i < ins.length; i++) res[pos + i] = ins[i];
        for (int i = pos; i < arr.length; i++) res[i + ins.length] = arr[i];
        return res;
    }

    /**
     * Задание 4.7
     * Возвращает массив в обратном порядке.
     */
    public int[] reverseBack(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }

    /**
     * Задание 4.9
     * Возвращает массив индексов всех вхождений элемента.
     */
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int v : arr) if (v == x) count++;

        int[] res = new int[count];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) res[idx++] = i;
        }
        return res;
    }
}
