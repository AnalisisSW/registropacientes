package centromedico.entities;

//import javax.persistence.Column;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Grupo 7
 */
@Entity
@Table(name="Pacientes")
public class Paciente implements Serializable, Comparable<Paciente>{
    
    @Id
    @Column(name="codigo")
    private String codigo;
    
    @Column(name="apellido")
    private String apellido;
    
    @Column(name="nombre")
    private String nombre;
    
    /**
     * Constructor x defecto
     */
    public Paciente() {
    }

    /**
     * Constructor parametrizado
     * @param codigo
     * @param apellido
     * @param nombre
     */
    public Paciente(String codigo, String apellido, String nombre) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    /**
     * Get codigo del paciente
     * @return codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set codigo del paciente
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Get Apellido
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Set Apellido
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Get nombre del paciente
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set nombre del paciente
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo toString de paciente
     * @return String
     */
    @Override
    public String toString() {
        return "Paciente: " + "\nCodigo: " + codigo + "\nApellido: " + apellido +
                "\nNombre: " + nombre + "\n";
    }

    @Override
    public int compareTo(Paciente o) {
        return this.codigo.compareTo(o.codigo);
    }
    
}
