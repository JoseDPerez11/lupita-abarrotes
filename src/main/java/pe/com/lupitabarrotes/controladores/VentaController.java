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
import pe.com.lupitabarrotes.entidades.Venta;
import pe.com.lupitabarrotes.services.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
    
    @Autowired
    private VentaService ventaServicio;
    
    @GetMapping
    public List<Venta> findAll() {
        return ventaServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Venta> findAllCustom() {
        return ventaServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Venta> findById(@PathVariable Integer id) {
        return ventaServicio.findById(id);
    }
    
    @PostMapping
    public Venta add(@RequestBody Venta venta) {
        return ventaServicio.add(venta);
    }
    
    @PutMapping("/{id}")
    public Venta update(@PathVariable Integer id, @RequestBody Venta venta) {
        venta.setIdVenta(id);
        return ventaServicio.update(venta);
    }
    
    @DeleteMapping("/{id}")
    public Venta update(@PathVariable Integer id) {
        Venta objventa = new Venta();
        objventa.setEstadoven(false);
        return ventaServicio.delete(Venta.builder().idVenta(id).build());
    }
    
}
