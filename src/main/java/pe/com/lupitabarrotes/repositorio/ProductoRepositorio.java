
package pe.com.lupitabarrotes.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lupitabarrotes.entidades.Cliente;
import pe.com.lupitabarrotes.entidades.Producto;


public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
    
    @Query("select p from Producto p where p.estadopro=1")
    List<Producto> findAllCustom();
}
