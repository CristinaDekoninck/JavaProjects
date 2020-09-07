package animals;

public class Doggie {

    private String name;
    private String size;
    private byte age;
    private String breed;

    public Doggie(String name, String size, byte age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark(){
        String bark = "";
        if(size.equalsIgnoreCase("small")){
            bark = "yap yap yap";
        }
        else if(size.equalsIgnoreCase("medium")){
            bark = "woof woof";
        }
        else if(size.equalsIgnoreCase("large")){
            bark = "WOOF! WOOF!";
        }

        else {
            bark = "I'm sorry, I have seem to have lost my voice!";
        }

        return bark;
    }

    public String play() {
        String playing = "";
        if(breed.equalsIgnoreCase("poodle")){
            playing = "Oh dear, I don't think so, one could not possibly engage in such activities";
        }
        else if(breed.equalsIgnoreCase("Labrador")){
            playing = "Yeah, yeah! Throw the stick! Yeah, DO IT!";
        }

        else if(breed.equalsIgnoreCase("Border Collie")){
            playing = "Lets go chase some sheep!";
        }

        return playing;
    }

    public String beHuman(){
        String breed = "";
        return "Hello human, I'm " + name + " and I am " + age + " years old " + breed + ", what breed are you?";
    }

}

