/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Controller;
import ProyectoFinal.List;
import ProyectoFinal.Objetos.Alumnos;
import ProyectoFinal.UI;




/**
 *
 * @author gabyt
 */
public class OptionsAgregrarAlumnosController {
    
    /*
    metodo para agregar alumnos
    */
    public void agregarAlumnos(String Nombre, String Apellido,String Matricula, String Grado, String Edad, String Escolaridad){
        Alumnos alumno = new Alumnos() {};
 
        alumno.SetNombre(Nombre);
        alumno.SetApellido(Apellido);
        alumno.SetMatricula(Matricula);
        alumno.SetEdad(Edad);
        alumno.SetGrado(Grado);
        alumno.SetEscolaridad(Escolaridad);
        
        DataB.GetPreparatoria().add(alumno);
        DataB.GetProfesional().add(alumno);
        DataB.GetPosgrado().add(alumno);
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
