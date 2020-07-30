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
public class Preparatoria extends Alumnos {
    
    
    /*
     *variables
     */

    ;
    private String grado;
    private String edad;
    private String escolaridad;

    public Preparatoria() {
        /*
         constructor vacio
         */
        
        escolaridad="";
        grado= "";
        edad = "";

    }
    /*
     constructor
     */

    public Preparatoria(String TypeCourse, String age, String Esco) {

      
        grado = TypeCourse;
        edad = age;
        escolaridad= Esco;

    }
    /*
     metodos
     */

  

   

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

    @Override
    public String GetEdad() {
        return edad;
    }
    @Override
     public void SetEscolaridad(String Esco) {
        escolaridad = Esco;
    }

    @Override
    public String GetEscolaridad() {
        return escolaridad;
    }

}




    

    

   

   

