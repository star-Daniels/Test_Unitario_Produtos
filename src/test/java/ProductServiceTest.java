import com.example.applications.ProductApplication;
import com.example.entities.Product;
import com.example.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    Product product;
    @InjectMocks
    ProductApplication productApplication;

    @Mock
    ProductService productService;





    @Test
    public void deveAdicionarUmaImagem(){


        product = new Product(1, "kit-talher", 6, "C:\\Users\\danie\\Downloads\\talher.jpg");
        productApplication.append(product);
        Mockito.verify(productService,Mockito.times(1)).save(product);




    }

    @Test
    public void deveRemoverAImagem(){

        product = new Product(1, "kit-talher", 6, "C:\\Users\\danie\\Downloads\\talher.jpg");
        productApplication.append(product);

        productApplication.remove(product.getId());

        Mockito.verify(productService,Mockito.times(1)).remove(product.getId());




    }

    @Test
    public void deveAtualizarAImagem(){

        product = new Product(1, "kit-talher", 6, "C:\\Users\\danie\\Downloads\\talher.jpg");
        productApplication.append(product);
        productApplication.update(2, product);

        Mockito.verify(productService, Mockito.times(1)).update(product);

    }
}
