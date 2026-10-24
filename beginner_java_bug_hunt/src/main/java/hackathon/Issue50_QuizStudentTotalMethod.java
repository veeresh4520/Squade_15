public class Issue50_QuizStudentTotalMethod {
    public static void main(String[] args) {
        int unitFee = 30;
        int quantity = 10;
        int discountPercent = 25;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
