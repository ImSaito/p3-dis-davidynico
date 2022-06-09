
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Prestamo {

    @SerializedName("id_prestamo")
    @Expose
    private String idPrestamo;
    @SerializedName("id_usuario")
    @Expose
    private String idUsuario;
    @SerializedName("id_equipo")
    @Expose
    private int idEquipo;
    @SerializedName("FechIni")
    @Expose
    private String fechIni;
    @SerializedName("Ffin")
    @Expose
    private String ffin;
    @SerializedName("FRdev")
    @Expose
    private String fRdev;
    @SerializedName("Comentarios")
    @Expose
    private String comentarios;
    public Object verticalLayout;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Prestamo() {
    }

    /**
     * 
     * @param idEquipo
     * @param idUsuario
     * @param fechIni
     * @param idPrestamo
     * @param ffin
     * @param fRdev
     * @param comentarios
     */
    public Prestamo(String idPrestamo, String idUsuario, int idEquipo, String fechIni, String ffin, String fRdev, String comentarios) {
        super();
        this.idPrestamo = idPrestamo;
        this.idUsuario = idUsuario;
        this.idEquipo = idEquipo;
        this.fechIni = fechIni;
        this.ffin = ffin;
        this.fRdev = fRdev;
        this.comentarios = comentarios;
    }

    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Prestamo withIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
        return this;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Prestamo withIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
        return this;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Prestamo withIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
        return this;
    }

    public String getFechIni() {
        return fechIni;
    }

    public void setFechIni(String fechIni) {
        this.fechIni = fechIni;
    }

    public Prestamo withFechIni(String fechIni) {
        this.fechIni = fechIni;
        return this;
    }

    public String getFfin() {
        return ffin;
    }

    public void setFfin(String ffin) {
        this.ffin = ffin;
    }

    public Prestamo withFfin(String ffin) {
        this.ffin = ffin;
        return this;
    }

    public String getFRdev() {
        return fRdev;
    }

    public void setFRdev(String fRdev) {
        this.fRdev = fRdev;
    }

    public Prestamo withFRdev(String fRdev) {
        this.fRdev = fRdev;
        return this;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public Prestamo withComentarios(String comentarios) {
        this.comentarios = comentarios;
        return this;
    }
    public String IdStr(){
        return Integer.toString(getIdEquipo());
    }
}
