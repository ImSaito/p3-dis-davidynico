
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Ssoo {

    @SerializedName("-Nombre")
    @Expose
    private String nombre;
    @SerializedName("-Version")
    @Expose
    private String version;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Ssoo() {
    }

    /**
     * 
     * @param nombre
     * @param version
     */
    public Ssoo(String nombre, String version) {
        super();
        this.nombre = nombre;
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ssoo withNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Ssoo withVersion(String version) {
        this.version = version;
        return this;
    }

    public String toString(){
        return "\nNombre: "+ getNombre();
    }

}
