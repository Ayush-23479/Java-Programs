class a {
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}
class b extends a{
    @Override
    public void  meth1(){
        System.out.println("I am method 1 of class B");
    }
}

public class Method_OverRding {
    public static void main(String[] args) {
        a A= new a();
        A.meth1();

        b B= new b();
        B.meth1();

    }
}
