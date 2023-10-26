class Employee{
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name= n;
    }
}
class cellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Harami Phone utha...");
    }

}

class Square{
    int side;
    public  int area(){
        return side*side;
    }
    public int perimeter(){
return 4*side;
}
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public  void run(){
        System.out.println("Running from the enemy");
    }
    public  void fire(){
        System.out.println("Firirng on the enemy");
    }
}

public class oops_ps {
    public static void main(String[] args) {
        //Problem 1
        Employee Ayush = new Employee();
        Ayush.setName("Java Developer");
        Ayush.salary=200;
        System.out.println(Ayush.getSalary());
        System.out.println(Ayush.getName());


        //Problem 2
        cellPhone asus= new cellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();

        //Problem33
        Square sq= new Square();
        sq.side =3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());


        //Problem 5
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
}
}

