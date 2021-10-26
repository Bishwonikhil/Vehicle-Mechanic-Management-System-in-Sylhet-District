package project;

import java.io.File;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {

        File dir = new File("Project");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file = new File(path + "/Mechanic.txt");
        file.createNewFile();


        //System.out.println("1. Are you Mechanic?");
        System.out.println("2. Are you User?");

        //InsertMechanic add = new InsertMechanic();
        //add.add();

        SearchMechanic search = new SearchMechanic();
        search.search();


    }
}

