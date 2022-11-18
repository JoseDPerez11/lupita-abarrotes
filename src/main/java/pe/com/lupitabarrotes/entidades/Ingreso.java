package pe.com.lupitabarrotes.entidades;

import java.io.Serializable;
import java.sql.Date;

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
@Entity(name = "Ingreso")
@Table(name = "ingreso")
public class Ingreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "idingreso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIngreso;

    @Column(name = "tipocoming")
    private String tipocomprobanteing;

    @Column(name = "numcoming")
    private String numerocomprobanteing;

    @Column(name = "fechaing")
    private Date fechaing;

    @Column(name = "imping")
    private double impuestoing;

    @Column(name = "toting")
    private double totaling;

    @Column(name = "esting")
    private boolean estadoing;

    @ManyToOne
    @JoinColumn(name = "idproveedor", nullable = false)
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "idusuario", nullable = false)
    private Usuario usuario;

}
