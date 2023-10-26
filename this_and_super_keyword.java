class Ekclass{
    int a;

    public int getA() {
        return a;
    }
    Ekclass(int a){
        this.a=a;

    }public int returnone(){
        return 1;


    }
}
class Doclass extends Ekclass{Doclass(int c){
    super(c);
    System.out.println("I am a constructor");
}
}

public class this_and_super_keyword {
    public static void main(String[] args) {
        Ekclass a1= new Ekclass(43);
        Doclass a12= new Doclass(5);
        System.out.println(a1.getA());
    }
}
