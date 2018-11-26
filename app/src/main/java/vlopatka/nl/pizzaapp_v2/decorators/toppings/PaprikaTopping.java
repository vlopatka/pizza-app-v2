package vlopatka.nl.pizzaapp_v2.decorators.toppings;

import vlopatka.nl.pizzaapp_v2.Constants;
import vlopatka.nl.pizzaapp_v2.decorators.IPizza;
import vlopatka.nl.pizzaapp_v2.decorators.Topping;

public class PaprikaTopping extends Topping {

    public PaprikaTopping(IPizza IPizza) {
        this.IPizza = IPizza;
    }

    @Override
    public double getPrice() {
        return IPizza.getPrice() + Constants.PAPRIKA_PRICE;
    }

    @Override
    public double removePrice() {
        return IPizza.getPrice() - Constants.PAPRIKA_PRICE;
    }
}
