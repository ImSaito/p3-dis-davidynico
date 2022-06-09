
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class LicenciaPago {

    @SerializedName("-Nombre")
    @Expose
    private String nombre;
    @SerializedName("-Version")
    @Expose
    private String version;
    @SerializedName("-Tipo")
    @Expose
    private String tipo;
    @SerializedName("#text")
    @Expose
    private String text;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LicenciaPago() {
    }

    /**
     * 
     * @param tipo
     * @param text
     * @param nombre
     * @param version
     */
    public LicenciaPago(String nombre, String version, String tipo, String text) {
        super();
        this.nombre = nombre;
        this.version = version;
        this.tipo = tipo;
        this.text = text;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LicenciaPago withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public LicenciaPago withVersion(String version) {
        this.version = version;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LicenciaPago withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LicenciaPago withText(String text) {
        this.text = text;
        return this;
    }

}
