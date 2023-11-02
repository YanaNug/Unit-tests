import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class task2Test {
    @Test // Число входит в интервал от 25 до 100
    public void testNumberInTheInterval() {
        NumberUtils utils = new NumberUtils();
        int number = 77;
        boolean result = utils.numberInInterval(number);
        Assertions.assertTrue(result);
    }

    @Test // Число не входит в интервал от 25 до 100
    public void testNumberBelowInterval() {
        NumberUtils utils = new NumberUtils();
        int number = 13;
        boolean result = utils.numberInInterval(number);
        Assertions.assertFalse(result);
    }

    @Test // Число не входит в интервал от 25 до 100
    public void testNumberAboveInterval() {
        NumberUtils utils = new NumberUtils();
        int number = 375;
        boolean result = utils.numberInInterval(number);
        Assertions.assertFalse(result);
    }

    @Test // Граничное значение (не должно входить)
    public void testNumberEqualsLowerBoundary() {
        NumberUtils utils = new NumberUtils();
        int number = 25;
        boolean result = utils.numberInInterval(number);
        Assertions.assertFalse(result);
    }

    @Test // Граничное значение  (не должно входить)
    public void testNumberEqualsUpperBoundary() {
        NumberUtils utils = new NumberUtils();
        int number = 100;
        boolean result = utils.numberInInterval(number);
        Assertions.assertFalse(result);
    }
}