package Controladores;

import Componentes.Login;
import Componentes.Mensajes;
import Datos.GestionarCliente;
import IU.dlgClientes;
import IU.dlgGestClientes;
import IU.dlgGestClientes1;
import Modelo.ClienteMovil;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class controlCliente {
    static String UsuarioL="";
    public static void aModificar()
    {
        int x = dlgClientes.tablaClientes.getSelectedRow();
        String cod = dlgClientes.tablaClientes.getValueAt(x, 0).toString();
        ClienteMovil c = GestionarCliente.busCliente(cod);
        dlgGestClientes.lblCodC.setText(String.valueOf(c.getIdCliente()));
        dlgGestClientes.cbCiudad.setSelectedIndex(c.getCodCiudad());
        dlgGestClientes.txtCodInt.setText(c.getCod_interno());
        dlgGestClientes.txtNF.setText(c.getNombre_fantacia());
        dlgGestClientes.txtRazonS.setText(c.getRazonSocial());
        dlgGestClientes.txtRuc.setText(c.getRuc());
        dlgGestClientes.txtTelefono.setText(c.getTelefono());
        dlgGestClientes.txtDireccion.setText(c.getDireccion());
        dlgGestClientes.txtReferencia1.setText(c.getRef1());
        dlgGestClientes.txtReferencia2.setText(c.getRef2());
        switch (c.getCodI()) {
            case 11 -> dlgGestClientes.cboIdentificacion.setSelectedIndex(1);
            case 12 -> dlgGestClientes.cboIdentificacion.setSelectedIndex(2);
            case 13 -> dlgGestClientes.cboIdentificacion.setSelectedIndex(3);
            case 14 -> dlgGestClientes.cboIdentificacion.setSelectedIndex(4);
            case 15 -> dlgGestClientes.cboIdentificacion.setSelectedIndex(5);
            case 16 -> dlgGestClientes.cboIdentificacion.setSelectedIndex(6);
            case 17 -> dlgGestClientes.cboIdentificacion.setSelectedIndex(7);
            default -> {
            }
        }
    }
    
    public static ClienteMovil capturarCampos()
    {
        ClienteMovil c = null;
        String telf;
        int codC = Integer.parseInt(dlgGestClientes.lblCodC.getText());
        String codInt = (dlgGestClientes.txtCodInt.getText());
        String NombreFantacia;
        if(dlgGestClientes.txtNF.getText().isEmpty()){
            NombreFantacia = "' '";
        }else{
            NombreFantacia = dlgGestClientes.txtNF.getText();
        }
        String razonS = dlgGestClientes.txtRazonS.getText();
        String ruc = dlgGestClientes.txtRuc.getText().toUpperCase();
        String direc = dlgGestClientes.txtDireccion.getText().toUpperCase();
        String ref1 = dlgGestClientes.txtReferencia1.getText().toUpperCase();
        String ref2 = dlgGestClientes.txtReferencia2.getText().toUpperCase();
        if(dlgGestClientes.txtTelefono.getText().isEmpty()){
            telf="' '";
        }else{
            telf = dlgGestClientes.txtTelefono.getText();
        }
        int codCi = Integer.parseInt(dlgGestClientes.lbCiudad.getText());
        int codI = 0;
            switch (dlgGestClientes.cboIdentificacion.getSelectedIndex()) {
                case 1 ->
                    codI = 11;
                case 2 ->
                    codI = 12;
                case 3 ->
                    codI = 13;
                case 4 ->
                    codI = 14;
                case 5 ->
                    codI = 15;
                case 6 ->
                    codI = 16;
                case 7 ->
                    codI = 17;
                default -> {
                }
            }
        c = new ClienteMovil(codC, codInt, NombreFantacia, razonS, ruc, direc, ref1, ref2, telf, codCi, codI);                
        return c;
    }
    public static ClienteMovil capturarCampos1()
    {
        ClienteMovil c = null;
        String telf;
        int codC = Integer.parseInt(dlgGestClientes1.lblCodC.getText());
        int codCi = Integer.parseInt(dlgGestClientes1.lbCiudad.getText());
        String razonS = dlgGestClientes1.txtRazonS.getText().toUpperCase();
        String ruc = dlgGestClientes1.txtRuc.getText().toUpperCase();
        if(dlgGestClientes1.txtTelefono.getText().isEmpty()){
            telf="' '";
        }else{
            telf = dlgGestClientes1.txtTelefono.getText();
        }
        String direc = dlgGestClientes1.txtDireccion.getText().toUpperCase();
        int codI = 0;
            switch (dlgGestClientes.cboIdentificacion.getSelectedIndex()) {
                case 1 ->
                    codI = 11;
                case 2 ->
                    codI = 12;
                case 3 ->
                    codI = 13;
                case 4 ->
                    codI = 14;
                case 5 ->
                    codI = 15;
                case 6 ->
                    codI = 16;
                case 7 ->
                    codI = 17;
                default -> {
                }
            }
        c = new ClienteMovil(codC , razonS, ruc, direc, telf, codCi, codI);                
        return c;
    }
    
    public static String addCliente()
    {
        String msg;
        ClienteMovil c = capturarCampos();
        msg = GestionarCliente.addCliente(c);
        if(msg==null)
        {
            Mensajes.informacion("Cliente Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
     public static String addCliente1()
    {
        String msg;
        ClienteMovil c = capturarCampos1();
        msg = GestionarCliente.addCliente(c);
        if(msg==null)
        {
            Mensajes.informacion("Cliente Registrado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String actCliente()
    {
        String msg;
        ClienteMovil c = capturarCampos();
        msg = GestionarCliente.actCliente(c);
        if(msg==null)
        {
            Mensajes.informacion("Cliente Actualizado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static String delCliente()
    {
        int x = dlgClientes.tablaClientes.getSelectedRow();
        String msg;
        String cod = dlgClientes.tablaClientes.getValueAt(x, 0).toString();
        String usuario = UsuarioL=Login.getUsuarioLogueado();
        msg = GestionarCliente.delCliente(cod);
        if(msg==null)
        {
            Mensajes.informacion("Cliente Eliminado");
        }
        else{
            Mensajes.error(msg);
        }
        return msg;
    }
    
    public static void listClientes(JTable tabla, String cod)
    {
        List lista = null;
        lista = GestionarCliente.listClientes(cod);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filtClientes(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filRazonS(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    
    public static void filtRuc(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filRuc(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    /*public static void filContacto(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filContacto(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
    */
    /*public static void filDireccion(JTable tabla, String cad)
    {
        List lista = null;
        lista = GestionarCliente.filDireccion(cad);
        for(int i=1;i<lista.size();i++)
        {
            DefaultTableModel tb = (DefaultTableModel)tabla.getModel();
            Object[]fila = (Object[])lista.get(i);
            tb.addRow(fila);
        }
    }
   */         
}
