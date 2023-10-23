package construtorAndStatic;

public class Department {
    int id;
    String name;
    int budget;
    int numberOfEmployees;
    int startingYear;
    String companyName;
    String ceo;

    public Department(){

    }
    public Department(int dId, String dName, int dBudget, int dNoOfEmployees, int dStartingYear, String dCompanyName, String dCEO) {
        id = dId;
        name = dName;
        budget = dBudget;
        startingYear = dStartingYear;
        companyName = dCompanyName;
        ceo = dCEO;
    }
    public Department(Department department) {
        id = department.id+1;
        budget = department.budget;
        numberOfEmployees = department.numberOfEmployees;
        startingYear = department.startingYear;
        companyName = department.companyName;
        ceo = department.ceo;
    }
}
