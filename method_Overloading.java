public class method_Overloading {
    public static void foo() {
        System.out.println("Good Morning BRO!");
    }

    public static void foo(int a ) {
        System.out.println("Good Morning" +a+" BRO!");
    }
    public static void foo(int a,int b) {
        System.out.println("Good Morning"+ a+" BRO!");
        System.out.println("Good Morning"+  b+" BRO!");
    }
    public static void foo(int a, int b,int c) {
        System.out.println("Good Morning BRO!");
    }

     static int change(int a1) {
        a1=98;
return a1;
    }

    public static void change2(int [] arr) {
arr [0]=98;
    }

    public static void telljoke() {
        System.out.println("I invented a word! \n"+ "Plagiarism");
    }

    public static void main(String[] args) {
//        telljoke();
        // Case1: changing the Integer
//        int x= 45;
//        change(x);
//        System.out.println("The value of x after running change :" +x);


        //Case1: Changing Thr Array
//        int [] marks={ 52,73,77,89,98,983};
//        change2(marks);
//        System.out.println("The value of x after running the change is :"+marks[1]);

        //Methods Ovrloding
        foo();
        foo(3000);
        foo(3000,22222);
        //Arguments are actual!
    }
}
