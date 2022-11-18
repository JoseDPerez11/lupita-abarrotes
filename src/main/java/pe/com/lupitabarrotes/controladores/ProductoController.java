
package pe.com.lupitabarrotes.controladores;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.lupitabarrotes.entidades.Producto;
import pe.com.lupitabarrotes.services.ProductoServicio;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoServicio productoServicio;
    
    @GetMapping
    public List<Producto> findAll() {
        return productoServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Producto> findAllCustom() {
        return productoServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Integer id) {
        return productoServicio.findById(id);
    }
    
    @PostMapping
    public Producto add(@RequestBody Producto producto) {
        return productoServicio.add(producto);
    }
    
    @PutMapping("/{id}")
    public Producto update(@PathVariable Integer id, @RequestBody Producto producto) {
        producto.setIdProducto(id);
        return productoServicio.update(producto);
    }
    
    @DeleteMapping("/{id}")
    public Producto update(@PathVariable Integer id) {
        Producto objProducto = new Producto();
        objProducto.setEstadopro(false);
        return productoServicio.delete(Producto.builder().idProducto(id).build());
    }
}
