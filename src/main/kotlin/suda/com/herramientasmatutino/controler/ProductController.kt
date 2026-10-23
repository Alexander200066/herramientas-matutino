import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import suda.com.herramientasmatutino.service.ProductService

@Controller
open class ProductController {

    @Autowired
    lateinit var productService: ProductService

    @GetMapping(value = "/hola")
    open fun saludo(): String {
        return "Hola mundo"
    }

    @GetMapping(value = "/adios")
    open fun despedida(): String {
        return "Adios mundo"
    }

    @GetMapping(value = "/saludoService")
    open fun saludoService(): String {
        return this.productService.saludoService()
    }
}