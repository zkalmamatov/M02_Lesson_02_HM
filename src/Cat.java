public class Cat extends Animal implements Printable {

    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( "Color: " + color);
    }
}
