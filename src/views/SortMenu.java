
package views;

import controllers.SortMethod;
import models.Array;

public class SortMenu extends Menu{
    
    private Array a;
    
    public SortMenu(String title, String[] choices, Array a) { 
        super(title, choices);
        this.a = a;
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("----------\nAfter bubble sort: ");
                a = new SortMethod().bubbleSort(a);
                a.display();
                System.out.println("\n----------");
                break;
            case 2:
                System.out.println("----------\nAfter quick sort: ");
                a = new SortMethod().quickSort(a, 0, a.getSize() - 1);
                a.display();
                System.out.println("\n----------");
                break;
        }
    }
    
}
