package OOpsInKotlin.Abstraction;

public class TestAbstraction {
    public static void main(String[] args) {
        Vehicle car = new Car();

        VehicleAbs vehicleAbs = new Truck();
        vehicleAbs.start();

       PaymentInterface paymentInterface = new UpiPaymentClass();
       paymentInterface.pay(23);



    }
}
