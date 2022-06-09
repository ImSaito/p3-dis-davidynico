
package practica2.practica2.Backend;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Sw {

    @SerializedName("LicenciaPago")
    @Expose
    private LicenciaPago licenciaPago;
    @SerializedName("LicenciaLibre")
    @Expose
    private String licenciaLibre;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sw() {
    }

    /**
     * 
     * @param licenciaLibre
     * @param licenciaPago
     */
    public Sw(LicenciaPago licenciaPago, String licenciaLibre) {
        super();
        this.licenciaPago = licenciaPago;
        this.licenciaLibre = licenciaLibre;
    }

    public LicenciaPago getLicenciaPago() {
        return licenciaPago;
    }

    public void setLicenciaPago(LicenciaPago licenciaPago) {
        this.licenciaPago = licenciaPago;
    }

    public Sw withLicenciaPago(LicenciaPago licenciaPago) {
        this.licenciaPago = licenciaPago;
        return this;
    }

    public String getLicenciaLibre() {
        return licenciaLibre;
    }

    public void setLicenciaLibre(String licenciaLibre) {
        this.licenciaLibre = licenciaLibre;
    }

    public Sw withLicenciaLibre(String licenciaLibre) {
        this.licenciaLibre = licenciaLibre;
        return this;
    }

}
