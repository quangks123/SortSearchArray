
package models;
import controllers.Validation;
import java.util.Scanner;

public class Array {
    
    private static Scanner sc = new Scanner(System.in);
            
    private int[] array;
    private int size;

    public Array() {
        System.out.print("Enter size of array: ");
        size = new Validation().enterInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] = new Validation().enterInt();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }
    
    public void display() {
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
