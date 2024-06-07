public class Dog extends Animal implements Printable {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void print() {
        super.print();
        System.out.println( "bread: " + breed);
    }
}
