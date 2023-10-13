import java.util.Scanner;
import java.io.*;

/**
 * The main class of the program. This is where the initialization from the files is done so that data is not lost
 * between uses of the program.
 * @author Dimitris Kleitsas
 * @author Anastasios Zyngiridis
 */


public class Main {
    static volatile boolean run = true;
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("src/data/userNumbers.txt"));
        int clients = scanner.nextInt();
        int owners = scanner.nextInt();
        int pendingOwners = scanner.nextInt();
        int admins = scanner.nextInt();

        scanner.close();


        if (clients > 0) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/data/clients.ser"))) {
                for (int i = 0; i < clients; i++) {
                    UserBase.addClient((Client) in.readObject());
                }

            }
        }

        if (owners > 0) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/data/owners.ser"))) {
                for (int i = 0; i < owners; i++) {
                    UserBase.addOwner((Owner) in.readObject());
                }

            }
        }

        if (pendingOwners > 0) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/data/pendingOwners.ser"))) {
                for (int i = 0; i < pendingOwners; i++) {
                    UserBase.addPendingOwner((Owner) in.readObject());
                }

            }
        }

        if (admins > 0) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/data/admins.ser"))) {
                for (int i = 0; i < admins; i++) {
                    UserBase.addAdmin((Admin) in.readObject());
                }

            }
        }



        LoginMenu menu = new LoginMenu();


       while (run) {
            Thread.onSpinWait();
       }



        if (UserBase.getClientsNumber() >= 0) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/data/clients.ser"))) {
                for (int i = 0; i < UserBase.getClientsNumber(); i++) {
                    out.writeObject(UserBase.getClient(i));
                }

            }
        }



        if (UserBase.getOwnersNumber() >= 0 ){
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/data/owners.ser"))) {
                for (int i = 0; i < UserBase.getOwnersNumber(); i++) {
                    out.writeObject(UserBase.getOwner(i));
                }
            }
        }


        if (UserBase.getPendingOwnersNumber() >= 0) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/data/pendingOwners.ser"))) {
                for (int i = 0; i < UserBase.getPendingOwnersNumber(); i++) {
                    out.writeObject(UserBase.getPendingOwner(i));
                }

            }
        }


        if (UserBase.getAdminsNumber() >= 0) {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/data/admins.ser"))) {
                for (int i = 0; i < UserBase.getAdminsNumber(); i++) {
                    out.writeObject(UserBase.getAdmin(i));
                }

            }
        }




        Writer wr = new FileWriter("src/data/userNumbers.txt");
        wr.write(UserBase.getClientsNumber() + " ");
        wr.write(UserBase.getOwnersNumber() + " ");
        wr.write(UserBase.getPendingOwnersNumber() + " ");
        wr.write(UserBase.getAdminsNumber() + " ");
        wr.close();

        System.exit(0);
    }

}