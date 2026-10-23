
package suda.com.herramientasmatutino.service

import org.springframework.stereotype.Service
import suda.com.herramientasmatutino.model.Product
import suda.com.herramientasmatutino.repository.ProductRepository

@Service
class ProductService(
    private val productRepository: ProductRepository
) {
    fun getAllProducts(): List<Product> =
        productRepository.findAll()

    fun getProductById(id: Long): Product? =
        productRepository.findById(id).orElse(null)

    fun createProduct(product: Product): Product =
        productRepository.save(product)

    fun updateProduct(id: Long, product: Product): Product? {
        if (!productRepository.existsById(id)) return null

        return productRepository.save(product.copy(id = id))
    }

    fun deleteProduct(id: Long): Boolean {
        if (!productRepository.existsById(id)) return false

        productRepository.deleteById(id)
        return true
    }
}
