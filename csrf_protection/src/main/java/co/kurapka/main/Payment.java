package co.kurapka.main;

/**
 * Created by achmudas on 25/04/15.
 */
public class Payment {

    private int cardNumber;
    private int bankAccountToTransfer;
    private int amountOfMoney;

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
