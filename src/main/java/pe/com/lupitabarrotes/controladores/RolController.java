
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
import pe.com.lupitabarrotes.entidades.Rol;
import pe.com.lupitabarrotes.services.RolServicio;



@RestController
@RequestMapping("/rol")
public class RolController {
    
    @Autowired
    private RolServicio rolServicio;
    
    @GetMapping
    public List<Rol> findAll() {
        return rolServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Rol> findAllCustom() {
        return rolServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Rol> findById(@PathVariable Integer id) {
        return rolServicio.findById(id);
    }
    
    @PostMapping
    public Rol add(@RequestBody Rol rol) {
        return rolServicio.add(rol);
    }
    
    @PutMapping("/{id}")
    public Rol update(@PathVariable Integer id, @RequestBody Rol rol) {
        rol.setIdRol(id);
        return rolServicio.update(rol);
    }
    
    @DeleteMapping("/{id}")
    public Rol update(@PathVariable Integer id) {
        Rol objRol = new Rol();
        objRol.setEstadorol(false);
        return rolServicio.delete(Rol.builder().idRol(id).build());
    }
}
