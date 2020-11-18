package Builder;

public class BuilderDesignPatternExample {
    public static void main(String[] args) {
        Meal meal = new Meal.MealBuilder("Double Decker Burger","French Fries","Coke")
                .setSeasoning("Peri-Peri")
                .setSouce("Tomato")
                .build();
        meal.toString();

        Meal meal1 = new Meal.MealBuilder("Aloo Tikki","Indian Fries","Fanta").build();
        meal1.toString();
    }
}
