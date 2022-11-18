
package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.Usuario;
import pe.com.lupitabarrotes.repositorio.UsuarioRepositorio;


@Service
public class UsuarioServicioImpl implements UsuarioServicio{
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepositorio.findAll();
    }

    @Override
    public List<Usuario> findAllCustom() {
        return usuarioRepositorio.findAllCustom();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return usuarioRepositorio.findById(id);
    }

    @Override
    public Usuario add(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Usuario update(Usuario usuario) {
        Usuario objUsuario = usuarioRepositorio.getById(usuario.getIdUsuario());
        BeanUtils.copyProperties(usuario, objUsuario);
        return usuarioRepositorio.save(objUsuario);
    }

    @Override
    public Usuario delete(Usuario usuario) {
        Usuario objUsuario = usuarioRepositorio.getById(usuario.getIdUsuario());
        objUsuario.setEstadouser(false);
        return usuarioRepositorio.save(objUsuario);
    }
}
