
package pe.com.lupitabarrotes.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lupitabarrotes.entidades.Usuario;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
    
    @Query("select u from Usuario u where u.estadouser=1")
    List<Usuario> findAllCustom(); 
}
