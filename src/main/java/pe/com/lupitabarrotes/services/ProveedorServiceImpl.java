package pe.com.lupitabarrotes.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.lupitabarrotes.entidades.Proveedor;
import pe.com.lupitabarrotes.repositorio.ProveedorRepositorio;

@Service
public class ProveedorServiceImpl implements ProveedorServicio {
	
	@Autowired
	private ProveedorRepositorio proveedorRepositorio;

	@Override
	public List<Proveedor> findAll() {
		return proveedorRepositorio.findAll();
	}

	@Override
	public List<Proveedor> findAllCustom() {
		return proveedorRepositorio.findAllCustom();
	}

	@Override
	public Optional<Proveedor> findById(Integer id) {
		return proveedorRepositorio.findById(id);
	}

	@Override
	public Proveedor add(Proveedor proveedor) {
		return proveedorRepositorio.save(proveedor);
	}

	@Override
	public Proveedor update(Proveedor proveedor) {
            Proveedor objProveedor = proveedorRepositorio.getById(proveedor.getIdProveedor());
            BeanUtils.copyProperties(proveedor, objProveedor);
            return proveedorRepositorio.save(objProveedor);
	}

	@Override
	public Proveedor delete(Proveedor proveedor) {
		Proveedor objProveedor = proveedorRepositorio.getById(proveedor.getIdProveedor());
                objProveedor.setEstadoprov("deshabilitado");
		return proveedorRepositorio.save(objProveedor);
	}

}
