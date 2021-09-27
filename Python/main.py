from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo")
    car = Car("NGE84RT", Account("Natalia Surita", "ERT982"))
    car.passenger = 4
    print(vars(car))
    print(vars(car.driver))

    car2 = Car("AMV1257", Account("Juano Antonio", "ABN456"))
    car2.passenger = 3
    print(vars(car2))
    print(vars(car2.driver))