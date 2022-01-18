package Module2;

public class Py {
    private int y;  //Private class attribute

    public Py() {   //Class constructor
        y = 28;     //Initial value of class attribute y
    }

    public int getY() { //Public method that returns y
        return y;
    }

    public void setY(int newY) {    //Public method to set the value of y
        this.y = newY;
    }
}
