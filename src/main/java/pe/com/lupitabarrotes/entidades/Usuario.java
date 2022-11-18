package pe.com.lupitabarrotes.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "Usuario")
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idusuario")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nomuser")
    private String nombreuser;

    @Column(name = "tipodocuser")
    private String tipodocumentouser;

    @Column(name = "numdocuser")
    private String numerodocumentouser;

    @Column(name = "diruser")
    private String direccionuser;

    @Column(name = "teleuser")
    private String telefonouser;

    @Column(name = "emailuser")
    private String emailuser;

    @Column(name = "passuser")
    private String claveuser;

    @Column(name = "estuser")
    private boolean estadouser;

    @ManyToOne
    @JoinColumn(name = "idrol", nullable = false)
    private Rol rol;
}
