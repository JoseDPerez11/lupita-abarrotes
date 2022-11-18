
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;

import pe.com.lupitabarrotes.entidades.DetalleVenta;


public interface DetalleVentaServicio {
    
    public List<DetalleVenta> findAll();
    
    public Optional<DetalleVenta> findById(Integer id);
    
    public DetalleVenta add(DetalleVenta dv);
    
    public DetalleVenta update(DetalleVenta dv);
}
