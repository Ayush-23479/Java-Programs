class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public  void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;

    }

    public int getId() {
        return id;
    }
}


public class Access_Modifires {
    public static void main(String[] args) {
        MyEmployee Ayush = new MyEmployee();
        Ayush.setName("Java Developer");
        System.out.println(Ayush.getName());
        Ayush.setId(234);
        System.out.println(Ayush.getId());
    }
}
