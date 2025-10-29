import com.example.applications.ProductApplication;
import com.example.services.ProductService;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class ProductApplicationTest {

    @InjectMocks
    ProductApplication productApplication;

    @Mock
    ProductService productService;
}
