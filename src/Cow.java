public class Cow extends Animal implements Printable {

    private String food;

    public Cow(String name, int age, String food) {
        super(name, age);
        this.food = food;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Food: " + food);
    }
}
