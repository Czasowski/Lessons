class Chapter4 {
    //encapsulating
    private int size;
    private String name;

    void setName(String a) {
        name = a;
    }

    int getSize() {
        return size;
    }

    void setSize(int s) {
        size = s;
    }


    void bark1() {
        System.out.println("Dog's name: " + name);
        if(size>60) {
            System.out.println("Woof");
        } else if (size> 14) {
            System.out.println("Ruff");
        } else {
            System.out.println("Yip");
        }
    }
}

class Tester {
    public static void main(String[] args) {
        Chapter4 one = new Chapter4();
        one.setSize(70);
        one.setName("Ole");
        Chapter4 two = new Chapter4();
        two.setSize(8);
        two.setName("Gera");

        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two: " + two.getSize());
        one.bark1();
        two.bark1();
        //array
        Chapter4[] pets = new Chapter4[7];
        pets[0] = new Chapter4();
        pets[1] = new Chapter4();

        pets[0].setSize(30);
        int x = pets[0].getSize();
        pets[1].setSize(x);
        pets[1].setName("Gar");
        pets[1].bark1();
    }
}
class XCopy {
    public static void main(String [] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);  }
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}
