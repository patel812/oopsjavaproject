
public class Pizza {

    private int price;

    private boolean veg;


    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;


    private int basePizzaPrice;


    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isOptedForTakeAway = false;


    public Pizza(boolean veg) {
        this.veg = veg;

        if(this.veg){
            System.out.print("Veg ");
            this.price = 300;
        }else{
            System.out.print("Non Veg ");
            this.price = 400;
        }

        basePizzaPrice = this.price;
    }


    public void extraCheesePrice(){
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }


    public void extraToppingsPrice(){
        isExtraToppingAdded = true;
        this.price += extraToppingsPrice;
    }


    public void backPackPrice(){
        isOptedForTakeAway = true;
        this.price += backPackPrice;
    }


    public void getBill(){

        String bill = "";
        System.out.println("Pizza : "+basePizzaPrice);

        if(isExtraCheeseAdded){
            bill += "Extra cheese added : "+extraCheesePrice+ "\n";
        }

        if(isExtraToppingAdded){
            bill += "Extra Topping added : "+extraToppingsPrice+ "\n";
        }

        if(isOptedForTakeAway){
            bill += "Opted for take away : "+backPackPrice+ "\n";
        }

        bill += "Bill : "+this.price+ "\n";
        System.out.println(bill);
    }

}
