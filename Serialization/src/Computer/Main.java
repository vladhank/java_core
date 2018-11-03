package Computer;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String fileName = "/Users/uladzislauhancharenka/Desktop/Java/Computer.dat";
        String fileName2 = "/Users/uladzislauhancharenka/Desktop/Java/Laptop.dat";
        ArrayList<Computer> computers = new ArrayList<>();
        ArrayList<Computer> dComputers = new ArrayList<>();
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Laptop> dLaptops = new ArrayList<>();
        computers.add(new Computer(8, 512, "Intel Core i5", "GeForce GTS510"));
        computers.add(new Computer(16, 512, "Intel Core i5 5gen", "RADEON NX700"));
        laptops.add(new Laptop(16,512,"Intel Core i7",
                "GeForce GTX 1070","HP",9400,"JHKS76GH"));
        laptops.add(new Laptop(8,256,"Intel Core i3","Intel Iris 500",
                "Compaq",6700,"MS-DOS"));
        try {
            SerializationMethods.Serialization(computers, fileName);
            dComputers = (ArrayList<Computer>) SerializationMethods.Deserialization(fileName);
            SerializationMethods.Serialization(laptops,fileName2);
            dLaptops=(ArrayList<Laptop>)SerializationMethods.Deserialization(fileName2);

            for (Computer computer : dComputers) {
                System.out.println(computer);
            }
            for (Laptop laptop:dLaptops){
                System.out.println(laptop);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

    }
}
