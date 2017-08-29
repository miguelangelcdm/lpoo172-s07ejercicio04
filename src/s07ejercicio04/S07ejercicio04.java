/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio04;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class S07ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("ingrese # minutos:");
        int minutos=input.nextInt();
        int years=minutos/525600;
        int days=(minutos%525600)/1440;
        System.out.println(minutos+" son aprox. "+years +" años y "+days+" dias" );
    }
    
}
