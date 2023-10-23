package construtorAndStatic;

public class Client {
    public static void main(String[] args) {
        Department HR = new Department();
        HR.id = 1;
        HR.name = "Ankita & Co.";
        HR.budget = 5000000;
        HR.numberOfEmployees = 5;
        HR.startingYear = 2024;
        HR.companyName = "Sudeep International LLC";
        HR.ceo = "Ankita Gowda";

        Department finance = new Department(2, "Sudeep & Co", 5000000,
                5, 2024, "Sudeep International LLC",
                "Ankita Gowda");

        Department marketing = new Department(finance);


        System.out.println(HR.name);
        System.out.println(finance.name);
        System.out.println(marketing.companyName);
    }
}
