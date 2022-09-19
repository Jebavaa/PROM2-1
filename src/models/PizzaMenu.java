package models;

import java.time.LocalDateTime;
import java.util.List;

public class PizzaMenu {

    private List<PizzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu(List<PizzaMenuItem> menuItems) {
        this.menuItems = menuItems;
        this.lastUpdate = LocalDateTime.now();
    }
    public void removeItem (PizzaMenuItem toRemove)
    {
        menuItems.remove(toRemove);
        updateLastUpdateTime();
    }
    public void updateLastUpdateTime()
    {
        lastUpdate = LocalDateTime.now();
    }

}
