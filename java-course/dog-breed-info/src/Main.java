public class Main {
    public static void main(String[] args) {
        Dog maltese = new Dog();
        System.out.println(maltese.getInfo());

        Dog bulldog = new Dog();
        bulldog.setBreed("Bulldog");
        bulldog.setSize("Medium");
        bulldog.setAge(7);
        bulldog.setColor("Black");
        System.out.println(bulldog.getInfo());
        String dog_breed = bulldog.getBreed();
        System.out.println("Got this breed from the dog class: "+dog_breed);
    }
}
