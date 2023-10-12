import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class ArtworkTest {

    Artwork artwork;
    Artist artist;

    @BeforeEach
    public void setUp(){


        artist = new Artist("Leonardo Da Vinci");
        artwork = new Artwork("Mona Lisa", artist.getName(), 50);

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
        assertThat(artwork.getArtist()).isEqualTo("Leonardo Da Vinci");
    }

    public void setArtist() {
        artwork.setArtist("Nathan");
        assertThat(artwork.getArtist()).isEqualTo("Nathan");
        }
            }
