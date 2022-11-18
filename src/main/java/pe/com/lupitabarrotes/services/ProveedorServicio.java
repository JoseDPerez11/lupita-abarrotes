package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;

import pe.com.lupitabarrotes.entidades.Proveedor;

public interface ProveedorServicio {
	
	public List<Proveedor> findAll();
    
    public List<Proveedor> findAllCustom();
    
    public Optional<Proveedor> findById(Integer id);
    
    public Proveedor add(Proveedor proveedor);
    
    public Proveedor update(Proveedor proveedor);
    
    public Proveedor delete(Proveedor proveedor);
	
}
