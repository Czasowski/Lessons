/* import java.io.*;

class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

String checkYourself(String stringGuess) {
        //string в int
    int guess = Integer.parseInt(stringGuess);

            String result = "miss";
    for (int cell : locationCells) {
        if (guess == cell) {
            result = "hit";
            numOfHits++;
            break;
        }
    }
    if (numOfHits == locationCells.length) {
        result = "kill";
    }
    System.out.println(result);
    return result;
}
}

class TesterDotCom {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom dot = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 8);


        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        dot.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive) {
            String userGuess = helper.getUserInput("enter a number");
            String result = dot.checkYourself(userGuess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you took " + numOfGuesses + " guesses");
            }
        }
    }
}

class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader( new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0 ) return null;
        } catch (IOException e) {System.out.println("IOException: "  + e);
        }
        return inputLine;
    }
}

 */
/*
 class ForLoop {
    for (int i = 0; i<8; i++) {
         System.out.println(i);
         создает и, пока меньше 8, каждый цикл и++

     }
for {String name : nameArray} {
    каждый элемент эррей присваевается имя нейм и цикл идет для каждого элемента
     }
int x =0;
int z = ++x;
 z и x оба равны 1
     int q = 0;
 int w = q++;
 q = 1 а w = 0

             casting primitives
     long y = 42;
 int x = (int) y;

 float f = 3.231f;
 int x = (int) f;
 x = 3 теперь
 }

 */


