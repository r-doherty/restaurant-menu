package restaurant;

import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.Date;
import java.io.File;
import java.text.SimpleDateFormat;

public class MenuItem {

    private static Date currentDate = new Date();
    private static Timestamp currentTs = new Timestamp(currentDate.getTime());

    private String name;
    private double price;
    private String description;
    private String category;
    private String status;

    public MenuItem (String name, double price, String description, String category, String status)
    {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.status = status;
    }


//    Created these getters + setters but chose another way of approaching assignment
//    public String getName() {return name;}
//    public double getPrice() {return price;}
//    public String getDescription() {return description;}
//    public String getCategory() {return category;}
//    public Date getStatus() {return status;}
//
//    private void setName(String aName) {name = aName;}
//    private void setPrice(double aPrice) {price = aPrice;}
//    private void setDescription(String aDescription) {description = aDescription;}
//    private void setCategory(String aCategory) {category = aCategory;}
//    private void setStatus(String aStatus) {status = aStatus;}

    public static MenuItem banhMi = new MenuItem("Banh Mi", 8.99, "Pork, Chicken, Tofu, or Mushroom on a Toasted Vietnamese Baguette topped with our truck made pickled carrots & daikon, cucumbers, cilantro, jalapenos, and our addicting roasted garlic Sriracha mayo", "Main Course", "New");
    public static MenuItem kickinChicken = new MenuItem("Kicken Chicken", 8.99, "chicken carnitas, queso fresco, Korean bbq sauce, cucumber, pickled onions, radish, candied jalapeños, sriracha crema", "Main Course", "Old");
    public static MenuItem freshOffTheBoat = new MenuItem("Fresh off the Boat", 9.99, "blue crab cakes, sesame slaw, cucumber, spicy mayo, sesame seeds, pickled onions", "Main Course", "New");

    public static MenuItem kimchiFries = new MenuItem("Kimchi Fries", 5.99, "your choice of protein, caramelized kimchi, cheddar + monterey jack, onions, cilantro, magic sauce, sesame seeds, sriracha on a crispy bed of french fries", "Appetizer", "Old");
    public static MenuItem patatasBravas = new MenuItem("Patatas Bravas", 3.99, "potatoes, kimchi, green onions, cilantro, spicy mayo — ++ short ribs $2.00, pork $2.00, egg $1.50", "Appetizer", "New");

    public static MenuItem blackWalnutPie = new MenuItem("Black Walnut Pie (Slice)", 2.99, "Decadent, chocolatey, and oh-so-tasty. Grandmothers Texas sheet cake combines rich, chocolate sheet cake with fudgy chocolate-nut icing", "Dessert", "Old");

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
            if (item.category == "Appetizer" && item.status == "New") {
                System.out.println(item.name + " — $" + item.price + " *NEW*");
                System.out.println(" ... " + item.description);
            }
            else if (item.category == "Appetizer" && item.status == "Old")
            {
                System.out.println(item.name + " — $" + item.price);
                System.out.println(" ... " + item.description);
            }
        }

        System.out.println("\n***Main Courses***");
        for (MenuItem item : menu) {
            if (item.category == "Main Course" && item.status == "New") {
                System.out.println(item.name + " — $" + item.price + " *NEW*");
                System.out.println(" ... " + item.description);
            }
            else if (item.category == "Main Course" && item.status == "Old")
            {
                System.out.println(item.name + " — $" + item.price);
                System.out.println(" ... " + item.description);
            }
        }

        System.out.println("\n***Desserts***");
        for (MenuItem item : menu) {
            if (item.category == "Dessert" && item.status == "New") {
                System.out.println(item.name + " — $" + item.price + " *NEW*");
                System.out.println(" ... " + item.description);
            }
            else if (item.category == "Dessert" && item.status == "Old")
            {
                System.out.println(item.name + " — $" + item.price);
                System.out.println(" ... " + item.description);
            }
        }

        System.out.println();
        File file = new File("../RestaurantMenu/src/restaurant/MenuItem.java");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Menu last updated : " + sdf.format(file.lastModified()));
    }
}
