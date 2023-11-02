import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task1Test {
    @Test  Проверка, что возвращается true, если число чётное
    public void testEvenNumber() {
        NumberUtils utils = new NumberUtils();
        int evenNumber = 8888;
        boolean isEven = utils.evenOddNumber(evenNumber);
        Assertions.assertTrue(isEven);
    }

    @Test  Проверка, что возвращается false, если число нечётное
    public void testOddNumber() {
        NumberUtils utils = new NumberUtils();
        int oddNumber = 777;
        boolean isEven = utils.evenOddNumber(oddNumber);
        Assertions.assertFalse(isEven);
    }

    @Test  Проверка, что возвращается true, если передаётся ноль
    public void testZero() {
        NumberUtils utils = new NumberUtils();
        int zero = 0;
        boolean isEven = utils.evenOddNumber(zero);
        Assertions.assertTrue(isEven);
    }
}