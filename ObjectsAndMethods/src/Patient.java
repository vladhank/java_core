import java.util.Scanner;

public class Patient {
    private int age;
    private String name;
    private String lastname;
    private String middlename;
    private String diagnosis;
    private String checkInsurance;
    public boolean insurance;
    Scanner scan = new Scanner(System.in);
    //private Object Patient;

    public void setData() {
        System.out.println("Введите имя пациента");
        this.name = scan.next();
        System.out.println("Введите фамилию пациента");
        this.lastname = scan.next();
        System.out.println("Введите отчество");
        this.middlename = scan.next();
        System.out.println("Введите возраст");
        this.age = scan.nextInt();
        System.out.println("Какой диагноз у пациента");
        this.diagnosis = scan.next();
        System.out.println("Есть ли страховка(ввведите yes или no)");
        this.checkInsurance = scan.next();
        if (checkInsurance.equals("yes")) {
            this.insurance = true;
        } else insurance = false;
    }

    public Patient[] searchByAge(Patient[] array, int searchAge) {
        int i = 0;
        if (array[i].age == searchAge) {
            System.out.println(array[i]);

        }
        return array;
    }

    public Patient[] searchByLastname(Patient[] array,String searchLastname){
        int i=0;
        if(array[i].lastname.equals(searchLastname)){
            System.out.println(array[i]);
        }
        return array;
    }

    @Override
    public String toString() {
        if (checkInsurance.equals("yes")) {
            return ("ФИО " + name + " " + lastname + " " + middlename + " Возраст: " + age + " Диагноз: " + diagnosis + " " + "Есть страховка");
        } else
            return ("ФИО " + name + " " + lastname + " " + middlename + " Возраст: " + age + " Диагноз: " + diagnosis + " " + "Нет страховки");
    }
}