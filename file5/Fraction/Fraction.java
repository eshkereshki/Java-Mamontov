package Fraction;

/**
 * Интерфейс, описывающий дробь.
 * Позволяет получать значение дроби и изменять её числитель и знаменатель.
 */
public interface Fraction {

    /**
     * Возвращает значение дроби в виде числа типа double.
     *
     * @return значение дроби
     */
    double getDoubleValue();

    /**
     * Устанавливает новый числитель дроби.
     *
     * @param numerator новый числитель
     */
    void setNumerator(int numerator);

    /**
     * Устанавливает новый знаменатель дроби.
     *
     * @param denominator новый знаменатель
     */
    void setDenominator(int denominator);
}
