public class Inventory {
    public static void main(String[] args) {

        Electronics[] inventory = {
                new Electronics(50000),
                new Electronics(30000)
        };

        for (Electronics e : inventory) {
            e.applyDiscount(10);
        }
    }
}