package inheritanceAndPolymorphism;

public class Student extends User{
    double psp;
    double reputationPoints;
    public void getDetails () {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("address : " + address);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("PSP : " + psp);
        System.out.println("Reputation Points : " + reputationPoints);
    }
    public void attenLecture() {
        System.out.println("Student is attending lecture");
    }
}
