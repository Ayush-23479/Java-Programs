import java.sql.SQLOutput;

class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of circle");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius=r;

    }
    public double area(){
        return Math.PI*this.radius*this.radius;

    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
     super(r);
        System.out.println("I am cylinder1 parametrized contructor");
this.height=h;
    }


    public double volume(){
        return Math.PI*this.radius*this.radius*this.radius;
    }
}
public class Inheretance_ps {
    public static void main(String[] args) {
        //Problem 1
//        Circle obj= new Circle(12);

        Cylinder1 obj= new Cylinder1(12,4);
    }
}







