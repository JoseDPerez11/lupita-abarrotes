
package pe.com.lupitabarrotes.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lupitabarrotes.entidades.Ingreso;

public interface IngresoRepositorio  extends JpaRepository<Ingreso, Integer>{
    
    @Query("select i from Ingreso where i.estadoing='1'")
    List<Ingreso>findAllCustom();
}
