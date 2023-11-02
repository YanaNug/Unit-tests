public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int
    discountAmount) {
        double discount = purchaseAmount * (discountAmount / 100.0);
        double totalAmount = purchaseAmount - discount;
        return totalAmount;
    }
    }