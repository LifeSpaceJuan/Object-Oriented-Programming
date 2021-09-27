<?php
require_once('car.php');
class UberVan extends Car
{
    public $typeCarAceppted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCarAceppted, $seatsMaterial)
    {
        parent::__construct($license, $driver);
        $this->typeCarAceppted = $typeCarAceppted;
        $this->seatsMaterial = $seatsMaterial;
    }
}
