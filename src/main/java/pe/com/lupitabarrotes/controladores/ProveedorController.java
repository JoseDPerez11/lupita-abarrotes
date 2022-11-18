
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
import pe.com.lupitabarrotes.entidades.Proveedor;
import pe.com.lupitabarrotes.services.ProveedorServicio;


@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
    @Autowired
    private ProveedorServicio proveedorServicio;
    
    @GetMapping
    public List<Proveedor> findAll() {
        return proveedorServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Proveedor> findAllCustom() {
        return proveedorServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Proveedor> findById(@PathVariable Integer id) {
        return proveedorServicio.findById(id);
    }
    
    @PostMapping
    public Proveedor add(@RequestBody Proveedor proveedor) {
        return proveedorServicio.add(proveedor);
    }
    
    @PutMapping("/{id}")
    public Proveedor update(@PathVariable Integer id, @RequestBody Proveedor proveedor) {
        proveedor.setIdProveedor(id);
        return proveedorServicio.update(proveedor);
    }
    
    @DeleteMapping("/{id}")
    public Proveedor update(@PathVariable Integer id) {
        Proveedor objproveedor = new Proveedor();
        objproveedor.setEstadoprov("Inhabilitado");
        return proveedorServicio.delete(Proveedor.builder().idProveedor(id).build());
    }
}
