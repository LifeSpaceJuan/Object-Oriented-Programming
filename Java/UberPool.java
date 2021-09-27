class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model){
        super(license, driver); // Representa a la clase padre de la herencia, constructor de Car
        this.brand = brand;
        this.model = model;
    }
}