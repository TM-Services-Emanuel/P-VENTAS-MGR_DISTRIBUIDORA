package Datos;

import Componentes.Operacion;
import Componentes.OperacionMovil;
import Componentes.generarCodigos;
import Modelo.Motivo;
import java.util.List;

public class GestionarMotivo {

    public static String getCodigo() {
        String cod = generarCodigos.getCodigoMovil("SELECT MAX(idusuario) from usuario ");
        return cod;
    }

    public static String addMotivo(Motivo m) {
        String msg;
        StringBuilder sql = new StringBuilder("INSERT INTO usuario VALUES (");
        sql.append(m.getCodU()).append(",'");
        sql.append(m.getNombre()).append("',");
        sql.append(m.getCi()).append(",'");
        sql.append(m.getDir()).append("','");
        sql.append(m.getTel()).append("','");
        sql.append(m.getUsu()).append("',");
        sql.append(m.getPas()).append(",'S')");
        msg = OperacionMovil.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("INSERT INTO motivo VALUES ("
//                + m.getCodM() + ",'"
//                + m.getMotivo() + "','S')");
        return msg;
    }

    public static String actMotivo(Motivo m) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE usuario SET nombre='");
        sql.append(m.getNombre()).append("', ci=");
        sql.append(m.getCi()).append(", direccion='");
        sql.append(m.getDir()).append("', telefono='");
        sql.append(m.getTel()).append("', usuario='");
        sql.append(m.getUsu()).append("', contrasena=");
        sql.append(m.getPas());        
        sql.append(" WHERE idusuario=");
        sql.append(m.getCodU()).append("");
        msg = OperacionMovil.exeOperacion(sql.toString());
//        msg = Operacion.exeOperacion("UPDATE motivo SET mot_nombre='"
//                + m.getMotivo()
//                + "' WHERE mot_codigo="
//                + m.getCodM() + "");
        return msg;
    }

    public static String delMotivo(String cod) {
        String msg;
        StringBuilder sql = new StringBuilder("UPDATE usuario SET estado= 'N'");
        sql.append(" WHERE idusuario=");
        sql.append(cod).append("");
//        String sql = "UPDATE motivo SET mot_indicador = 'N' WHERE mot_codigo = " + cod + "";
        msg = OperacionMovil.exeOperacion(sql.toString());
        return msg;
    }

    public static List listMotivo() {
        String sql = "SELECT * FROM usuario WHERE estado='S'";
        return OperacionMovil.getTabla(sql);
    }

}
