package api;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductService {
    @GET("products")
    Call<ResponseBody> getProduct();

    @DELETE("products/{id}")
    Call<ResponseBody> deleteProduct(@Path("id") int id);


}
