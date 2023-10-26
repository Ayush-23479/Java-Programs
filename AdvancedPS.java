import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AdvancedPS {
    public static void main(String[] args) {
        //ps1
        ArrayList ar = new ArrayList();
        ar.add("Student 1");
        ar.add("Student 2");

        ar.add("Student 3");
        ar.add("Student 4 ");
        ar.add("Student 5");
        ar.add("Student 6 ");
        ar.add("Student 7 ");
        ar.add("Student 8 ");
        ar.add("Student 9 ");
        ar.add("Student 10 ");
        for (Object o :ar
             ) {
            System.out.println(o);
        }


        //ps -2
        Date d = new Date();
        System.out.println(d.getHours() + ":"+ d.getMinutes()+":"+ d.getSeconds());

        //or
        Calendar c= Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+ c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

   //ps-3
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df= DateTimeFormatter.ofPattern("H:m:s");
        String myDate= dt.format(df);
        System.out.println(myDate);


        //ps-4
        HashSet<Integer> s = new HashSet<>();
        s.add(5);
        s.add(15);
        s.add(46);
        s.add(60);
        s.add(9);
        System.out.println(s);

    }
}
