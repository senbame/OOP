package practice4;

public class Restaurant {

    private double pizzaPrice;

    public Restaurant(double pizzaPrice) {
        this.pizzaPrice = pizzaPrice;
    }

    public boolean servePizza(CanHavePizza eater) {

        if (eater instanceof Person) {
            Person p = (Person) eater;

            if (!p.pay(pizzaPrice)) {
                System.out.println("Order cancelled ");
                return false;
            }
        } else {
            System.out.println("Free pizza for animals ");
        }

        eater.eatPizza();
        return true;
    }
}