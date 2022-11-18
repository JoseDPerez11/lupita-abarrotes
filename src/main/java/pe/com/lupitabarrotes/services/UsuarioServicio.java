
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import pe.com.lupitabarrotes.entidades.Usuario;


public interface UsuarioServicio {
    
    public List<Usuario> findAll();
    
    public List<Usuario> findAllCustom();
    
    public Optional<Usuario> findById(Integer id);
    
    public Usuario add(Usuario usuario);
    
    public Usuario update(Usuario usuario);
    
    public Usuario delete(Usuario usuario);
}
