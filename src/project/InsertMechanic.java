
package project;

import java.io.*;
import java.util.Scanner;

public class InsertMechanic {

    private static Scanner s;

    public void add() throws IOException {

        String name, wheel, contact, location;

        File dir = new File("Project");
        //dir.mkdir();
        String path = dir.getAbsolutePath();

        File file = new File(path + "/Mechanic.txt");
        //file.createNewFile();

        s = new Scanner(file);
        Scanner in = new Scanner(System.in);


        System.out.print("Please enter your Name: ");
        name = in.nextLine();

        System.out.print("Location: ");
        location = in.nextLine();

        System.out.print("Wheel number's of your vehicle: ");
        wheel = in.nextLine();


        //System.out.println("Successfully Inserted your information.");


    }
}
