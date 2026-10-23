
package suda.com.herramientasmatutino.repository

import org.springframework.data.jpa.repository.JpaRepository
import suda.com.herramientasmatutino.model.Product

interface ProductRepository : JpaRepository<Product, Long>
