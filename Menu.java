package OOP_StarWars;

import java.util.Scanner;

public class Menu {
    private int menuChoice;

    Scanner kboard = new Scanner(System.in);

    public void menu(){
        System.out.println("Please choose from the following options...");
        System.out.println("Select 1 to find out your own Star Wars name...");
        //System.out.println("Select 2 to generate a random Star Wars name...");
        menuChoice = kboard.nextInt();

        while (menuChoice > 2 || menuChoice < 1) {
            System.out.println("Please choose from the following options...");
            System.out.println("Select 1 to find out your own star wars name...");
            //System.out.println("otherwise please enter 2 to generate a random name...");
            menuChoice = kboard.nextInt();
        }

        switch(menuChoice) {
            case 1:
                UserName myName = new UserName();
                myName.setUserFirstName();
                myName.setUserLastName();
                myName.setUserMaidenName();
                myName.setUserBirthPlace();
                myName.displayName();
                break;
            case 2:
                //Fullname randomName = new Fullname();
                break;
            default:
                System.out.println("Pick a number 1, 2 or 3... it's not that hard");
        }
    }
}
