<?php
require_once('car.php');
require_once('account.php');

$car = new Car("AMV1257", new Account("Juano Antonio", "ABN456 \n"));
$car->printDataCar();

$car2 = new Car("NGE84RT",new Account("Natalia Surita", "ERT982 \n"));
$car2->printDataCar();
