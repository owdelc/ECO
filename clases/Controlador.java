import java.util.*;

public class Controlador{

    Scanner scan = new Scanner(System.in);
    Contador_oxigeno simulador_oxigeno = new Contador_oxigeno();



    int arboles_planatados = 0;

    public void Simulador_planeta(){
        System.out.println("Todavia no esta disponible esta opcion");
    }

    public void Oxigeno(){
        int opcion = 0;
        while (opcion != 4){
            System.out.println("Elija una opcion:");
            System.out.println("1. Averiguar el porcentaje de disminucion del oxigeno para un ano");
            System.out.println("2. Informacion sobre la disminucion del oxigeno");
            System.out.println("3. Saber cuanto has aportado con la siembra de arboles");
            System.out.println("4. Regresar al menu principal");
            opcion = scan.nextInt();

            switch(opcion){
                case 1:
                    int ano;
                    System.out.println("Los niveles de oxigeno de que ano deseas conocer? \n Introduce el ano: (Del 2000 en adelante) ");
                    ano = scan.nextInt();
                    simulador_oxigeno.Contador(ano);
                break;

                case 2:
                    simulador_oxigeno.Informacion_oxigeno();
                break;

                case 3:
                    simulador_oxigeno.Aportacion_arboles(arboles_planatados);
                break;

                case 4:
                    System.out.println(" ");
                break;

                default:
                    System.out.println("Opcion invalida");
                break;
            }

        }
    }

    public void Voluntariado(){
    System.out.print(contacto);

    }

    public void Plantacion(){
      System.out.print(tips);

    }


}
