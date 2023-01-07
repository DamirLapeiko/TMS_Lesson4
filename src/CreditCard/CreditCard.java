package CreditCard;
public class CreditCard {
    int NumberOfAcc;
    int CurrentSumOnAcc;
    public CreditCard(int NumberOfAcc, int CurrentSumOnAcc) {
        this.NumberOfAcc = NumberOfAcc;
        this.CurrentSumOnAcc = CurrentSumOnAcc;
    }

    public void setSomeMoneyOnAcc(int money){
        System.out.println("Сколько вы хотите пополнить? " + money);
        CurrentSumOnAcc += money;
        System.out.println("Сумма на счете " + CurrentSumOnAcc);
        System.out.println();
    }
    public void pullSomeMoneyFromAcc(int money) {
        System.out.println("Сколько вы хотите снять? " + money);
        CurrentSumOnAcc -= money;
        System.out.println("Сумма на счете " + CurrentSumOnAcc);
        System.out.println();
    }
    public void showMoneyOnAcc() {
        System.out.println("На карте " + NumberOfAcc + ":" + ' ' +CurrentSumOnAcc);
    }
}

