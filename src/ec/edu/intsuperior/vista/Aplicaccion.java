/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jeffe
 */
public class Aplicaccion {
     public static void main(String[] args) {
                 Persona cj = new Persona();//c0onstructor por defecto
        SimpleDateFormat Formtfecha = new SimpleDateFormat("06/06/1996");//POR PARAMETROS 
        Date fecha = new Date();
        
        
        fecha.setYear(1996);
        fecha.setMonth(6);
        fecha.setDate(6);
        Persona obj1 = new Persona("1724678161", "Cartagena Jefferson", "Carua Danny", "/"
               , "Mateo Martinez", fecha, "cartagenajeffer@intsuperior.edu.ec");
        
                System.out.println("Fecha de Nacimiento: "+
                        obj1.getFechanacimeinto().getYear()+"/"
                        + obj1.getFechanacimeinto().getMonth()+"/"+obj1.getFechanacimeinto().getDate());             
       
        
        
    }
        
}

