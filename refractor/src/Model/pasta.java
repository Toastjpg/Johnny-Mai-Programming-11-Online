package Model;

public class Pasta extends Items {
    boolean isDelux;

    public Pasta(String name, double price, boolean delux){
        super(name, price);
        isDelux = delux;
    }
//Adds $2 to price if it is delux
    @Override
    public double getHowMuch() {
        if (isDelux){
            return getPrice() + 2;
        }
        else{
            return getPrice();
        }
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " Price: " +  getPrice();
    }
}
