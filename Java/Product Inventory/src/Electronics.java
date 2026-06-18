class Electronics implements Discountable {

    double price;

    Electronics(double price) {
        this.price = price;
    }

    public void applyDiscount(double pct) {
        price = price - (price * pct / 100);
        System.out.println("New Price = " + price);
    }
}

