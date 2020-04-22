public class AnimalDemo {
    public static void main(String[] args) {
        AnimalFactory animatorFactory = new AnimalFactory();

        Animal a1 = animatorFactory.getAnimal("feline");
        System.out.println("a1 sound : " + a1.makeSound());

        Animal a2 = animatorFactory.getAnimal("canine");
        System.out.println("a2 sound : " + a2.makeSound());
    }
}
