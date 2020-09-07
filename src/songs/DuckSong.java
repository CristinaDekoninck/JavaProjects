package songs;

import java.util.Scanner;

public class DuckSong {

    public static void main(String[] args) {
        DuckSong duckSong = new DuckSong();
        duckSong.sing();
    }
    private void sing(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many little ducks were there?");
        int littleDucks = Integer.parseInt(myScanner.nextLine());

        String word = "little ducks";
        for (int i = littleDucks; i > 0; i--) {
            System.out.println(i + " " + word + " went out one day,");
            System.out.println("Over the hill and far away.");
            System.out.println("Mother duck said quack quack quack quack,");
            if (i == 1) {
                System.out.println("And all of the 5 little ducks came back.");
            } else {
                int newNum = i-1;
                if (newNum == 1) {
                    word = "little ducks";
                }
                System.out.println("But only " + newNum + " " + word + " came back.");
                System.out.println();

            }
        }
    }
}
