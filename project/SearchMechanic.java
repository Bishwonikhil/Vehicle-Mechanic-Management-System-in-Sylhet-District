
package project;

import java.io.*;
import java.util.*;

public class SearchMechanic {

    private static Scanner s;

    public void search() throws IOException {

            File dir = new File("Project");
            //dir.mkdir();
            String path = dir.getAbsolutePath();

            File file = new File(path + "/Mechanic.txt");
            //file.createNewFile();

            try{
                s = new Scanner(file);
                s.useDelimiter("[\n\n]");
                Scanner in = new Scanner(System.in);

                System.out.print("Enter your current Location: ");
                String location = in.nextLine();

                System.out.print("Wheel's number of your vehicle: ");
                String type = in.nextLine();

                String Name = null, Location = null, Type = null, Contact = null;

                while (s.hasNext()) {

                    Name = s.next();
                    Location = s.next();
                    Type = s.next();
                    Contact = s.next();


                    if (Location.equalsIgnoreCase(location) && (Type.equalsIgnoreCase(type))) {

                        System.out.println("\nMechanic's Name: " + Name + "\n" + "Wheel's: " + Type + "\n" + "Contact Number: " + Contact+"\n");

                    }

                }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("You can contact with those mechanic.");

    }
    
}
