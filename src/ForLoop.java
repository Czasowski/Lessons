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
