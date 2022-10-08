
package Moldelo;

public class FuncionesMat {
    String cadena="";
    
    public String funcionesMate(){
        cadena+="Algunos métodos predefinidos de la clase MATH\n\n";
        cadena+="Valor Absoluto de -250: "+Math.abs(-250)+"\n";  
        cadena+="Redondeo de x al entero superior (12.8):"+Math.ceil(12.18)+"\n";
        cadena+="Redondeo de x al entero inferior (12.8):"+Math.floor(12.18)+"\n";  
        cadena+="Calcula el minimo de dos números (10,15): "+Math.min(10,15)+"\n";  
        cadena+="Calcula el maximo de dos números (10,15): "+Math.max(10,15)+"\n";
        cadena+="La raiz cuadrada del número 5 : "+Math.sqrt(5)+"\n";
        cadena+="la potencia de N(y):5(5) "+Math.pow(5,5)+"\n";
        cadena+="El coseno de 1.0 "+Math.cos(1.0)+"\n";
        cadena+="El seno de 1.0 "+Math.sin(1.0)+"\n";
        cadena+="El tangente de 1.0 "+Math.tan(1.0)+"\n";
        return cadena;
    }
}
