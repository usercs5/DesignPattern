public class Pizza {
    private String chain;
    private String size;
    private java.util.ArrayList<String> toppings;
    
    private Pizza(PizzaBuilder builder) {
        this.chain = builder.chain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }
    
    public void eat() {
        System.out.println(chain + " - " + size);
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println();
    }
    
    public static class PizzaBuilder {
        private String chain;
        private String size;
        private java.util.ArrayList<String> toppings = new java.util.ArrayList<>();
        
        public PizzaBuilder(String chain, String size) {
            this.chain = chain;
            this.size = size;
        }
        
        public PizzaBuilder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }
        
        public Pizza build() {
            return new Pizza(this);
        }
    }
}