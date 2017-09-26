public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student (String name, int age, String gender, String previousOrganization) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.previousOrganization = previousOrganization;
    }

    public Student() {
        name = "Jane doe";
        age = 30;
        gender = "female";
        previousOrganization = "The School of Life";
        skippedDays = 0;
    }


    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }

    public void introduce () {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays (int numberOfDays) {
        skippedDays += numberOfDays;
    }



}
