package Controladores;

import Componentes.Login;
import Componentes.Mensajes;
import Datos.GestionarMotivo;
import IU.dlgMotivo;
import Modelo.Motivo;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlMotivo {
    static String UsuarioL="";
    public static String addMotivo()
    {
        String msg;
        int cod = Integer.parseInt(dlgMotivo.txtCod.getText());
        String nombre = dlgMotivo.txtVendedor.getText().toUpperCase();
        String ci = dlgMotivo.txtci.getText().toUpperCase();
        String dir = dlgMotivo.txtDireccion.getText().toUpperCase();
        String tel = dlgMotivo.txtTel.getText().toUpperCase();
        String usu = dlgMotivo.txtUsuario.getText();
        int pas = Integer.parseInt(dlgMotivo.txtContrasena.getText());
        Motivo m = new Motivo(cod, nombre, ci, dir, tel, usu, pas);
        msg = GestionarMotivo.addMotivo(m);
        if(msg==null)
        {
            Mensajes.informacion("Vendedor Móvil Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actMotivo()
    {
        String msg;
        int cod = Integer.parseInt(dlgMotivo.txtCod.getText());
        String nombre = dlgMotivo.txtVendedor.getText().toUpperCase();
        String ci = dlgMotivo.txtci.getText().toUpperCase();
        String dir = dlgMotivo.txtDireccion.getText().toUpperCase();
        String tel = dlgMotivo.txtTel.getText().toUpperCase();
        String usu = dlgMotivo.txtUsuario.getText().toUpperCase();
        int pas = Integer.parseInt(dlgMotivo.txtContrasena.getText());
        Motivo m = new Motivo(cod, nombre, ci, dir, tel, usu, pas);
        msg = GestionarMotivo.actMotivo(m);
        if(msg==null)
        {
            Mensajes.informacion("Vendedor Móvil Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delMotivo()    
    {
        String msg;
        String cod = dlgMotivo.txtCod.getText();
        msg = GestionarMotivo.delMotivo(cod);
        if(msg==null)
        {
            Mensajes.informacion("Vendedor Móvil Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listMotivo(JTable tabla)
    {
        List lista = null;
        lista = GestionarMotivo.listMotivo();
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
}