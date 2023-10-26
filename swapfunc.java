public class swapfunc {
    public static void main(String[] args) {
    int x=10;
    int y=30;
    sawpFunction(x,y);
}
    public static void sawpFunction(int a,int b) {
        System.out.println("Orignal Values :- a:"+a+" b:"+b );
        int c=a;
        a=b;
        b=c;
        System.out.println("Sawping  Values :- a:"+a+" b:"+b );
    }
}
