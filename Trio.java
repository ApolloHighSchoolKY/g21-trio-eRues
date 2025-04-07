//Write your answer here
public class Trio {
    Sandwich sandwich;
    Salad salad;
    Drink drink;
    private double price;
    private String name;

    public Trio(Sandwich mySandwich, Salad mySalad, Drink myDrink) {
        sandwich = mySandwich;
        salad = mySalad;
        drink = myDrink;

        if(sandwich < salad)
        {
            if(salad < drink)
            {
                price = salad.getPrice() + drink.getPrice();
            }
            else
            {
                price = salad.getPrice() + sandwich.getPrice();
            }
        }
        else
        {
            if(salad > drink)
            {
                price = salad.getPrice() + sandwich.getPrice();
            }
            else
            {
                price = drink.getPrice() + sandwich.getPrice();
            }
        }

        name = "" + sandwich.getname() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}