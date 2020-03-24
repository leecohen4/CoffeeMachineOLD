package AppLogic.Beverages;

public class BeverageFactory {
    public Beverage beverageToPrepare (eBeverageType i_Beverage) {
        switch (i_Beverage) {
            case BLACK:
                return new BlackCoffee();
            case ESPRESSO:
                return new Espresso();
            case TEA:
                return new Tea();
            case CAPPUCCINO:
                return new Cappuccino();
        }
        return null;
    }
}
