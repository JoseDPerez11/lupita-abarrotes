package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;


import pe.com.lupitabarrotes.entidades.Cliente;

public interface ClienteServicio {

    public List<Cliente> findAll();
    
    public List<Cliente> findAllCustom();
    
    public Optional<Cliente> findById(Integer id);
    
    public Cliente add(Cliente cliente);
    
    public Cliente update(Cliente cliente);
    
    public Cliente delete(Cliente cliente);
}
