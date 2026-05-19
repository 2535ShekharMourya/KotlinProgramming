package OOpsInKotlin.Abstraction;

interface VehicleAbs{
    abstract void start();
    abstract  void fuelType();
}

class Truck implements VehicleAbs{

    @Override
    public void start() {
        System.out.println("Truck Start");
    }

    @Override
    public void fuelType() {
        System.out.println("Truck fuelType is Disel ");

    }
}

abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Uses fuel or electricity");
    }
}
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

abstract class Payment{
    abstract void validate();
    void validateToUpi(){}
    void validateToBank(){}
    abstract void connectToBank();
    abstract void debitMoney();

}
class UpiPayment extends Payment {
    @Override
    void validate() {

    }

    @Override
    void connectToBank() {

    }

    @Override
    void debitMoney() {

    }
}
class NetBankingPayment extends Payment {

    @Override
    void validate() {

    }

    @Override
    void connectToBank() {

    }

    @Override
    void debitMoney() {

    }
}

interface PaymentInterface{
    abstract void validate();
    abstract void connectToBank();
    abstract void debitMoney();
    abstract void pay(int amount);
}
class UpiPaymentClass implements PaymentInterface{

    @Override
    public void validate() {

    }

    @Override
    public void connectToBank() {

    }

    @Override
    public void debitMoney() {

    }

    @Override
    public void pay(int amount) {

    }

    public void validateUpi(){

    }
}


