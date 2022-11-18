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
import pe.com.lupitabarrotes.entidades.Ingreso;
import pe.com.lupitabarrotes.services.IngresoService;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {
    
    @Autowired
    private IngresoService ingresoServicio;
    
    @GetMapping
    public List<Ingreso> findAll() {
        return ingresoServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Ingreso> findAllCustom() {
        return ingresoServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Ingreso> findById(@PathVariable Integer id) {
        return ingresoServicio.findById(id);
    }
    
    @PostMapping
    public Ingreso add(@RequestBody Ingreso cliente) {
        return ingresoServicio.add(cliente);
    }
    
    @PutMapping("/{id}")
    public Ingreso update(@PathVariable Integer id, @RequestBody Ingreso ingreso) {
        ingreso.setIdIngreso(id);
        return ingresoServicio.update(ingreso);
    }
    
    @DeleteMapping("/{id}")
    public Ingreso update(@PathVariable Integer id) {
        Ingreso objcliente = new Ingreso();
        objcliente.setEstadoing(false);
        return ingresoServicio.delete(Ingreso.builder().idIngreso(id).build());
    }
}
