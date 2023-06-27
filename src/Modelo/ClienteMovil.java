package Modelo;

public class ClienteMovil {
    
    private int idCliente;
    private String cod_interno;
    private String nombre_fantacia;
    private String razonSocial;
    private String ruc;
    private String direccion;
    private String ref1;
    private String ref2;
    private String telefono;
    private int codCiudad;
    private int CodI;
    
    
    //Contructor
    public ClienteMovil(int idCliente, String cod_interno, String nombre_fantacia, String razonSocial, String ruc, String direccion, String ref1, String ref2, String telefono, int codCiudad, int CodI) {    
        this.idCliente = idCliente;
        this.cod_interno = cod_interno;
        this.nombre_fantacia = nombre_fantacia;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.direccion = direccion;
        this.ref1 = ref1;
        this.ref2 = ref2;
        this.telefono = telefono;
        this.codCiudad = codCiudad;
        this.CodI = CodI;
    }

    public ClienteMovil(int idCliente, String razonSocial, String ruc, String direccion, String telefono, int codCiudad, int CodI) {
        this.idCliente = idCliente;
        this.razonSocial = razonSocial;
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codCiudad = codCiudad;
        this.CodI = CodI;
    }
    
    

    //Constructor Vacio
    public ClienteMovil() {
    }

    //Getter y Setter    

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCod_interno() {
        return cod_interno;
    }

    public void setCod_interno(String cod_interno) {
        this.cod_interno = cod_interno;
    }

    public String getNombre_fantacia() {
        return nombre_fantacia;
    }

    public void setNombre_fantacia(String nombre_fantacia) {
        this.nombre_fantacia = nombre_fantacia;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getCodCiudad() {
        return codCiudad;
    }

    public void setCodCiudad(int codCiudad) {
        this.codCiudad = codCiudad;
    }

    public int getCodI() {
        return CodI;
    }

    public void setCodI(int CodI) {
        this.CodI = CodI;
    }

    
}
