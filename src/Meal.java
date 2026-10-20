public class Meal {
    private String carb;
    private String protein;
    private String fat;
    private String customerName;
    private String dietPlan;
    
    public Meal(String customerName, String dietPlan, String carb, String protein, String fat) {
        this.customerName = customerName;
        this.dietPlan = dietPlan;
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }
    
    public void display() {
        System.out.println(customerName + " (" + dietPlan + ")");
        System.out.println("Meal: " + carb + ", " + protein + ", " + fat);
        System.out.println();
    }
}