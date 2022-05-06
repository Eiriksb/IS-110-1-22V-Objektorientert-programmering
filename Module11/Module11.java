class Main {
    

    public static void main(String[] args) {
        Cat var1 = new Cat(5, "black");


        Cat var2 = new Cat(5, "black"); // Likt som var1 men ikke samme.

        Animal var3 = new Cat(13, "white");

        Cat var4 = var1;

        var3.makeSound();
        var3 = new Dog(15, "yellow");
        var3.makeSound();

        System.out.println(var1.equals(var2));

        System.out.println(var1.hashCode()+" "+ var1.age +" "+var1.farge);
        System.out.println(var2.hashCode()+" "+ var2.age +" "+var2.farge);
    }
}