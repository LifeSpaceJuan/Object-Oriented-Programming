class Car {    
    constructor(license, driver){
        this.license = license;
        this.driver = driver;
        this.passenger;
        this.id;
    }
    
    printDataCar() {
        console.log(this.driver);
        console.log(this.license);
        console.log(this.driver.name);
        console.log(this.driver.document);
        console.table(this.driver); // lo imprime como una tabla
    }
}

