
package pe.com.lupitabarrotes.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.lupitabarrotes.entidades.Categoria;


public interface CategoriaRepositorio extends JpaRepository<Categoria, Integer>{
    
    @Query("select c from Categoria c where c.estadocat=1")
    List<Categoria> findAllCustom();
}
