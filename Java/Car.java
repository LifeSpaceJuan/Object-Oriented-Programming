class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;

    public Car(String license, Account driver){ // Parametros obligatorios para poderse crear un objeto Car
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        System.out.println("License: " + license + "    Driver: " + driver.name);
    }
}
