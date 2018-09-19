package Datatable;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class StudentList implements InputStudentsData, DateOfBirth, AverageAge {
    public static final Scanner SCAN = new Scanner(System.in);
    DateOfBirth[] list;
    int amount = 0;
    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    String dateInString = "123123";
    Date date;

    @Override
    public Date birthDate() {
        return date;
    }

    public StudentList(int amount) {
        this.amount = amount;
        list = new Student[amount];
    }

    public void inputData() {
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter student name: ");
            String name = SCAN.next();
            System.out.println("Enter student lastname:");
            String lastname = SCAN.next();
            System.out.println("Enter date of birth in the following format (dd/MM/yyyy):");
            dateInString = SCAN.next();
            try {
                date = format.parse(dateInString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            list[i] = new Student(name, lastname, date);
        }

    }

    public void calculateAverage() {

        long totalYears = 0;
        long totalMonths = 0;
        long totalDays = 0;
        long totalMinutes = 0;

        for (int i = 0; i < amount; i++) {
//            students[i].getDateOfBirth()
            LocalDateTime today = LocalDateTime.now();
            LocalDateTime birthday = list[i].birthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
            long years = ChronoUnit.YEARS.between(birthday, today);
            totalYears += years;
            long months = ChronoUnit.MONTHS.between(birthday, today);
            long days = ChronoUnit.DAYS.between(birthday, today);
            totalMonths += months;
            long minutes = ChronoUnit.MINUTES.between(birthday, today);
            totalMinutes += minutes;

        }
        totalYears = totalYears / list.length;
        totalMonths = (totalMonths % 12) / list.length;
        totalDays = (totalDays % 365 % 31) / list.length;
        totalMinutes = (totalMinutes % 60 % 24 % 365) / list.length;
        System.out.println(totalYears + " year " + totalMonths + " months " + totalMinutes + " minutes ");
    }

    public void output() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            str.append(list[i]);
        }
        return str.toString();
    }
}
