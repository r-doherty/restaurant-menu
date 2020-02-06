package restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<MenuItem> menu;
    private LocalDateTime lastUpdated;

    public Menu() {
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }

    public void addMenuItem(MenuItem menuItem)
    {
        menu.add(menuItem);
        lastUpdated = LocalDateTime.now();
    }

    public void removeMenuItem(int menuItemId)
    {
        for(int i = 0; i < menu.size(); i++)
        {
            if(menu.get(i).getMenuId() == menuItemId)
            {
                menu.remove(i);
                lastUpdated = LocalDateTime.now();
                break;
            }
        }
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

}
