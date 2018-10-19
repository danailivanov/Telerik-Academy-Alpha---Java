import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main (String[] args){

        HashSet<String> javaStudents = new HashSet<>();
        javaStudents.add("S. Nakov");
        javaStudents.add("V. Kolev");
        javaStudents.add("V. Tsanev");
        HashSet<String> linuxStudents = new HashSet<>();
        linuxStudents.add("D. Alexiev");
        linuxStudents.add("V. Tsanev");

        System.out.println("Java Students: " + javaStudents);
        System.out.println("Linux Students: " + linuxStudents);
        System.out.println("Java or Linux Students: " +
                union(javaStudents, linuxStudents));
        System.out.println("Java and Linux Students: " +
                intersect(javaStudents, linuxStudents));


    }

    private static HashSet intersect(HashSet set1, HashSet set2) {
        HashSet intersect = new HashSet();
        intersect.addAll(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    private static HashSet union(HashSet set1, HashSet set2){
        HashSet union = new HashSet();
        union.addAll(set1);
        union.addAll(set2);
        return union;
    }
}
