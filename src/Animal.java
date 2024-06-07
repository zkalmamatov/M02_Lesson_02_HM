public class Animal implements Printable {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println( "\nName: " + name + ", Age: " + age );
    }
}
