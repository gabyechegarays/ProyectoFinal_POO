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
public class Profesional extends Alumnos {
    
   
    private String matricula;
    private String grado;
    private String edad;
    private String escolaridad;

    public Profesional() {
        /*
         constructor vacio
         */
        
        matricula = "";
        escolaridad="";
        grado= "";
        edad = "";

    }
    /*
     constructor
     */

    public Profesional( String id, String TypeCourse, String age, String Esco) {

        
        matricula = id;
        grado = TypeCourse;
        edad = age;
        escolaridad= Esco;

    }
    /*
     metodos
     */

   

    public void SetMatricula(String id) {
        matricula = id;
    }

    @Override
    public String SetMatricula() {
        return matricula;
    }

   

    @Override
    public void SetGrado(String GrAcademido) {
        grado = GrAcademido;
    }

    @Override
    public String GetGrado() {
        return grado;
    }

    @Override
    public void SetEdad(String age) {
        edad = age;
    }

    public String GetEdad() {
        return edad;
    }
     public void SetEscolaridad(String Esco) {
        escolaridad = Esco;
    }

    public String GetEscolaridad() {
        return escolaridad;
    }

}

    
    
    
   
  
   
        


    