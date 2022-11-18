package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.lupitabarrotes.entidades.Cliente;
import pe.com.lupitabarrotes.repositorio.ClienteRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> findAll() {
        return clienteRepositorio.findAll();
    }

    @Override
    public List<Cliente> findAllCustom() {
        return clienteRepositorio.findAllCustom();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepositorio.findById(id);
    }

    @Override
    public Cliente add(Cliente cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        Cliente objCliente = clienteRepositorio.getById(cliente.getIdCliente());
        BeanUtils.copyProperties(cliente, objCliente);
        return clienteRepositorio.save(objCliente);
    }

    @Override
    public Cliente delete(Cliente cliente) {
        Cliente objCliente = clienteRepositorio.getById(cliente.getIdCliente());
        objCliente.setEstadocli(false);
        return clienteRepositorio.save(objCliente);
    }

}
