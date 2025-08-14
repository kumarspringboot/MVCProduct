package com.alt.serviceImpl;

import com.alt.dto.ProductDTO;
import com.alt.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public ProductDTO registerProduct(ProductDTO product) {
        return null;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO product) {
        return null;
    }

    @Override
    public ProductDTO fetchProductById(int id) {
        return null;
    }

    @Override
    public List<ProductDTO> fetchAllProductBy() {
        return List.of();
    }

    @Override
    public void deleteProduct() {

    }
}
