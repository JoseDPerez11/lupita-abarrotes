
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.Rol;
import pe.com.lupitabarrotes.repositorio.RolRepositorio;

@Service
public class RolServicioImpl implements RolServicio{
    
    @Autowired
    private RolRepositorio rolRepositorio;

    @Override
    public List<Rol> findAll() {
        return rolRepositorio.findAll();
    }

    @Override
    public List<Rol> findAllCustom() {
        return rolRepositorio.findAllCustom();
    }

    @Override
    public Optional<Rol> findById(Integer id) {
        return rolRepositorio.findById(id);
    }

    @Override
    public Rol add(Rol rol) {
        return rolRepositorio.save(rol);
    }

    @Override
    public Rol update(Rol rol) {
        Rol objRol = rolRepositorio.getById(rol.getIdRol());
        BeanUtils.copyProperties(rol, objRol);
        return rolRepositorio.save(objRol);
    }   

    @Override
    public Rol delete(Rol rol) {
        Rol objRol = rolRepositorio.getById(rol.getIdRol());
        objRol.setEstadorol(false);
        return rolRepositorio.save(objRol);
    }
}
