import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Donacion{

    public void redirigir(){
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try{
                    java.net.URI uri= new java.net.URI("https://www.paypal.com/gt/home");
                    desktop.browse(uri);
                } catch(URISyntaxException | IOException ex){}
            }
        }
    }
}