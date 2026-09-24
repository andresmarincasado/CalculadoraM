/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoram;
import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class CalculadoraM {
   float numero1;
    float numero2;
    float seguir = 1;
    String operacion;
    Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        CalculadoraM calc = new CalculadoraM();
        while (calc.seguir == 1){
            calc.obtenerNumeros();
            calc.calcularResultado(calc.operacion);            
        }
        System.out.println();
        System.out.println("Adios!");
        calc.teclado.close();
    }
    
    public void obtenerNumeros(){
        System.out.println("Ingrese primer numero:");
        while (!teclado.hasNextFloat()){
        System.out.println("ERROR: Ingrese un numero:");
        teclado.next();
        }
        numero1 = teclado.nextFloat();

        System.out.println("Ingrese la operacion (+, -, *, / o %):");  
        operacion = teclado.next();
        while (!"+".equals(operacion) && !"-".equals(operacion) && !"*".equals(operacion) && !"/".equals(operacion) && !"%".equals(operacion)){
        System.out.println("ERROR: Ingrese una operacion valida:");  
        operacion = teclado.next();        
        }
        
        System.out.println("Ingrese segundo numero:");       
        while (!teclado.hasNextFloat()){
        System.out.println("ERROR: Ingrese un numero:");
        teclado.next();        
        }
        numero2 = teclado.nextFloat();
    }
    
    public void calcularResultado(String simbolo){
        float resultado;
        System.out.println("RESULTADO:");
        switch (simbolo){
            case "+":
                resultado = numero1 + numero2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = numero1 - numero2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = numero1 * numero2;
                System.out.println(resultado);
                break;
            case "/":
                if (numero2 == 0){
                    System.out.println("El segundo numero no puede ser 0");
                } else {
                    resultado = numero1 / numero2;
                    System.out.println(resultado);                
                }
                break;
            case "%":
                if (numero2 == 0){
                    System.out.println("El segundo numero no puede ser 0");
                } else {
                    resultado = numero1 % numero2;
                    System.out.println(resultado);                
                }
                break;
            default:
                System.out.println("Operacion invalida"); 
        }
        
        System.out.println();
        System.out.println("Ingrese 1 para usar calculadora de nuevo. Ingrese cualquier valor para acabar la sesion:");
        if (teclado.hasNextInt()){
            seguir = teclado.nextInt();
        } else {
            seguir = 0;
        }
    }
    
}
