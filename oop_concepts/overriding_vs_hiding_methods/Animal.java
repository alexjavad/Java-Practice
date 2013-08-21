public class Animal {
    public static void testClassMethod() {
        System.out.println("The class method in Animal.");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Animal.");
    }
    public static void main(String[] args) {
        Animal myAnimal = new Cat();
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}