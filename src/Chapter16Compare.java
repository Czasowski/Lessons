import java.io.*;
import java.net.Socket;
import java.util.*;

public class Chapter16Compare {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Chapter16Compare().go();
    }
    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one,Song two) {
            return one.getArtist().compareTo(two.getArtist());
        }
    }
    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        TreeSet<Song> songSet = new TreeSet<Song>();
        songSet.addAll(songList);

        //HashSet <Song> songSet = new HashSet<Song>(); uniq but not sort
        //songSet.addAll(songList);

        System.out.println(songSet);

        //ArtistCompare artistCompare = new ArtistCompare(); cause dublicates
        //Collections.sort(songList,artistCompare);
    }
    void getSongs() {
        try {
            File file = new File("Songlist.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}

//TreeSet - Keeps the elements sorted and prevents duplicates.
// HashMap - Let’s you store and access elements as name/value pairs.
// LinkedList - Designed to give better performance when you insert or delete elements from the middle of the collection. (In practice, an ArrayList is still usually what you want.)
// HashSet - Prevents duplicates in the collection, and given an element, can find that element in the collection quickly.
// LinkedHashMap - Like a regular HashMap, except it can remember the order in which elements (name/value pairs) were inserted, or it can be configured to remember the order in which elements were last accessed.
class Song implements Comparable<Song> {
    String title;
    String artist;
    String rating;
    String bpm;

    public boolean equals(Object aSong) {
        Song s = (Song) aSong;
        return getTitle().equals(s.getTitle());
    }
public int hashCode() {
        return title.hashCode();
}
    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;

    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getRating() {
        return rating;
    }
    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Song song) {
       return title.compareTo(song.getTitle());
    }
}

//if (foo == bar) {
// // both references are referring
// // to the same object on the heap
//if (foo.equals(bar) && foo.hashCode() == bar.hashCode()) {
// // both references are referring to either a
// // a single object, or to two objects that are equal



class TestTree {
    public static void main (String[] args) {
        new TestTree().go();
    }
    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        TreeSet<Book> tree = new TreeSet<Book>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}
class Book implements Comparable {
    String title;

    public Book(String t) {
        title = t;
    }

    public int compareTo(Object b) {
        Book book = (Book) b;
        return (title.compareTo(book.title));
    }
    //OR Comparator
    //public class BookCompare implements Comparator<Book> {
    // public int compare(Book one, Book two) {
    // return (one.title.compareTo(two.title));
    // }
    //}
    //class Test {
    // public void go() {
    // Book b1 = new Book("How Cats Work");
    // Book b2 = new Book("Remix your Body");
    // Book b3 = new Book("Finding Emo");
    // BookCompare bCompare = new BookCompare();
    // TreeSet<Book> tree = new TreeSet<Book>(bCompare);
    // tree.add(new Book("How Cats Work");
    // tree.add(new Book("Finding Emo");
    // tree.add(new Book("Remix your Body");
    // System.out.println(tree);
    // }
    //}
}
//MAP EXAmple
class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();
        scores.put("Kathy", 42);
        scores.put("Bert", 343);
        scores.put("Skyler", 420);
        System.out.println(scores);
        System.out.println(scores.get("Bert"));
    }
}