package inheritanceAndPolymorphism;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Ananth";
        s.address = "Andhra Pradesh";
        s.phone = "9999999999";
        s.email = "Ananth@Scler.com";
        s.password = "Ananth@123";
        s.psp = 60.34;
        s.reputationPoints = 54;
        s.getDetails();


        System.out.println();

        TA t = new TA();
        t.id = 2;
        t.name = "Ram";
        t.address = "UP";
        t.phone = "9999999991";
        t.email = "Ram@Scler.com";
        t.password = "Ram@123";
        t.problemSolved = 12;
        t.rating = 4.9;
        t.getDetails();


        User uStudent = new Student();
        User uTA = new TA();
        User uMentor = new Mentor();
        User instructor = new Instructor();

        ValidationService validationService = new ValidationService();
        System.out.println(validationService.verifyEmail(new Student())); //attributes in student -> 8
        System.out.println(validationService.verifyEmail(new TA()));
        System.out.println(validationService.verifyEmail(new Instructor()));
        System.out.println(validationService.verifyEmail(new Mentor()));


        Student student = new Student();
        student.attenLecture();

        Instructor instructor1 = new Instructor();
        instructor1.attenLecture();

        Mentor mentor = new Mentor();
        mentor.attenLecture();

        TA ta = new TA();
        ta.attenLecture();
    }
}
