
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
import pe.com.lupitabarrotes.entidades.Usuario;
import pe.com.lupitabarrotes.services.UsuarioServicio;


@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping
    public List<Usuario> findAll() {
        return usuarioServicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Usuario> findAllCustom() {
        return usuarioServicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Usuario> findById(@PathVariable Integer id) {
        return usuarioServicio.findById(id);
    }
    
    @PostMapping
    public Usuario add(@RequestBody Usuario usuario) {
        return usuarioServicio.add(usuario);
    }
    
    @PutMapping("/{id}")
    public Usuario update(@PathVariable Integer id, @RequestBody Usuario usuario) {
        usuario.setIdUsuario(id);
        return usuarioServicio.update(usuario);
    }
    
    @DeleteMapping("/{id}")
    public Usuario update(@PathVariable Integer id) {
        Usuario objProducto = new Usuario();
        objProducto.setEstadouser(false);
        return usuarioServicio.delete(Usuario.builder().idUsuario(id).build());
    }
}
