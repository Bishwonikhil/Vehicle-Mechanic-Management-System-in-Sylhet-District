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

        System.out.println("Enter the Name: ");
        name = in.nextLine();

        System.out.println("Enter the Location: ");
        location = in.nextLine();

        System.out.println("Enter the Type: ");
        type = in.nextLine();

        System.out.println("Enter the Number: ");
        contact = in.next();


        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);



        System.out.println("Successfully Inserted your information.");


    }
}