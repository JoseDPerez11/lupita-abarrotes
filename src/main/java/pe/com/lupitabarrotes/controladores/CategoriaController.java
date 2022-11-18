
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
import pe.com.lupitabarrotes.entidades.Categoria;
import pe.com.lupitabarrotes.services.CategoriaServicio;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaServicio categoriaServicio;
    
    @GetMapping
    public List<Categoria> findAll() {
        return categoriaServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Categoria> findAllCustom() {
        return categoriaServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Integer id) {
        return categoriaServicio.findById(id);
    }
    
    @PostMapping
    public Categoria add(@RequestBody Categoria categoria) {
        return categoriaServicio.add(categoria);
    }
    
    @PutMapping("/{id}")
    public Categoria update(@PathVariable Integer id, @RequestBody Categoria categoria) {
        categoria.setIdCategoria(id);
        return categoriaServicio.update(categoria);
    }
    
    @DeleteMapping("/{id}")
    public Categoria update(@PathVariable Integer id) {
        Categoria objCategoria = new Categoria();
        objCategoria.setEstadocat(false);
        return categoriaServicio.delete(Categoria.builder().idCategoria(id).build());
    }
}
