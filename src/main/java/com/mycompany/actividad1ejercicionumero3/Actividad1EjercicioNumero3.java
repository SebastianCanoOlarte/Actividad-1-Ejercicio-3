/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad1ejercicionumero3;


public class Actividad1EjercicioNumero3 {

    public static void main(String[] args) {
        double bruto, retencion, neto;
        bruto = 48*5000;
        retencion = (bruto*12.5) /100;
        neto = bruto - retencion;
        System.out.println("El salario bruto del trabajador es: $"+bruto);
        System.out.println("la retencion de fuente del trabajador es: $"+retencion);
        System.out.println("El salario neto del trabajador es: $"+neto);
    }
}
