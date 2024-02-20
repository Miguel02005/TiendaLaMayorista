public class Importado extends producto {
    
    public String licenciaImportacion;

    public Importado(String nombre, int codigo, String licenciaImportacion) {
        super(nombre, codigo);
        this.licenciaImportacion = licenciaImportacion;
    }

    public String getLicenciaImportacion() {
        return licenciaImportacion;
    }

    public void setLicenciaImportacion(String licenciaImportacion) {
        this.licenciaImportacion = licenciaImportacion;
    }

    
}
