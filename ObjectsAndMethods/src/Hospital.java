import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {
        int amountOfPatients;
        int choiseMenu;
        int searchAge;
        String searchLastname;

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите количество пациентов");
        amountOfPatients = scan.nextInt();
        Patient[] idPatients = new Patient[amountOfPatients];
        Patient newpt=new Patient();
        for (int i = 0; i < amountOfPatients; i++) {
            System.out.println("Информация о " + (i + 1) + " пациенте:");
            idPatients[i] = new Patient();
            idPatients[i].setData();
        }
        for (Patient i : idPatients) System.out.println(i);
        System.out.println("Желаете найти пациента?");
        System.out.println("1-Искать по фамилии" + "2 Искать по возрасту");
        choiseMenu = scan.nextInt();
        if (choiseMenu == 1) {
            System.out.println("Введите фамилию для поиска");{
                searchLastname=scan.next();
            }
            for(int i=0;i<idPatients.length-1;i++){
                idPatients[i].searchByLastname(idPatients,searchLastname);
            }
        }
        if (choiseMenu == 2) {
            System.out.println("Введите возраст для поиска:");
            searchAge=scan.nextInt();
            for(int i=0;i<idPatients.length-1;i++){
                idPatients[i].searchByAge(idPatients,searchAge);
            }

        }
    }
}

