/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uv.programa03;

/**
 *
 * @author mxaxe
 */
public class Programa03 {

    public static void main(String[] args) {
       // ClaseConcreta c = new ClaseConcreta();
        //c.imprimir();
        
       // ClaseAHija cah=new ClaseAHija();
        //cah.imprimir();
        
        ClaseA ca=null;
        
        ca=new ClaseAHija();
        ca.imprimir();
        
        ca=new ClaseAHija2();
        ca.imprimir();
        
        ca=new ClaseA(){
            @Override
            public void msg() {
                System.out.println("Otra clase anonima");
            }
        };
        ca.imprimir();
       // System.out.println("Hello World!");
    }
}
