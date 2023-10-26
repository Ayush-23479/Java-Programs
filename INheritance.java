class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I AM a CONSTRUTOR");
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class INheritance {
    public static void main(String[] args) {
        //Creating an object of basse class
        Base a= new Base();
        a.setX(4);
        System.out.println(a.getX());

        //Creating an object of derived class
        Derived a1= new Derived();
        a1.setY(34);
        System.out.println(a1.getY());
    }
}
