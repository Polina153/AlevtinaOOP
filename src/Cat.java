public class Cat extends Animal{
    public Cat(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    public Cat(String name, int legs, boolean tail) {
        super(name, legs, tail);
    }

    public Cat() {
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }
}
