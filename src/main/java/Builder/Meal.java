package Builder;

public class Meal {
// 1. Required Parameters
    private String burger;
    private String fries;
    private String colddrink;
// 2. Optional Parameters
    private String souce;
    private String seasoning;

// 3. Private Constructor
// 4. Initialize with builder
    private Meal(MealBuilder builder) {
        this.burger = builder.burger;
        this.fries = builder.fries;
        this.colddrink = builder.colddrink;
        this.souce = builder.souce;
        this.seasoning = builder.seasoning;
    }
// 5. Only getter , No setters
    public String getBurger() {
        return burger;
    }

    public String getFries() {
        return fries;
    }

    public String getColddrink() {
        return colddrink;
    }

    public String getSouce() {
        return souce;
    }

    public String getSeasoning() {
        return seasoning;
    }

    public String toString(){
        System.out.println("Burger:"+burger);
        System.out.println("Fries:"+fries);
        System.out.println("ColdDrink:"+colddrink);
        System.out.println("Souce:"+souce);
        System.out.println("Seasoning:"+seasoning);
        System.out.println("------------------------");
        return "";
    }
//6. Static inner Builder class
    public static  class MealBuilder{
        private String burger;
        private String fries;
        private String colddrink;
        private String souce;
        private String seasoning;
//7. Required Parameters Constructor
    public MealBuilder(String burger, String fries, String colddrink) {
        this.burger = burger;
        this.fries = fries;
        this.colddrink = colddrink;
    }
//8. Optional Parameters with setters
    public MealBuilder setSouce(String souce) {
        this.souce = souce;
//9. Return Builder Object from Setters of Optional Parameters
        return this;
    }

    public MealBuilder setSeasoning(String seasoning) {
        this.seasoning = seasoning;
        return this;
    }
//9. Builder method
    public Meal build(){
        return new Meal(this);
    }
}
}
