
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.DetalleIngreso;
import pe.com.lupitabarrotes.repositorio.DetalleIngresoRepositorio;

@Service
public class DetalleIngresoServicioImpl implements DetalleIngresoServicio{
    
    @Autowired
    private DetalleIngresoRepositorio dir;

    @Override
    public List<DetalleIngreso> findAll() {
        return dir.findAll();
    }

    @Override
    public Optional<DetalleIngreso> findById(Integer id) {
        return dir.findById(id);
    }

    @Override
    public DetalleIngreso add(DetalleIngreso cliente) {
        return dir.save(cliente);
    }

    @Override
    public DetalleIngreso update(DetalleIngreso di) {
        DetalleIngreso objDI = dir.getById(di.getIdDetalleingreso());
        BeanUtils.copyProperties(di, objDI);
        return dir.save(objDI);
    }

}
