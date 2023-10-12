import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class ArtworkTest {

    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){


        artist = new Artist("Leonardo Da Vinci");
        artwork = new Artwork("Mona Lisa", artist, 50);

    }

    @Test
    public void getTitle(){
        assertThat(artwork.getTitle()).isEqualTo("Mona Lisa");
    }

    @Test
    public void setTitle(){
        artwork.setTitle("Starry Night");
        assertThat(artwork.getTitle()).isEqualTo("Starry Night");
    }

    @Test
    public void getArtist(){
        assertThat(artwork.getArtist()).isEqualTo(artist);
    }
    @Test
    public void setArtist() {
        Artist artist1 = new Artist("Vincent Van Gogh");

        artwork.setArtist(artist1);
        assertThat(artwork.getArtist().getName()).isEqualTo("Vincent Van Gogh");
        }
            }
