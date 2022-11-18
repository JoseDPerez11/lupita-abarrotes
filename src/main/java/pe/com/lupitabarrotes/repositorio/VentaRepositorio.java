package pe.com.lupitabarrotes.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lupitabarrotes.entidades.Venta;

public interface VentaRepositorio extends JpaRepository<Venta, Integer>{
    
    @Query("select v from Venta v where v.estadoven='1'")
    List<Venta> findAllCustom();
    
}
