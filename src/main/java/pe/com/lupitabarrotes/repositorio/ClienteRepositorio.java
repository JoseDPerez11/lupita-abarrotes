package pe.com.lupitabarrotes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.lupitabarrotes.entidades.Cliente;


public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{

	@Query("select p from Cliente p where p.estado=1")
    List<Cliente> findAllCustom(); 

}
