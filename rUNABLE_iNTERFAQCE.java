class MyThreadRunable1 implements  Runnable{
    public void run(){
        System.out.println("I am thread 1 not threat 1");
        System.out.println("I am thread 1 not threat 1");
        System.out.println("I am thread 1 not threat 1");
        System.out.println("I am thread 1 not threat 1");
        System.out.println("I am thread 1 not threat 1");
    }
}
class MyThreadRunable2 implements  Runnable{
    public void run(){
        System.out.println("I am thread 2 not threat 2");
        System.out.println("I am thread 2 not threat 2");
        System.out.println("I am thread 2 not threat 2");
        System.out.println("I am thread 2 not threat 2");
        System.out.println("I am thread 2 not threat 2");
    }
}


public class rUNABLE_iNTERFAQCE {
    public static void main(String[] args) {
        MyThreadRunable1 bullet1= new MyThreadRunable1();
//        Thread gun1= new MyThread1(bullet1);


        MyThreadRunable2 bullet2= new MyThreadRunable2();
        Thread gun2= new Thread();

    }
}
