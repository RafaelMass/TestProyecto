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
public class PruebaProyecto {
    
    public static void main(String[] args) {
        Proyecto pro = new Proyecto();
        System.out.println(pro.Transferencia(6, 12345678));
        System.out.println(pro.NIP("eee"));
        System.out.println(pro.NombreCliente("Rafael", "Rafa1212"));
        System.out.println(pro.Deposito(123));
        System.out.println(pro.Retiro(150));
    }
}