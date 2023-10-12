import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatExceptionOfType;

public class CustomerTest {


    Customer customer;


    @BeforeEach
    public void setUp() {
        customer = new Customer("John");

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


//    @Test
//    public void addArtworkToCollection(){
//
//
//    }
}


