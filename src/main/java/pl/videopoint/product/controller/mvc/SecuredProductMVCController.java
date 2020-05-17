package pl.videopoint.product.controller.mvc;

import pl.videopoint.product.mapper.SecuredProductMapper;
import pl.videopoint.product.service.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/secured/product")
@RequiredArgsConstructor
public class SecuredProductMVCController {

    private final ProductService productService;

    private final SecuredProductMapper productMapper;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("products", productMapper.map(productService.findAll()));

        return "secured-list";
    }


}
