/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.introSIS.dao;

import java.sql.*;
/**
 *
 * @author ivanrojasgranados
 */
public class ConexionDB {
    private String urlConexion="jdbc:derby://localhost:1527/MascotasElRefugio";
    private String usrName="adminSIS";
    private String password="adminSIS123";
    
    public Connection conectar() throws SQLException{
        return DriverManager.getConnection(urlConexion, usrName, password);
    }
    
}
