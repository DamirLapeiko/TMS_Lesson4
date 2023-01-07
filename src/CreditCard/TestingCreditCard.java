package CreditCard;
public class TestingCreditCard {
    public static void main(String[] args) {
CreditCard creditCard1 = new CreditCard(1, 1570);
CreditCard creditCard2 = new CreditCard(2,2160);
CreditCard creditCard3 = new CreditCard(3,3260);

creditCard1.setSomeMoneyOnAcc(230);
creditCard2.setSomeMoneyOnAcc(240);
creditCard3.pullSomeMoneyFromAcc(260);

creditCard1.showMoneyOnAcc();
creditCard2.showMoneyOnAcc();
creditCard3.showMoneyOnAcc();
    }
}
