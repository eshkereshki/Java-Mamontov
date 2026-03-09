package Fraction;

/**
 * Класс, представляющий дробь с кешированием значения.
 * Значение типа double пересчитывается только тогда,
 * когда изменяется числитель или знаменатель.
 */
public class CachedFraction implements Fraction {

    /** Числитель дроби */
    private int numerator;

    /** Знаменатель дроби */
    private int denominator;

    /** Закешированное значение дроби в формате double */
    private Double cachedValue;

    /**
     * Создает дробь с указанным числителем и знаменателем.
     *
     * @param numerator числитель
     * @param denominator знаменатель
     * @throws IllegalArgumentException если знаменатель равен 0
     */
    public CachedFraction(int numerator, int denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("Знаменатель не может быть 0");

        this.numerator = numerator;
        this.denominator = denominator;
        normalize();
    }

    /**
     * Нормализует дробь.
     * Если знаменатель отрицательный, знак переносится в числитель.
     * Также сбрасывается кешированное значение.
     */
    private void normalize() {
        if (denominator < 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
        cachedValue = null;
    }

    /**
     * Возвращает значение дроби в формате double.
     * Если значение уже вычислялось, используется кеш.
     *
     * @return значение дроби
     */
    @Override
    public double getDoubleValue() {
        if (cachedValue == null)
            cachedValue = (double) numerator / denominator;
        return cachedValue;
    }

    /**
     * Устанавливает новый числитель дроби.
     * Кешированное значение сбрасывается.
     *
     * @param numerator новый числитель
     */
    @Override
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        cachedValue = null;
    }

    /**
     * Устанавливает новый знаменатель дроби.
     *
     * @param denominator новый знаменатель
     * @throws IllegalArgumentException если знаменатель равен 0
     */
    @Override
    public void setDenominator(int denominator) {
        if (denominator == 0)
            throw new IllegalArgumentException("Знаменатель не может быть 0");

        this.denominator = denominator;
        normalize();
    }

    /**
     * Возвращает строковое представление дроби.
     *
     * @return строка в формате "числитель/знаменатель"
     */
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    /**
     * Сравнивает две дроби.
     *
     * @param obj объект для сравнения
     * @return true если дроби равны
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CachedFraction)) return false;
        CachedFraction other = (CachedFraction) obj;
        return numerator == other.numerator &&
                denominator == other.denominator;
    }

    /**
     * Возвращает хеш-код дроби.
     *
     * @return хеш-код
     */
    @Override
    public int hashCode() {
        return 31 * numerator + denominator;
    }
}
