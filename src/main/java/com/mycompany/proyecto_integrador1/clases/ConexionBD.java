/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_integrador1.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ConexionBD {
  

    private static final String URL = "jdbc:mysql://localhost:3306/dbsve"; // Cambia por el nombre de tu BD
    private static final String USUARIO = "root";  // Tu usuario de MySQL
    private static final String CONTRASEÑA = "Polasana2020";   // Si tienes contraseña, colócala aquí

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.err.println("❌ Error: No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Error de conexión a la base de datos.");
            e.printStackTrace();
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("🔒 Conexión cerrada correctamente.");
            } catch (SQLException e) {
                System.err.println("❌ Error al cerrar la conexión.");
                e.printStackTrace();
            }
        }
    }
    
    public static boolean validarLogin(String usuario, String identificacion, String contraseña) {
    boolean accesoPermitido = false;
    Connection conexion = ConexionBD.conectar();
    String sql = "SELECT * FROM administradores WHERE nombre_usuario = ? AND identificacion = ? AND contraseña = ?";

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, identificacion);
        ps.setString(3, contraseña);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) { // Si encuentra un resultado, el login es correcto
            accesoPermitido = true;
        }
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en el login: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return accesoPermitido;
}
    
    public static boolean registrarAdmin(String usuario, String identificacion, String contraseña) {
        boolean registrado = false;
        Connection conexion = ConexionBD.conectar();
        String sql = "INSERT INTO administradores (nombre_usuario, identificacion, contraseña) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, identificacion);
            ps.setString(3, contraseña);
            
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                registrado = true;
            }
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return registrado;
    }
    
    public static void registrarAcceso(String usuario, String identificacion) {
    Connection conexion = ConexionBD.conectar();
    String sql = "INSERT INTO log_accesos (nombre_usuario, id_administrador) VALUES (?, ?)";
    
    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, usuario);
        ps.setString(2, identificacion);
        ps.executeUpdate();
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al registrar acceso: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
}

    

