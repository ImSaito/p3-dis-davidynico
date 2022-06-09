package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CMemoria {

    @SerializedName("-velocidad")
    @Expose
    private String velocidad;
    @SerializedName("#text")
    @Expose
    private String text;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CMemoria() {
    }

    /**
     * 
     * @param text
     * @param velocidad
     */
    public CMemoria(String velocidad, String text) {
        super();
        this.velocidad = velocidad;
        this.text = text;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public CMemoria withVelocidad(String velocidad) {
        this.velocidad = velocidad;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CMemoria withText(String text) {
        this.text = text;
        return this;
    }

}
