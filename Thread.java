class MyThread1 extends Thread{

    public void run(){
        int i =0;
        while (i<1000){
            System.out.println("My Cooking Thread is Running ");
            System.out.println("I am Happy !");
            i++;
        }
    }
}


class MyThread2 extends Thread{

    public void run(){
        int i =0;
        while (i<1000){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am Fucked Up!");
            i++;
        }
    }
}

public class Thread {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2= new MyThread2();
    }
}
