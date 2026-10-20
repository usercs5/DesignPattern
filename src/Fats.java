public class Fats {
    private static Fats instance;
    private String[] foods = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
    
    private Fats() {}
    
    public static Fats getInstance() {
        if (instance == null) {
            instance = new Fats();
        }
        return instance;
    }
    
    public String getFood(String dietPlan) {
        java.util.ArrayList<String> available = new java.util.ArrayList<>();
        
        for (String food : foods) {
            if (dietPlan.equals("Vegan") && food.equals("Sour Cream")) continue;
            if (dietPlan.equals("Vegan") && food.equals("Tuna")) continue;
            if (dietPlan.equals("Nut Allergy") && (food.equals("Peanuts") || food.equals("Avocado"))) {
                if (food.equals("Peanuts")) continue;
            }
            available.add(food);
        }
        
        return available.get(new java.util.Random().nextInt(available.size()));
    }
}