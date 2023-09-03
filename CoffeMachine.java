import java.util.Scanner;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);
    private int espresso;
    private int hot_water;
    private int milk_floam;
    private int streamed_milk;
    private int money;

    public CoffeeMachine(){
        
    }

    public CoffeeMachine(int espresso, int hot_water, int milk_floam, int streamed_milk, int money) {
        this.espresso = espresso;
        this.hot_water = hot_water;
        this.milk_floam = milk_floam;
        this.streamed_milk = streamed_milk;
        this.money = money;
    }

    public static void buy(CoffeeMachine coffeeMachine){
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz.\n 1. Espresso (20 ₺)\n 2. Double Espresso (29 ₺)\n 3. Cappuccino (27 ₺)\n 4. Caffe Latte (27 ₺)\n 5. Mocha (32 ₺)\n 6. Americano (25 ₺)\n 7. Hot Water (5 ₺)\n");
        String inputValue = scanner.nextLine();

        switch(inputValue){
            case "1" :
                System.out.println("You choosed 1");
                new Espresso()
                break;
            case "2" :
                System.out.println("You choosed 2");
                break;
            case "3" :
                System.out.println("You choosed 3");
                break;
            case "4" :
                System.out.println("You choosed 4");
                break;
            case "5" :
                System.out.println("You choosed 5");
                break;
            case "6" :
                System.out.println("You choosed 6");
                break;
            case "7" :
                System.out.println("You choosed 7");
                break;
            default :
                System.out.println("Lütfen doğru numara seçiniz!");
                break;
        }
    }
}