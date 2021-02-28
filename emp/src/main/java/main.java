import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Emp emp1 = new Emp("dev", "vel", 100, 10000, new Date(2016, 11, 14));
        Emp emp2 = new Emp("dav", "Jack", 101, 12000, new Date(2016, 11, 23));
        Emp emp3 = new Emp("sam", "Tan", 102, 13000, new Date(2016, 11, 22));
        Emp emp4 = new Emp("pam", "Lan", 104, 14000, new Date(2016, 11, 29));
        Emp emp5 = new Emp("can", "som", 105, 15000, new Date(2016, 11, 19));

        List<Emp> list = new ArrayList<Emp>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        //Before Sorting
//        System.out.println(list);
//        list.sort(Comparator.comparing(e -> e.getDate()));
//        list.sort(Comparator.comparing(e -> e.getLastName()));
       Comparator<Emp> groupByComparator = Comparator.comparing(Emp::getDate).thenComparing(Emp::getLastName);
         list.sort(groupByComparator);
        //After Sorting
        System.out.println(list);
    }
}
