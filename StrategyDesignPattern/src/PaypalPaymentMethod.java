

public class PaypalPaymentMethod implements PaymentMethod{
   public String email;
   public String password;

    public PaypalPaymentMethod(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    //Method Ipmlimentation
    @Override
    public void pay(int amount) {
        System.out.println(amount + "is paid using paypal");
    }
}
