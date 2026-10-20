public class Protein {
    private static Protein instance;
    private String[] foods = {"Fish", "Chicken", "Beef", "Tofu"};
    
    private Protein() {}
    
    public static Protein getInstance() {
        if (instance == null) {
            instance = new Protein();
        }
        return instance;
    }
    
    public String getFood(String dietPlan) {
        java.util.ArrayList<String> available = new java.util.ArrayList<>();
        
        for (String food : foods) {
            if (dietPlan.equals("Paleo") && food.equals("Tofu")) continue;
            if (dietPlan.equals("Vegan") && (food.equals("Fish") || food.equals("Chicken") || food.equals("Beef") || food.equals("Tofu"))) {
                if (!food.equals("Tofu")) continue;
            }
            available.add(food);
        }
        
        return available.get(new java.util.Random().nextInt(available.size()));
    }
}