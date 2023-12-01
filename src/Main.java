public class Main {
    public static void main(String[] args) {
/*        Box myBox = new Box(15, 10.5, 13.2);
        Box box1 = new Box(5, 5, 5);
        Box box2 = new Box(10, 10, 10);
        myBox.showVolume();
        box1.showVolume();
        box2.showVolume();*/
        Cat cat = new Cat();
        cat.printInfo();
        Dog dog = new Dog();
        Ferret ferret = new Ferret("Gerda", 6, 4, true);
        dog.printInfo();
        dog.attack();
        ferret.printInfo();
        Dolphin dolphin = new Dolphin("Charly", 10);
        dolphin.printInfo();
    }
}