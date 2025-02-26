enum Laptop {
    
    MACBOOK(2000),
    ALIENWARE(3000),
    THINKPAD(1500),
    TUFGAMING(750);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}


public class EnumClass {
    
    public static void main(String[] args) {

        for(Laptop item : Laptop.values()) {
            System.out.println(item + " : " + item.getPrice());
        }
        
    }
}
