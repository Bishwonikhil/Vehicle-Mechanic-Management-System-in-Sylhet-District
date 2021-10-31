
package project;

import java.io.*;
import java.util.Scanner;

public class InsertMechanic {

    private static Scanner s;

    public void add() throws IOException {

        String name, type, contact, location;

            File dir = new File("Project");
            //dir.mkdir();
            String path = dir.getAbsolutePath();

            File file = new File(path + "/Mechanic.txt");
            //file.createNewFile();

            s = new Scanner(file);
            Scanner in = new Scanner(System.in);

            System.out.print("Please enter the Name: ");
            name = in.nextLine();

            System.out.print("Location: ");
            location = in.nextLine();

            System.out.print("Wheel's type: ");
            type = in.nextLine();

            System.out.print("Number: ");
            contact = in.next();


            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println(name + "\n" + location + "\n" + type + "\n" + contact);
            printWriter.flush();
            printWriter.close();

            System.out.println("Insert Done");


    }
}
