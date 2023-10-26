//class MyDeprecated{
//    @Deprecated
//    Void meth1(){
//        System.out.println("I am Method 1");
//    }
//}

//interface MyInt{
//    void display();
//
//}


import java.io.FileWriter;
import java.io.IOException;

public class ps_12 {
//    public static void main(String[] args) {
//        MyDeprecated d= new MyDeprecated();
////        d.meth1();
//MyInt i= ()-> System.out.println("Iam display");
////i.display();

    public static void main(String[] args) {
        int i= 19;
        String table="";
        for (int j = 0; j < 10; j++) {
            table+= i+"X"+(j+1)+"="+i*(j+1);
            table+="\n";


        }
        try {
            FileWriter fileWriter= new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        }
        catch (IOException e ){
            e.printStackTrace();
        }
    }



}
