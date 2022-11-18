
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import pe.com.lupitabarrotes.entidades.Rol;


public interface RolServicio {
    
    public List<Rol> findAll();
    
    public List<Rol> findAllCustom();
    
    public Optional<Rol> findById(Integer id);
    
    public Rol add(Rol rol);
    
    public Rol update(Rol rol);
    
    public Rol delete(Rol rol);
}
