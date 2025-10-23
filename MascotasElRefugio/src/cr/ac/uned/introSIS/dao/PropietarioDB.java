/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.introSIS.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ivanrojasgranados
 */
public class PropietarioDB {
    private Connection conexion;
    
    public PropietarioDB(){
    try {
            conexion=new ConexionDB().conectar();
        } catch (SQLException ex) {
            Logger.getLogger(MascotaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
