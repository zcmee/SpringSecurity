package pl.videopoint.product.controller.api;

import pl.videopoint.product.dto.SecuredProductDto;
import pl.videopoint.product.mapper.SecuredProductMapper;
import pl.videopoint.product.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/secured/product")
@RequiredArgsConstructor
public class SecuredProductRestController {

    private final ProductService productService;

    private final SecuredProductMapper productMapper;

    @GetMapping
    public Set<SecuredProductDto> findAll() {
        return productMapper.map(productService.findAll());
    }
}
