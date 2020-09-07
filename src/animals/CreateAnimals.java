package animals;

import java.util.Scanner;

public class CreateAnimals{

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        CreateAnimals animals = new CreateAnimals();
        animals.getAnimalType();
    }

    private void getAnimalType(){
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        if(animal.equalsIgnoreCase("dog")){
            createDog();
        }
        else if (animal.equalsIgnoreCase( "cat")){
            createcat();
        }

        else if (animal.equalsIgnoreCase( "trex")){
            createtrex();
        }

        else if(animal.equalsIgnoreCase("Battlechicken")){
            createBattlechicken();
        }

        else{
            System.out.println(animal + " is not an animal we can currently create, please try again.");
        }

    }

    private void createcat() {
        System.out.println("What is the cats name?");
        String name = myScanner.nextLine();
        System.out.println("What colour is the cat?");
        String colour = myScanner.nextLine();
        System.out.println("What breed is the cat?");
        String breed = myScanner.nextLine();
        System.out.println("Is the cat friendly? Yes? Sometimes? No?");
        String isFriendly = myScanner.nextLine();
        Cat myCat = new Cat(name, colour, breed, isFriendly);

        System.out.println(myCat.meow());
        System.out.println(myCat.beHuman());

    }

    private void createDog() {
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog? Small, medium or Large?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        byte age = Byte.parseByte(myScanner.nextLine());
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        Doggie myDog = new Doggie(name, size, age, breed);

        System.out.println(myDog.bark());
        System.out.println(myDog.play());
        System.out.println(myDog.beHuman());

    }

    private void createtrex() {
        System.out.println("What is the Trex named?");
        String name = myScanner.nextLine();
        System.out.println("How old is the Trex?");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("Does your Trex have a sense of humour? Yes? No? Perhaps, maybe?");
        String humour = myScanner.nextLine();
        Trex myTrex = new Trex(name, age, humour);

        System.out.println(myTrex.funny());
        System.out.println(myTrex.beHuman());

    }

    private void createBattlechicken() {
        System.out.println("What is the Battlechicken named?");
        String name = myScanner.nextLine();
        System.out.println("What size is your Battlechicken?");
        int size = Integer.parseInt(myScanner.nextLine());
        System.out.println("Name your target");
        String target = myScanner.nextLine();
        System.out.println("Choose Battlechicken stance: Aggressive, passive, friendly. Choose wisely.");
        String stance = myScanner.nextLine();
        Battlechicken myBattlechicken = new Battlechicken(name, size, target, stance);

        System.out.println(myBattlechicken.engage());
        System.out.println(myBattlechicken.beHuman());
    }

}
