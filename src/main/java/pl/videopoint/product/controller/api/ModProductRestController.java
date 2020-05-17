package pl.videopoint.product.controller.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.videopoint.product.dto.AdminProductDto;
import pl.videopoint.product.dto.ModProductDto;
import pl.videopoint.product.mapper.ModProductMapper;
import pl.videopoint.product.service.ProductService;

import java.util.Set;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/secured/mod/product")
@RequiredArgsConstructor
public class ModProductRestController {

    private final ProductService productService;

    private final ModProductMapper productMapper;

    @GetMapping
    public Set<ModProductDto> findAll() {
        return productMapper.map(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ModProductDto modProductDto) {
        productService.create(productMapper.map(modProductDto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
