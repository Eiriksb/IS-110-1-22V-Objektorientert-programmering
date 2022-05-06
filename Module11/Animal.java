public abstract class Animal {
    protected int age;
    protected String farge;  
    public Animal(int age, String farge) {
        this.age = age;
        this.farge = farge;
    }
    protected abstract void makeSound();
}
