package ch.noser.uek223.domain.product;

import ch.noser.uek223.domain.product.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductWeb{

    private final ProductService productService;
    private final ProductMapper productMapper;

    @Autowired
    public ProductWeb(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping("/")
    public ResponseEntity<List<Product>> findAll(@RequestParam("archived") Optional<Boolean> archived, @RequestParam("outOfStock") Optional<Boolean> showOutOfStock) {
        return ResponseEntity.ok().body(productService.findAll(archived, showOutOfStock));
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDTO>findById(@PathVariable("productId") String id) {
        return ResponseEntity.ok().body(productMapper.productToProductDTOAdmin(productService.findById(id).get()));
    }

    @PostMapping("/")
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return ResponseEntity.ok().body(productService.save(product));
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Product> update(@PathVariable("productId") String id,
                                          @RequestBody Product product) {
        return ResponseEntity.ok().body(productService.update(id, product));
    }

    @GetMapping("/{lowerBound}/{upperBound}")
    public ResponseEntity<List<Product>> findAllBetween(@PathVariable("lowerBound") double lowerBound, @PathVariable("upperBound") double upperBound, @RequestParam("archived") Optional<Boolean> archived, @RequestParam("outOfStock") Optional<Boolean> showOutOfStock) {
        return ResponseEntity.ok().body(productService.findAllBetweenPrice(lowerBound, upperBound
                , archived, showOutOfStock));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Product> archiveById(@PathVariable("productId") String id) {
        return ResponseEntity.ok().body(productService.archiveById(id));
    }
}
