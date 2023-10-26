package inheritanceAndPolymorphism;

public class Citizen {
    final int id;
    String name;
    static String nationality = "Indian";

    public Citizen(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
