abstract class Pen{
    abstract void  write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}


class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
  void bite(){
      System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello..");
    }
    @Override
    public void eat(){
        System.out.println("Eating");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping");
    }
}
public class ps_Intefaces1 {
    public static void main(String[] args) {
        //q1+q2
        FountainPen pen= new FountainPen();
        pen.changeNib();


        //q3
        Human ayush =new Human();
        ayush.sleep();


        //q5
        Monkey m2= new Human();
        m2.bite();
        m2.jump();


        BasicAnimal Ab= new Human();
        Ab.eat();
        Ab.sleep();
    }
}
