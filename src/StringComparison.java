import java.io.*;
import java.util.*;

public class StringComparison {



    public static void main(String[] args) {
        String password = "bingo";
        try {
            if(args[0].toLowerCase().equals(password)) {
                System.out.println("Valid password");
            }
            else {
                System.out.println("Invalid password");
            }
        } catch (Exception e) {
            System.out.println("Enter the password!");
        }
    }
}

class StringSearch {
    public static void main(String[] args) {
        String[] books = {"Java in easy steps", "XML in easy steps", "HTML in easy steps", "CSS in easy steps", "Gone With the Wind", "Drop the Defense"};
        int c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].substring(0, 4) + " | ");
            if (books[i].endsWith("in easy steps")) c1++;
            if (books[i].startsWith("Java")) c2++;
            if (books[i].indexOf("easy") == -1) c3++;
        }
        System.out.println("\nНайдено " + c1 + " названий из этой серии");
        System.out.println("Найдено " + c2 + " названий с Java");
        System.out.println("Найдено " + c3 + " других названий");

    }
}
class CharacterSwap {
    public static void main(String[] args) {
        String txt = "";
        if (txt.isEmpty()) txt = " Boorow ";
        System.out.println("Строка: " + txt);
        System.out.println("Длина первоначальной строки: " + txt.length());
        txt = txt.trim();
        System.out.println("Строка: " + txt);
        System.out.println("Длина первоначальной строки: " + txt.length());
        char ini = txt.charAt(0);
        System.out.println(ini);
        txt = txt.replace('o', 'a');
        System.out.println(txt);

    }
    }
//доступна для всего класса static
//Ключевое слово public разрешает доступ из любого другого класса, а доступ по умолчанию разрешает открывать доступ только для классов одного пакета.
class  Car {
    private String color;
    private String bodyType;
    private String maker;

    public Car() { // constructor
        maker = "Porsche";
        color = "Серебристый";
        bodyType = "Купе";
    }

    private String accelerate() {
        String motion = "Accelerating";
        return motion;
    }

    public void setCar(String brand, String paint, String style) {
        maker = brand;
        color = paint;
        bodyType = style;
    }

    public void getCar() {
        System.out.println(maker + " цвет " + color);
        System.out.println(maker + " тип кузова " + bodyType);
        System.out.println(maker + " " + accelerate() + "\n");
    }
}
class Constructor {
    public static void main(String[] args) {
        Car Porsche = new Car();
        Porsche.getCar();
        Car Ferrari = new Car() ;
        Ferrari.setCar( "Ferrari" , "Красный" , "Спортивный" ) ;
        Ferrari.getCar() ;
    }
}

class ListFiles {
    public static void main(String[] args) {
        File dir = new File("data") ;
    if (dir.exists()) {
        String[] files = dir.list();
        System.out.println(files.length + "files were found.");
for (int i = 0; i < files.length;i++) {
    System.out.println(files[i]);
}
    } else {
        System.out.println("List not found");
    }
    }
}

class ReadString {
    public static void main(String[] args) {
        System.out.println("Input the name of the book: ");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(isr);
        String input = "";
        try {
            input = buffer.readLine();
            buffer.close();
        } catch (IOException e) {
            System.out.println("Ошибка!!");
        }
        System.out.println("Thanks! You read \"" + input + "\".");
    }
} // для чтения файла используется FileReader

class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("tеam.txt") ;
            BufferedWriter buffer = new BufferedWriter(file);
            buffer.write( "Дул ветер из последних сил," ) ; //append() - не перезаписует, а добавляет.
            buffer.newLine() ; buffer.write( "И град хлестал, и ливень лил," );
            buffer.newLine() ; buffer.write( "И вспышки молний тьма глотала," ) ;
            buffer.newLine() ; buffer.write( "И небо долго грохотало..." ) ;
            buffer.newLine() ; buffer.write( "В такую ночь, как эта ночь," ) ;
            buffer.newLine() ; buffer.write( "Сам дьявол погулять не прочь." ) ;
            buffer.close();

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


