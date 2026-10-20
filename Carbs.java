public class Carbs {
    private static Carbs instance;
    private String[] foods = {"Cheese", "Bread", "Lentils", "Pistachio"};
    
    private Carbs() {}
    
    public static Carbs getInstance() {
        if (instance == null) {
            instance = new Carbs();
        }
        return instance;
    }
    
    public String getFood(String dietPlan) {
        java.util.ArrayList<String> available = new java.util.ArrayList<>();
        
        for (String food : foods) {
            if (dietPlan.equals("Paleo") && food.equals("Cheese")) continue;
            if (dietPlan.equals("Vegan") && food.equals("Cheese")) continue;
            available.add(food);
        }
        
        return available.get(new java.util.Random().nextInt(available.size()));
    }
}