package pl.videopoint.product.controller.mvc;

import pl.videopoint.product.mapper.AdminProductMapper;
import pl.videopoint.product.service.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/secured/admin/product")
@RequiredArgsConstructor
public class AdminProductMVCController {

    private final ProductService productService;

    private final AdminProductMapper productMapper;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("products", productMapper.map(productService.findAll()));

        return "admin-list";
    }
}
