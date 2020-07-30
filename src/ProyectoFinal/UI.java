/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;

import ProyectoFinal.Controller.OptionsAgregarMateriaController;
import ProyectoFinal.Controller.OptionsAgregarEmpleadoController;
import ProyectoFinal.Objetos.Alumnos;
import ProyectoFinal.Objetos.Empleado;
import ProyectoFinal.Objetos.EmpleadoAdministrativo;
import ProyectoFinal.Objetos.Investigador;
import ProyectoFinal.Objetos.MaestroPlanta;
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
import ProyectoFinal.View.VisualizacionDatosView;
import java.util.ArrayList;



/**
 *
 * @author gabyt
 */
public class UI  {
    
  
    
    
    public UI()
    {
        /*
        constructor Vacio
        */
    }
    public void SetOptionsAgregarMateriaController(OptionsAgregarMateriaController m){
        AMC=m;
    }
    public void doSomething()
    {
        OpView.show();
       
    }   
    public void SetMateriasPreparatoria(MateriasPreparatoria M)
    {
        MP=M;
    }
    public void SetOptionsAgregarEmpleadoController(OptionsAgregarEmpleadoController EC)
    {
        OAEC=EC;
    }
  
  
    public void SetLogIn(Login_Interface loginView){
        
        login= loginView;
        
    }
    
    public void setLogOut(OptionsView logout){
        OpView= logout;
    }
    
    public void setOpView(OptionsView agregarAlumnos) {
       OpView=agregarAlumnos;
    }

    public void setAlumno(OptionsAgregarAlumno alumno){
        AgregarAlumno= alumno;
        
    }
    public void SetEmpleado(OptionsAgregarEmpleado empleado){
        AgregarEmpleado= empleado;
    }
     public void SetEmpleadoAdm(OptionsEmpleadoAdm empleadoadm){
        EmpleadoAdministrativo= empleadoadm;
    }
    public void SetEmpleadoAcademico(OptionsEmpleadoAcademico empleadoAcademico){
        EmpleadoAcademico=empleadoAcademico;
    }
    public void SetCrearMaterias(AgregarMateria Materias){
        CrearMateriales= Materias;
             
    }
     public void SetMateriasProfesionales(MateriasProfesional L)
    {
        MateriasProfesional=L;
    }
    
    public void SetMateriasProfesional(MateriasProfesional mProfesional){
        
        MateriasProfesional=mProfesional;
    }
    public void SetMateriasPosgrado(MateriasPosgrado mP){
        
        MateriasPosgrado=mP;
    }
    public void SetAlumnos(Alumnos mA){
        
       A=mA;
     
    }
    public void SetMateria(Materia m){
        
        Ms=m;
         
    }
      public void SetMaestrosDeAsignacion(MaestrosDeAsignacion MDS)
    {
        MDAS=MDS;
    }
    public void SetMaestroPlanta (MaestroPlanta MAP)
    {
        MDP=MAP;
    
    }
    public void SetMaestroPosgrado(MaestroPosgrado MAPOS)
    {
        MDPOS=MAPOS;
    }
    public void SetVisualizacionDatosView(VisualizacionDatosView dat)
    {
        dato=dat;
    }
   
  

    /**
     *
     **/
    public void goToLogIn(){
        login.show();
    }
    public void goToOpView()
    {
        OpView.show();
    }
     public void goToOpAgregarAlumno() {
      AgregarAlumno.show();
    }
    public void GoToEmpleado(){
        AgregarEmpleado.show();
        
    }
    public void GoToEmpleadoAdministrativo(){
        
        EmpleadoAdministrativo.show();      
    }
    public void GoToEmpleadoAcademico(){
        EmpleadoAcademico.show();
        
    }
    public void GoToCrearMaterias(){
        CrearMateriales.show();
    }
    public void GoToMateriaPreparatoria(){
        
        MP.show();
        
    }
   
    public void GoToMateriasProfesional(){
        
        MateriasProfesional.show();
              
    }
    public void GoToMateriasPosgrado(){
        
        MateriasPosgrado.show();
        
    }
    public void GoToVisualizarDatosView()
    {
        dato.show();
    }
  
    
    /**
     variable privadas
     **/
    private Login_Interface login;
    private OptionsView OpView;
    private OptionsAgregarAlumno AgregarAlumno;
    private OptionsAgregarEmpleado AgregarEmpleado;
    private OptionsEmpleadoAdm EmpleadoAdministrativo;
    private OptionsEmpleadoAcademico EmpleadoAcademico;
    private VisualizacionDatosView dato;
    private AgregarMateria CrearMateriales; 
    private MateriasProfesional MateriasProfesional;
    private MateriasPosgrado MateriasPosgrado;
    private Alumnos A;
    private Materia Ms;
  
    private EmpleadoAdministrativo Adm;
    private Investigador Inv;
    private MaestrosDeAsignacion MDAS;
    private MaestroPlanta MDP;
    private MaestroPosgrado MDPOS;
    
    private OptionsAgregarMateriaController AMC;
    private OptionsAgregarEmpleadoController OAEC;
    private MateriasPreparatoria MP;
          
}

    
 
    
    
    