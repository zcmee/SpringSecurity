package pl.videopoint.product.mapper;

import pl.videopoint.product.dto.SecuredProductDto;
import pl.videopoint.product.model.Product;

import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface SecuredProductMapper {

    SecuredProductDto map(Product product);

    Set<SecuredProductDto> map(Set<Product> products);
}
