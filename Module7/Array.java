public class Array {
    static String[] cars = {"Acura", "BMW", "Audi", "Mazda", "Ford"};

    static int[] myNum = {10,20,30,40};

    public static void main(String[] args) {
        for (int i = 0; i < cars.length; i++){ //i starter som 0, gjør noe om i er mindre en hvor mange strings det er i Array, så pluss på 1 på i.
            System.out.println(cars[i]);
        }

        for (int i : myNum) {
            System.out.println(i);
        }

        int x, y;

        x = 20;

        y = (x == 1)? 31:90;

        System.out.println(y);

        y = (x == 20)? 31:90;

        System.out.println(y);
    }
}
