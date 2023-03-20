package api;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ProductService {
    @GET("products")
    Call<ResponseBody> getProduct();
}
