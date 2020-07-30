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
public class MaestroPlanta extends Empleado{

    private String materias;

    public MaestroPlanta() {
        /*
         constructor vacio
         */

        materias = "";

    }
    /*
     constructor
     */

    public MaestroPlanta(String name, String LastName, String gender, String id, String TypeCourse, String age) {

        materias = name;

    }
    /*
     metodos
     */

    public void SetMaterias(String topic) {
        materias = topic;
    }

    public String GetMaterias() {
        return materias;
    }

}
