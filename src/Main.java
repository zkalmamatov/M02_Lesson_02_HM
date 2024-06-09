import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal_1 = createObject("Dog");
        Animal animal_2 = createObject("Cat");
        Animal animal_3 = createObject("Cow");
        Animal[] animals = {animal_1, animal_2, animal_3};
        for (Animal animal : animals) {
            ((Printable) animal).print();
        }


        System.out.println("\n__________");
        System.out.println("BANK JAVA:\n");


        BankAccount bank_account = new BankAccount(15000.00);

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Ваш текущий баланс: " + bank_account.getAmount());
        System.out.println();

        while (true) {
            System.out.println("Укажите сумму для снятия: ");
            int inSum = scanner.nextInt();
            try {
                bank_account.withDraw(inSum);
                System.out.println("Ваш текущий остаток на счете: " + bank_account.getAmount() + "\n");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                System.out.println("Доступная сумма для снятия:" + e.getRemainingAmount());
                try {
                    bank_account.withDraw((int) bank_account.getAmount());
                } catch (LimitException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("\nВаш текущий остаток на счете: " + bank_account.getAmount());
                break;
            }
        }
    }


    public static Animal createObject(String className) {
        switch (className) {
            case "Dog":
                return new Dog("Rex", 5, "Doberman");
            case "Cat":
                return new Cat("Leo", 3, "White");
            case "Cow":
                return new Cow("Astra", 6, "Clover");
            default:
                return null;
        }
    }
}
