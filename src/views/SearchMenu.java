
package views;

import controllers.SearchMethod;
import controllers.Validation;
import models.Array;

public class SearchMenu extends Menu{
   
    private Array a;

    public SearchMenu(String title, String[] choices, Array a) {
        super(title, choices);
        this.a = a;
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter number: ");
                int n = new Validation().enterInt();
                int i = new SearchMethod().linearSearch(a, n);
                if (i != -1) {
                    System.out.println("Index is: " + i);
                } else {
                    System.out.println("Not found!");
                }
                System.out.println("---------------");
                break;
            case 2: 
                System.out.print("Enter number: ");
                n = new Validation().enterInt();
                i = new SearchMethod().binarySearch(a, n);
                if (i == -1) {
                    System.out.println("Not found!");
                    
                } else if (i == -2) {
                    System.out.println("This array is not sorted!");
                }else {
                    System.out.println("Index is: " + i);
                }
                System.out.println("---------------");
                break;
        }
                
    }
    
}
