package animals;

public class Battlechicken {

    private String name;
    private int size;
    private String target;
    private String stance;


    public Battlechicken(String name, int size, String target, String stance) {
        this.name = name;
        this.size = size;
        this.target = target;
        this.stance = stance;

    }


    public String engage() {
        String engage = "";
        if(stance.equalsIgnoreCase("Aggressive")){
            engage = "ATTACK MODE ENGAGED: CLUCK CLUCK CLUCK";
        }
        else if(stance.equalsIgnoreCase("Passive")){
            engage = "PASSIVE MODE ENGAGED: *Stares deeply into " + target + "'s eyes*";
        }
        else if(stance.equalsIgnoreCase("Friendly")){
            engage = "FRIENDLY MODE ENGAGED: *Lays egg and rolls it to " + target + "*";
        }
        else {
            engage = "ATTACK MODE AUTO ENGAGED UNLESS CORRECT INPUT IS GIVEN...5...4..3...2...1...";
        }
        return engage;
    }

    public String beHuman(){
        String breed = "";
        return "Hello CLUCK, I'm " + name + " and I am CLUCK " + size + " cm's tall. Scary I know CLUCK. I am currently watching " + target + " closely in " + stance + " stance.  Ready on your command CLUCK.";
    }
}
