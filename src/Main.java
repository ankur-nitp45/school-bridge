import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher kamla = new Teacher(1,"Kamala Harris",500);
        Teacher mohan = new Teacher(2,"Mohan Lal",700);
        Teacher arun = new Teacher(3,"Arun Jadhav",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(kamla);
        teacherList.add(mohan);
        teacherList.add(arun);


        Student mayank = new Student(1,"Mayank Kumar",4);
        Student ankur = new Student(2,"Ankur Walker",12);
        Student harsh = new Student(3,"Harsh Pratap Singh",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(mayank);
        studentList.add(harsh);
        studentList.add(ankur);




        School s = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        s.addTeacher(megan);


        mayank.payFees(5000);
        ankur.payFees(6000);
        System.out.println("DAV has earned $"+ s.getTotalMoneyEarned());

        System.out.println("------SCHOOL PAYMENT MANAGEMENT----");
        kamla.receiveSalary(kamla.getSalary());
        System.out.println("DAV has spent for salary to " + kamla.getName()
                +" and now has $" + s.getTotalMoneyEarned());

        arun.receiveSalary(arun.getSalary());
        System.out.println("DAV has spent for salary to " + arun.getName()
                +" and now has $" + s.getTotalMoneyEarned());


        System.out.println(ankur);

        mohan.receiveSalary(mohan.getSalary());

        System.out.println(mohan);

    }
}