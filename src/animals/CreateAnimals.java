package animals;

import java.util.Scanner;

public class CreateAnimals{

    Scanner myScanner = new Scanner(System.in);

    private void getAnimalType(){
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        if(animal.equalsIgnoreCase("dog")){
            createDog();
        }
        else if (animal.equalsIgnoreCase( "cat")){
            createcat();
        }
        else{
            System.out.println(animal + " is not an animal we can currently create, please try again.");
        }

    }

    private void createcat() {

    }

    private void createDog() {

    }
}
