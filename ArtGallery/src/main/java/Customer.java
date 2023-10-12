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
        this.artworkCollection.add(gallery.getStock().clone());


        System.out.println(this.artworkCollection.contains(artwork));

        //gallery.removeStock(artwork);

    }

    public int countArtworkCollection(){
        return this.artworkCollection.size();
    }

    public ArrayList getArtworkCollection() {
        return this.artworkCollection;
    }

    public void setArtworkCollection(ArrayList artworkCollection) {
        this.artworkCollection = artworkCollection;
    }

    //    public void buyArtwork(Gallery gallery, Artwork artwork){
//        if (this.wallet - artwork.getPrice() > 0){
//
//        }
//    }
}
