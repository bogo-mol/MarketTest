import api.CategoryService;
import dto.GetCategoryResponse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import utils.RetrofitUtils;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CategoryServiceTest {
    static CategoryService categoryService;

    @BeforeAll
    static void beforeAll() {
        categoryService = RetrofitUtils.getRetrofit().create(CategoryService.class);
    }

    @Test
    void getCategoriesTest() {
        try {
            Response<GetCategoryResponse> response = categoryService.getCategory(2).execute();

            assertThat(response.isSuccessful(), equalTo(true));
            assertThat(response.body().getId(), equalTo(2));
            assertThat(response.body().getTitle(), equalTo("Electronic"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}