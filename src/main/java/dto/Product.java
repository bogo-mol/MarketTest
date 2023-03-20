package dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Product {

    @JsonProperty
    private Integer id;

    @JsonProperty
    private String title;

    @JsonProperty
    private Integer price;

    @JsonProperty
    private String categoryTitle;
}
