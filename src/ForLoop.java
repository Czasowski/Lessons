public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
//создает переменную i и назначает ей 0; повторять пока i меньше 100; каждую итерацию добавляет 1 к i
            int x = 0;
            int z = x++; //x = 1 and z = 0
            int b = ++x; //x = 1 and b = 1
        }
        String[] nameArray = {"Fred", "Qwerty"};
        for (String name : nameArray) { //for loop for collections
        }
        long y = 42;
        int x = (int) y; //(int)-cast operator
        float f = 3.33f;
        int e = (int) f; // e=3
    }
}

class Switch {
    public static void main(String[] args) {
        int month = 2, year = 2016, num = 31;
        switch (month) {
            case 4:
            case 6:
            case 11:
                num = 30;
                break;
            case 2:
                num = (year % 4 == 0) ? 29 : 28;
                break;
        }
            System.out.println(month + "/" + year + ": " + num + " days");

        do {
            System.out.println("Month: " + month);
            break;
        }    while (month == 2);
    }
    }

    class Cont {
        public static void main(String[] args) {
            outerLoop : for (int i = 1; i<4; i++) {

                for (int j = 1; j<4; j++) {
                    if (i == 1 && j == 1) {
                        System.out.println("outerLoop cont");
                        continue outerLoop;
                    }
                    if (i == 3 && j == 2) {
                        System.out.println("exit");
                        break;
                    }
                    System.out.println("Iteration i="+i+ " j="+j);
                }
            }
        }
    }

    class Convert {
        public static void main(String[] args) {
            float days = 365.25f;
            String weeks = "52" ;

            int day = (int) days;
            int week = Integer.parseInt(weeks);

            int w = day/week;
            System.out.println("Days in week: "+ w);
        }
    }

    class Arrays {
        public static void main(String[] args) {
            String[] str = {"Java", "Good", "Language"};
            int[] num = new int[3];
            num[0] = 100;
            num[1] = 200;
            str[1] = "Perfect";
            System.out.println(str.length + "\n" + num.length);
        }
    }

    class Dimensions {
        public static void main(String[] args) {
            boolean [] [] points = new boolean[5][20];
            points[0][5] = true ;
            points[1][6] = true ;
            points[2][7] = true ;
            points[3][8] = true ;
            points[4][9] = true ;

            for (int i = 0; i < points.length; i++) {
                System.out.println("\n");
                for (int j = 0; j < points[0].length; j++) {
                    char mark = (points[i][j]) ? 'X' : '-';
                    System.out.print(mark);
                }
            }
            System.out.println("\n" + points[0].length);
        }
    }

