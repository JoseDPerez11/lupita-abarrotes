
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.Cliente;
import pe.com.lupitabarrotes.entidades.DetalleVenta;
import pe.com.lupitabarrotes.repositorio.DetalleVentaRepositorio;

@Service
public class DetalleVentaServicioImpl implements DetalleVentaServicio {
    
    @Autowired
    private DetalleVentaRepositorio dvr;

    @Override
    public List<DetalleVenta> findAll() {
        return dvr.findAll();
    }

    @Override
    public Optional<DetalleVenta> findById(Integer id) {
        return dvr.findById(id);
    }

    @Override
    public DetalleVenta add(DetalleVenta detalleVenta) {
        return dvr.save(detalleVenta);
    }

    @Override
    public DetalleVenta update(DetalleVenta detalleVenta) {
        DetalleVenta objDV = dvr.getById(detalleVenta.getIdDetalleventa());
        BeanUtils.copyProperties(detalleVenta, objDV);
        return dvr.save(objDV);
    }

}
