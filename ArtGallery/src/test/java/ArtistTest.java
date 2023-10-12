import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {

    Artist artist;

    @BeforeEach

    public void setUp(){
       artist = new Artist("Leonardo Da Vinci");

    }



    @Test

    public void getName(){
        assertThat(artist.getName()).isEqualTo("Leonardo Da Vinci");
    }

    @Test
    public void setName(){
        artist.setName("Nathan");
        assertThat(artist.getName()).isEqualTo("Nathan");

    }

}

