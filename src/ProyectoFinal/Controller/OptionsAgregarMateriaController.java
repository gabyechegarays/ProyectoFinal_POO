/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Controller;

import ProyectoFinal.List;

import ProyectoFinal.Objetos.Materia;
import ProyectoFinal.UI;

/**
 *
 * @author gabyt
 */
public class OptionsAgregarMateriaController {
    
    public void agregarMateria(String Nombre, String carrera,String semestre ,String maestro, String materia){
        Materia materias= new Materia() {};
       
        materias.SetNombre(Nombre);
        materias.SetCarrera(carrera);
        materias.SetSemestre(semestre);
        materias.SetMaestro(maestro);
        materias.SetMateria(materia);
      
        
    }
       /*
    controlador
    */
        
    public void setControlador(List db){
    
        DataB= db;
     
          
    }
    public void SetMotorUI(UI u)
    {
        M=u;
    }
     private List DataB;
    private UI M;    
    
}


