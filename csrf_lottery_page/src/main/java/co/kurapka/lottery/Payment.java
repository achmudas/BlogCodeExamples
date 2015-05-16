package co.kurapka.lottery;

/**
 * Created by achmudas on 16/05/15.
 */
public class Payment {

    private int cardNumber = 444444;
    private int bankAccountToTransfer = 353535;
    private int amountOfMoney = 10000;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getBankAccountToTransfer() {
        return bankAccountToTransfer;
    }

    public void setBankAccountToTransfer(int bankAccountToTransfer) {
        this.bankAccountToTransfer = bankAccountToTransfer;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

}
