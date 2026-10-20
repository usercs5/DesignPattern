public class MealDriver {
    public static void main(String[] args) {
        MealFactory factory = MealFactory.getInstance();
        
        // Customer 1 - No Restriction
        Meal meal1 = factory.createMeal("John", "No Restriction");
        meal1.display();
        
        // Customer 2 - Paleo
        Meal meal2 = factory.createMeal("Sarah", "Paleo");
        meal2.display();
        
        // Customer 3 - Vegan
        Meal meal3 = factory.createMeal("Mike", "Vegan");
        meal3.display();
        
        // Customer 4 - Nut Allergy
        Meal meal4 = factory.createMeal("Lisa", "Nut Allergy");
        meal4.display();
        
        // Customer 5 - No Restriction
        Meal meal5 = factory.createMeal("David", "No Restriction");
        meal5.display();
        
        // Customer 6 - Paleo
        Meal meal6 = factory.createMeal("Emma", "Paleo");
        meal6.display();
    }
}