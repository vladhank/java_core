package Hospital;

import java.util.Scanner;

public class Hospital {
    Patient[] patients;
    int size;
    private final Scanner SCAN = new Scanner(System.in);

    Hospital(int size) {
        this.size = size;
        patients = new Patient[size];
    }

    public void input() {
        for (int i = 0; i < size; i++) {
            System.out.println("Enter patient name:");
            String name = SCAN.next();
            System.out.println("Enter patient age:");
            int age =SCAN.nextInt();
            System.out.println("Enter patient diagnosis:");
            String diagnosis=SCAN.next();
            System.out.println("Does the patient have insurance (true/false):");
            boolean insurance=SCAN.nextBoolean();
            patients[i]= new Patient(name,age,diagnosis,insurance);
        }
    }

    public void output(){
        System.out.println(this);
    }

    public void search(String name){
        System.out.println("the patients you are looking for");
        for (int i=0;i<size;i++){
            if (patients[i].getName().equals(name)){
                System.out.println(patients[i]);
            }
        }
    }


    public void search(int age){
        System.out.println("the patients you are looking for");
        for (int i=0;i<size;i++){
            if (patients[i].getAge()==age){
                System.out.println(patients[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i=0;i<size;i++){
            str.append(patients[i]).append("\n");
        }
        return str.toString();
    }
}

