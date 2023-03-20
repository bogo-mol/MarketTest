package api;


import dto.Product;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface ProductService {
    @GET("products")
    Call<ResponseBody> getProduct();

    @DELETE("products/{id}")
    Call<ResponseBody> deleteProduct(@Path("id") int id);

    @POST("products")
    Call<Product> createProduct(@Body Product productRequest);
}