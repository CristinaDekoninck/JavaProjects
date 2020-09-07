package animals;

public class Cat {

    private String name;
    private String colour;
    private String breed;
    private String isFriendly;


    public Cat(String name, String colour, String breed, String isFriendly) {
        this.name = name;
        this.colour = colour;
        this.breed = breed;
        this.isFriendly = isFriendly;
    }

    public String meow(){
        String meow = "";
        if(isFriendly.equalsIgnoreCase("Yes")){
            meow = "Purr purr purr";
        }
        else if(isFriendly.equalsIgnoreCase("Sometimes")){
            meow = "*Gives you the side eye* Meoowww";
        }
        else if(isFriendly.equalsIgnoreCase("No")){
            meow = "**Swipes at your face and demands to be fed**";
        }

        else {
            meow = "Hooman, I do not understand your command. Even if I did, I would not obey as you are my slave.";
        }

        return meow;
    }


    public String beHuman(){
        String breed = "";
        return "Hello hooman, I'm " + name + " and I am " + colour + " in colour. "  + "Can I be friendly? " + isFriendly + ". Congratulations, you are my new servant now.";
    }


}
