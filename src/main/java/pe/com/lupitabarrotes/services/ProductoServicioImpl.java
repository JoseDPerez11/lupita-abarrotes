
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.Producto;
import pe.com.lupitabarrotes.repositorio.ProductoRepositorio;

@Service
public class ProductoServicioImpl implements ProductoServicio{
    
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> findAll() {
        return productoRepositorio.findAll();
    }

    @Override
    public List<Producto> findAllCustom() {
        return productoRepositorio.findAllCustom();
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return productoRepositorio.findById(id);
    }

    @Override
    public Producto add(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        Producto objProducto = productoRepositorio.getById(producto.getIdProducto());
        BeanUtils.copyProperties(producto, objProducto);
        return productoRepositorio.save(objProducto);
    }

    @Override
    public Producto delete(Producto producto) {
        Producto objProducto = productoRepositorio.getById(producto.getIdProducto());
        objProducto.setEstadopro(false);
        return productoRepositorio.save(objProducto);
    }
}
