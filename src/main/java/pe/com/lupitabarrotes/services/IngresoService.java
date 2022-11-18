
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import pe.com.lupitabarrotes.entidades.Ingreso;

public interface IngresoService {
    
    public List<Ingreso> findAll();
    
    public List<Ingreso> findAllCustom();
    
    public Optional<Ingreso> findById(Integer id);
    
    public Ingreso add(Ingreso ingreso);
    
    public Ingreso update(Ingreso ingreso);
    
    public Ingreso delete(Ingreso ingreso);
    
}
