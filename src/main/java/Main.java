import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", 20);
        Animal cat = new Animal("Cat", 10);

        //      System.out.println(dog.getAge());
        //       System.out.println(cat.getAge());

        //      dog.setAge(21);
        //       cat.setAge(11);

        //       System.out.println(dog.getAge());


        System.out.println(Animal.animalCounter);

        Animal rabbit = new Animal("Rabbit", 10);
        System.out.println(Animal.animalCounter);

    }
        public void test () {
            System.out.println("Testing...");
        }
}
