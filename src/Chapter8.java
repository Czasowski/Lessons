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
//getClass method
//    Cat c = new Cat();
  //  System.out.println(c.getClass());
//System.out.println(c.hashCode());
//System.out.println(c.toString());
