public class BankAccount {

    private double amount;


    public  BankAccount(double amount) {
        this.amount = amount;
    }


    public double getAmount() {
        return amount;
    }


    public void deposit(double sum) {
        amount += sum;
        System.out.println("Поступило на счет: " + sum + " сом");
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("\nНедостаточно средств для снятия наличных, " +
                    " Ваш баланс: " + amount);
        }
        amount -= sum;
        System.out.println("Со счета успешно сняли: " + sum + " сом");;
    }


}
