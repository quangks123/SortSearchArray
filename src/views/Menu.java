
package views;

import controllers.Validation;
import java.util.ArrayList;

public abstract class Menu {
    
    private String title;
    private ArrayList<String> choices;
    
    public Menu(String title, String[] choices){
        this.title = title;
        this.choices = new ArrayList<>();
        for (String c : choices) {
            this.choices.add(c);
        }
    }
    
    private void display(String title,ArrayList<String> al){
        System.out.println("\n" + title);
        for(int i=0;i<al.size();i++){
            System.out.println((i+1)+". "+al.get(i));
        }
        System.out.println("--------------------------------------");
    }
    
    public void run(){
   
        while(true){
            int choice = getSelected();
            if((choice <= choices.size() - 1) && (choice >= 1))
                execute(choice);
            else if (choice == choices.size())
                break;
            else {
                System.out.println("--------------\nTry again!!\n--------------");
            }                 
        }
    }
    
    public abstract void execute(int choice);
    
    public int getSelected(){
        display(title,choices);
        System.out.print("Enter your choice: ");
        return new Validation().enterInt();
    }
    
}
