import java.text.DecimalFormat;

public class Contador_Oxigeno{

    DecimalFormat df = new DecimalFormat("#.000000");
        
        
    public String Contador(int anos_trascurridos){
        double disminucion_oxigeno = 0.7;
        int anos = anos_trascurridos - 2000;
        double porcentaje = anos * 0.00000088;
        disminucion_oxigeno = disminucion_oxigeno + porcentaje;

            

        return "Para el agno " + anos_trascurridos + " habra disminuido " + df.format(disminucion_oxigeno) + "%.";
    }

    public void Informacion_oxigeno(){
        System.out.println("Según estudios realizados recientemente, los cientificos han descubierto que en los últimos 800,000 agnos los niveles de oxigeno han decaido un 0.7% y no se sabe cual es la causa de esto");
        System.out.println("Hay diferentes hipótesis que tratan de explicar esto. Una de ellas (la más apoyada) dice que es debido al cambio climático");

    }
    
    public void Aportacion_arboles(int cant_arboles){
        int arboles = cant_arboles;
        System.out.println("Se necesitan aproximadamente 22 arboles para suplir la demanda de oxigeno de una persona");
        if (arboles >= 22){
            System.out.println("Excelente! Estas contribuyendo mucho al planeta");
        } else if (arboles == 0) {
            System.out.println("Todavia no has contribuido. Apoya al planeta y empieza a sembrar!");
        } else {
            System.out.println("Estas contribuyendo! Sigue sembrando");
        }
    }
}


/* ********************************
Referencias:
1. Zahumenszki, Carlos(2016). "La atmosfera de la Tierra esta perdiendo oxigeno" 
https://es.gizmodo.com/la-atmosfera-de-la-tierra-esta-perdiendo-oxigeno-y-los-1786971190
2. D. A. Stolper, M. L. Bender, G. B. Dreyfus, Y. Yan, J. A. Higgins: 
A Pleistocene ice core record of atmospheric O2 concentrations. Science (2016).
*/