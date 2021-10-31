
package project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException{

        File dir = new File("Project");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file = new File(path + "/Mechanic.txt");
        file.createNewFile();

        int c;
        Scanner sign = new Scanner(System.in);
        String userName,passWord;

        System.out.println("Sign In/Sign Up");
        System.out.print("Enter your email or phone number: ");
        userName = sign.nextLine();

        System.out.print("Password: ");
        passWord = sign.nextLine();

        do{
            System.out.println("1. Are you Mechanic?");
            System.out.println("2. Are you User?");
            System.out.print("Choose any option: ");
            Scanner in = new Scanner(System.in);
            c = in.nextInt();
            switch(c)
            {
                case 1:
                    InsertMechanic add = new InsertMechanic();
                    add.add();
                    break;
                case 2:
                    SearchMechanic search = new SearchMechanic();
                    search.search();
                    break;
            }

        }while(c!=0);
        
    }
    
}
