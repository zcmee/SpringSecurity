package pl.videopoint.product.controller.api;

import pl.videopoint.product.dto.ProductDto;
import pl.videopoint.product.mapper.ProductMapper;
import pl.videopoint.product.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductRestController {

    private final ProductService productService;

    private final ProductMapper productMapper;

    @GetMapping
    public Set<ProductDto> findAll() {
        return productMapper.map(productService.findAll());
    }
}
