
package com.mycompany.proyecto_integrador1.clases;

import com.mycompany.proyecto_integrador1.LoginAdministrador.LoginAdministrador;
import com.mycompany.proyecto_integrador1.RegistroAdministrador.RegistroAdministrador;
import com.mycompany.proyecto_integrador1.Sistema.AdminInterface;


public class Main {
     public static void main(String[] args) {
       LoginAdministrador login = new LoginAdministrador(); // Crea la ventana de Login
       login.setVisible(true); // Muestra la ventana
     }
}
