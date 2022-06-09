
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Usuario {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("departamento")
    @Expose
    private String departamento;
    @SerializedName("TlfContacto")
    @Expose
    private String tlfContacto;
    @SerializedName("CorreoElectronico")
    @Expose
    private String correoElectronico;
    @SerializedName("Ubicacion")
    @Expose
    private String ubicacion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Usuario() {
    }

    /**
     * 
     * @param ubicacion
     * @param tlfContacto
     * @param name
     * @param departamento
     * @param id
     * @param correoElectronico
     */
    public Usuario(String id, String name, String departamento, String tlfContacto, String correoElectronico, String ubicacion) {
        super();
        this.id = id;
        this.name = name;
        this.departamento = departamento;
        this.tlfContacto = tlfContacto;
        this.correoElectronico = correoElectronico;
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario withId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Usuario withName(String name) {
        this.name = name;
        return this;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Usuario withDepartamento(String departamento) {
        this.departamento = departamento;
        return this;
    }

    public String getTlfContacto() {
        return tlfContacto;
    }

    public void setTlfContacto(String tlfContacto) {
        this.tlfContacto = tlfContacto;
    }

    public Usuario withTlfContacto(String tlfContacto) {
        this.tlfContacto = tlfContacto;
        return this;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Usuario withCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Usuario withUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        return this;
    }

}
