
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Pantalla {

    @SerializedName("-Diagonal")
    @Expose
    private String diagonal;
    @SerializedName("-Resolucion")
    @Expose
    private String resolucion;
    @SerializedName("#text")
    @Expose
    private String text;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pantalla() {
    }

    /**
     * 
     * @param resolucion
     * @param text
     * @param diagonal
     */
    public Pantalla(String diagonal, String resolucion, String text) {
        super();
        this.diagonal = diagonal;
        this.resolucion = resolucion;
        this.text = text;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public Pantalla withDiagonal(String diagonal) {
        this.diagonal = diagonal;
        return this;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public Pantalla withResolucion(String resolucion) {
        this.resolucion = resolucion;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Pantalla withText(String text) {
        this.text = text;
        return this;
    }

}
