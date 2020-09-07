package animals;

public class Trex {

    private String name;
    private int age;
    private String humour;

    public Trex(String name, int age, String humour) {
        this.name = name;
        this.age = age;
        this.humour = humour;

    }

    public String funny(){
        String funny = "";
        if(humour.equalsIgnoreCase("Yes")){
            funny = "What do you call a blind Dinosaur?  Do-you-think-he-saurus!";
        }

        else if(humour.equalsIgnoreCase("No")){
            funny = "Well, my jokes to you would be a Dino-snore anyway...";
        }

        else if(humour.equalsIgnoreCase("Maybe")){
            funny = "Hurry up and make a decision before I go extin...oh.";
        }

        else {
            funny = "Ah ah ah, you didn't input the correct command, ah ah ah. ";
        }

        return funny;
    }


    public String beHuman(){
        String breed = "";
        return "Hello tiny human, I'm " + name + " and I am " + age + " years old. " + "Want to hear some jokes? " + humour + "?" + ". Well ok then! Have a Dino-mite day!";
    }
}
