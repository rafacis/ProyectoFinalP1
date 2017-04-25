/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.finalp1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael
 */
public class ProyectoFinalP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int tamaño = SolicitarEntero("Teclea el número de materias");
            String[] materias = NombreMaterias(tamaño);
            double [][]arreglo = arreglo(tamaño, materias);
            ImprimirArreglo(arreglo, materias);    
    }
     public static String[] NombreMaterias(int tamano){

         String []materias = new String[tamano];
         for (int i  =0; i < tamano; i++){
            materias[i] = JOptionPane.showInputDialog("Teclea el nombre de la materia "+ (i+1) + ": ");            
        } 
        return materias;
        }
       public static double[][] arreglo(int tamaño,String materia[]){

        double [][]arreglo = new double [tamaño][3];
      
        for (int i = 0; i < tamaño; i++){
        for (int j = 0; j < 3 ; j++){
        
        arreglo[i][j] = Solicitardouble("Escribe la calificación del parcial: "+(j+1)+": ");
        }
        }
        return arreglo;
        }
         public static void ImprimirArreglo(double [][]a, String materia[]){
        double suma=0,prom=0;
              
        for (int i = 0; i < a.length;i++){
        for (int j = 0; j < a[i].length;j++){
            suma= suma+a[i][j];
            prom=suma/3;
        }
        System.out.println();
        JOptionPane.showMessageDialog(null, "Promedio de la materia " + materia[i] + ":\n" + prom);
        prom = 0;
        suma = 0;
        }
        }
         public static int SolicitarEntero(String men){
        int num = 0;
        boolean flag;
        do{
                    try{
                String dato = JOptionPane.showInputDialog(men);
                num = Integer.parseInt(dato);
                 flag = false;}
                    catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error");
                flag = true;
            }
        }
        while(flag);
        return num;
    }
         
          public static double Solicitardouble(String men){
        double num = 0;
        boolean flag;
        do{
            try{
                String dato = JOptionPane.showInputDialog(men);
                num = Double.parseDouble(dato);
                flag =  false;
            }
            catch(Exception e){

                JOptionPane.showMessageDialog(null, "Error");
                flag=true;
            }
        }
        while(flag);
        return num;
    
    }
    
}
