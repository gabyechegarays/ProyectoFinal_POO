/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal;


import ProyectoFinal.Controller.OptionsAgregarEmpleadoController;
import ProyectoFinal.Controller.OptionsAgregarMateriaController;
import ProyectoFinal.Objetos.Alumnos;
import ProyectoFinal.Objetos.Carrera;
import ProyectoFinal.Objetos.Empleado;
import ProyectoFinal.Objetos.EmpleadoAdministrativo;
import ProyectoFinal.Objetos.MaestroPlanta;
import ProyectoFinal.Objetos.Investigador;
import ProyectoFinal.Objetos.MaestroPosgrado;
import ProyectoFinal.Objetos.MaestrosDeAsignacion;
import ProyectoFinal.Objetos.Materia;
import ProyectoFinal.Objetos.Posgrado;
import ProyectoFinal.Objetos.Preparatoria;
import ProyectoFinal.Objetos.Profesional;
import ProyectoFinal.View.AgregarMateria;
import ProyectoFinal.View.MateriasPosgrado;
import ProyectoFinal.View.MateriasPreparatoria;
import ProyectoFinal.View.MateriasProfesional;
import ProyectoFinal.View.OptionsAgregarAlumno;
import java.util.ArrayList;

/**
 *
 * @author gabyt
 */
public class List {
  
    public List(){
        
    }
    
    /*
    aqui van los get de cada lista
   
    */
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
    public void SetMateriasPosgrado(MateriasPosgrado Mpo)
    {
       MPos= Mpo;
    }
    public void SetMateriasProfesionales(MateriasProfesional L)
    {
        M=L;
    }
    public void SetMateriasPreparatoria(MateriasPreparatoria M)
    {
        MP=M;
    }
    public void SetOptionsAgregarMateriaController(OptionsAgregarMateriaController m){
        AMC=m;
    }
    public void SetOptionsAgregarEmpleadoController(OptionsAgregarEmpleadoController EM)
    {
        OAEC=EM;
    }
        
    public void SetOPAagregarMaterias(AgregarMateria m)
    {
        OPAgregarMateria=m;
    }
    public void SetOPAgregarAlumno(OptionsAgregarAlumno a)
    {
        OPAgregarAlumno=a;
    }
    public ArrayList GetPreparatoria(){
        
        return alumnoPreparatoria;
    }
    public ArrayList GetProfesional(){
        return alumnoPreparatoria;
    }
    public ArrayList GetPosgrado(){
        return alumnoPreparatoria;
        
    }
    public ArrayList GetEmpleadoAdmistrativo(){
        return EmAdministrativo;
    }
    public ArrayList GetMaestroPlanta(){
        return EmAdministrativo;
        
    }
    public ArrayList GetMaestroPosgrado(){
        return EmAdministrativo;
    }
    public ArrayList GetInvestigador(){
        return investigador;
    }
    public ArrayList GetCarrera(){
        return Carrera;
    }
    public ArrayList GetMateria(){
        return Materias;
    }
   
    public void SetAlumnos(Alumnos A)
    {
        Alum=A;
    }
    public void SetMateria(Materia M)
            
    {
    
        mS=M; 
    }
    public void SetEmpleado(Empleado Emp)
    {
        
        Em=Emp;
    }
    /*
    aqui estan los arrayList para cada uno
    */
    private ArrayList<Preparatoria> alumnoPreparatoria = new ArrayList<Preparatoria>();
    private ArrayList<Profesional> alumnoProfesional = new ArrayList<Profesional>();
    private ArrayList<Posgrado> alumnosPosgrado = new ArrayList<Posgrado>();
    private ArrayList<EmpleadoAdministrativo> EmAdministrativo = new ArrayList<EmpleadoAdministrativo>();
    private ArrayList<MaestrosDeAsignacion> MaestroAsignacion = new ArrayList<MaestrosDeAsignacion>();
    private ArrayList<MaestroPlanta> MaestroPlanta = new ArrayList<MaestroPlanta>();
    private ArrayList<Investigador> investigador = new ArrayList<Investigador>();
    private ArrayList<Carrera> Carrera = new ArrayList<Carrera>();
    private ArrayList<Materia> Materias = new ArrayList<Materia>();
    private OptionsAgregarMateriaController AMC; 
    private OptionsAgregarEmpleadoController OAEC;
    private Alumnos Alum;
    private Materia mS;
    private OptionsAgregarAlumno OPAgregarAlumno;
    private AgregarMateria OPAgregarMateria;
    private MateriasPreparatoria MP;
    private MateriasProfesional M;
    private MateriasPosgrado MPos;
    private Empleado Em;
    private EmpleadoAdministrativo Adm;
    private Investigador Inv;
    private MaestrosDeAsignacion MDAS;
    private MaestroPlanta MDP;
    private MaestroPosgrado MDPOS;
    
        
}


    