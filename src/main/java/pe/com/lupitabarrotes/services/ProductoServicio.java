
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import pe.com.lupitabarrotes.entidades.Producto;


public interface ProductoServicio {
    
    public List<Producto> findAll();
    
    public List<Producto> findAllCustom();
    
    public Optional<Producto> findById(Integer id);
    
    public Producto add(Producto producto);
    
    public Producto update(Producto producto);
    
    public Producto delete(Producto producto);
}
