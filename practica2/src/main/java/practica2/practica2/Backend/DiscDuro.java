package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DiscDuro {

    @SerializedName("-Tipo")
    @Expose
    private String tipo;
    @SerializedName("-Capacidad")
    @Expose
    private String capacidad;
    @SerializedName("#text")
    @Expose
    private String text;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DiscDuro() {
    }

    /**
     * 
     * @param tipo
     * @param text
     * @param capacidad
     */
    public DiscDuro(String tipo, String capacidad, String text) {
        super();
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.text = text;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public DiscDuro withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public DiscDuro withCapacidad(String capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public DiscDuro withText(String text) {
        this.text = text;
        return this;
    }

}
