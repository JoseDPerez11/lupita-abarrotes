
package pe.com.lupitabarrotes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.lupitabarrotes.entidades.DetalleVenta;


public interface DetalleVentaRepositorio extends JpaRepository<DetalleVenta, Integer> {
    
}
