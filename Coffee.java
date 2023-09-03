
public class Coffee extends CoffeeMachineApp {
    private String name;

    public Coffee(int espresso, int hot_water, int milk_foam, int steamed_milk, int hot_chocolate, int money, String name) {
        super(espresso, hot_water, milk_foam, steamed_milk, hot_chocolate, money);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}