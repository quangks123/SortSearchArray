
package views;

import models.Array;

public class MainMenu extends Menu{
    
    private Array a;
    
    public MainMenu(String title, String[] choices) {
        super(title, choices);
        a = new Array();
        a.display();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                String[] sortChoices = {"Bubble sort", "Quick sort", "Back"};
                new SortMenu("------SORT------", sortChoices, a).run();
                break;
            case 2:
                String[] searchChoices = {"Linear search", "Binary search", "Back"};
                new SearchMenu("--------SEARCH--------", searchChoices, a).run();
                break;
        }
    }
     
}
