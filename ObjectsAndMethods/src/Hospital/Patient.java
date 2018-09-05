package Hospital;

public class Patient {
    private String name;
    private int age;
    private String diagnosis;
    private boolean insurance;

    public Patient(String name, int age, String diagnosis, boolean insurance) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public boolean isInsurance() {
        return insurance;
    }

    @Override
    public String toString() {
        StringBuilder str =new StringBuilder();
        str.append("Patient name - ").append(name).append(" | ");
        str.append("Patient age - ").append(age).append(" | ");
        str.append("Patient diagnosis - ").append(diagnosis).append(" | ");
        str.append("Insurance - ").append(insurance).append(" | ");
        return str.toString();
    }
}
