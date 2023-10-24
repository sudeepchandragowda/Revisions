package inheritanceAndPolymorphism;

public class TA extends User {
    int problemSolved;
    double rating;

    public void getDetails() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("address : " + address);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
        System.out.println("Problems Solved : " + problemSolved);
        System.out.println("TA Ratings : " + rating);
    }
    public void attenLecture() {
        System.out.println("TA is solving doubt from the lecture");
    }
}
