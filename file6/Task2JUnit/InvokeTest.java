import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Тест для проверки корректной работы аннотации @Invoke
 * и класса InvokeProcessor.
 */
public class InvokeTest {

    private TestClass testObject;

    /**
     * Подготовка тестового объекта перед каждым тестом.
     */
    @BeforeEach
    void setUp() {
        testObject = new TestClass();
    }

    /**
     * Проверяет, что методы с аннотацией @Invoke
     * успешно находятся и вызываются.
     */
    @Test
    void testInvokeProcessing() {

        assertDoesNotThrow(() -> {
            InvokeProcessor.process(testObject);
        });

    }
}
