public class Chapter8 { //Serious Polymorphism
//абстрактный класс запрещает создавать новые объекты этого класса = new ...
    //абстрактный метод должен быть овверайд public abstract void eat();
    //если объект Dog поместить в ArrayList<Object> то он потеряет функции собаки, но можно вернуть обратно
    // Object o = al.get(index)
    //Dog d = (Dog) o;
    //d.roam
    //если не ясно что это за объект изначально можно чекнуть
    // if (o instaceof Dog) { Dog d = (Dog) o; }
}

interface Nose {
    public int iMethod();
}
abstract class Picasso implements Nose {
    public int iMethod() {
        return 7;
    }
}
class Clowns extends Picasso {}
class Acts implements Nose {
    public int iMethod() {
        return 5;
    }
}
class Of76 extends Clowns {
    public static void main (String [] args) {
Nose[] i = new Nose[3];
i[0] = new Acts();
i[1] = new Clowns();
i[2] = new Of76();
for(int x = 0; x < 3; x++) {
    System.out.println(i[x].iMethod() + " " + i[x].getClass());
}
    }
}

/*


class MyDogList {
    private Dog[] dogs = new Dog[5];
    private int nextIndex = 0;

    public void add(Dog d) {
        if (nextIndex < dogs.length) {
            dogs[nextIndex] = d;
            System.out.println("Dog added at " + nextIndex);
            nextIndex++;
        }
    }
        public static void main(String[] args) {
            MyDogList dogy = new MyDogList();
            Dog a = new Dog();
            dogy.add(a);
        }
    }
    */
//getClass method
//    Cat c = new Cat();
  //  System.out.println(c.getClass());
//System.out.println(c.hashCode());
//System.out.println(c.toString());

//interface
/* define
public interface Pet {
public abstract void beFriendly();
    public abstract void play();
}
использовать
class Dog extends Canine implements Pets {

 */
