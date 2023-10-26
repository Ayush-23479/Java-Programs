import java.util.Scanner;

public class ps_error {
    public static void main(String[] args) {
       //Problem 1
        int age= 23;
        int year_born= 2000-23;
//        System.out.println(6/0);

        //Problem 2
        try {
            int a= 666/6;

        }
        catch (IllegalArgumentException e){
            System.out.println("Heheh");
        }
        catch (ArithmeticException e){
            System.out.println("Hahahahaha");
        }

        //Problem 3
        boolean flag =true;
        int [ ] marks= new int[3];
        marks[0]= 1;
        marks[1]=23;
        marks[2]=43;
        Scanner sc= new Scanner(System.in);
        int index;
        int i=0;
        while (flag && i<5){
            try {
                System.out.println("Enter the value of the index");
                index= sc.nextInt();
                System.out.println("The value of the marks[index] is "+ marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid Index");
                i++;

            }
        }
        if (i>=5){
            System.out.println("Error");
        }
    }
}
