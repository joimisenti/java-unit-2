import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        ArrayList <Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();

        System.out.print("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +
                "\nthe menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.print("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();

        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");

        redVelvet.type();

        System.out.println("How much would you like to charge for the red velvet cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");

        chocolate.type();

        System.out.println("How much would you like to charge for the chocolate cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();

        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

        // Within the main method, start creating drinkMenu

        ArrayList <Drink> drinkMenu = new ArrayList<Drink>();

        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the drinks menu. We currently have " +
                "\nthree drinks on the menu but we need to decide on pricing.");

        System.out.println("We are deciding on the price for water. Here is the description: ");
        water.type();

        System.out.println("How much would you like to charge for water?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        water.setPrice(price);

        System.out.println("We are deciding on the price for soda. Here is the description: ");
        soda.type();

        System.out.println("How much would you like to charge for soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();;
        price = Double.parseDouble(priceText);

        soda.setPrice(price);

        System.out.println("We are deciding no the price for milk. Here is the description: ");
        milk.type();

        System.out.println("How much would you like to charge for milk?" +
                "(Input a numerical number taken to 2 decimal places)");

        priceText = input.nextLine();
        price = Double.parseDouble(priceText);

        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        System.out.println(drinkMenu);

        new Order(cupcakeMenu, drinkMenu);

    }
}

// Create new class Cupcake that all other cupcakes will inherit from

class Cupcake {
    public double price;

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void type () {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake {

    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake {

    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

class Drink {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A consumable liquid beverage; in this case, a bottle of water");
    }
}

class Soda extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of soda");
    }
}

class Milk extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of milk");
    }
}
