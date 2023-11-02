class Car extends Vehicle {
    public Car(String company, String model, int yearRelease) {
        super(company, model, yearRelease);
        this.numWheels = 4;
        this.speed = 0;
    }

    @Override
    public void testDrive() {
        this.speed = 60;
    }

    @Override
    public void park() {
        this.speed = 0;
    }
}