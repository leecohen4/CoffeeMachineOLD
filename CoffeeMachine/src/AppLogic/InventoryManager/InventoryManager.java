package AppLogic.InventoryManager;

import AppLogic.OrderElements.eIngredients;
import java.util.HashMap;

public class InventoryManager {
    private HashMap<eIngredients, Integer> inventory = new HashMap<>();
    private final int INITIAL_INVENTORY = 100;
    private final int MINIMUM_INVENTORY = 10;

    private static final InventoryManager inventoryManager = new InventoryManager();

    /**
     * Initialize inventory with initial amount.
     */
    private InventoryManager() {
        for (eIngredients ingredient : eIngredients.values()) {
            inventory.put(ingredient, INITIAL_INVENTORY);
        }
    }

    public void validateInventory() {
        for (eIngredients ingredient : eIngredients.values()) {
            if (inventory.get(ingredient) <= MINIMUM_INVENTORY) {
                restockIngredient(ingredient);
            }
        }
    }

    private void restockIngredient(eIngredients ingredient) {
        int amountToRestock = INITIAL_INVENTORY - inventory.get(ingredient);
        inventory.put(ingredient, amountToRestock);
    }

    public HashMap<eIngredients, Integer> getInventory() { return inventory;}

    public static InventoryManager getInventoryManger() { return inventoryManager;}
}