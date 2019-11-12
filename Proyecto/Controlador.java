public class Controlador{

    Contador_Oxigeno contador_oxigeno = new Contador_Oxigeno();
    Contacto contacto = new Contacto();
    Tips tips = new Tips();

    public String I_Contacto(int x){
        String p = " ";
        if (x == 1){
            p=contacto.I_AmigosLagoAmatitlan();
        } else if(x == 2){
            p=contacto.I_DefensoresNaturaleza();
        } else if(x == 3){
            p=contacto.I_Guateambiente();
        } else if(x == 4){
            p=contacto.I_Fundaeco();
        }

        return p;
    }

    public void paginas_contacto(int x){
        if (x==1){
            contacto.pagina_AmigosLagoAmatitlan();
        } else if(x==2){
            contacto.pagina_DefensoresNaturaleza();
        } else if(x==3){
            contacto.pagina_Guateambiente();
        } else if(x==4){
            contacto.pagina_Fundaeco();
        }
    }

    public String disminucion_oxigeno(int x){
        return contador_oxigeno.Contador(x);
    }

    public void info_oxigeno(){
        contador_oxigeno.Informacion_oxigeno();
    }

    public void aportacion_oxigeno(int x){
        contador_oxigeno.Aportacion_arboles(x);
    }

    public void Tips(){
        tips.Introduccion();
    }


}