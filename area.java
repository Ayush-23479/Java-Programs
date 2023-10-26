public class area {
    public static void main(String[] args) {
        int x=30;
        int y=43;
        float r=3;
        TestProject obj = new TestProject();
        float area_circle =obj.area(r);
        int area_rectangle = obj.area(x,y);
        System.out.println("Area of the circle is :"+area_circle);
        System.out.println("Area of the Rectangle is :"+area_rectangle);
        
    }
    public static int area (int n1,int n2) {
        int result= n1*n2;
        return result;
    }
    public static float area(int n ){
        float result =3.14f*n*n;
        return result;
    }
}
