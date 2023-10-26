import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {
        System.out.println("Take the Input fronm the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Sub1");
        int Sub1= sc.nextInt();
        System.out.println("Enter the marks of Sub2");
        int Sub2= sc.nextInt();
        System.out.println("Enter the marks of Sub3");
        int Sub3= sc.nextInt();

      float percentage = ((Sub1+Sub2+Sub3)/300f)*100;
        System.out.print("The percentage of a student is  ");
        System.out.println(percentage);



    }
}
