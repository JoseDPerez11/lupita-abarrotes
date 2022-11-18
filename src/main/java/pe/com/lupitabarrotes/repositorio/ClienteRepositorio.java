package pe.com.lupitabarrotes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.lupitabarrotes.entidades.Cliente;


public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{

    @Query("select c from Cliente c where c.estadocli=1")
    List<Cliente> findAllCustom(); 

}
