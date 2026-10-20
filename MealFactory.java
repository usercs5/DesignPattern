public class MealFactory {
    private Carbs carbs = Carbs.getInstance();
    private Protein protein = Protein.getInstance();
    private Fats fats = Fats.getInstance();
    
    private static MealFactory instance;
    
    private MealFactory() {}
    
    public static MealFactory getInstance() {
        if (instance == null) {
            instance = new MealFactory();
        }
        return instance;
    }
    
    public Meal createMeal(String customerName, String dietPlan) {
        String carbFood = carbs.getFood(dietPlan);
        String proteinFood = protein.getFood(dietPlan);
        String fatFood = fats.getFood(dietPlan);
        
        return new Meal(customerName, dietPlan, carbFood, proteinFood, fatFood);
    }
}