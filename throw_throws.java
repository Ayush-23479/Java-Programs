class NegativeRdiuaException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be -ve!";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be -ve";

    }
}

public class throw_throws {
    public static double area (int r)throws NegativeRdiuaException{
        if (r <0) {
            throw new NegativeRdiuaException();
        }
        double result= Math.PI*r*r;
        return  result;
    }
    public static  int divide (int a, int b) throws ArithmeticException{
        int result= a/b;
        return result;
    }

    public static void main(String[] args) {
        try {
            double ar = area(3);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
