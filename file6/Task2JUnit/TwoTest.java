import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Тест для проверки обработки некорректных значений аннотации @Two.
 */
public class TwoTest {

    /**
     * Проверяет, что при пустой строке и отрицательном числе
     * выбрасывается IllegalArgumentException.
     */
    @Test
    void testInvalidTwoAnnotation() {

        assertThrows(
                IllegalArgumentException.class,
                () -> TwoProcessor.process(InvalidTwoAnnotatedClass.class)
        );
    }
}
