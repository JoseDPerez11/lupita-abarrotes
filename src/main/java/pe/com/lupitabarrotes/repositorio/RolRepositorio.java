
package pe.com.lupitabarrotes.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lupitabarrotes.entidades.Rol;


public interface RolRepositorio extends JpaRepository<Rol, Integer> {
    @Query("select r from Rol r where r.estadorol=1")
    List<Rol> findAllCustom();
}
