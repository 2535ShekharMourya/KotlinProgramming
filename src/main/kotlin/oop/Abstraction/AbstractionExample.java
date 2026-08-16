package oop.Abstraction;

public class AbstractionExample {
    public static void main(String[] args) {

        LocalUserRepository repository =new LocalUserRepository();
        UserViewModel viewModel = new UserViewModel(repository);
        viewModel.loadUser();

        PaymentGateway paymentGateway = new RazorpayGateway();
        CheckoutService checkoutService = new CheckoutService(paymentGateway);
        checkoutService.checkout(500.0);
    }
}

class CheckoutService { // Exercise 1 — Payment Gateway ⭐⭐⭐⭐⭐
    private final PaymentGateway paymentGateway;
    CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }
    public void checkout(double amount) {
        boolean success = paymentGateway.pay(amount);

        if (success) {
            System.out.println("Checkout successful");
        } else {
            System.out.println("Payment failed");
        }
    }
}
interface PaymentGateway {
    boolean pay(double amount);
}

class RazorpayGateway implements PaymentGateway {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing payment using Razorpay");
        System.out.println("Calling Razorpay API...");
        return true;
    }
}

class StripeGateway implements PaymentGateway {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing payment using Stripe");
        System.out.println("Calling Stripe API...");
        return true;
    }
}

class PaypalGateway implements PaymentGateway {
    @Override
    public boolean pay(double amount) {
        System.out.println("Processing payment using PayPal");
        System.out.println("Calling PayPal API...");
        return true;
    }
}

class UserViewModel {
    private final UserRepository repository;
    UserViewModel(UserRepository repository) {
        this.repository = repository;
    }

    void loadUser() {
        User user = repository.getUser();
        System.out.println(user.name);
    }
}

interface UserRepository {
    User getUser();
}

class LocalUserRepository implements UserRepository {
    @Override
    public User getUser() {
        // Fetch from Room
        return new User("local :Shekhar", 25);
    }
}

class RemoteUserRepository implements UserRepository {
    @Override
    public User getUser() {
        // Fetch from Retrofit/Firebase
        return new User("Remote: Shekhar", 25);
    }
}

class User {

     String name;
    int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
4. Abstraction:
abstraction is not simply "using an interface. " The key idea is hiding implementation details and exposing only the essential behavior
        Exercise 1 — Payment Gateway ⭐⭐⭐⭐⭐
        Create an abstraction:
        PaymentGateway
        ├── RazorpayGateway
        ├── StripeGateway
        └── PaypalGateway
        Define:
interface PaymentGateway {
    fun pay(amount: Double): Boolean
}
    Implement each gateway differently.
        Then create a checkout service:
class CheckoutService(
        private val paymentGateway: PaymentGateway
)
The CheckoutService should not know how Razorpay/Stripe/etc. internally work.
        This is VERY important for Android interviews because it connects OOP with Dependency Injection.
        Follow-ups:
Q.1:  Why interface instead of concrete class?
Ans: I use an interface because CheckoutService depends on the abstraction rather than a concrete payment provider.
This reduces coupling and allows me to replace Razorpay with Stripe or PayPal without modifying CheckoutService
This is basically the Dependency Inversion Principle.

Bad: CheckoutService → RazorpayGateway
Good: CheckoutService → PaymentGateway ← RazorpayGateway
                                       ← StripeGateway
                                       ← PaypalGateway
PaymentGateway tells CheckoutService what operation is available, but doesn't tell it how the operation is implemented
CheckoutService only knows: paymentGateway.pay(amount);
It does not know:
// Razorpay details
createOrder();
generateSignature();
callRazorpayAPI();
verifyPayment();
or:
// Stripe details
createPaymentIntent();
callStripeAPI();
confirmPayment();
That's the abstraction.

Q.2: How does abstraction help testing?  How would you create a fake payment gateway for unit testing?
Suppose you want to test CheckoutService.
You don't want your unit test to actually call Razorpay's API. You can create a fake:

class FakePaymentGateway implements PaymentGateway {
    @Override
    public boolean pay(double amount) {
        return true;
    }
}
Then:
PaymentGateway fakeGateway = new FakePaymentGateway();
CheckoutService checkoutService = new CheckoutService(fakeGateway);
checkoutService.checkout(500);

Now your test doesn't need:
Internet
Razorpay SDK
Razorpay server
Real payment
API credentials

This is called dependency substitution for testing.

"I define a PaymentGateway interface that exposes the pay() operation without exposing the implementation details.
Razorpay, Stripe, and PayPal implement that interface differently.
CheckoutService depends only on the PaymentGateway abstraction, so it doesn't care which payment provider is being used.
This reduces coupling, allows implementations to be easily replaced, and makes the service easier to unit test by injecting a fake payment gateway."

        Exercise 2 — Repository Abstraction ⭐⭐⭐⭐⭐
        Create:
        UserRepository
        ├── LocalUserRepository
        └── RemoteUserRepository
        Interface:
interface UserRepository {
    suspend fun getUser(): User
}
Then:
class UserViewModel(
        private val repository: UserRepository
)
The ViewModel should not care whether data comes from Room, Retrofit, Firebase, etc.
        This is especially valuable for your Android interviews because it combines:
        Abstraction + Polymorphism + Dependency Injection + MVVM + Repository Pattern.
*/
