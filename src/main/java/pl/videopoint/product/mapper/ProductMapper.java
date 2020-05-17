package pl.videopoint.product.mapper;

import pl.videopoint.product.dto.ProductDto;
import pl.videopoint.product.model.Product;

import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto map(Product product);

    Set<ProductDto> map(Set<Product> products);
}
