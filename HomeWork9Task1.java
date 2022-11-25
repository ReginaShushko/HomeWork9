package homeWork9;

import java.util.Scanner;

public class HomeWork9Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        Pair<String> stringPair = new Pair<>(str1, str2);
        System.out.println(stringPair.first());
        System.out.println(stringPair.last());
        System.out.println(stringPair.swap());

        System.out.println("Enter new element: ");
        String str3 = scanner.nextLine();
        System.out.println(stringPair.replaceFirst(str3));

        System.out.println("Enter new element: ");
        String str4 = scanner.nextLine();
        System.out.println(stringPair.replaceLast(str4));

    }
}

class Pair<T> {

    private T first;
    private T second;

    Pair(final T first, final T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T first() {
        return first;
    }

    public T last() {
        return second;
    }

    public T swap() {
        T temporal = this.first;
        this.first = this.second;
        this.second = temporal;
        return (T) (first + ", " + second);
    }

    public T replaceFirst(T newElement) {
        this.first = newElement;
        return (T) (first + ", " + second);
    }

    public T replaceLast(T newElement) {
        this.second = newElement;
        return (T) (second + ", " + first);
    }
}