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

    
    

    public static void guardarCandidato(String nombre, String cargo, int tarjeton) {
        Connection conexion = ConexionBD.conectar();
        if (conexion != null) {
            String sql = "INSERT INTO candidatos (nombre, cargo, tarjeton) VALUES (?, ?, ?)";
            try {
                PreparedStatement stmt = conexion.prepareStatement(sql);
                stmt.setString(1, nombre);
                stmt.setString(2, cargo);
                stmt.setInt(3, tarjeton);
                stmt.executeUpdate();
                System.out.println("✅ Candidato registrado con éxito");
            } catch (SQLException e) {
                System.out.println("❌ Error al registrar candidato: " + e.getMessage());
            }
        }  
    }
    
    
    public static boolean GuardarVotante(String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, int Identificacion, String Curso, String CodigoVotacion){
    // Conexión a la base de datos
    Connection conexion = ConexionBD.conectar();
    
    // Variable que indica si la operación fue exitosa
    boolean exito = false;
    
    if (conexion != null) {
        // Consulta SQL de inserción para la tabla "estudiantes"
        String sql = "INSERT INTO estudiantes (nombre1, nombre2, apellido1, apellido2, identificacion, curso, codigo_votacion) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try {
            // Preparar la sentencia SQL
            PreparedStatement stmt = conexion.prepareStatement(sql);
            
            // Asignar los valores a los parámetros de la consulta SQL
            stmt.setString(1, PrimerNombre);  // Primer Nombre
            stmt.setString(2, SegundoNombre); // Segundo Nombre
            stmt.setString(3, PrimerApellido); // Primer Apellido
            stmt.setString(4, SegundoApellido); // Segundo Apellido
            stmt.setInt(5, Identificacion); // Identificación
            stmt.setString(6, Curso); // Curso
            stmt.setString(7, CodigoVotacion); // Código de Votación
            
            // Ejecutar la actualización en la base de datos
            stmt.executeUpdate();
            
            // Si todo salió bien, marcamos exito como verdadero
            exito = true;
            System.out.println("✅ Votante registrado con éxito");
        } catch (SQLException e) {
            // Manejo de errores en caso de problemas
            System.out.println("❌ Error al registrar votante: " + e.getMessage());
        }
    }
    
    // Retornar el valor de exito (true si la inserción fue exitosa, false si ocurrió algún error)
    return exito;
}

}


    

