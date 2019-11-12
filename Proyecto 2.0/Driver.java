import java.util.*;


public class Driver{

    public static void main(String[] args) {
        Controlador controlador = new Controlador();
        Scanner scan = new Scanner(System.in);
        int opcion1 =0;
        int opcion2 =0;
        int opcion3 =0;
        String enter;
        while(opcion1 != 6){
            System.out.println("------------  ECO  ------------");
            System.out.println("Que desea realizar?");
            System.out.println("1. Informacion sobre el oxigeno");
            System.out.println("2. Contactar ONGs");
            System.out.println("3. Tips");
            System.out.println("4. Donaciones");
            System.out.println("5. Simulador");
            System.out.println("6. Salir");
            opcion1=scan.nextInt();
            switch(opcion1){
                case 1:
                    while (opcion2 != 4){
                        System.out.println("Elija una opcion:");
                        System.out.println("1. Averiguar el porcentaje de disminucion del oxigeno para un agno");
                        System.out.println("2. Informacion sobre la disminucion del oxigeno");
                        System.out.println("3. Saber cuanto has aportado con la siembra de arboles");
                        System.out.println("4. Regresar al menu principal");
                        opcion2 = scan.nextInt();
                        switch(opcion2){

                            case 1:
                                System.out.println("Los niveles de oxigeno de que agno desea conocer?\nIntroduce el agno:(Del 2000 en adelante)");
                                int agno = scan.nextInt();
                                System.out.println(controlador.disminucion_oxigeno(agno));
                            break;

                            case 2:
                                controlador.info_oxigeno();
                            break;

                            case 3:
                                System.out.println("Cuantos arboles has plantado?");
                                int arboles = scan.nextInt();
                                controlador.aportacion_oxigeno(arboles);
                            break;

                            case 4:
                                System.out.println("");
                            break;

                            default:
                                System.out.println("Opcion no valida");
                            break;

                        }//segundo switch

                    }//segundo while

                break;

                case 2:
                    while(opcion3 != 5){
                        System.out.println("Que organizacion te interesaria?");
                        System.out.println("1. Amigos del Lago de Atitlan");
                        System.out.println("2. Defensores de La Naturaleza");
                        System.out.println("3. Guateambiente");
                        System.out.println("4. Fundaeco");
                        System.out.println("5. Regresar al menu principal");
                        opcion3 = scan.nextInt();
                        if(opcion3 <=4){    
                            System.out.println(controlador.I_Contacto(opcion3));
                            System.out.println("Deseas acceder a la pagina de esta ONG? Si o No");
                            scan.nextLine();
                            String x = scan.nextLine();
                            if(x.equalsIgnoreCase("si")){
                                controlador.paginas_contacto(opcion3);
                            }
                        }
                    }
                break;

                case 3: 
                    controlador.Tips();
                break;

                case 4:
                    controlador.Paypal();
                break;

                case 5:
                    controlador.Simulador();
                break;

                case 6:
                    System.out.println("Feliz Dia");
                break;

                default:
                    System.out.println("Opcion no valida");
                break;
            }//primer switch

        }//primer while


    }
}