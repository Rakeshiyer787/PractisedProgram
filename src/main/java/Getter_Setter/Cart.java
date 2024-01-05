package Getter_Setter;

public class Cart {
   private String itemName;
    private int price;


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Cart obj = new Cart();
        obj.setItemName("Butter");
        obj.setPrice(50);
        System.out.println("The details we have set are: ");
        System.out.println("Your product is " + obj.getItemName());
        System.out.println("Price of Product is " + obj.getPrice());
    }
}

