public class Main {
    public static void main(String[] args)
    {
        Animal dog = new Animal("Dog",20);
        Animal cat = new Animal("Cat",10);

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        dog.setAge(21);
        cat.setAge(11);

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        System.out.println(dog);
        System.out.println(cat);
    }
}
