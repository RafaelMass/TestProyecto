/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pruebaproyecto;

/**
 *
 * @author Rafa
 */
public class Proyecto {
    
    public String Transferencia(double Dinero, double Clave){
           double Num = 8;
           
           int D = (int) Clave;
           if((Dinero > 0) && (Integer.toString(D).length() >= Num)){
               return "Trensferencia completada"; 
           }else{
               return "No se pudo completar la transferencia";
           }
    }
    
    public String Retiro(int Dinero){
        if(Dinero > 0){
            return "Retiro exitoso";
        }else{
            return "No se pudo efectuar";
        }
    }
    
    public String Deposito(int Dinero){
        if(Dinero > 0){
            return "Deposito exitoso";
        }else{
            return "Deposito fallido";
        }
    }
    
    public String NombreCliente(String nom, String contrasena) {
        return "Nombre: " + nom + " Contraseña: " + contrasena;
    }
    
    public String NIP(String nip){
        String NIP;
        int y;
        
        double c = 0;
        
        do{
            try{
               NIP = nip;
               double c1 = c;
               c = Double.parseDouble(NIP.trim());
               y = 2;
               return "NIP aceptado";
            }catch(NumberFormatException p){
                y = 0;
                return "NIP solo son numeros";
            }
        }while(y < 1);
    }
    
    
}