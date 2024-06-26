/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Inadex_gui.VistaSign_In;
import Servicios.Servicios;
import java.sql.SQLException;
/**
 *
 * @author Carlos Marban
 */
public class ControladorSignIn {
    private VistaSign_In vista;
    private Servicios servicios;
    
    public ControladorSignIn(){
        this.servicios = new Servicios();
        
    }
    public boolean registrar(String usuario, String contrasena, String apellido, String nombre, String correo) throws SQLException{
        return servicios.registrarUsuario(usuario, contrasena, correo, nombre, apellido);
    }
    public void setVista(VistaSign_In vista){
        this.vista = vista;
    }
    public void MostrarSignIn(){
        vista.setVisible(true);
    }
    public void OcultarSignIn(){
        vista.dispose();
    }
}
