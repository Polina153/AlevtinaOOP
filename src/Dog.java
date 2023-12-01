public class Dog extends Animal{
    @Override
    void voice() {
        System.out.println("Bark");
    }
    void attack(){
        System.out.println(name + " is attacking");
    }
}
