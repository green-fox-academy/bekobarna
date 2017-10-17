package CreditCard;

public class CreditCardApp {

    public static void main(String[] args) {
        CreditCard card = new CreditCard();

        System.out.println(card.getCodeAccount());
        System.out.println(card.cumeSumCVV(card.getCodeAccount()));

    }
}
