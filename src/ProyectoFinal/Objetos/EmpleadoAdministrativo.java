/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Objetos;

import ProyectoFinal.List;
import ProyectoFinal.UI;

/**
 *
 * @author gabyt
 */
public class EmpleadoAdministrativo extends Empleado {
    
   
    
    
    public EmpleadoAdministrativo(){    
    }
      public void SetNombre(String name) {
        nombre = name;
    }

    @Override
    public String GetNombre() {
        return nombre;
    }

    @Override
    public void SetApellido(String LastName) {
        apellido = LastName;
    }

    public String GetApellido() {
        return apellido;
    }
    
        
    private String nombre;
    private String apellido;

}

   
    

