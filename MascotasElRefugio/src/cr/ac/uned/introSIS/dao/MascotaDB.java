/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cr.ac.uned.introSIS.dao;

import cr.ac.uned.introSIS.dominio.Mascota;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ivanrojasgranados
 */
public class MascotaDB {
    
    private Connection conexion;
    
    public MascotaDB(){
        try {
            conexion=new ConexionDB().conectar();
        } catch (SQLException ex) {
            Logger.getLogger(MascotaDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void insertarMascota(Mascota mascota) throws SQLException{
        String insert="INSERT INTO MASCOTAS (nombre, especie,color,sexo,edad) VALUES (?,?,?,?,?)";
        PreparedStatement pst=conexion.prepareStatement(insert);
        pst.setString(1, mascota.getNombre());
        pst.setString(2, mascota.getEspecie());
        pst.setString(3, mascota.getColor());
        pst.setString(4, mascota.getSexo());
        pst.setInt(5, mascota.getEdad());
        
        pst.execute();
        
       
    
    }
    
    public ArrayList<Mascota> obtenerMascotas() throws SQLException{
        ArrayList<Mascota> mascotas=new ArrayList<>();
        String select="SELECT * FROM MASCOTAS";
        PreparedStatement pst=conexion.prepareStatement(select);
        ResultSet rs=pst.executeQuery();
        
        while(rs.next()){
            Mascota mascotaTemporal=new Mascota();
            mascotaTemporal.setId(rs.getInt("id"));
            mascotaTemporal.setNombre(rs.getString("nombre"));
            mascotaTemporal.setEspecie(rs.getString("especie"));
            mascotaTemporal.setColor(rs.getString("color"));
            mascotaTemporal.setSexo(rs.getString("sexo"));
            mascotaTemporal.setEdad(rs.getInt("edad"));
            mascotas.add(mascotaTemporal);
        }
        
        
        return mascotas;
    }
    
}
