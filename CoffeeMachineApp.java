import java.util.Scanner;

public class CoffeeMachineApp {

    static Scanner scanner = new Scanner(System.in);
    private int espresso;
    private int hot_water;
    private int milk_foam;
    private int steamed_milk;
    private int hot_chocolate;
    private int money;

    public CoffeeMachineApp(){
        
    }

    public CoffeeMachineApp(int espresso, int hot_water, int milk_foam, int steamed_milk, int hot_chocolate, int money) {
        this.espresso = espresso;
        this.hot_water = hot_water;
        this.milk_foam = milk_foam;
        this.steamed_milk = steamed_milk;
        this.hot_chocolate = hot_chocolate;
        this.money = money;
    }

    public static void buy(){
        System.out.println("Lütfen içmek istediginiz kahvenin numarasini giriniz.\n \n 1. Espresso (20 tl)\n 2. Double Espresso (29 tl)\n 3. Cappuccino (27 tl)\n 4. Caffe Latte (27 tl)\n 5. Mocha (32 tl)\n 6. Americano (25 tl)\n 7. Hot Water (5 tl)");
        String inputValue = scanner.nextLine();

        switch(inputValue){
            case "1" :
                printMessage(new Espresso());
                break;
            case "2" :
                printMessage(new DoubleEspresso());
                break;
            case "3" :
                printMessage(new Cappuccino());
                break;
            case "4" :
                printMessage(new CaffeLatte());
                break;
            case "5" :
                printMessage(new Mocha());
                break;
            case "6" :
                printMessage(new Americano());
                break;
            case "7" :
                printMessage(new HotWater());
                break;
            default :
                System.out.println("Lütfen dogru numara seçiniz!");
                
        }
    }

    public static void printMessage(Coffee coffee){
        System.out.println("\nTesekkürler kahveniz hazirlaniyor");
        
        String message = coffee.getName();
        message = message + " sectiniz. Bu icecegimiz ";

        if (coffee.getEspresso() != 0) {
            message = message + coffee.getEspresso();
            message = message + " espresso ";
        }

        if (coffee.getHotChocolate() != 0) {
            message = message + coffee.getHotChocolate();
            message = message + " sicak çikolata ";
        }

        if (coffee.getHotWater() != 0) {
            message = message + coffee.getHotWater();
            message = message + " sicak su ";
        }

        if (coffee.getMilkFoam() != 0) {
            message = message + coffee.getMilkFoam();
            message = message + " süt köpügü ";
        }

        if (coffee.getSteamedMilk() != 0) {
            message = message + coffee.getSteamedMilk();
            message = message + " buharli süt ";
        }
        
        message = message + "içermektedir. Afiyet Olsun.";
        System.out.println(message);
    }

    public int getEspresso() {
        return espresso;
    }

    public int getHotWater() {
        return hot_water;
    }

    public int getMilkFoam() {
        return milk_foam;
    }

    public int getSteamedMilk() {
        return steamed_milk;
    }

    public int getHotChocolate() {
        return hot_chocolate;
    }

    public int getMoney() {
        return money;
    }
}