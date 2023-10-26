public class array {
    public static void main(String[] args) {
        // char[] a =new char [5];
        // a[0]= 'A';
        // a[1]='B';
        // a[2]='C';
        // a[3]='D';
        // a[4]='E';

        // for (int i = 0; i < 5; i++) {
        // System.out.println(a[i]);
        // }
        int[] a = new int[11];
        for (int i = 0; i <= 10; i++) {
            a[i] = i;
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(a[i]);
        }
    }
}
