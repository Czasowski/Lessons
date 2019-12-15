import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
class SortMountain {
    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    class  NameCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }
    class HeightCompare implements Comparator<Mountain> {

        @Override
        public int compare(Mountain one, Mountain two) {
            return one.height - two.height;
        }
    }

    public static void main(String[] args) {
        new SortMountain().go();
    }
    public void go() {
        mtn.add(new Mountain("Longs", 14255));
        mtn.add(new Mountain("Elber", 14433));
        mtn.add(new Mountain("Maroo", 14156));
        mtn.add(new Mountain("Castl", 14265));

        System.out.println("as entered: \n" +mtn);
        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("by name: \n" + mtn);
        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, nc);
        System.out.println("by height: \n" + mtn);
    }
}
class Mountain {
   int height;
    String name;

        Mountain(String n, int h) {
        name = n;
        height = h;
        }
        public String toString() {
            return name + " " + height;
        }
}
