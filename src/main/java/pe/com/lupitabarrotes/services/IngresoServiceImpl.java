package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.Ingreso;
import pe.com.lupitabarrotes.repositorio.IngresoRepositorio;

@Service
public class IngresoServiceImpl implements IngresoService{
    
    @Autowired
    private IngresoRepositorio ingresoRepositorio;

    @Override
    public List<Ingreso> findAll() {
        return ingresoRepositorio.findAll();
    }

    @Override
    public List<Ingreso> findAllCustom() {
        return ingresoRepositorio.findAllCustom();
    }

    @Override
    public Optional<Ingreso> findById(Integer id) {
        return ingresoRepositorio.findById(id);
    }

    @Override
    public Ingreso add(Ingreso ingreso) {
        return ingresoRepositorio.save(ingreso);
    }

    @Override
    public Ingreso update(Ingreso ingreso) {
        Ingreso objIngreso = ingresoRepositorio.getById(ingreso.getIdIngreso());
        BeanUtils.copyProperties(ingreso, objIngreso);
        return ingresoRepositorio.save(objIngreso);
    }

    @Override
    public Ingreso delete(Ingreso ingreso) {
        Ingreso objIngreso = ingresoRepositorio.getById(ingreso.getIdIngreso());
        objIngreso.setEstadoing(false);
        return ingresoRepositorio.save(objIngreso);
    }
    
}
