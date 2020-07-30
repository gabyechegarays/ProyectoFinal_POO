/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Controller;

import ProyectoFinal.List;
import ProyectoFinal.Objetos.Carrera;


/**
 *
 * @author gabyt
 */
public class OptionsAgregarCarrerraController {

   
 
        public void agregarCarrera(String Nombre){
        
        // objeto de carrera 
        Carrera carrera = new Carrera() {};
       
        carrera.SetNombre(Nombre);
        
      
        
        DataB.GetCarrera().add(carrera);
        }
        public  void SetControlador(List db) {
        
          DataB= db;
       
    }
        

    
    private List DataB;
       
    
}
    

