import java.io.*;
import  java.lang.Thread;


public class Thread_Mthod2 {
    public static void main(String[] args) {
        try{
            for (int i = 0; i <5 ; i++) {
                Thread.sleep(2000);
                System.out.println(i);
                System.out.println("Child Thread");
            }
        }
//        catch(Exception e){
//            System.out.println(e);
        catch (InterruptedException e){
            System.out.println("Child Thread Interrupted");

        }
    }
}
