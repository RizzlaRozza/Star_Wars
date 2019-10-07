package OOP_StarWars;

import org.w3c.dom.css.CSSUnknownRule;

import java.util.Scanner;

public class UserName {
    private String firstName;
    private String lastName;
    private String fullName;
    private String calcF1;
    private String calcF2;
    private String swFirstName;
    private String maidenName;
    private String birthPlace;
    private String calcL1;
    private String calcL2;
    private String swLastName;


    Scanner kboard = new Scanner(System.in);

    public void displayName(){
        System.out.println("Hello");
        System.out.println("Press enter to continue...");

        calcF1 = firstName.substring(0,2);
        calcF2 = lastName.substring(0,3);
        swFirstName = calcF1 + calcF2;

        calcL1 = maidenName.substring(0,2);
        calcL2 = birthPlace.substring(0,3);
        swLastName = calcL1 + calcL2;

        System.out.println("Your Star Wars name is: " + swFirstName + " " + swLastName);
    }

    /** Ask for and return users first name */
    public void setUserFirstName(){
        System.out.println("Please enter your first name");
        firstName = kboard.nextLine();
    }

    public String getUserFirstName(){
        return firstName;
    }

    /** Ask for and return users last name */
    public void setUserLastName(){
        System.out.println("Please enter your surname:");
        lastName = kboard.nextLine();
    }

    public String getUserLastName(){
        return lastName;
    }

    /** Mothers Maiden Name */
    public void setUserMaidenName(){
        System.out.println("Please enter your mothers maiden name");
        maidenName = kboard.nextLine();
    }

    public String getUserMaidenName(){ return maidenName; }

    /** Birth Place */
    public void setUserBirthPlace(){
        System.out.println("Please enter your birthplace");
        birthPlace = kboard.nextLine();
    }

    public String getUserBirthPlace(){ return birthPlace; }


}




