public class Dolphin extends Animal{
    public Dolphin(String name, int age) {
        super(name, age, 0, true);
    }

    @Override
    void printInfo() {
        System.out.printf("This %s is %s years old. \n", name, age);
    }

    @Override
    void voice() {
        System.out.println("ftttt");
    }
}
