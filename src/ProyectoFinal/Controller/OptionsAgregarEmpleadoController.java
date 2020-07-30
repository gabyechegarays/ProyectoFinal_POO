/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Controller;

import ProyectoFinal.List;
import ProyectoFinal.Objetos.Empleado;
import ProyectoFinal.UI;

/**
 *
 * @author gabyt
 */
public class OptionsAgregarEmpleadoController {
    
       public void agregarEmpleo(String Nombre, String Apellido, String Matricula,String job ,String Salario, String Edad){
        Empleado empleado= new Empleado() {};
        empleado.SetNombre(Nombre);
        empleado.SetApellido(Apellido);
        empleado.SetApellido(Salario);
        empleado.SetTipoJob(job);
        empleado.SetEdad(Edad);
        empleado.SetSalario(Salario);
        empleado.SetTipoJob(job);
       
      
        
        DataB.GetMaestroPlanta().add(empleado);
        DataB.GetMaestroPosgrado().add(empleado);
        DataB.GetPosgrado().add(empleado);
        DataB.GetInvestigador().add(empleado);
       }
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


