package inheritanceAndPolymorphism;

public class User {
    int id;
    String name;
    String phone;
    String address;
    String email;
    String password;
    public void getDetails () {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("address : " + address);
        System.out.println("Email : " + email);
        System.out.println("Password : " + password);
    }

    public void attenLecture() {
        System.out.println("User is attending lecture");
    }
}
