
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.Categoria;
import pe.com.lupitabarrotes.repositorio.CategoriaRepositorio;


@Service
public class CategoriaServicioImpl implements CategoriaServicio{
    
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return categoriaRepositorio.findAllCustom();
    }

    @Override
    public Optional<Categoria> findById(Integer id) {
        return categoriaRepositorio.findById(id);
    }

    @Override
    public Categoria add(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

    @Override
    public Categoria update(Categoria categoria) {
        Categoria objCategoria = categoriaRepositorio.getById(categoria.getIdCategoria());
        BeanUtils.copyProperties(categoria, objCategoria);
        return categoriaRepositorio.save(objCategoria);
    }

    @Override
    public Categoria delete(Categoria cliente) {
        Categoria objCliente = categoriaRepositorio.getById(cliente.getIdCategoria());
        objCliente.setEstadocat(false);
        return categoriaRepositorio.save(objCliente);
    }
}
