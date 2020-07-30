/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import ProyectoFinal.Controller.Login2Controller;
import ProyectoFinal.Controller.OptionsAgregarCarrerraController;
import ProyectoFinal.Controller.OptionsAgregarEmpleadoController;
import ProyectoFinal.Controller.OptionsAgregarMateriaController;
import ProyectoFinal.Controller.OptionsAgregrarAlumnosController;
import ProyectoFinal.Objetos.Alumnos;
import ProyectoFinal.Objetos.Empleado;
import ProyectoFinal.Objetos.Investigador;
import ProyectoFinal.Objetos.MaestroPosgrado;
import ProyectoFinal.Objetos.MaestrosDeAsignacion;
import ProyectoFinal.Objetos.Materia;
import ProyectoFinal.View.AgregarMateria;
import ProyectoFinal.View.Login_Interface;
import ProyectoFinal.View.MateriasPosgrado;
import ProyectoFinal.View.MateriasPreparatoria;
import ProyectoFinal.View.MateriasProfesional;
import ProyectoFinal.View.OptionsAgregarAlumno;
import ProyectoFinal.View.OptionsAgregarEmpleado;
import ProyectoFinal.View.OptionsEmpleadoAcademico;
import ProyectoFinal.View.OptionsEmpleadoAdm;
import ProyectoFinal.View.OptionsView;



/**
 *
 * @author gabyt
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Login_Interface login= new Login_Interface();
        login.show(); 
        
        /*
        Motor de Interface
        */
        UI motorInterface= new UI();
         
        /*
        lista
        */
        List motor= new List();
        login.setMotor(motorInterface);
        /*
        frame
        */
        OptionsView opView= new OptionsView();
        OptionsView logout= new OptionsView();
        OptionsAgregarAlumno AgregarAlumno= new OptionsAgregarAlumno();
        OptionsAgregarEmpleado AgregarEmpleado= new OptionsAgregarEmpleado();  
        OptionsEmpleadoAdm EmpleadoAdm= new OptionsEmpleadoAdm();
        OptionsEmpleadoAcademico EmpleadoAcademico= new OptionsEmpleadoAcademico(); 
        AgregarMateria materia= new AgregarMateria();  
  
        /*
        objetos
        */
        MateriasProfesional mProfesional = new MateriasProfesional();
        MateriasPosgrado mPosgrado = new MateriasPosgrado();
        MateriasPreparatoria MatP=new MateriasPreparatoria();
        MateriasPosgrado MatPos= new MateriasPosgrado();
        MaestrosDeAsignacion MaestroADS= new MaestrosDeAsignacion();
        Investigador Inv = new Investigador();
        MaestroPosgrado MPOS = new MaestroPosgrado();
        Alumnos A = new Alumnos() {};
        Materia M= new Materia(){};
        Empleado EM= new Empleado(){};
        
        /*
        frame con Motor
        */
        opView.setMotor(motorInterface); 
        logout.setMotor(motorInterface);
        AgregarAlumno.setMotor(motorInterface); 
        AgregarEmpleado.setMotor(motorInterface);
        EmpleadoAdm.setMotor(motorInterface);
        EmpleadoAcademico.setMotor(motorInterface);
        EmpleadoAdm.setMotor(motorInterface);
        EmpleadoAcademico.setMotor(motorInterface);
        materia.setMotor(motorInterface);
        mPosgrado.setMotor(motorInterface);
    
        /*
         motor con Frame 
        */           
        motorInterface.SetLogIn(login);
        motorInterface.setOpView(opView); 
        motorInterface.setOpView(logout);
        motorInterface.setAlumno(AgregarAlumno);
        motorInterface.SetEmpleado(AgregarEmpleado);
        motorInterface.SetEmpleadoAdm(EmpleadoAdm);
        motorInterface.SetEmpleadoAcademico(EmpleadoAcademico);
        motorInterface.SetCrearMaterias(materia);
        motorInterface.SetMateriasProfesional(mProfesional);
        motorInterface.SetMateriasPosgrado(mPosgrado);
       
         
        
      
        /*
        Controller
        */ 
        OptionsAgregarCarrerraController controllerCarrera = new OptionsAgregarCarrerraController();
        OptionsAgregarEmpleadoController controllerEmpleado= new OptionsAgregarEmpleadoController();
        OptionsAgregarMateriaController controllerMateria= new OptionsAgregarMateriaController();
        OptionsAgregrarAlumnosController controllerAlumnos= new OptionsAgregrarAlumnosController();
        Login2Controller l2 = new Login2Controller();
      
        /*
        materias
        */        
        motor.SetMateria(M);
        motorInterface.SetMateria(M);
        materia.setMotor(motorInterface);
        motor.SetMateria(M);
        motorInterface.SetMateria(M);
        controllerMateria.SetMotorUI(motorInterface);
        controllerMateria.setControlador(motor);
        motorInterface.SetOptionsAgregarMateriaController(controllerMateria);
        motor.SetOptionsAgregarMateriaController(controllerMateria);
        M.SetUi(motorInterface);
        M.SetMotor(motor); 
      
        
        /*
        materiasProfesional
        */
        mProfesional.SetControladorMateria(controllerMateria);
        mProfesional.setMotor(motorInterface);
        MatP.SetControladorMateria(controllerMateria);
        MatP.setMotor(motorInterface);
        MatP.setControlador(motor);
        motorInterface.SetMateriasPreparatoria(MatP);
        motor.SetMateriasPreparatoria(MatP);
        
        /*
        materiaPosgrado
        */
        mPosgrado.SetControladorMateria(controllerMateria);
        mPosgrado.setMotor(motorInterface);  
        MatPos.SetControladorMateria(controllerMateria);
        MatPos.setMotor(motorInterface);
        MatPos.setControlador(motor);
        motor.SetMateriasPosgrado(MatPos);
        
        
        
        /*
        alumno
        */
        motor.SetAlumnos(A);
        A.SetMotor(motor);
        A.SetUi(motorInterface);
        motorInterface.SetAlumnos(A);  
        motor.SetOPAgregarAlumno(AgregarAlumno);
        controllerAlumnos.SetMotorUI(motorInterface);
        controllerAlumnos.setControlador(motor);
        AgregarAlumno.SetControlador(controllerAlumnos);
        
        /*
        empleado
        */
        motor.SetEmpleado(EM);
        motorInterface.SetEmpleado(AgregarEmpleado);
        motorInterface.SetEmpleado(AgregarEmpleado);
        controllerEmpleado.SetMotorUI(motorInterface);
        controllerEmpleado.setControlador(motor);
        motorInterface.SetOptionsAgregarEmpleadoController(controllerEmpleado);
        motor.SetOptionsAgregarEmpleadoController(controllerEmpleado);
        EM.SetUi(motorInterface);
        EM.SetMotor(motor);
        
        /*
        Empleado Administrativo
        */
        EmpleadoAdm.SetControladorEmpleado(controllerEmpleado);
        EmpleadoAdm.setMotor(motorInterface);
        
        /*
        Empleado Academico
        */
        EmpleadoAcademico.SetControladorEmpleado(controllerEmpleado);
        EmpleadoAcademico.setMotor(motorInterface);
        
        
   
    }
    
}
