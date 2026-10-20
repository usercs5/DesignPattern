public class PizzaDriver {
    public static void main(String[] args) {
        // Initial three pizzas - one of each size
        Pizza pizza1 = new Pizza.PizzaBuilder("Pizza Hut", "Small")
            .addTopping("Pepperoni")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .build();
        pizza1.eat();
        
        Pizza pizza2 = new Pizza.PizzaBuilder("Pizza Hut", "Medium")
            .addTopping("Pepperoni")
            .addTopping("Bacon")
            .addTopping("Onions")
            .addTopping("Extra Cheese")
            .addTopping("Peppers")
            .addTopping("Chicken")
            .build();
        pizza2.eat();
        
        Pizza pizza3 = new Pizza.PizzaBuilder("Pizza Hut", "Large")
            .addTopping("Pepperoni")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .addTopping("Bacon")
            .addTopping("Onions")
            .addTopping("Extra Cheese")
            .addTopping("Peppers")
            .addTopping("Chicken")
            .addTopping("Olives")
            .build();
        pizza3.eat();
        
        // Pizza Hut additional
        Pizza pizza4 = new Pizza.PizzaBuilder("Pizza Hut", "Large")
            .addTopping("Pepperoni")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .build();
        pizza4.eat();
        
        Pizza pizza5 = new Pizza.PizzaBuilder("Pizza Hut", "Small")
            .addTopping("Bacon")
            .addTopping("Onions")
            .build();
        pizza5.eat();
        
        // Little Caesars
        Pizza pizza6 = new Pizza.PizzaBuilder("Little Caesars", "Medium")
            .addTopping("Pepperoni")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .addTopping("Bacon")
            .addTopping("Onions")
            .addTopping("Extra Cheese")
            .addTopping("Peppers")
            .addTopping("Chicken")
            .build();
        pizza6.eat();
        
        Pizza pizza7 = new Pizza.PizzaBuilder("Little Caesars", "Small")
            .addTopping("Pepperoni")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .addTopping("Bacon")
            .addTopping("Onions")
            .addTopping("Extra Cheese")
            .build();
        pizza7.eat();
        
        // Dominos
        Pizza pizza8 = new Pizza.PizzaBuilder("Dominos", "Small")
            .addTopping("Pepperoni")
            .build();
        pizza8.eat();
        
        Pizza pizza9 = new Pizza.PizzaBuilder("Dominos", "Large")
            .addTopping("Sausage")
            .addTopping("Mushrooms")
            .addTopping("Bacon")
            .build();
        pizza9.eat();
    }
}