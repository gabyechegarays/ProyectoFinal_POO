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
public abstract class Empleado {
    
    private String nombre;
    private String apellido;
    private String matricula;
    private String salarios;
    private String tipoEmpleo;
    private String edad;
    private List motor;
    private UI s;


    public Empleado() {
        /*
         constructor vacio
         */
        nombre = "";
        apellido = "";
        matricula = "";
        
        tipoEmpleo="";
        edad = "";

    }
    /*
     constructor
     */

    public Empleado(String name, String LastName, String id, String TypeJob, String age, String sal) {

        nombre = name;
        apellido = LastName;
        matricula = id;
        salarios= sal;
        tipoEmpleo = TypeJob;
        edad = age;

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

    public void SetTipoJob(String TypeCourse) {
        tipoEmpleo = TypeCourse;
    }

    public String GetTipoCurso() {
        return tipoEmpleo;
    }

    public void SetEdad(String age) {
        edad = age;
    }

    public String GetEdad() {
        return edad;
    }
    public void SetSalario(String sal){
        salarios= sal;
    }
    public String GetSalario(){
        return salarios;
    }
     public void SetMotor(List m)
    {
        motor=m;
        
    }
    public void SetUi(UI Motor2){
        
       s=Motor2;
        
    }

}

    

