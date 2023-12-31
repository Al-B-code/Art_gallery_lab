import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GalleryTest {
    Artwork artwork;
    Artwork artwork2;
    Artist artist;
    Artist artist2;
    Gallery gallery;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Leonardo Da Vinci");
        artwork = new Artwork("Mona Lisa", artist, 50);
        gallery = new Gallery("Tate Modern", 1000);

        artist2 = new Artist("Picasso");
        artwork2 = new Artwork("Guernica", artist2, 100);

        gallery.addStock(artwork);
        gallery.addStock(artwork2);
    }

    @Test
    public void getName(){
        assertThat(gallery.getName()).isEqualTo("Tate Modern");
    }
    @Test
    public void setName(){
        gallery.setName("Louvre");
        assertThat(gallery.getName()).isEqualTo("Louvre");
    }

    @Test
    public void getTill(){
        assertThat(gallery.getTill()).isEqualTo(1000);
    }

    @Test
    public void setTill(){
        gallery.setTill(500);
        assertThat(gallery.getTill()).isEqualTo(500);
    }

    @Test
    public void countStock(){
        assertThat(gallery.countStock()).isEqualTo(2);
    }
    @Test
    public void getStock(){
        assertThat(gallery.getStock().size()).isEqualTo(gallery.countStock());
    }
    @Test
    public void addStock(){
        Artwork artwork3 = new Artwork("La Vie", artist2, 70);
        gallery.addStock(artwork3);
        assertThat(gallery.countStock()).isEqualTo(3);
    }
    @Test
    public void removeStock(){
        gallery.removeStock(artwork);
        assertThat(gallery.countStock()).isEqualTo(1);
    }

    @Test
    public void addMoneyToTill(){
        gallery.addMoneyToTill(artwork);
        assertThat(gallery.getTill()).isEqualTo(1050);
    }

    @Test
    public void stockTake(){
        assertThat(gallery.stockTake()).isEqualTo(150);
    }



}
