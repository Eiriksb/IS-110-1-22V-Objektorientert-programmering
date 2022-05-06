public class Cat extends Animal {

    public Cat(int age, String farge) {
        super(age, farge);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public boolean equals(Object obj) {
        
        if(this == obj) {
            return true; // Reference equality.
            }
            if(!(obj instanceof Cat)) {
            return false; // Not the same farge.
            }
            Cat other = (Cat) obj;
            return other.age == this.age && other.farge.equals(this.farge);
     }

    @Override
     public int hashCode() {
        int result = 68; // An arbitrary starting value.
        // Make the computed value depend on the order in which
        // the fields are processed.
        result = 37 * result + age;
        result = 37 * result + (farge == null ? 0 : farge.hashCode());
        return result;
    }
}   
