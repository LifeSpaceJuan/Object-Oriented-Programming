class main{
    public static void main(String[] args) {
        System.out.println("Hola mundo bb!!");
        Car car = new Car("AMV1257", new Account("Juano Antonio", "ABN456"));
        car.passenger = 4;
        car.printDataCar();

        Car car2 = new Car("NGE84RT",new Account("Natalia Surita", "ERT982"));
        car2.passenger = 3;
        car2.printDataCar();
        
    }
}