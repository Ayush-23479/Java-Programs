import java.util.Scanner;

public class ps {
    public static void main(String[] args) {
//      byte m1,m2,m3;
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter your marks in Physics");
//        m1 =sc.nextByte();
//
//        System.out.println("Enter your marks in Chemistry");
//        m2 =sc.nextByte();
//
//        System.out.println("Enter your marks in Mathematics ");
//        m3 =sc.nextByte();
//
//        float avg= (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall Percentage is: "+ avg);
//        if (avg>= 40&& m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, you have been promoted");
//        }
//else {
//            System.out.println("Sorry, you have not been promoted!Please try again ");
//        }

//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter your income in lakhs per annum "");
//                float tax =0;
//        float income = sc.nextFloat();
//        if (income <= 2.5) {
//            tax =tax+0;
//        } else if (income>2.5f && income <=5f) {
//            tax= tax+ 0.05f* (income-2.5f);
//        }
//        else if (income>5f && income <=10.0f) {
//            tax= tax+ 0.05f* (5.0f-2.5f);
//            tax= tax+ 0.2f*(income -5f);
//        }
//       else if (income>10.0f) {
//            tax =tax+0.05f*(5.0f-2.5f);
//            tax=tax +0.2f*(10.0f-5f);
//            tax= tax+0.3f*(income-10.0f);
//
//        }
//        System.out.println("The total tax paid by the employee is :" + tax);



//        Scanner sc= new Scanner(System.in);
//        int day= sc.nextInt();
//
//        switch (day){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuseday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");



//        }

//        int n=4 ;
//        for (int i = n; i >0 ; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//
//            }
//            System.out.print("\n");
//        }

//


//        int n=5;
//        for (int i = 0; i <10 ; i++) {
//            for (int j = 1; j <=10 ; j++) {
//                System.out.printf("%d X %d =%d\n", n,j,n*j);
//            }
//        }


//        int n=10;
//        for (int i = 10; i>=1; i--) {
//            System.out.printf("%d X %d =%d \n",n,i,n*i);
//        }


//        int n=5;
//        int i=1;
//        int factorial =1;
//        while (i<=n){
//            factorial*= i;
//            i++;
//        }
//        System.out.println(factorial);


        int n=8;
        int sum=0;
        for (int i = 0; i <10 ; i++) {
            sum+= n*i;

        }
        System.out.println(sum);
    }
}
