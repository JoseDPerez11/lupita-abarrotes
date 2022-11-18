
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
import pe.com.lupitabarrotes.entidades.DetalleVenta;
import pe.com.lupitabarrotes.services.DetalleVentaServicio;


@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaController {
    
    @Autowired
    private DetalleVentaServicio detalleVentaServicio;
    
    @GetMapping
    public List<DetalleVenta> findAll() {
        return detalleVentaServicio.findAll();
    }
    
    @GetMapping("/{id}")
    public Optional<DetalleVenta> findById(@PathVariable Integer id) {
        return detalleVentaServicio.findById(id);
    }
    
    @PostMapping
    public DetalleVenta add(@RequestBody DetalleVenta detalleIngreso) {
        return detalleVentaServicio.add(detalleIngreso);
    }
    
    @PutMapping("/{id}")
    public DetalleVenta update(@PathVariable Integer id, @RequestBody DetalleVenta detalleVenta) {
        detalleVenta.setIdDetalleventa(id);
        return detalleVentaServicio.update(detalleVenta);
    }
}
