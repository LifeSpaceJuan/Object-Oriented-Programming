<?php
require_once('car.php');
require_once('account.php');
require_once('UberX.php');
require_once('UberBlack.php');

$car = new Car("AMV1257", new Account("Juano Antonio", "ABN456"));
$car->printDataCar();

$car2 = new Car("NGE84RT",new Account("Natalia Surita", "ERT982"));
$car2->printDataCar();

$uberX = new UberX("LIHT543", new Account("El pepe", "ARI654"), "Chevrolet", "spark");
$uberX ->printDataCar();

$uberBlack = new UberBlack("BERW490", new Account("Jose Luis", "IYT783"), "Elegant", "Cuero");
$uberBlack ->printDataCar();


?>