import java.util.ArrayList;

public class PallidaClass {
    String className;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public void addStudent (Student student) {
        students.add(student);
    }

    public void addMentor (Mentor mentor) {
        mentors.add(mentor);
    }

    public PallidaClass(String className) {
        this.className = className;
        students = new ArrayList<>();
        mentors = new ArrayList<>();
    }

    public void info () {
        System.out.println("Pallida " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Person> people = new ArrayList<>();

        Person mark = new Person("Mark", 46, "male");
        people.add(mark);
        Person jane = new Person();
        people.add(jane);
        Student john = new Student("John Doe", 20, "male", "BME");
        people.add(john);
        Student johnTheClone = (Student) john.clone();
        people.add(johnTheClone);
        Student student = new Student();
        people.add(student);
        Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
        people.add(gandhi);
        Mentor mentor = new Mentor();
        people.add(mentor);
        Sponsor sponsor = new Sponsor();
        people.add(sponsor);
        Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");
        people.add(elon);

        student.skipDays(3);

        for (int i = 0; i < 5; i++) {
            elon.hire();
        }
        for (int i = 0; i < 3; i++) {
            sponsor.hire();
        }

        for(Person person : people) {
            person.introduce();
            person.getGoal();
        }

        PallidaClass badass = new PallidaClass("BADA55");
        badass.addStudent(student);
        badass.addStudent(john);
        badass.addMentor(mentor);
        badass.addMentor(gandhi);
        badass.info();
    }
}