
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Hw {

    @SerializedName("-Procesador")
    @Expose
    private String procesador;
    @SerializedName("CMemoria")
    @Expose
    private CMemoria cMemoria;
    @SerializedName("DiscDuro")
    @Expose
    private DiscDuro discDuro;
    @SerializedName("Pantalla")
    @Expose
    private Pantalla pantalla;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hw() {
    }

    /**
     * 
     * @param pantalla
     * @param discDuro
     * @param procesador
     * @param cMemoria
     */
    public Hw(String procesador, CMemoria cMemoria, DiscDuro discDuro, Pantalla pantalla) {
        super();
        this.procesador = procesador;
        this.cMemoria = cMemoria;
        this.discDuro = discDuro;
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Hw withProcesador(String procesador) {
        this.procesador = procesador;
        return this;
    }

    public CMemoria getCMemoria() {
        return cMemoria;
    }

    public void setCMemoria(CMemoria cMemoria) {
        this.cMemoria = cMemoria;
    }

    public Hw withCMemoria(CMemoria cMemoria) {
        this.cMemoria = cMemoria;
        return this;
    }

    public DiscDuro getDiscDuro() {
        return discDuro;
    }

    public void setDiscDuro(DiscDuro discDuro) {
        this.discDuro = discDuro;
    }

    public Hw withDiscDuro(DiscDuro discDuro) {
        this.discDuro = discDuro;
        return this;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Hw withPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
        return this;
    }

    
    public void imprimir()
    {
        System.out.println("HW\n=========\nProcesador: " + getProcesador() + "\nCapacidad de la memoria: " + getCMemoria() + "\nDisco duro: " + getDiscDuro() + "\nPantalla: "+ getPantalla());
    }

}
