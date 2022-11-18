
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import pe.com.lupitabarrotes.entidades.Categoria;


public interface CategoriaServicio {
    
    public List<Categoria> findAll();
    
    public List<Categoria> findAllCustom();
    
    public Optional<Categoria> findById(Integer id);
    
    public Categoria add(Categoria categoria);
    
    public Categoria update(Categoria categoria);
    
    public Categoria delete(Categoria categoria);
}
