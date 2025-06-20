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
  

    private static final String URL = "jdbc:mysql://localhost:3306/dbsve"; 
    private static final String USUARIO = "root"; 
    private static final String CONTRASEÑA = "Polasana2020"; 

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

        if (rs.next()) { 
            accesoPermitido = true;
        }
        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en el login: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return accesoPermitido;
}
    
public static boolean validarLoginParaEstudiantes(String identificacion, String codigoVotacion) {
     boolean accesoPermitido = false;
    Connection conexion = ConexionBD.conectar();
    String sql = "SELECT * FROM estudiantes WHERE identificacion = ? AND codigo_votacion = ? AND estado = 'ACTIVO'";

    try {
        PreparedStatement ps = conexion.prepareStatement(sql);
        ps.setString(1, identificacion);
        ps.setString(2, codigoVotacion);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) { 
            accesoPermitido = true;
            System.out.println("✅ Estudiante válido y ACTIVO encontrado");

            String actualizarEstadoSQL = "UPDATE estudiantes SET estado = 'INACTIVO' WHERE identificacion = ?";
            PreparedStatement actualizar = conexion.prepareStatement(actualizarEstadoSQL);
            actualizar.setString(1, identificacion);
            int actualizado = actualizar.executeUpdate();

            if (actualizado > 0) {
                System.out.println("Estado cambiado a INACTIVO");
            } else {
                System.out.println(" No se pudo cambiar el estado del estudiante");
            }

            actualizar.close();
        } else {
            System.out.println("Estudiante no encontrado o no está ACTIVO");
        }

        conexion.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en el login: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    return accesoPermitido;
}

public static void vaciarTablas() {
    Connection con = null;
    PreparedStatement ps = null;

    String[] tablas = {"contralor", "estudiantes", "mediador", "personeria", "representante", "votoscontralor","votosmediador","votospersoneria","votosrepresentante"}; 

    try {
        con = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);

        for (String tabla : tablas) {
            String sql = "DELETE FROM " + tabla; 
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        }

        JOptionPane.showMessageDialog(null, "¡Todas las tablas han sido vaciadas!");

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al vaciar las tablas: " + e.getMessage());
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
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
                System.out.println("Candidato registrado con éxito");
            } catch (SQLException e) {
                System.out.println("Error al registrar candidato: " + e.getMessage());
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

    
    public static void guardarEnTablaPorCargo(String nombre, String cargo, int tarjeton) {
    Connection conexion = ConexionBD.conectar();
    PreparedStatement pstmt = null;

    try {
       

        // Selección dinámica de la tabla
        String tabla = "";
        switch (cargo.toLowerCase()) {
            case "personero":
                tabla = "personeria";
                break;
            case "contralor":
                tabla = "contralor";
                break;
            case "representante":
                tabla = "representante";
                break;
            case "mediador":
                tabla = "mediador";
                break;
            default:
                System.out.println("Cargo no reconocido: " + cargo);
                return;
        }

        // Construir e insertar
        String sql = "INSERT INTO " + tabla + " (nombre, cargo, tarjeton) VALUES (?, ?, ?)";
        pstmt = conexion.prepareStatement(sql);
        pstmt.setString(1, nombre);
        pstmt.setString(2, cargo);
        pstmt.setInt(3, tarjeton);
        pstmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "¡Se guardo con exito!");
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (pstmt != null) pstmt.close();
            if (conexion != null) conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    
     public static boolean guardarEstudiante(int identificacion, String nombre1, String nombre2, String apellido1, String apellido2, String curso, String codigoVotacion) {
    Connection conexion = ConexionBD.conectar(); // ¡Faltaba esta línea!
    String sql = "INSERT INTO estudiantes (identificacion, nombre1, nombre2, apellido1, apellido2, curso, codigo_votacion, estado) VALUES (?, ?, ?, ?, ?, ?, ?, 'ACTIVO')";

    try (PreparedStatement pst = conexion.prepareStatement(sql)) {
        pst.setInt(1, identificacion);
        pst.setString(2, nombre1);
        pst.setString(3, nombre2.isEmpty() ? null : nombre2);
        pst.setString(4, apellido1);
        pst.setString(5, apellido2.isEmpty() ? null : apellido2);
        pst.setString(6, curso);
        pst.setString(7, codigoVotacion);

        int filas = pst.executeUpdate();
        return filas > 0;
    } catch (SQLException e) {
        System.err.println("Error al guardar estudiante: " + e.getMessage());
        return false;
    } finally {
        cerrarConexion(conexion); // Cierra la conexión correctamente
    }
}


}


    

