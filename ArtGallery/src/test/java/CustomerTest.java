import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CustomerTest {


    Customer customer;
    Artwork artwork;
    Artwork artwork2;
    Artist artist;
    Artist artist2;
    Gallery gallery;


    @BeforeEach
    public void setUp() {
        customer = new Customer("John");

        artist = new Artist("Leonardo Da Vinci");
        artwork = new Artwork("Mona Lisa", artist, 50);
        gallery = new Gallery("Tate Modern", 1000);

        artist2 = new Artist("Picasso");
        artwork2 = new Artwork("Guernica", artist2, 100);

        gallery.addStock(artwork);
        gallery.addStock(artwork2);

    }



    @Test
    public void getName() {
        assertThat(customer.getName()).isEqualTo("John");
    }

    @Test
    public void setName() {
        customer.setName("Tom");
        assertThat(customer.getName()).isEqualTo("Tom");
    }


    @Test
    public void getWallet() {
        assertThat(customer.getWallet()).isEqualTo(100);
    }


    @Test
    public void setWallet(){
        customer.setWallet(50);
        assertThat(customer.getWallet()).isEqualTo(50);
    }

    @Test
    public  void countArtworkCollection(){
        assertThat(customer.countArtworkCollection()).isEqualTo(0);
    }

    @Test
    public void getArtworkCollection(){
        assertThat(customer.getArtworkCollection().size()).isEqualTo(customer.countArtworkCollection());
    }

    @Test
    public void addArtworkToCollection(){
        customer.addArtworkToCollection(gallery, artwork);
        assertThat(customer.countArtworkCollection()).isEqualTo(1);
        assertThat(gallery.countStock()).isEqualTo(1);
    }

    @Test
    public void buyArtWork(){
        customer.buyArtwork(gallery, artwork);
        assertThat(customer.countArtworkCollection()).isEqualTo(1);
        assertThat(gallery.countStock()).isEqualTo(1);
        assertThat(customer.getWallet()).isEqualTo(50);
        assertThat(gallery.getTill()).isEqualTo(1050);

    }

//    @Test
//    public void addArtworkToCollection(){
//
//
//    }
}


