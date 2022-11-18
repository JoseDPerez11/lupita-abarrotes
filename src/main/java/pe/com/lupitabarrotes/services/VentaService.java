package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import pe.com.lupitabarrotes.entidades.Venta;

public interface VentaService {
    
    public List<Venta> findAll();
    
    public List<Venta> findAllCustom();
    
    public Optional<Venta> findById(Integer id);
    
    public Venta add(Venta venta);
    
    public Venta update(Venta venta);
    
    public Venta delete(Venta venta);
}
