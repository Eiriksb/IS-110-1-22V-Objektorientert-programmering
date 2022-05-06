public class Dog extends Animal{

    public Dog(int age, String farge) {
        super(age, farge);
    }

    @Override
    protected void makeSound() {
        System.out.println("Woof"); 
    }

    
    
}
