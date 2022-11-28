package homeWork9;

import java.util.Random;
import java.util.Scanner;

public class HomeWork9Task2 {
    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = scanner.nextInt();
        Integer[][] integer = new Integer[n][n];
        Interator<Integer> integerInterator = new Interator<>(integer);

        for (int i = 0; i < integer.length; i++) {
            for (int j = 0; j < integer[i].length; j++) {
                integer[i][j] = random.nextInt(9) + 1;
            }
        }
        for (Integer[] row : integer) {
            if (row != null) {
                for (Integer column : row) {
                    System.out.print(column + " ");
                }
            }
            System.out.println();
        }

        System.out.println(integerInterator.hasNext());
        System.out.println("Element 1: " + integerInterator.next());
        System.out.println(integerInterator.hasNext());
        System.out.println("Element 2: " + integerInterator.next());
        System.out.println(integerInterator.hasNext());
        System.out.println("Element 3: " + integerInterator.next());
        System.out.println(integerInterator.hasNext());
        System.out.println("Element 4: " + integerInterator.next());
        System.out.println(integerInterator.hasNext());
    }
}

class Interator<T> {

    private final T[][] array;
    private int row;
    private int column;

    public Interator(T[][] array) {
        this.array = array;
    }

    public T next() {
        T temporalArray = array[row][column];
        column++;
        for (int row = this.row; row < array.length; row++) {
                if (column <= array[row].length) {
                    this.row = row;
                    if (column >= array[row].length) {
                        this.row++;
                        this.column = 0;
                    }
                    return temporalArray;
                }
            }

        return temporalArray;
    }

    public boolean hasNext() {
        for (int row = this.row; row < array.length; row++) {
            for (int column = this.column; column < array[row].length; ) {
                return true;
            }
        }

        return false;
    }
}



