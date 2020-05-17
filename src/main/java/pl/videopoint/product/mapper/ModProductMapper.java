package pl.videopoint.product.mapper;

import pl.videopoint.product.dto.ModProductDto;
import pl.videopoint.product.model.Product;

import org.mapstruct.Mapper;

import java.util.Set;

@Mapper(componentModel = "spring")
public interface ModProductMapper {

    ModProductDto map(Product product);
	
	Product map(ModProductDto modProductDto);

    Set<ModProductDto> map(Set<Product> products);
}
