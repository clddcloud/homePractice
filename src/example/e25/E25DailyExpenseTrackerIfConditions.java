package example.e25;

public class E25DailyExpenseTrackerIfConditions {
    public static void main(String[] args) {
        // Assign values to daily expenses
        float morningExpense=50.9f, afternoonExpense=11.2f, eveningExpense=14.15f;

        // Calculate total expense
        float totalExpense=morningExpense+afternoonExpense+eveningExpense;

        // Define a budget

        float budget=100.0f;

        // Check if within budget
        System.out.println("Your total daily expense is: "+totalExpense);

        if (totalExpense<=budget){
            System.out.println("You are within the budget.");
        } else {
            System.out.println("You are over the budget.");
        }
    }
}
