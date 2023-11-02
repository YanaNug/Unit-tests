import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testCalculateDiscountWithValidArguments() {
        double purchaseAmount = 100.0;
        int discountAmount = 20;

        double totalAmount = Calculator.calculateDiscount(purchaseAmount, discountAmount);

        Assertions.assertThat(totalAmount).isEqualTo(80.0);
    }

    @Test
    public void testCalculateDiscountWithInvalidArguments() {
        double purchaseAmount = 100.0;
        int discountAmount = 200; // Неверное значение скидки

        Assertions.assertThatThrownBy(() -> {
            Calculator.calculateDiscount(purchaseAmount, discountAmount);
        }).isInstanceOf(ArithmeticException.class)
          .hasMessage("Проверка на исключение ArithmeticException");
    }
}