
    class Employee1{
        int id;
        int salary;
        String name;
        public void printDetails(){
            System.out.println("My id is "+ id);
            System.out.println("and my name is " + name);
        }
        public int getSalary(){
            return salary;
        }
    }
    public class own_class {
        public static void main(String[] args) {
            System.out.println("This is a cutom class");
            Employee1 harry = new Employee1();
            Employee1 mc= new Employee1();
          //Settinjg atttributes for harry
            harry.id= 12;
            harry.salary=3342;
            harry.name="Ghost";

            //setting an attribute for mc
            mc.id=132;
            mc.salary=324242;
            mc.name="Simon Rileay";

            //Printing the attributes
            harry.printDetails();
            mc.printDetails();
//            int salary1= mc.salary();
//            System.out.println(salary1);
        }
}
