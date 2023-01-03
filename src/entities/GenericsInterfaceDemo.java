package entities;

public class GenericsInterfaceDemo {

    public static void main(String[] args) {

        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iob = new MyClass<>(inums);
        MyClass<Character> cob = new MyClass<>(chs);

        System.out.println("Max value of inums: " + iob.max());
        System.out.println("Min value of inums: " + iob.min());

        System.out.println("Max value of chs: " + cob.max());
        System.out.println("Min value of chs: " + cob.min());

    }
}
