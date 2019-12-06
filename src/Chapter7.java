class Chapter7 {
//override method не может менять доступность и не может менять возвращаемый тип, входные данные должны быть такие же.
    //overload меняет нужно изменить аргументы функции, можно изменить возвращаемый тип, можно изменять доступность
}
/*
    class MonsterTestDrive {
    public static void main(String [] args) {
        Monster [] ma = new Monster[3];
        ma[0] = new Vampire();
        ma[1] = new Dragon();
        ma[2] = new Monster();
        for(int x = 0; x < 3; x++) {
            ma[x].frighten(x);
        }
    }
}
    class Monster {
    boolean frighten(int d) {
        System.out.println("arrrgh");
        return true;
    }
    }
    class Vampire extends Monster {
    boolean frighten(int x) {
            System.out.println("a bite?");
            return false;

        }
    }
    class Dragon extends Monster {
        boolean frighten(int degree) {
            System.out.println("breath fire");
            return true;
        }
    }
 */
class Rowboat extends Boat {
public void rowTheBoat() {
    System.out.print("stroke natasha ");
}
}
    class Boat {
    private int length;
    public void setLength(int len) {
        length = len;
    }
    public int getLength() {
        return length;
    }
    public void move() {
        System.out.print("drift ");
    }
    }
class Sailboat extends Boat {
    public void move() {
        System.out.print("hoist sail ");
    }
}
    class TestBoats {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        Sailboat b2 = new Sailboat();
        Rowboat b3 = new Rowboat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
        int we = b2.getLength();
        System.out.println();
        System.out.println("The length of the Sailboat is " + we);
    }
}