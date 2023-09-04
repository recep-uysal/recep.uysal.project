import java.util.Scanner;

public class Coffee {
    static Scanner scanner = new Scanner(System.in);

    private int espresso;
    private int hot_water;
    private int milk_foam;
    private int steamed_milk;
    private int hot_chocolate;
    private int money;
    private String name;

    public Coffee(){

    }

    public Coffee(int espresso, int hot_water, int milk_foam, int steamed_milk, int hot_chocolate, int money, String name) {
        this.espresso = espresso;
        this. hot_water = hot_water;
        this.milk_foam = milk_foam;
        this.steamed_milk = steamed_milk;
        this.hot_chocolate = hot_chocolate;
        this.money = money;
        this.name = name;
    }

    public static void buy(){
        System.out.println("Lütfen içmek istediginiz kahvenin numarasini giriniz.\n \n 1. Espresso (" + String.valueOf(new Espresso().getMoney()) + " tl)\n 2. Double Espresso (" + String.valueOf(new DoubleEspresso().getMoney()) + " tl)\n 3. Cappuccino (" + String.valueOf(new Cappuccino().getMoney()) + " tl)\n 4. Caffe Latte (" + String.valueOf(new CaffeLatte().getMoney()) + " tl)\n 5. Mocha (" + String.valueOf(new Mocha().getMoney()) + " tl)\n 6. Americano (" + String.valueOf(new Americano().getMoney()) + " tl)\n 7. Hot Water (" + String.valueOf(new HotWater().getMoney()) + " tl)");
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
                System.out.println("Lütfen dogru kahve numarası giriniz!");
                
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

    public String getName() {
        return name;
    }
}