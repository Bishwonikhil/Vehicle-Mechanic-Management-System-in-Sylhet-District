
package project;

import java.io.File;



public class Main {

    public static void main(String[] args) {

        File dir = new File("Project");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file = new File(path + "/Mechanic.txt");
        file.createNewFile();


        System.out.println("Are you Mechanic?");

        InsertMechanic add = new InsertMechanic();
        add.add();




    }

}
