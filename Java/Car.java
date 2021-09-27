class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver){ // Parametros obligatorios para poderse crear un objeto Car
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (passenger != null) 
            System.out.println("License: " + license + "    Driver: " + driver.name + "     Passengers: " + passenger);
    }

    //Encapsulamiento
    public Integer getPassenger(){
        return passenger;
    }

    public void setPassenger(Integer passenger){
        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesita asignar minimo 4 pasajeros");
        }
    }
}
