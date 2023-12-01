public abstract class Animal {
    String name;
    int age;
    int legs;
    boolean tail;

    public Animal(String name, int age, int legs, boolean tail) {
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.tail = tail;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int legs, boolean tail) {
        this.name = name;
        this.age = -1;
        this.legs = legs;
        this.tail = tail;
    }

    public Animal() {
        this.name = "No name";
        this.age = -1;
        this.legs = 4;
        this.tail = true;
    }
    void printInfo(){
        System.out.printf("This %s is %s years old and has %s legs and tail is %s. \n", name, age, legs, tail);
    }
    abstract void voice();
}
