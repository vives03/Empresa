/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import dao.DAOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author angel
 */
public class Menu {
    
    public boolean executeMenu(BufferedReader in) throws IOException{
        
        String action;
        int idProd = 0;
        String dia = "";
        String mes = "";
        String any = "";
                
        System.out.println("ANALITZADOR DE VENDES");
        System.out.println("1.- Introduir una venda");
        System.out.println("2.- Eliminar una venda");
        System.out.println("3.- Llistar vendes de un mes");
        System.out.println("4.- Llistar productes per ordre de vendes");
        System.out.println("5.- Sortir");
        System.out.println("Opció ?");
        
        action = in.readLine();
        if ((action.length() == 0) || action.charAt(0) == '5') {
            return true;
        }

        switch (action.charAt(0)) {
            // Introducir una venta
            case '1':

                System.out.println("Dia (1..31)? ");
                
                System.out.println("Mes (1..12)? ");
                
                System.out.println("Any (1600..3000)? ");
                
                System.out.println("Identificador del producte ? ");
                
                System.out.println("Unitats ? ");
                
                String qInVenta = "insert into ventas(producto,fecha_venta) values ('" + idProd + ",'" + any +"-" + mes + "-" + dia + "')";
                
                break;

            // Eliminar una venta
            case '2':
                System.out.println("Identificador del producte ? ");
                
                System.out.println("Dia (1..31)? ");
                
                System.out.println("Mes (1..12)? ");
                
                System.out.println("Any (1600..3000)? ");
                
                String qDelVenta = "delete from ventas where producto = " + idProd + ", fecha_venta= '" + any + "-" + mes + "-" + dia + "')";
                
                break;
                
            // Listar vendas
            case '3':
                System.out.println("Identificador del producte ? ");
                
                System.out.println("Mes (1..12)? ");
                
                System.out.println("Any (1600..3000)? ");
                
                String qListVenta = "";
                break;
            
            // Listar productos por orden de venda
            case '4':
                System.out.println("Any (1600..3000)? ");
                break;
        }

        return false;
    }
        
    
    public static void main(String[] args) {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        Menu m = new Menu();
        try {    
            m.executeMenu(in);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        

    }
}
