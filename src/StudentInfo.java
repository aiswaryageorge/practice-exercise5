import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentInfo {

    private String id;
    private String name;
    private int age;

    StudentInfo(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}

//Implementing a comparator interface
class StudentSorter implements Comparator {

    StudentSorter() {
    }

    public int compare(Object o1, Object o2) {

        StudentInfo s1 = (StudentInfo)o1;
        StudentInfo s2 = (StudentInfo)o2;

        if (s1.getAge() == s2.getAge()) {

            int answer = s1.getName().compareTo(s2.getName());
            return answer == 0 ? s1.getID().compareTo(s2.getID()) : answer;
        }
        else
        {
            return s1.getAge() > s2.getAge() ? 1 : -1;
        }
    }
}

//Printing the array in sorted manner
class Main{
    Main() {
    }

    public static void main(String[] args) {

        List<StudentInfo> listofstudents = new ArrayList();

        listofstudents.add(new StudentInfo("12", "Aishu", 20));
        listofstudents.add(new StudentInfo("17", "Akash", 25));
        listofstudents.add(new StudentInfo("15", "Mike", 24));
        listofstudents.add(new StudentInfo("19", "Rose", 23));
        listofstudents.add(new StudentInfo("10", "Jack", 29));

        Collections.sort(listofstudents, new StudentSorter());

        for(int i = 0; i < listofstudents.size(); ++i) {

            PrintStream var1 = System.out;
            String var2 = ((StudentInfo)listofstudents.get(i)).getID();
            var1.println(var2 + " " + ((StudentInfo)listofstudents.get(i)).getName() + " " + ((StudentInfo)listofstudents.get(i)).getAge());
        }

    }
}


