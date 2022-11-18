
package pe.com.lupitabarrotes.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.lupitabarrotes.entidades.DetalleIngreso;
import pe.com.lupitabarrotes.services.DetalleIngresoServicio;

@RestController
@RequestMapping("/detalleingreso")
public class DetalleIngresoController {
    
    @Autowired
    private DetalleIngresoServicio detalleIngresoServicio;
    
    @GetMapping
    public List<DetalleIngreso> findAll() {
        return detalleIngresoServicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<DetalleIngreso> findById(@PathVariable Integer id) {
        return detalleIngresoServicio.findById(id);
    }
    
    @PostMapping
    public DetalleIngreso add(@RequestBody DetalleIngreso detalleIngreso) {
        return detalleIngresoServicio.add(detalleIngreso);
    }
    
    @PutMapping("/{id}")
    public DetalleIngreso update(@PathVariable Integer id, @RequestBody DetalleIngreso detalleIngreso) {
        detalleIngreso.setIdDetalleingreso(id);
        return detalleIngresoServicio.update(detalleIngreso);
    }
    
}
