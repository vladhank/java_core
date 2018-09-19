package Datatable;

import java.util.Date;

public class Student implements DateOfBirth {
    private String name;
    private String lastname;
    private Date dateOfBirth;

    public Student(String name, String lastname, Date dateOfBirth)  {
        this.name = name;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public Date birthDate() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Student name - ").append(name).append("| lastname - ").append(lastname).append(" | Date of Birth - ").append(dateOfBirth).append("\n");
        return str.toString();
    }
}
