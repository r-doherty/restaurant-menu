package restaurant;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private String category;
    private Date dateAdded;

    public MenuItem (String name, double price, String description, String category)
    {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
//        this.dateAdded = dateAdded;

    }

    public String getName() {return name;}
    public double getPrice() {return price;}
    public String getDescription() {return description;}
    public String getCategory() {return category;}
//    public Date getDateAdded() {return dateAdded;}

    private void setName(String aName) {name = aName;}
    private void setPrice(double aPrice) {price = aPrice;}
    private void setDescription(String aDescription) {description = aDescription;}
    private void setCategory(String aCategory) {category = aCategory;}
//    private void setDateAdded(Date aDate) {dateAdded = aDate;}

    public static MenuItem banhMi = new MenuItem("Banh Mi", 8.99, "Pork, Chicken, Tofu, or Mushroom on a Toasted Vietnamese Baguette topped with our truck made pickled carrots & daikon, cucumbers, cilantro, jalapenos, and our addicting roasted garlic Sriracha mayo", "Main Course");
    public static MenuItem kickinChicken = new MenuItem("Kicken Chicken", 8.99, "chicken carnitas, queso fresco, Korean bbq sauce, cucumber, pickled onions, radish, candied jalapeños, sriracha crema", "Main Course");
    public static MenuItem freshOffTheBoat = new MenuItem("Fresh off the Boat", 9.99, "blue crab cakes, sesame slaw, cucumber, spicy mayo, sesame seeds, pickled onions", "Main Course");

    public static MenuItem kimchiFries = new MenuItem("Kimchi Fries", 5.99, "your choice of protein, caramelized kimchi, cheddar + monterey jack, onions, cilantro, magic sauce, sesame seeds, sriracha on a crispy bed of french fries", "Appetizer");
    public static MenuItem patatasBravas = new MenuItem("Patatas Bravas", 3.99, "potatoes, kimchi, green onions, cilantro, spicy mayo — ++ short ribs $2.00, pork $2.00, egg $1.50", "Appetizer");

    public static MenuItem blackWalnutPie = new MenuItem("Black Walnut Pie (Slice)", 2.99, "Decadent, chocolatey, and oh-so-tasty. Grandmothers Texas sheet cake combines rich, chocolate sheet cake with fudgy chocolate-nut icing", "Dessert");

    public static ArrayList<MenuItem> menu = new ArrayList<>();

    private static void loadMenu() {

        menu.add(banhMi);
        menu.add(kickinChicken);
        menu.add(freshOffTheBoat);
        menu.add(kimchiFries);
        menu.add(patatasBravas);
        menu.add(blackWalnutPie);
    }

    public static void printMenu() {
        loadMenu();

        System.out.println("***Appetizers***");
        for (MenuItem item : menu) {
            if (item.category == "Appetizer") {
                System.out.println(item.name + " — $" + item.price);
                System.out.println(" ... " + item.description);
            }
        }

        System.out.println("\n***Main Courses***");
        for (MenuItem item : menu) {
            if (item.category == "Main Course") {
                System.out.println(item.name + " — $" + item.price);
                System.out.println(" ... " + item.description);
            }
        }

        System.out.println("\n***Desserts***");
        for (MenuItem item : menu) {
            if (item.category == "Dessert") {
                System.out.println(item.name + " — $" + item.price);
                System.out.println(" ... " + item.description);
            }
        }
    }
}
