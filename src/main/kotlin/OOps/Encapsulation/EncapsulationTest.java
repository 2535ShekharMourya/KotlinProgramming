package OOpsInKotlin.Encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(200);
        System.out.println( account.getBalance());

        StudentJV studentJV = new StudentJV();
        // this is  not  Encapsulation because we directly access it and modify it without any validation
        studentJV.age = 23;
        studentJV.name = "shekhar";

        // this is Encapsulation
        studentJV.setMarks(23);
        studentJV.getMarks();

    }
}
