package pe.com.lupitabarrotes.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.lupitabarrotes.entidades.Proveedor;

public interface ProveedorRepositorio extends JpaRepository<Proveedor, Integer>{

	@Query("select p from Proveedor p where p.estado='registrado'")
    List<Proveedor> findAllCustom();
}
