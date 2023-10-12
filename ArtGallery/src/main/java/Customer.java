import java.util.ArrayList;

public class Customer {
    
    private String name;
    private double wallet;
    private ArrayList artworkCollection;
    
    
    public Customer(String name){
        this.name = name;
        this.wallet = 100;
        this.artworkCollection = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }


    public void addArtworkToCollection(Gallery gallery, Artwork artwork){
        this.artworkCollection.add(artwork);
        gallery.removeStock(artwork);
    }



    public void buyArtwork(Gallery gallery, Artwork artwork){
        if (this.wallet - artwork.getPrice() > 0){
            this.addArtworkToCollection(gallery, artwork);
            this.wallet -= artwork.getPrice();
            gallery.addMoneyToTill(artwork);
        }
    }

    public int countArtworkCollection(){
        return this.artworkCollection.size();
    }

    public ArrayList getArtworkCollection() {
        return this.artworkCollection;
    }




}
