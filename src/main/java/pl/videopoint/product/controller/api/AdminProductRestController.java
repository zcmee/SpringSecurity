package pl.videopoint.product.controller.api;

import pl.videopoint.product.dto.AdminProductDto;
import pl.videopoint.product.mapper.AdminProductMapper;
import pl.videopoint.product.service.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/secured/admin/product")
@RequiredArgsConstructor
public class AdminProductRestController {

    private final ProductService productService;

    private final AdminProductMapper productMapper;

    @GetMapping
    public Set<AdminProductDto> findAll() {
        return productMapper.map(productService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody AdminProductDto adminProductDto) {
        productService.create(productMapper.map(adminProductDto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        productService.delete(id);
    }
}
