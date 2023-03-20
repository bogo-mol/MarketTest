package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class GetCategoryResponse {

    @JsonProperty
    private Integer id;

    @JsonProperty
    private List<Product> products = new ArrayList<>();

    @JsonProperty
    private String title;
}
