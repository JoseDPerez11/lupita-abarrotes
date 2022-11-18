
package pe.com.lupitabarrotes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.lupitabarrotes.entidades.DetalleIngreso;


public interface DetalleIngresoRepositorio extends JpaRepository<DetalleIngreso, Integer>{
    
}
