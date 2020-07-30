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
public class Carrera{
    
    

    private String nombre;
    private String GradoAcademico;
   

    public Carrera() {
        /*
         constructor vacio
         */
        nombre = "";
        
        

    }
    /*
     constructor
     */
   

    public Carrera(String name) {

        nombre = name;
        

    }
    /*
     metodos
     */

    public void SetNombre(String name) {
        nombre = name;
    }

    public String GetNombre() {
        return nombre;
    }

   
    
}
