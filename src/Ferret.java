public class Ferret extends Animal{
    public Ferret(String name, int age, int legs, boolean tail) {
        super(name, age, legs, tail);
    }

    public Ferret(String name, int legs, boolean tail) {
        super(name, legs, tail);
    }

    public Ferret() {
    }

    @Override
    void voice() {
        System.out.println("silent");
    }
}
