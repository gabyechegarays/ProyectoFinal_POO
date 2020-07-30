/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Objetos;

/**
 *
 * @author gabyt
 */
public class MaestroPosgrado extends Empleado {
    
    private String nombre;
    private String apellido;
   
    
    
    public MaestroPosgrado(){    
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
    
}
