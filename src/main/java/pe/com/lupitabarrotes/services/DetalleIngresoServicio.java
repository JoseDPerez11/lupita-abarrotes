
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;

import pe.com.lupitabarrotes.entidades.DetalleIngreso;


public interface DetalleIngresoServicio {
    
    public List<DetalleIngreso> findAll();
    
    public Optional<DetalleIngreso> findById(Integer id);
    
    public DetalleIngreso add(DetalleIngreso di);
    
    public DetalleIngreso update(DetalleIngreso di);
    
}
