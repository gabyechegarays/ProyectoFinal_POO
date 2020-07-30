/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Objetos;
import ProyectoFinal.List;
import ProyectoFinal.UI;
import java.util.ArrayList;

/**
 *
 * @author gabyt
 */
public abstract class Alumnos {
    /*
     *variables
     */

    private String nombre;
    private String apellido;
    private String matricula;
    private String grado;
    private String edad;
    private String escolaridad;
    private List motor;
    private UI s;

    public Alumnos() {
        /*
         constructor vacio
         */
        nombre = "";
        apellido = "";
        matricula = "";
        escolaridad="";
        grado= "";
        edad = "";

    }
    /*
     constructor
     */

    public Alumnos(String name, String LastName, String id, String TypeCourse, String age, String Esco) {

        nombre = name;
        apellido = LastName;
        matricula = id;
        grado = TypeCourse;
        edad = age;
        escolaridad= Esco;

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

    public void SetApellido(String LastName) {
        apellido = LastName;
    }

    public String GetApellido() {
        return apellido;
    }

    public void SetMatricula(String id) {
        matricula = id;
    }

    public String SetMatricula() {
        return matricula;
    }

   

    public void SetGrado(String GrAcademido) {
        grado = GrAcademido;
    }

    public String GetGrado() {
        return grado;
    }

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
    public void SetMotor(List m)
    {
        motor=m;
        
    }
    public void SetUi(UI Motor2){
        
       s=Motor2;
        
    }

}
