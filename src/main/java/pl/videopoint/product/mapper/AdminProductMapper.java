package pl.videopoint.product.mapper;

import pl.videopoint.product.dto.AdminProductDto;
import pl.videopoint.product.model.Product;

import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface AdminProductMapper {

    AdminProductDto map(Product product);

    Product map(AdminProductDto adminProductDto);

    Set<AdminProductDto> map(Set<Product> products);
}
