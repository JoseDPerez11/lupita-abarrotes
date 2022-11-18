
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
import pe.com.lupitabarrotes.entidades.Cliente;
import pe.com.lupitabarrotes.services.ClienteServicio;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServicio clienteServicio;
    
    @GetMapping
    public List<Cliente> findAll() {
        return clienteServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Cliente> findAllCustom() {
        return clienteServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Integer id) {
        return clienteServicio.findById(id);
    }
    
    @PostMapping
    public Cliente add(@RequestBody Cliente cliente) {
        return clienteServicio.add(cliente);
    }
    
    @PutMapping("/{id}")
    public Cliente update(@PathVariable Integer id, @RequestBody Cliente cliente) {
        cliente.setIdCliente(id);
        return clienteServicio.update(cliente);
    }
    
    @DeleteMapping("/{id}")
    public Cliente update(@PathVariable Integer id) {
        Cliente objcliente = new Cliente();
        objcliente.setEstadocli(false);
        return clienteServicio.delete(Cliente.builder().idCliente(id).build());
    }
}
