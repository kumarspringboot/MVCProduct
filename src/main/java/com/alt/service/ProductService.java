package com.alt.service;

import com.alt.dto.ProductDTO;

import java.util.List;

public interface ProductService {

    public ProductDTO registerProduct(ProductDTO product);

    public ProductDTO updateProduct(ProductDTO product);
    public ProductDTO fetchProductById(int id);
    public List<ProductDTO> fetchAllProductBy();
    public void deleteProduct();
}
