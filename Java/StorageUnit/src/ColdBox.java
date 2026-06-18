class ColdBox extends StorageUnit implements Refrigerated {

    ColdBox(int id, double capacity) {
        super(id, capacity);
    }

    public void adjustTemp(int t) {
        System.out.println("Temperature adjusted to " + t + "°C");
    }
}