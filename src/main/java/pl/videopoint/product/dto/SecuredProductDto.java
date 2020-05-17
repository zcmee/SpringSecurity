package pl.videopoint.product.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SecuredProductDto {

    private String name;

    private String code;

    private double price;
}
