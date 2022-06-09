
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



@Generated("jsonschema2pojo")
public class Equipo extends Hw{

    @SerializedName("id_equipo")
    @Expose
    private Long idEquipo;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("marca")
    @Expose
    private String marca;
    @SerializedName("usoEqui")
    @Expose
    private String usoEqui;
    @SerializedName("SSOO")
    @Expose
    private Ssoo ssoo;
    @SerializedName("HW")
    @Expose
    private Hw hw;
    @SerializedName("SW")
    @Expose
    private Sw sw;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Equipo() {
    }

    /**
     * 
     * @param marca
     * @param idEquipo
     * @param tipo
     * @param usoEqui
     * @param sw
     * @param ssoo
     * @param hw
     */
    public Equipo(Long idEquipo, String tipo, String marca, String usoEqui, Ssoo ssoo, Hw hw, Sw sw) {
        super();
        this.idEquipo = idEquipo;
        this.tipo = tipo;
        this.marca = marca;
        this.usoEqui = usoEqui;
        this.ssoo = ssoo;
        this.hw = hw;
        this.sw = sw;
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Equipo withIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Equipo withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Equipo withMarca(String marca) {
        this.marca = marca;
        return this;
    }

    public String getUsoEqui() {
        return usoEqui;
    }

    public void setUsoEqui(String usoEqui) {
        this.usoEqui = usoEqui;
    }

    public Equipo withUsoEqui(String usoEqui) {
        this.usoEqui = usoEqui;
        return this;
    }

    public Ssoo getSsoo() {
        return ssoo;
    }

    public void setSsoo(Ssoo ssoo) {
        this.ssoo = ssoo;
    }

    public Equipo withSsoo(Ssoo ssoo) {
        this.ssoo = ssoo;
        return this;
    }

    public Hw getHw() {
        return hw;
    }

    public void setHw(Hw hw) {
        this.hw = hw;
    }

    public Equipo withHw(Hw hw) {
        this.hw = hw;
        return this;
    }

    public Sw getSw() {
        return sw;
    }

    public void setSw(Sw sw) {
        this.sw = sw;
    }

    public Equipo withSw(Sw sw) {
        this.sw = sw;
        return this;
    }
    @Override
    
    public String toString()
    {
        //Leer datos
        return "\t\t\t\tINFORME DE EQUIPO\n\t\t\t\t==============\n1.Id: " + getIdEquipo() + 
               "\n2.Tipo: " + getTipo() + "\n3.Marca: " + getMarca()+ "\n4.Uso del Equipo: " + getUsoEqui()+ "\n5.SSOO:\n\t5.1.Nombre:" + ssoo.getNombre() + "\n\t5.2.Version: " 
               + ssoo.getVersion() + "\n6.HW: " +"\n\t6.1.Procesador : " + hw.getProcesador() + "\n\t\t6.1.1Capacidad: " + hw.getCMemoria().getText() + "\n\t\t6.1.2.Velocidad: " 
               + hw.getCMemoria().getVelocidad() + "\n\t6.2.Disco Duro: " + hw.getDiscDuro().getText() + "\n\t\t6.2.1Tipo: " + hw.getDiscDuro().getTipo() 
               + "\n\t\t6.2.2Capacidad: " + hw.getDiscDuro().getCapacidad() + "\n\t6.3.Pantalla" + hw.getPantalla().getText() + "\n\t\t6.3.1.Diagonal: " + hw.getPantalla().getDiagonal()
               + "\n\t\t6.3.2.Resolución: " + hw.getPantalla().getResolucion() + "\n7.SW:" + "\n\t7.1.Licnecia Libre: " + sw.getLicenciaLibre() + "\n\t7.2.Id: " 
               + sw.getLicenciaPago().getText() + "\n\t7.3.Nombre: " + sw.getLicenciaPago().getNombre() +"\n\t7.4.Version: "+ sw.getLicenciaPago().getVersion() + "\n\t7.5.Tipo: " 
               + sw.getLicenciaPago().getTipo();
    }

}
