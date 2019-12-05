import java.io.*;
import java.util.*;

public class Chapter6 {
    private ArrayList<String> locationsCell;
    private String name;

    public void setLocationsCell(ArrayList<String> loc) {
        locationsCell = loc;
    }

    public void setName(String n) {
        name = n;
    }
    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationsCell.indexOf(userInput);
        if(index >= 0) {
            locationsCell.remove(index);

            if (locationsCell.isEmpty()) {
                result = "kill";
                System.out.println("Ох! Ты потопил " +name + " : ( ");
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

class DotComBust {
    private GameHelper helper = new GameHelper(); //создать объект хелпер
    private ArrayList<Chapter6> dotComsList = new ArrayList<Chapter6>(); //создать массив из чептер 6
    private int numOfGuesses = 0; // переменная считающая количество ходов


    private void setUpGame() {
        // first make some dot coms and give them locations
        Chapter6 one = new Chapter6();
        one.setName("Pets.com");
        Chapter6 two = new Chapter6();
        two.setName("eToys.com");
        Chapter6 three = new Chapter6();
        three.setName("Go2.com");
        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for (Chapter6 dotComToSet : dotComsList) {

            ArrayList<String> newLocation = helper.placeDotCom(3); //Ask the helper for a DotCom location (an ArrayList of Strings).

            dotComToSet.setLocationsCell(newLocation); //Call the setter method on this DotCom to give it the location you just got from the helper.

        } // close for loop
    } // close setUpgame method

    private void startPlaying() {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }
    private void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";

        for(Chapter6 dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame() {
        System.out.println("Все корабли потоплены!");
        if (numOfGuesses <= 18) {
            System.out.println("Ты успел потопить корбали противника и выжил");

        } else {
            System.out.println("Слишком долго! Тебя потопили раньше");
        }
    }

    public static void main (String[] args) {
        DotComBust game = new DotComBust(); //создает игру
        game.setUpGame();//игра вызывает метод размещения кораблей
        game.startPlaying(); // игра вызывает  метод начала игры
    }

}

class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String[] alphacoords = new String[comSize]; // holds ‘f6’ type coords
        String temp = null; // temporary String for concat
        int[] coords = new int[comSize]; // current candidate coords
        int attempts = 0; // current attempts counter
        boolean success = false; // flag = found a good location ?
        int location = 0; // current starting location

        comCount++; // nth dot com to place
        int incr = 1; // set horizontal increment
        if ((comCount % 2) == 1) { // if odd dot com (place vertically)
            incr = gridLength; // set vertical increment
        }
        while (!success & attempts++ < 200) { // main search loop (32)
            location = (int) (Math.random() * gridSize); // get random starting point
            System.out.print(" try " + location);
            int x = 0; // nth position in dotcom to place
            success = true; // assume success
            while (success && x < comSize) { // look for adjacent unused spots
                if (grid[location] == 0) { // if not already used
                    coords[x++] = location; // save location
                    location += incr; // try ‘next’ adjacent
                    if (location >= gridSize){ // out of bounds - ‘bottom’
                        success = false; // failure
                    }
                    if (x>0 && (location % gridLength == 0)) { // out of bounds - right edge
                        success = false; // failure
                    }
                } else { // found already used location
                    System.out.print(" used " + location);
                    success = false; // failure
                }
            }
        } // end while

        int x = 0; // turn location into alpha coords
        int row = 0;
        int column = 0;
        System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1; // mark master grid pts. as ‘used’
            row = (int) (coords[x] / gridLength); // get row value
            column = coords[x] % gridLength; // get numeric column value
            temp = String.valueOf(alphabet.charAt(column)); // convert to alpha

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.print(" coord "+x+" = " + alphaCells.get(x-1));
        }

         System.out.println("\n");

        return alphaCells;
    }
}