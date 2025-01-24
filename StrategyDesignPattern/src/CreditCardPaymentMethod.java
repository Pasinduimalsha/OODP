
public class CreditCardPaymentMethod implements PaymentMethod {

    public String cardHolderName ;
    public String card ;
    public String cvv ;
    public String dateOfExpiry;

    public CreditCardPaymentMethod(String cardHolderName, String card, String cvv, String dateOfExpiry) {
        this.cardHolderName = cardHolderName;
        this.card = card;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCard() {
        return card;
    }

    public String getCvv() {
        return cvv;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    @Override
    public void pay(int amount){
        System.out.println(amount + " is paid using " + card);
    }

}
