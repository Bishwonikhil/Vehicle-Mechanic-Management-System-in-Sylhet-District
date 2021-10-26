package project;

import java.io.*;
import java.util.*;

public class SearchMechanic {

    private static Scanner s;

    public void search()  {

        File dir = new File("Project");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file = new File(path + "/Mechanic.txt");
        //file.createNewFile();
        //s = new Scanner(file);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Location: ");
        String location = in.nextLine();

        System.out.println("Enter the Type: ");
        String type = in.nextLine();
        String Name, Location , Type, Contact;

        while (s.hasNext()) {

            Name = s.next();
            Location = s.next();
            Type = s.next();
            Contact = s.next();


            if (Location.equals(location) && (Type.equals(type))) {

                System.out.println("Name: " + Name + "\n" + "Type: " + Type + "\n" + "Number: " + Contact+"\n");

            }

        }


    }

}

}