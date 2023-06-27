package Modelo;

public class Motivo {
    
    private int codU;
    private String nombre;
    private String ci;
    private String dir;
    private String tel;
    private String usu;
    private int pas;
    

    //Constructor
    public Motivo(int codU, String nombre, String ci, String dir, String tel, String usu, int pas) {    
        this.codU = codU;
        this.nombre = nombre;
        this.ci = ci;
        this.dir = dir;
        this.tel = tel;
        this.usu = usu;
        this.pas = pas;
    }

    //Constructor Vacio
    public Motivo() {
    }

    //Getter y Setter

    public int getCodU() {
        return codU;
    }

    public void setCodU(int codU) {
        this.codU = codU;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }
    
    
}
