import api.ProductService;
import okhttp3.ResponseBody;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import utils.RetrofitUtils;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProductServiceTest {

    static ProductService productService;

    @BeforeAll
    static void BeforeAll() {
        productService = RetrofitUtils.getRetrofit().create(ProductService.class);
    }

    @Test
    void getProductTest() {
        try {
            Response<ResponseBody> response= productService.getProduct().execute();

            assertThat(response.isSuccessful(), equalTo(true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}