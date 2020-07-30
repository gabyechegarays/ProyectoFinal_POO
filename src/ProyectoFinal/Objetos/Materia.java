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
public class Materia {

   

    public Materia() {
        /*
         constructor vacio
         */
        nombre = "";
        carrera = "";
        semestre = "";
        maestro = "";
        materia = "";

    }
    /*
     constructor
     */
    //career

    public Materia(String name, String career, String semester, String teacher, String schoolSubject) {

        nombre = name;
        carrera = career;
        semestre = semester;
        maestro = teacher;
        materia = schoolSubject;

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

    public void SetCarrera(String career) {
        carrera = career;
    }

    public String GetCarrera() {
        return carrera;
    }

    public void SetSemestre(String semester) {
        semestre = semester;

    }

    public String GetSemestre() {
        return semestre;
    }

    public void SetMaestro(String teacher) {
        maestro = teacher;
    }

    public String GetMaestro() {
        return maestro;
    }

    public void SetMateria(String schoolSubject) {
        materia = schoolSubject;

    }

    public String GetMateria() {
        return materia;
    }
    public void SetMotor(List m)
    {
        motor=m;
        
    }
    public void SetUi(UI Motor2){
        
       s=Motor2;
        
    }
    private String nombre;
    private String carrera;
    private String semestre;
    private String maestro;
    private String materia;
    private List motor;
    private UI s;

}

    


    

