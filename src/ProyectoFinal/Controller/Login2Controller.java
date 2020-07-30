/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoFinal.Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author gabyt
 */
public class Login2Controller {
    
    public Login2Controller(){
        
        ArcReader = "";
    
    }

    
   
    
    //sirve para la lectura del archivo en formato txt
    public int User(String user, String password) {
        int i = 0;
        try {
           File archivo = new File("C:\\Users\\gabyt\\Documents\\usuarios.txt");
            
            FileReader arc = new FileReader(archivo);
            BufferedReader br = new BufferedReader(arc);

            while (true) {
                ln = br.readLine();
                //al no ser null, se guardara la linea en el strind de ArcReader
                if (ln != null) {
                    if (ln.contains(user) && ln.contains(password)) {
                        i = 1;
                        break;
                    }
                
                } 
                //si no lo hace, se termina el ciclo
                else 
                {
                    System.out.println("no existe usuario");break;
                }
              

            }

        } 
        catch (FileNotFoundException excep) {
            System.out.println("no existo archivo");
        } 
        catch (IOException excep) {
            System.out.println(excep);
        }
        return i;

    }
     private String ArcReader;
     private String ln;

    
    }
    

