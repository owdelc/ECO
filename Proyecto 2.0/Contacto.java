import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Contacto{

    public String I_AmigosLagoAmatitlan(){
        return "Tel: 2362-3195\nE-mail: info@damigosatitlan.org";

    }

    public void pagina_AmigosLagoAmatitlan(){
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://amigosatitlan.org/");
                    desktop.browse(uri);
                } catch(URISyntaxException | IOException ex){}
            }
        }
    }

    public String I_DefensoresNaturaleza(){
        return "Tel: 2310-2929\nE-mail: info@defensores.orgt.gt";
    }

    public void pagina_DefensoresNaturaleza(){
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://defensores.org.gt/en/fundacion-defensores-de-la-naturaleza-2/");
                    desktop.browse(uri);
                } catch(URISyntaxException | IOException ex){}
            }
        }
    }

    public String I_Guateambiente(){
        return "Tel: 4095-9871\nE-mail: luisrodriguez@guateambiente.org";
    }

    public void pagina_Guateambiente(){
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://www.guateambiente.org/");
                    desktop.browse(uri);
                } catch(URISyntaxException | IOException ex){}
            }
        }
    }

    public String I_Fundaeco(){
        return "Tel: 2314-1900\nE-mail: m.cerezo@fundaeco.org.gt";
    }

    public void pagina_Fundaeco(){
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://fundaeco.org.gt/fundaeco.org.gt/index.html");
                    desktop.browse(uri);
                } catch(URISyntaxException | IOException ex){}
            }
        }
    }
}