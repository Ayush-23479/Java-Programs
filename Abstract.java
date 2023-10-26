import javax.xml.stream.XMLInputFactory;

abstract  class  Parent2{
    public Parent2(){
        System.out.println("Mai base 2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract  class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract {
    public static void main(String[] args) {
//        Parent2 p = new Parent2() ; --eroor
        Child2 c= new Child2();
        //Child c3 =new Child3(); --eroor
    }
}
