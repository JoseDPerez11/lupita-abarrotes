
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.lupitabarrotes.entidades.Venta;
import pe.com.lupitabarrotes.repositorio.VentaRepositorio;

public class VentaServiceImpl implements VentaService{

    @Autowired
    private VentaRepositorio ventaRepositorio;

    @Override
    public List<Venta> findAll() {
        return ventaRepositorio.findAll();
    }

    @Override
    public List<Venta> findAllCustom() {
        return ventaRepositorio.findAllCustom();
    }

    @Override
    public Optional<Venta> findById(Integer id) {
        return ventaRepositorio.findById(id);
    }

    @Override
    public Venta add(Venta venta) {
        return ventaRepositorio.save(venta);
    }

    @Override
    public Venta update(Venta venta) {
        Venta objIngreso = ventaRepositorio.getById(venta.getIdVenta());
        BeanUtils.copyProperties(venta, objIngreso);
        return ventaRepositorio.save(objIngreso);
    }

    @Override
    public Venta delete(Venta venta) {
        Venta objIngreso = ventaRepositorio.getById(venta.getIdVenta());
        objIngreso.setEstadoven(false);
        return ventaRepositorio.save(objIngreso);
    }
    
}
