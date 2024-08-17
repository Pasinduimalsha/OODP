//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        System.out.println("Preparing Coffee:");
        coffee.prepareRecipe();  // This will call the template method in CaffeineBeverage

        System.out.println("\nPreparing Tea:");
        tea.prepareRecipe();  // This will call
    }
}

