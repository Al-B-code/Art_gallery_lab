import java.util.ArrayList;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name, double till){
        this.name = name;
        this.till = till;
        this.stock = new ArrayList();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public void addMoneyToTill(Artwork artwork){
        this.till += artwork.getPrice();
    }

    public ArrayList<Artwork> getStock() {
        return this.stock;
    }

    public void addStock(Artwork stock) {
        this.stock.add(stock);
    }

    public void removeStock(Artwork stock){
        this.stock.remove(stock);
    }


    public int countStock(){
        return this.stock.size();
    }

    public double stockTake(){
        double stockTake = 0;
        for (int i = 0; i < this.stock.size() ; i++) {
            stockTake += this.getStock().get(i).getPrice();
        }
        return stockTake;
    }

}
