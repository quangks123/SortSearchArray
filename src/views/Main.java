
package views;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"Sort", "Search", "Exit"};
        new MainMenu("--------MENU---------", choices).run();
    }
}
