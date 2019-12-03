
class Chapter1 {
    /* while, if loops цикл
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
        x += 1;
        }
        if (x == 3) {
            System.out.print("Do");
        }
    }
*/
// generate three random numbers рандом
    /* public static void main(String[] args) {
        int oneLength = 5;
        int rand1 = (int) (Math.random() * oneLength);
        System.out.println(rand1);
        //привести к инт
        int x = (int) 24.6;
        System.out.println(x);
    } */
Player p1;
Player p2;
Player p3;

public void startGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1=0;
    int guessp2 = 0;
    int guessp3 = 0;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    int targetNumber = (int) (Math.random() * 10);
    System.out.println("я думаю о числе между 0 и 9...");

    while (true) {
        System.out.println("Число к угадыванию это " + targetNumber);

        p1.guess();
        p2.guess();
        p3.guess();
        guessp1 = p1.number;
        System.out.println("Player one guessed " + guessp1);
        guessp2 = p2.number;
        System.out.println("Player two guessed " + guessp2);
        guessp3 = p3.number;
        System.out.println("Player three guessed " + guessp3);

        if (guessp1 == targetNumber) {
            p1isRight = true;
        }
        if (guessp2 == targetNumber) {
            p2isRight = true;
        }
        if (guessp3 == targetNumber) {
            p3isRight = true;
        }
        if (p1isRight || p2isRight || p3isRight) {

            System.out.println("We have a winner!");
            System.out.println("Player one got it right? " + p1isRight);
            System.out.println("Player two got it right? " + p2isRight);
            System.out.println("Player three got it right? " + p3isRight);
            System.out.println("Game is over.");
            break; // game over, so break out of the loop
        } else {
            // we must keep going because nobody got it right!
            System.out.println("Players will have to try again.");
        } // end if/else
    } // end loop
} // end method
} // end clas

class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random()*10);
        System.out.println("I'm guessing " + number);
    }
}

class GameLauncher {
    public static void main (String[] args) {
        Chapter1 game = new Chapter1();
        game.startGame();
    }
}

