public class DogMaker {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Bjarne","collie");
        Dog dog2 = new Dog("Flemming", "lortehund");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");

        System.out.println(dog1.getName() + " is now a " + dog1.getBreed() + ".");
        System.out.println(dog2.getName() + " is now a " + dog2.getBreed() + ".");


    }
}
